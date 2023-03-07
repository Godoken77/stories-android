package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.stories.domain.model.IStoryItem.StoryItem

internal interface RecommendedStoriesUseCase {

    suspend fun getRecommendedStories(): List<StoryItem>
}