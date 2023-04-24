package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.common.data.SettingsRepository
import javax.inject.Inject

internal class RateAppUseCaseImpl @Inject constructor(
    private val settingsRepository: SettingsRepository
) : RateAppUseCase {

    override suspend fun isAppRated(): Boolean {
        val settings = settingsRepository.getSettings()

        return settings.isAppRated
    }

    override suspend fun setAppRated() {
        settingsRepository.setAppRated()
    }
}