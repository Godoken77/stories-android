package com.example.stories.android.feature.stories.di

import com.example.stories.android.feature.stories.domain.usecase.StoriesByCategoryUseCase
import com.example.stories.android.feature.stories.domain.usecase.StoriesByCategoryUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
internal interface StoriesModule {

    @Binds
    fun bindStoriesByCategoryUseCase(impl: StoriesByCategoryUseCaseImpl): StoriesByCategoryUseCase
}