package com.example.stories.android.feature.common.di

import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.common.data.StoryRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal interface CommonModule {

    @Binds
    fun bindStoryRepository(impl: StoryRepositoryImpl): StoryRepository
}