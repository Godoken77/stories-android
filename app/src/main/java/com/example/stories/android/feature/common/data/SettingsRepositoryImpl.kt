package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.data.datasource.db.dao.SettingsDao
import com.example.stories.android.feature.common.data.datasource.db.entity.SettingsEntity
import com.example.stories.android.feature.common.data.datasource.remote.ApiService
import com.example.stories.android.feature.common.data.datasource.remote.Service
import javax.inject.Inject

internal class SettingsRepositoryImpl @Inject constructor(
    private val settingsDao: SettingsDao,
    private val service: Service,
    private val apiService: ApiService
): SettingsRepository {
    override suspend fun getSettings(): SettingsEntity {
        var settingsEntity: SettingsEntity? = null

        // Server models updating - delete in release version

        /*val stories = service.storiesWithContent
        stories.forEach {
            apiService.setStory(it)
        }*/
        
        /*val result = apiService.getStories().data
        result?.forEach {
            apiService.deleteStory(it.id)
        }*/

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

    override suspend fun setAlreadyReadArticleCount(count: Int) {
        val currentSettings = settingsDao.getSettings()

        if (currentSettings != null) {
            val updatedSettings = currentSettings.copy(
                alreadyReadArticleCount = count
            )
            settingsDao.updateSettings(updatedSettings)
        } else {
            val updatedSettings = SettingsEntity().copy(
                alreadyReadArticleCount = count
            )
            settingsDao.updateSettings(updatedSettings)
        }
    }

    override suspend fun increaseReadArticleCount() {
        val currentSettings = settingsDao.getSettings()

        if (currentSettings != null) {
            val updatedSettings = currentSettings.copy(
                alreadyReadArticleCount = currentSettings.alreadyReadArticleCount + 1
            )
            settingsDao.updateSettings(updatedSettings)
        } else {
            val updatedSettings = SettingsEntity().copy(
                alreadyReadArticleCount = 1
            )
            settingsDao.updateSettings(updatedSettings)
        }
    }
}