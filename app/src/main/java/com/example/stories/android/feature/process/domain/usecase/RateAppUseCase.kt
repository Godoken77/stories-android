package com.example.stories.android.feature.process.domain.usecase

internal interface RateAppUseCase {

    suspend fun setAppRated()

    suspend fun isAppRated(): Boolean
}