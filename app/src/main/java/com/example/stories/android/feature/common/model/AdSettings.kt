package com.example.stories.android.feature.common.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AdSettings(
    @SerializedName("freeScreenings")
    val beforeCount: Int,
    @SerializedName("enabled")
    val isEnabled: Boolean
): Parcelable