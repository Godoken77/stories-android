package com.example.stories.android.feature.common.di

import androidx.room.Room
import com.example.stories.android.App
import com.example.stories.android.feature.common.data.SettingsRepository
import com.example.stories.android.feature.common.data.SettingsRepositoryImpl
import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.common.data.StoryRepositoryImpl
import com.example.stories.android.feature.common.data.datasource.db.Database
import com.example.stories.android.feature.common.data.datasource.db.dao.SettingsDao
import com.example.stories.android.feature.common.data.datasource.db.dao.StoryDao
import com.example.stories.android.feature.common.data.datasource.remote.AdService
import com.example.stories.android.feature.common.data.datasource.remote.Service
import com.example.stories.android.feature.common.domain.GetKey
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
    @Singleton
    fun bindStoryRepository(impl: StoryRepositoryImpl): StoryRepository

    @Binds
    @Singleton
    fun bindSettingsRepository(impl: SettingsRepositoryImpl): SettingsRepository
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
    fun provideSettingsDao(db: Database): SettingsDao =
        db.settingsDao()

    @Provides
    @Singleton
    fun provideService(): Service =
        Service()

    @Provides
    @Singleton
    fun provideAdService(): AdService =
        AdService()

    @Provides
    @Singleton
    fun provideGetKey(): GetKey =
        GetKey()
}