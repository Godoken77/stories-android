package com.example.stories.android.feature.main.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.analytics.domain.AmplitudeAnalytics
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.category.domain.usecase.CategoryUseCase
import com.example.stories.android.feature.main.domain.MainSideEffect
import com.example.stories.android.feature.main.domain.MainState
import com.example.stories.android.feature.main.domain.usecase.RecentlyStoriesUseCase
import com.example.stories.android.feature.main.domain.usecase.RecommendedStoriesUseCase
import com.example.stories.android.feature.stories.domain.model.IStoryItem
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class MainViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val recommendedStoriesUseCase: RecommendedStoriesUseCase,
    private val recentlyStoriesUseCase: RecentlyStoriesUseCase,
    private val categoryUseCase: CategoryUseCase,
    private val amplitudeAnalytics: AmplitudeAnalytics,
    private val router: Router
) : ViewModel(), ContainerHost<MainState, MainSideEffect> {

    override val container: Container<MainState, MainSideEffect> =
        container(
            initialState = MainState(
                recentlyStories = emptyList(),
                recommendedStories = emptyList(),
                categories = emptyList(),
                storyToContinue = IStoryItem.ShimmerItem
            ),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {}

    fun updateState() = intent {
        recommendedStoriesUseCase
            .runCatching { getRecommendedStories() }
            .onSuccess { recommendedStories ->
                val categories = categoryUseCase.getCategories()
                val recentlyStories = recentlyStoriesUseCase.getRecentlyStories()
                val storyToContinue = recentlyStoriesUseCase.getStoryToContinue()
                reduce {
                    state.copy(
                        recommendedStories = recommendedStories,
                        categories = categories,
                        recentlyStories = recentlyStories,
                        storyToContinue = storyToContinue,
                        isProgress = false
                    )
                }
            }
            .onFailure {
                reduce {
                    state.copy(
                        isProgress = false,
                        isFailure = true
                    )
                }
            }
    }

    fun continueStory(storyId: String) = intent {
        amplitudeAnalytics.logEvent(
            event = "open_story",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                ),
                Pair(
                    first = "start_point",
                    second = "CONTINUE"
                )
            )
        )
        openStory(storyId = storyId)
    }

    fun openRecommendedStory(storyId: String) = intent {
        amplitudeAnalytics.logEvent(
            event = "open_story",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                ),
                Pair(
                    first = "start_point",
                    second = "RECOMMENDED"
                )
            )
        )
        openStory(storyId = storyId)
    }

    fun openRecentlyStory(storyId: String) = intent {
        amplitudeAnalytics.logEvent(
            event = "open_story",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                ),
                Pair(
                    first = "start_point",
                    second = "RECENTLY"
                )
            )
        )
        openStory(storyId = storyId)
    }

    private fun openStory(storyId: String) = intent {
        router.navigateTo(AppScreens.StoryProcessScreen(storyId))
    }

    fun openStoriesByCategory(category: Category) = intent {
        amplitudeAnalytics.logEvent(
            event = "select_category",
            properties = mapOf(
                Pair(
                    first = "category",
                    second = category.name.uppercase()
                )
            )
        )
        router.navigateTo(AppScreens.StoriesScreen(category))
    }
}