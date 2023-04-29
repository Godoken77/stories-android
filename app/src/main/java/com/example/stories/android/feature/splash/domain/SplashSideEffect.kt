package com.example.stories.android.feature.splash.domain

internal sealed class SplashSideEffect {

    object RequestPermissions : SplashSideEffect()
}