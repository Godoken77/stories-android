package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.data.datasource.db.dao.SettingsDao
import com.example.stories.android.feature.common.data.datasource.db.entity.SettingsEntity
import javax.inject.Inject

internal class SettingsRepositoryImpl @Inject constructor(
    private val settingsDao: SettingsDao
): SettingsRepository {
    override suspend fun getSettings(): SettingsEntity {
        var settingsEntity: SettingsEntity? = null

        settingsDao.runCatching { getSettings() }
            .onSuccess { currentSettings ->
                if (currentSettings == null) {
                    val defaultSettings = SettingsEntity()
                    settingsDao.runCatching {
                        updateSettings(defaultSettings)
                    }.onSuccess {
                        settingsEntity = defaultSettings
                    }
                } else {
                    settingsEntity = currentSettings
                }
            }
            .onFailure {
                val defaultSettings = SettingsEntity()
                settingsDao.runCatching {
                    updateSettings(defaultSettings)
                }.onSuccess {
                    settingsEntity = defaultSettings
                }
            }

        return requireNotNull(settingsEntity)
    }

    override suspend fun setStoryToContinue(storyId: String) {
        val currentSettings = settingsDao.getSettings()

        if (currentSettings != null) {
            val updatedSettings = currentSettings.copy(
                storyToContinueId = storyId
            )
            settingsDao.updateSettings(updatedSettings)
        } else {
            val updatedSettings = SettingsEntity().copy(
                storyToContinueId = storyId
            )
            settingsDao.updateSettings(updatedSettings)
        }
    }

    override suspend fun setFirstSessionState(isFirst: Boolean) {
        val currentSettings = settingsDao.getSettings()

        if (currentSettings != null) {
            val updatedSettings = currentSettings.copy(
                isFirstSession = isFirst
            )
            settingsDao.updateSettings(updatedSettings)
        } else {
            val updatedSettings = SettingsEntity().copy(
                isFirstSession = isFirst
            )
            settingsDao.updateSettings(updatedSettings)
        }
    }
}