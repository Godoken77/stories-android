package com.example.stories.android.feature.splash.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.analytics.domain.AmplitudeAnalytics
import com.example.stories.android.feature.splash.domain.SplashSideEffect
import com.example.stories.android.feature.splash.domain.SplashState
import com.example.stories.android.feature.splash.domain.usecase.FirstSessionUseCase
import com.example.stories.android.feature.splash.domain.usecase.PermissionUseCase
import com.example.stories.android.feature.splash.domain.usecase.PreloadStoriesUseCase
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class SplashViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val firstSessionUse: FirstSessionUseCase,
    private val preloadStoriesUseCase: PreloadStoriesUseCase,
    private val permissionUseCase: PermissionUseCase,
    private val amplitudeAnalytics: AmplitudeAnalytics,
    private val router: Router
) : ViewModel(), ContainerHost<SplashState, SplashSideEffect> {

    private var isFirstSession: Boolean = false

    override val container: Container<SplashState, SplashSideEffect> =
        container(
            initialState = SplashState(),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {
        preloadStoriesUseCase.preloadStories()
        firstSessionUse.runCatching { isFirstSession() }
            .onSuccess { isFirst ->
                isFirstSession = isFirst

                if (permissionUseCase.isPermissionAlreadyAllow()) {
                    openNextScreen()
                    return@intent
                }

                if (permissionUseCase.isNeedToRequestNotificationPermission() || isFirstSession) {
                    permissionUseCase.resetSessionCountBeforeRequestPermission()
                    postSideEffect(SplashSideEffect.RequestPermissions)
                } else {
                    permissionUseCase.increaseSessionCountBeforeRequestPermission()
                    openNextScreen()
                }
            }
            .onFailure {
                isFirstSession = false

                if (permissionUseCase.isPermissionAlreadyAllow()) {
                    openNextScreen()
                    return@intent
                }

                if (permissionUseCase.isNeedToRequestNotificationPermission()) {
                    permissionUseCase.resetSessionCountBeforeRequestPermission()
                    postSideEffect(SplashSideEffect.RequestPermissions)
                } else {
                    permissionUseCase.increaseSessionCountBeforeRequestPermission()
                    openNextScreen()
                }
            }
    }

    fun handleRequestPermissionResult(isEnabled: Boolean) = intent {
        amplitudeAnalytics.logEvent(
            event = "notification_permission_result",
            properties = mapOf(
                Pair(
                    first = "is_allow",
                    second = isEnabled
                ),
                Pair(
                    first = "is_first_request",
                    second = isFirstSession
                )
            )
        )
        permissionUseCase.setPermissionState(isEnabled)
        openNextScreen()
    }

    fun openNextScreen()= intent {
        if (isFirstSession) {
            openChooseCategoryScreen()
        } else {
            openMainScreen()
        }
    }

    private fun openChooseCategoryScreen() = intent {
        router.replaceScreen(AppScreens.ChooseCategoryScreen())
    }

    private fun openMainScreen() = intent {
        router.newRootScreen(AppScreens.MainScreen())
    }
}