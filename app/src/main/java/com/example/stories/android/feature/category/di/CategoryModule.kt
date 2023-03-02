package com.example.stories.android.feature.category.di

import com.example.stories.android.feature.category.domain.usecase.CategoryUseCase
import com.example.stories.android.feature.category.domain.usecase.CategoryUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
internal interface CategoryModule {

    @Binds
    fun bindCategoryUseCase(impl: CategoryUseCaseImpl): CategoryUseCase
}