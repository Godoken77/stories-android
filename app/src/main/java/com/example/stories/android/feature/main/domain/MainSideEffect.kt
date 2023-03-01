package com.example.stories.android.feature.main.domain

import com.example.stories.android.feature.category.domain.model.Category

sealed class MainSideEffect {
    data class OpenStory(val storyId: String) : MainSideEffect()
    data class OpenStoriesByCategory(val category: Category) : MainSideEffect()
}