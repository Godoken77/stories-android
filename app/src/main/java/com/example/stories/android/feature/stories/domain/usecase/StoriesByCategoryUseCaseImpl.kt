package com.example.stories.android.feature.stories.domain.usecase

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.stories.domain.model.IStoryItem.StoryItem
import javax.inject.Inject

internal class StoriesByCategoryUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
) : StoriesByCategoryUseCase {
    override suspend fun getStoriesByCategory(category: Category): List<StoryItem> =
        storyRepository
            .getStories()
            .map {
                StoryItem.fromStory(it)
            }
            .filter {
                it.categories.contains(category)
            }
}