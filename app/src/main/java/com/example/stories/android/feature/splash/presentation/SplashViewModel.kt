package com.example.stories.android.feature.splash.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.analytics.domain.AmplitudeAnalytics
import com.example.stories.android.feature.splash.domain.SplashSideEffect
import com.example.stories.android.feature.splash.domain.SplashState
import com.example.stories.android.feature.splash.domain.usecase.FirstSessionUseCase
import com.example.stories.android.feature.splash.domain.usecase.PreloadStoriesUseCase
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class SplashViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val firstSessionUse: FirstSessionUseCase,
    private val preloadStoriesUseCase: PreloadStoriesUseCase,
    private val amplitudeAnalytics: AmplitudeAnalytics,
    private val router: Router
) : ViewModel(), ContainerHost<SplashState, SplashSideEffect> {

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
                if (isFirst) {
                    openChooseCategoryScreen()
                } else {
                    openMainScreen()
                }
            }
            .onFailure {
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