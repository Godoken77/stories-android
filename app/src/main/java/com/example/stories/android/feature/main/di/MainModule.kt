package com.example.stories.android.feature.main.di

import com.example.stories.android.feature.main.domain.usecase.RecommendedStoriesUseCase
import com.example.stories.android.feature.main.domain.usecase.RecommendedStoriesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
internal interface MainModule {

    @Binds
    fun bindRecommendedStoriesUseCase(impl: RecommendedStoriesUseCaseImpl): RecommendedStoriesUseCase
}