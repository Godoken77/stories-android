package com.example.stories.android.feature.choose.domain.usecase

import com.example.stories.android.feature.choose.domain.model.CategoryToChoose

internal interface CategoryToChooseUseCase {

    suspend fun getCategoriesToChoose(): Pair<CategoryToChoose, CategoryToChoose>
}