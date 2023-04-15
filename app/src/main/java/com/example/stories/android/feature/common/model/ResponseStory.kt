package com.example.stories.android.feature.common.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.process.domain.model.StoryPart
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResponseStory(
    val id: String,
    val pictureUrl: String,
    val name: String,
    val categories: List<Category>,
    val storyParts: List<StoryPart>?,
    val isRecommended: Boolean = false
) : Parcelable