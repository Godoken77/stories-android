package com.example.stories.android.feature.common.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity
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
    }
}