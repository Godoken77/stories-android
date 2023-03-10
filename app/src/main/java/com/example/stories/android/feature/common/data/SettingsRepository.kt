package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.data.datasource.db.entity.SettingsEntity

internal interface SettingsRepository {

    suspend fun getSettings(): SettingsEntity

    suspend fun setStoryToContinue(storyId: String)
}