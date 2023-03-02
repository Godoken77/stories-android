package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.main.domain.model.StoryItem

internal interface RecommendedStoriesUseCase {

    suspend fun getRecommendedStories(): List<StoryItem>
}