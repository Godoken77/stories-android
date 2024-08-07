package com.example.stories.android.feature.splash.di

import com.example.stories.android.feature.splash.domain.usecase.FirstSessionUseCase
import com.example.stories.android.feature.splash.domain.usecase.FirstSessionUseCaseImpl
import com.example.stories.android.feature.splash.domain.usecase.PreloadStoriesUseCase
import com.example.stories.android.feature.splash.domain.usecase.PreloadStoriesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
internal interface SplashModule {

    @Binds
    fun bindFirstSessionUseCase(impl: FirstSessionUseCaseImpl): FirstSessionUseCase

    @Binds
    fun bindPreloadStoriesUseCase(impl: PreloadStoriesUseCaseImpl): PreloadStoriesUseCase
}