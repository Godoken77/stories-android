package com.example.stories.android.feature.choose.di

import com.example.stories.android.feature.choose.domain.usecase.CategoryToChooseUseCase
import com.example.stories.android.feature.choose.domain.usecase.CategoryToChooseUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
internal interface ChooseModule {

    @Binds
    fun bindCategoryToChooseUseCase(impl: CategoryToChooseUseCaseImpl): CategoryToChooseUseCase
}