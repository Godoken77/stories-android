package com.example.stories.android.feature.category.domain.usecase

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.category.domain.model.CategoryItem
import javax.inject.Inject

internal class CategoryUseCaseImpl @Inject constructor() : CategoryUseCase {
    override suspend fun getCategories(): List<CategoryItem> =
        Category.values().map {
            CategoryItem.fromCategory(it)
        }
}