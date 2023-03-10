package com.example.stories.android.feature.common.di

import androidx.room.Room
import com.example.stories.android.App
import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.common.data.StoryRepositoryImpl
import com.example.stories.android.feature.common.data.datasource.db.Database
import com.example.stories.android.feature.common.data.datasource.db.dao.StoryDao
import com.example.stories.android.feature.common.data.datasource.remote.Service
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal interface CommonModule {

    @Binds
    fun bindStoryRepository(impl: StoryRepositoryImpl): StoryRepository
}

@InstallIn(SingletonComponent::class)
@Module
internal object CommonProvideModule {

    @Provides
    @Singleton
    fun provideDb(): Database =
        Room.databaseBuilder(
            App.INSTANCE.applicationContext,
            Database::class.java, "db"
        ).build()

    @Provides
    @Singleton
    fun provideStoryDao(db: Database): StoryDao =
        db.storyDao()

    @Provides
    @Singleton
    fun provideService(): Service =
        Service()
}