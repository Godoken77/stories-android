package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.data.datasource.db.dao.StoryDao
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity
import com.example.stories.android.feature.common.data.datasource.remote.Service
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.StoryPart
import javax.inject.Inject

internal class StoryRepositoryImpl @Inject constructor(
    private val storyDao: StoryDao,
    private val service: Service
) : StoryRepository {

    override suspend fun getStories(): List<Story> {
        val stories = mutableListOf<Story>()

        service.runCatching { getStories() }
            .onSuccess { remoteStories ->
                val localStories = storyDao.getStories().map { storyEntity ->
                    Story.fromStoryEntity(storyEntity)
                }

                val mergedList = sequence {
                    val remoteIterator = remoteStories.sortedBy { it.id }.iterator()
                    val localIterator = localStories.sortedBy { it.id }.iterator()

                    while (remoteIterator.hasNext() && localIterator.hasNext()) {
                        val remoteStory = remoteIterator.next()
                        val localStory = localIterator.next()

                        // Доработать версионирование local и remote списков историй
                        val mergedStoryParts = if (remoteStory.storyParts.size == localStory.storyParts.size) {
                            localStory.storyParts
                        } else {
                            remoteStory.storyParts
                        }

                        val mergedStory = remoteStory.copy(
                            currentPartId = localStory.currentPartId,
                            isRecentlyOpened = localStory.isRecentlyOpened,
                            storyParts = mergedStoryParts
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
    ): Boolean {
        var isOpened = false

        storyDao.runCatching { getStoryById(storyId) }
            .onSuccess {
                val storyParts = it.storyParts

                val updatedStoryParts = storyParts.map { part: StoryPart ->
                    if (part.partId == currentPartId) {
                        part.copy(
                            articles = part.articles.map { article ->
                                if (article.id == articleId) {
                                    article.copy(isOpen = true)
                                } else {
                                    article
                                }
                            }
                        )
                    } else {
                        part
                    }
                }
                val updatedStory = it.copy(
                    storyParts = updatedStoryParts
                )

                storyDao.runCatching { updateStory(updatedStory) }
                    .onSuccess {
                        isOpened = true
                    }
            }
            .onFailure {
                throw it
            }

        return isOpened
    }
}