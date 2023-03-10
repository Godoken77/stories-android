package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.common.data.SettingsRepository
import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.stories.domain.model.IStoryItem.StoryItem
import javax.inject.Inject

internal class RecentlyStoriesUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository,
    private val settingsRepository: SettingsRepository
) : RecentlyStoriesUseCase {
    override suspend fun getRecentlyStories(): List<StoryItem> {
        return storyRepository.getStories().filter {
            it.isRecentlyOpened
        }.map {
            StoryItem.fromStory(it)
        }
    }

    override suspend fun getStoryToContinue(): StoryItem {
        val stories = storyRepository.getStories()
        val storyToContinueId = settingsRepository.getSettings().storyToContinueId

        val storyToContinue = stories.firstOrNull {
            it.id == storyToContinueId
        } ?: stories.first()

        return StoryItem.fromStory(storyToContinue)
    }
}