package com.example.stories.android.feature.splash.domain.usecase

import com.example.stories.android.feature.common.data.StoryRepository
import javax.inject.Inject

internal class PreloadStoriesUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
) : PreloadStoriesUseCase {

    override suspend fun preloadStories() {
        storyRepository.getStories()
    }
}