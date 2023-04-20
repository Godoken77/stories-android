package com.example.stories.android.feature.common.data

import android.content.Context
import com.example.stories.android.feature.common.data.datasource.db.dao.StoryDao
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity
import com.example.stories.android.feature.common.data.datasource.remote.ApiService
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.StoryPart
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

internal class StoryRepositoryImpl @Inject constructor(
    private val storyDao: StoryDao,
    private val apiService: ApiService,
    @ApplicationContext private val context: Context
) : StoryRepository {

    override suspend fun getStories(): List<Story> {
        val stories = mutableListOf<Story>()
        val locale = when(context.resources.configuration.locales.get(0).language.uppercase()) {
            "RU" -> "RUSSIAN"
            else -> "ENGLISH"
        }

        apiService.runCatching { getStories(locale = locale) }
            .onSuccess { remoteStoriesResult ->
                val remoteStories = remoteStoriesResult.data?.map {
                    Story.fromResponseStory(it)
                } ?: throw Exception()
                val localStories = storyDao.getStories().map { storyEntity ->
                    Story.fromStoryEntity(storyEntity)
                }

                val mergedList = sequence {
                    val remoteIterator = remoteStories.sortedBy { it.id }.iterator()
                    val localIterator = localStories.sortedBy { it.id }.iterator()

                    while (remoteIterator.hasNext() && localIterator.hasNext()) {
                        val remoteStory = remoteIterator.next()
                        val localStory = localIterator.next()

                        val mergedStory = remoteStory.copy(
                            currentPartId = localStory.currentPartId,
                            isRecentlyOpened = localStory.isRecentlyOpened,
                            storyParts = localStory.storyParts
                        )
                        yield(mergedStory)
                    }

                    yieldAll(remoteIterator)
                }.toList()

                storyDao.insertAll(
                    mergedList.map { story ->
                        StoryEntity.fromStory(story)
                    }
                )

                stories.addAll(mergedList)
            }
            .onFailure {
                storyDao.runCatching { getStories() }
                    .onSuccess {
                        stories.addAll(
                            it.map { storyEntity ->
                                Story.fromStoryEntity(storyEntity)
                            }
                        )
                    }
                    .onFailure {
                        throw it
                    }
            }

        return stories
    }

    override suspend fun setStoryPart(storyId: String, partId: String): String {
        storyDao.runCatching { getStoryById(storyId) }
            .onSuccess {
                val updatedStory = it.copy(
                    currentPartId = partId
                )
                storyDao.updateStory(updatedStory)
            }
            .onFailure {
                throw it
            }

        return partId
    }

    override suspend fun setArticleOpened(
        storyId: String,
        currentPartId: String,
        articleId: String
    ): List<Article> {

        val updatedArticles = mutableListOf<Article>()

        storyDao.runCatching { getStoryById(storyId) }
            .onSuccess {localStoryEntity ->
                val storyParts = localStoryEntity.storyParts

                val updatedStoryParts = storyParts.map { part: StoryPart ->
                    if (part.partId == currentPartId) {
                        part.articles.map { article ->
                            if (article.id == articleId) {
                                updatedArticles.add(
                                    article.copy(isOpen = true)
                                )
                            } else {
                                updatedArticles.add(article)
                            }
                        }
                        part.copy(
                            articles = updatedArticles
                        )
                    } else {
                        part
                    }
                }
                val updatedStory = localStoryEntity.copy(
                    storyParts = updatedStoryParts
                )

                storyDao.runCatching { updateStory(updatedStory) }
                    .onFailure { throwable ->
                        throw throwable
                    }
            }
            .onFailure {
                throw it
            }

        return updatedArticles
    }

    override suspend fun resetStoryProgress(storyId: String): String {
        var defaultStoryPartId: String? = null

        storyDao.runCatching { getStoryById(storyId) }
            .onSuccess { storyEntity ->
                val storyParts = storyEntity.storyParts
                val firstStoryPartId = storyParts.minBy { it.partId }.partId
                val defaultStoryParts = storyParts.map { part ->
                    part.copy(
                        articles = part.articles.mapIndexed { index, article ->
                            if (index == 0) {
                                article.copy(isOpen = true)
                            } else {
                                article.copy(isOpen = false)
                            }
                        }
                    )
                }

                storyDao.runCatching {
                    updateStory(
                        storyEntity.copy(
                            currentPartId = firstStoryPartId,
                            storyParts = defaultStoryParts
                        )
                    )
                }.onSuccess {
                    defaultStoryPartId = firstStoryPartId
                }.onFailure {
                    throw it
                }
            }
            .onFailure {
                throw it
            }

        return requireNotNull(defaultStoryPartId)
    }

    override suspend fun getStoryProcessWithStoryParts(storyId: String): Story {
        var storyWithContent: Story? = null
        val locale = when(context.resources.configuration.locales.get(0).language.uppercase()) {
            "RU" -> "RUSSIAN"
            else -> "ENGLISH"
        }

        apiService.runCatching {
            getStory(
                storyId = storyId,
                locale = locale
            )
        }
            .onSuccess { remoteStoryResult ->
                val remoteStory = remoteStoryResult.data?.let {
                    Story.fromResponseStoryContent(it)
                } ?: throw Exception()
                val localStory = storyDao.getStoryById(storyId)

                // Доработать версионирование local и remote списков историй
                val mergedStoryParts = if (remoteStory.storyParts.size == localStory.storyParts.size) {
                    localStory.storyParts
                } else {
                    remoteStory.storyParts
                }

                val updatedStory = remoteStory.copy(
                    currentPartId = localStory.currentPartId,
                    isRecentlyOpened = true,
                    storyParts = mergedStoryParts
                )

                storyWithContent = updatedStory
                storyDao.updateStory(StoryEntity.fromStory(updatedStory))
            }
            .onFailure {
                storyWithContent = Story.fromStoryEntity(storyDao.getStoryById(storyId))
            }

        return requireNotNull(storyWithContent)
    }
}