package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.common.data.SettingsRepository
import com.example.stories.android.feature.common.data.datasource.remote.ApiService
import com.example.stories.android.feature.common.model.AdSettings
import javax.inject.Inject

internal class AdvertisementUseCaseImpl @Inject constructor(
    private val settingsRepository: SettingsRepository,
    private val apiService: ApiService
): AdvertisementUseCase {

    private companion object {
        const val RESET_STATE = 0
        const val AD_COUNT = 10
    }

    private var adSettingsCache: AdSettings? = null

    override suspend fun resetAlreadyReadArticleCount() {
        settingsRepository.setAlreadyReadArticleCount(RESET_STATE)
    }

    override suspend fun increaseReadArticleCount() {
        settingsRepository.increaseReadArticleCount()
    }

    override suspend fun isAdvertisementEnabled(): Boolean {
        val adSettings = adSettingsCache ?: run {
            adSettingsCache = apiService.getAdSettings().data
            return@run adSettingsCache
        }

        val localSettings = settingsRepository.getSettings()


        return (adSettings?.isEnabled == true && localSettings.isAdvertisementEnabled)
    }

    override suspend fun disableAdvertisement() {
        settingsRepository.disableAdvertisement()
    }

    override suspend fun isNeedToShowAd(): Boolean {
        val alreadyReadArticleCount = getAlreadyReadArticleCount()
        val articleCountBeforeAd = getArticleCountBeforeAdvertisement()

        return alreadyReadArticleCount >= articleCountBeforeAd
    }

    private suspend fun getAlreadyReadArticleCount(): Int {
        val settings = settingsRepository.getSettings()

        return settings.alreadyReadArticleCount
    }

    private suspend fun getArticleCountBeforeAdvertisement(): Int {
        val settings = adSettingsCache ?: run {
            adSettingsCache = apiService.getAdSettings().data
            return@run adSettingsCache
        }

        return settings?.beforeCount ?: AD_COUNT
    }
}