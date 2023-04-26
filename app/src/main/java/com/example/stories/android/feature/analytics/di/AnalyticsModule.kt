package com.example.stories.android.feature.analytics.di

import com.example.stories.android.feature.analytics.domain.AmplitudeAnalytics
import com.example.stories.android.feature.analytics.domain.AmplitudeAnalyticsImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal interface AnalyticsModule {

    @Binds
    @Singleton
    fun bindAmplitudeAnalytics(impl: AmplitudeAnalyticsImpl): AmplitudeAnalytics
}