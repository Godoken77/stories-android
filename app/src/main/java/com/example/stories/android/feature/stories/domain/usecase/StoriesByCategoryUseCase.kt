package com.example.stories.android.feature.stories.domain.usecase

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.main.domain.model.IStoryItem.StoryItem

interface StoriesByCategoryUseCase {

    suspend fun getStoriesByCategory(category: Category): List<StoryItem>
}