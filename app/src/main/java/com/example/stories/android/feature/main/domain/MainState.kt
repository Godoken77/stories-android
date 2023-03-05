package com.example.stories.android.feature.main.domain

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.main.domain.model.IStoryItem
import com.example.stories.android.feature.main.domain.model.IStoryItem.StoryItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class MainState(
    val recentlyStories: List<StoryItem>,
    val recommendedStories: List<StoryItem>,
    val storyToContinue: IStoryItem,
    val categories: List<CategoryItem>,
    val isProgress: Boolean = true,
    val isFailure: Boolean = false
) : Parcelable