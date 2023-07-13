package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.data.datasource.db.entity.SettingsEntity

internal interface SettingsRepository {

    suspend fun getSettings(): SettingsEntity

    suspend fun setStoryToContinue(storyId: String)

    suspend fun setFirstSessionState(isFirst: Boolean)

    suspend fun setAlreadyReadArticleCount(count: Int)

    suspend fun increaseReadArticleCount()

    suspend fun setSessionCount(count: Int)

    suspend fun increaseSessionCount()

    suspend fun setAppRated()

    suspend fun setNotifyPermissionState(isEnabled: Boolean)

    suspend fun disableAdvertisement()
}