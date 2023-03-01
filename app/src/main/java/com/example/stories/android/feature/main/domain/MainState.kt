package com.example.stories.android.feature.main.domain

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.main.domain.model.StoryItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class MainState(
    val recentlyStories: List<StoryItem>,
    val recommendedStories: List<StoryItem>,
    val storyToContinue: StoryItem,
    val categories: List<Category>
) : Parcelable