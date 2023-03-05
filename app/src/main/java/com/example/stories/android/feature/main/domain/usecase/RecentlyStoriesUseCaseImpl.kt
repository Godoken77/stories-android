package com.example.stories.android.feature.main.domain.usecase

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.main.domain.model.IStoryItem.StoryItem
import javax.inject.Inject

class RecentlyStoriesUseCaseImpl @Inject constructor() : RecentlyStoriesUseCase {
    override suspend fun getRecentlyStories(): List<StoryItem> =
        listOf(
            StoryItem(
                id = "1",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Хорошее название",
                categories = listOf(Category.NEW, Category.HORROR)
            ),
            StoryItem(
                id = "2",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Белый Бим",
                categories = listOf(Category.NEW, Category.COMEDY)
            ),
            StoryItem(
                id = "3",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Название",
                categories = listOf(Category.ADVENTURE, Category.FANTASY)
            )
        )

    override suspend fun getStoryToContinue(): StoryItem =
        StoryItem(
            id = "2",
            pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
            name = "Белый Бим",
            categories = listOf(Category.NEW, Category.COMEDY)
        )
}