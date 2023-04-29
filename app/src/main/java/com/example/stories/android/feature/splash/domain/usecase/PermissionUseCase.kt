package com.example.stories.android.feature.splash.domain.usecase

internal interface PermissionUseCase {

    suspend fun isNeedToRequestNotificationPermission(): Boolean

    suspend fun increaseSessionCountBeforeRequestPermission()

    suspend fun resetSessionCountBeforeRequestPermission()

    suspend fun setPermissionState(isEnabled: Boolean)

    suspend fun isPermissionAlreadyAllow(): Boolean
}