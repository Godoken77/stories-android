package com.example.stories.android.feature.splash.domain.usecase

import com.example.stories.android.feature.common.data.SettingsRepository
import javax.inject.Inject

internal class PermissionUseCaseImpl @Inject constructor(
    private val settingsRepository: SettingsRepository
): PermissionUseCase {

    private companion object {
        const val RESET_STATE = 0
        const val SESSION_COUNT = 2
    }

    override suspend fun increaseSessionCountBeforeRequestPermission() {
        settingsRepository.increaseSessionCount()
    }

    override suspend fun resetSessionCountBeforeRequestPermission() {
        settingsRepository.setSessionCount(RESET_STATE)
    }

    override suspend fun isNeedToRequestNotificationPermission(): Boolean {
        val currentSessionCount = getCurrentSessionCount()
        val sessionCountBeforeRequest = SESSION_COUNT

        return currentSessionCount >= sessionCountBeforeRequest
    }

    override suspend fun setPermissionState(isEnabled: Boolean) {
        settingsRepository.setNotifyPermissionState(isEnabled)
    }

    override suspend fun isPermissionAlreadyAllow(): Boolean {
        return settingsRepository.getSettings().isNotifyPermissionEnabled
    }

    private suspend fun getCurrentSessionCount(): Int {
        val settings = settingsRepository.getSettings()

        return settings.sessionCount
    }
}