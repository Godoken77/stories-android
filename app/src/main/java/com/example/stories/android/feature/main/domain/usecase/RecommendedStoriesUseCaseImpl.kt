package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.stories.domain.model.IStoryItem.StoryItem
import javax.inject.Inject

internal class RecommendedStoriesUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
) : RecommendedStoriesUseCase {
    override suspend fun getRecommendedStories(): List<StoryItem> =
        storyRepository.getStories().filter {
            it.isRecommended
        }.map {
            StoryItem.fromStory(it)
        }
}