package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.main.domain.model.IStoryItem.StoryItem

internal interface RecommendedStoriesUseCase {

    suspend fun getRecommendedStories(): List<StoryItem>
}