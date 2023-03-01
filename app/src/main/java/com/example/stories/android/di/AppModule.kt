package com.example.stories.android.di

import com.example.stories.android.App
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal class AppModule {
    @Provides
    fun provideRouter(): Router =
        App.INSTANCE.router
}