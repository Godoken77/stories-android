package com.example.stories.android.feature.choose.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.analytics.domain.AmplitudeAnalytics
import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.choose.domain.ChooseCategorySideEffect
import com.example.stories.android.feature.choose.domain.ChooseCategoryState
import com.example.stories.android.feature.choose.domain.Pair
import com.example.stories.android.feature.choose.domain.usecase.CategoryToChooseUseCase
import com.example.stories.android.feature.splash.domain.usecase.FirstSessionUseCase
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class ChooseCategoryViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val categoryToChooseUseCase: CategoryToChooseUseCase,
    private val firstSessionUseCase: FirstSessionUseCase,
    private val amplitudeAnalytics: AmplitudeAnalytics,
    private val router: Router
) : ViewModel(), ContainerHost<ChooseCategoryState, ChooseCategorySideEffect> {

    override val container: Container<ChooseCategoryState, ChooseCategorySideEffect> =
        container(
            initialState = ChooseCategoryState(),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {
        categoryToChooseUseCase.runCatching { getCategoriesToChoose() }
            .onSuccess {
                val firstCategory = Pair(
                    first = CategoryItem.fromCategory(it.first.category),
                    second = it.first.storyId
                )
                val secondCategory = Pair(
                    first = CategoryItem.fromCategory(it.second.category),
                    second = it.second.storyId
                )

                reduce {
                    state.copy(
                        firstCategory = firstCategory,
                        secondCategory = secondCategory
                    )
                }
            }
            .onFailure {
                reduce {
                    state.copy(
                        isFailure = true
                    )
                }
            }
    }

    fun openStory(storyId: String) = intent {
        val categoryName = if (state.firstCategory!!.second == storyId) {
            state.firstCategory!!.first.category.name
        } else {
            state.secondCategory!!.first.category.name
        }

        amplitudeAnalytics.logEvent(
            event = "first_choose_click",
            properties = mapOf(
                Pair(
                    first = "category_name",
                    second = categoryName
                ),
                Pair(
                    first = "story_id",
                    second = storyId
                )
            )
        )
        firstSessionUseCase.setFirstSessionState(false)
        router.newRootChain(
            AppScreens.MainScreen(),
            AppScreens.StoryProcessScreen(
                storyId = storyId,
                isFirstStory = true
            )
        )
    }
}