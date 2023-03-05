package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.main.domain.model.IStoryItem.StoryItem

internal interface RecentlyStoriesUseCase {

    suspend fun getRecentlyStories(): List<StoryItem>

    suspend fun getStoryToContinue(): StoryItem
}