package com.example.stories.android.feature.splash.domain.usecase

internal interface FirstSessionUseCase {

    suspend fun isFirstSession(): Boolean

    suspend fun setFirstSessionState(isFirst: Boolean)
}