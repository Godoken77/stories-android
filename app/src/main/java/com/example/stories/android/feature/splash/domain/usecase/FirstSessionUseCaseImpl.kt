package com.example.stories.android.feature.splash.domain.usecase

import com.example.stories.android.feature.common.data.SettingsRepository
import javax.inject.Inject

internal class FirstSessionUseCaseImpl @Inject constructor(
    private val settingsRepository: SettingsRepository
) : FirstSessionUseCase {

    override suspend fun isFirstSession(): Boolean {
        val settings = settingsRepository.getSettings()
        return settings.isFirstSession
    }

    override suspend fun setFirstSessionState(isFirst: Boolean) {
        settingsRepository.setFirstSessionState(isFirst)
    }
}