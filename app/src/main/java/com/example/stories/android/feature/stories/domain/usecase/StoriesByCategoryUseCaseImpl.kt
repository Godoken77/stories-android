package com.example.stories.android.feature.stories.domain.usecase

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.main.domain.model.IStoryItem.StoryItem
import javax.inject.Inject

class StoriesByCategoryUseCaseImpl @Inject constructor() : StoriesByCategoryUseCase {
    override suspend fun getStoriesByCategory(
        category: Category
    ): List<StoryItem> =
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
            ),
            StoryItem(
                id = "4",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Name name",
                categories = listOf(Category.ADVENTURE, Category.FANTASY)
            ),
            StoryItem(
                id = "5",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Title Title",
                categories = listOf(Category.ADVENTURE, Category.DETECTIVE)
            ),
            StoryItem(
                id = "6",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Title Title Название Название",
                categories = listOf(Category.ADVENTURE, Category.FANTASY, Category.NEW)
            ),
            StoryItem(
                id = "7",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Title TitleНазвание Название",
                categories = listOf(Category.ADVENTURE, Category.FANTASY, Category.NEW)
            ),
            StoryItem(
                id = "8",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "TitleНазвание Название Title",
                categories = listOf(Category.ADVENTURE, Category.FANTASY, Category.NEW)
            ),
            StoryItem(
                id = "9",
                pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                name = "Title Title 1212122",
                categories = listOf(Category.ADVENTURE, Category.FANTASY, Category.NEW)
            )
        ).filter { it.categories.contains(category) }
}