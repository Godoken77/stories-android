package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.stories.domain.model.IStoryItem.StoryItem
import javax.inject.Inject

internal class RecentlyStoriesUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
) : RecentlyStoriesUseCase {
    override suspend fun getRecentlyStories(): List<StoryItem> =
        storyRepository.getStories().filter {
            it.isRecentlyOpened
        }.map {
            StoryItem.fromStory(it)
        }

    override suspend fun getStoryToContinue(): StoryItem =
        storyRepository.getStories().filter {
            it.isRecentlyOpened
        }.map {
            StoryItem.fromStory(it)
        }.last()
}