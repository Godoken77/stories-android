package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.main.domain.model.StoryItem
import javax.inject.Inject

class RecentlyStoriesUseCaseImpl @Inject constructor() : RecentlyStoriesUseCase {
    override suspend fun getRecentlyStories(): List<StoryItem> =
        listOf(
            StoryItem(
                id = "1",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Хорошее название"
            ),
            StoryItem(
                id = "2",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Белый Бим"
            ),
            StoryItem(
                id = "3",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Название"
            )
        )
}