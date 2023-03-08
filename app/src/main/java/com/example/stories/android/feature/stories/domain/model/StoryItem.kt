package com.example.stories.android.feature.stories.domain.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import kotlinx.parcelize.Parcelize

@Parcelize
sealed class IStoryItem : Parcelable {

    data class StoryItem(
        val id: String,
        val pictureUrl: String,
        val name: String,
        val categories: List<Category>
    ) : IStoryItem() {
        companion object {
            fun fromStory(story: Story): StoryItem {
                return StoryItem(
                    id = story.id,
                    pictureUrl = story.pictureUrl,
                    name = story.name,
                    categories = story.categories
                )
            }
        }
    }

    object ShimmerItem : IStoryItem()
}