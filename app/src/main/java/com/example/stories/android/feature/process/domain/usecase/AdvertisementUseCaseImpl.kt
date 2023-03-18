package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.common.data.SettingsRepository
import com.example.stories.android.feature.common.data.datasource.remote.AdService
import javax.inject.Inject

internal class AdvertisementUseCaseImpl @Inject constructor(
    private val settingsRepository: SettingsRepository,
    private val service: AdService
): AdvertisementUseCase {

    private companion object {
        const val RESET_STATE = 0
    }

    override suspend fun resetAlreadyReadArticleCount() {
        settingsRepository.setAlreadyReadArticleCount(RESET_STATE)
    }

    override suspend fun increaseReadArticleCount() {
        settingsRepository.increaseReadArticleCount()
    }

    override suspend fun isAdvertisementEnabled(): Boolean {
        return service.getAdSettings().isEnabled
    }

    override suspend fun getBlockAdPrice(): String {
        return service.getAdSettings().price.toPriceFormat()
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
        return service.getAdSettings().beforeCount
    }

    private fun Int.toPriceFormat(): String {
        val fractional = this.mod(100)
        val int = this.div(100)

        return "$int,$fractional"
    }
}