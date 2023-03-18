package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.common.model.AdSettings

internal class AdService {

    suspend fun getAdSettings(): AdSettings {
        return AdSettings(
            beforeCount = 1,
            isEnabled = true,
            price = 499
        )
    }
}