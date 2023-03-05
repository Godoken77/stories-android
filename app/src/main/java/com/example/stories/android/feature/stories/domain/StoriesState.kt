package com.example.stories.android.feature.stories.domain

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.main.domain.model.IStoryItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class StoriesState(
    val stories: List<IStoryItem>,
    val category: CategoryItem,
    val isProgress: Boolean = true,
    val isFailure: Boolean = false
) : Parcelable