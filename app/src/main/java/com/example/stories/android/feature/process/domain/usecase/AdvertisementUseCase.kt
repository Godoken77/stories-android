package com.example.stories.android.feature.process.domain.usecase

internal interface AdvertisementUseCase {

    suspend fun getBlockAdPrice(): String

    suspend fun resetAlreadyReadArticleCount()

    suspend fun isAdvertisementEnabled(): Boolean

    suspend fun isNeedToShowAd(): Boolean

    suspend fun increaseReadArticleCount()
}