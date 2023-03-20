package com.example.stories.android.feature.common.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AdSettings(
    val beforeCount: Int,
    val isEnabled: Boolean,
    val price: Int
): Parcelable