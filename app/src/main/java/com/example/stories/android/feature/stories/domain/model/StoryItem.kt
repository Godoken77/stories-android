package com.example.stories.android.feature.stories.domain.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import kotlinx.parcelize.Parcelize

@Parcelize
sealed class IStoryItem : Parcelable {

    data class StoryItem(
        val id: String,
        val pictureUrl: String,
        val name: String,
        val categories: List<Category>
    ) : IStoryItem()

    object ShimmerItem : IStoryItem()
}