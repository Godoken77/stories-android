package com.example.stories.android.feature.category.domain.usecase

import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.common.data.StoryRepository
import javax.inject.Inject

internal class CategoryUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
) : CategoryUseCase {
    override suspend fun getCategories(): List<CategoryItem> {
        val stories = storyRepository.getStories()
        return stories.flatMap { it.categories }.distinct().map {
            CategoryItem.fromCategory(it)
        }
    }
}