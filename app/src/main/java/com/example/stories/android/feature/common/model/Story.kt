package com.example.stories.android.feature.common.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.StoryPart
import kotlinx.parcelize.Parcelize

@Parcelize
data class Story(
    val id: String,
    val pictureUrl: String,
    val name: String,
    val categories: List<Category>,
    val storyParts: List<StoryPart> = emptyList(),
    val currentPartId: String,
    val isRecentlyOpened: Boolean = false,
    val isRecommended: Boolean = false
) : Parcelable {
    companion object {
        fun fromStoryEntity(story: StoryEntity): Story {
            return Story(
                id = story.id,
                pictureUrl = story.pictureUrl,
                name = story.name,
                categories = story.categories,
                storyParts = story.storyParts,
                currentPartId = story.currentPartId,
                isRecentlyOpened = story.isRecentlyOpened,
                isRecommended = story.isRecommended
            )
        }

        fun fromResponseStory(story: ResponseStory): Story {
            return Story(
                id = story.id,
                pictureUrl = story.pictureUrl,
                name = story.name,
                categories = story.categories,
                storyParts = emptyList(),
                currentPartId = "1",
                isRecentlyOpened = false,
                isRecommended = story.isRecommended
            )
        }

        // Костыль из-за формата индексов на бэкенде
        fun fromResponseStoryContent(story: ResponseStoryContent): Story {
            val updatedStoryParts = story.storyParts.map { part ->
                part.copy(
                    partId = part.partId.toInt().plus(1).toString(),
                    articles = part.articles.mapIndexed { index, article ->
                        article.copy(
                            id = article.id.toInt().plus(1).toString(),
                            choices = if (part.articles.size == index + 1) {
                                listOf(
                                    Choice(
                                        nextStoryPartId = story.storyParts.firstOrNull {
                                            it.partId == part.partId.toInt().plus(1).toString()
                                        }?.partId?.toInt()?.plus(1).toString(),
                                        title = ""
                                    )
                                )
                            } else {
                                emptyList()
                            }
                        )
                    }
                )
            }
            return Story(
                id = story.id,
                pictureUrl = story.pictureUrl,
                name = story.name,
                categories = story.categories,
                storyParts = updatedStoryParts,
                currentPartId = "1",
                isRecentlyOpened = false,
                isRecommended = story.isRecommended
            )
        }
    }
}