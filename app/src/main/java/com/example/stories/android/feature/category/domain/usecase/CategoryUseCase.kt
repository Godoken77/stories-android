package com.example.stories.android.feature.category.domain.usecase

import com.example.stories.android.feature.category.domain.model.CategoryItem

internal interface CategoryUseCase {

    suspend fun getCategories(): List<CategoryItem>
}