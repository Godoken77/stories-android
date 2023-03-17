package com.example.stories.android.feature.splash.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SplashState(
    val isProgress: Boolean = true,
    val isFailure: Boolean = false
): Parcelable
