package com.example.stories.android.feature.stories.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.analytics.domain.AmplitudeAnalytics
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.main.domain.usecase.RecommendedStoriesUseCase
import com.example.stories.android.feature.stories.domain.StoriesSideEffect
import com.example.stories.android.feature.stories.domain.StoriesState
import com.example.stories.android.feature.stories.domain.model.IStoryItem
import com.example.stories.android.feature.stories.domain.usecase.StoriesByCategoryUseCase
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class StoriesViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val storiesByCategoryUseCase: StoriesByCategoryUseCase,
    private val recommendedStoriesUseCase: RecommendedStoriesUseCase,
    private val amplitudeAnalytics: AmplitudeAnalytics,
    private val router: Router
) : ViewModel(), ContainerHost<StoriesState, StoriesSideEffect> {

    companion object {
        const val CATEGORY = "category"
    }

    private val category: Category by lazy {
        requireNotNull(savedStateHandle[CATEGORY])
    }

    override val container: Container<StoriesState, StoriesSideEffect> =
        container(
            initialState = StoriesState(
                stories = listOf(
                    IStoryItem.ShimmerItem,
                    IStoryItem.ShimmerItem,
                    IStoryItem.ShimmerItem,
                    IStoryItem.ShimmerItem,
                    IStoryItem.ShimmerItem,
                    IStoryItem.ShimmerItem
                ),
                category = CategoryItem.fromCategory(category),
                recommendedStories = listOf()
            ),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {
        storiesByCategoryUseCase
            .runCatching { getStoriesByCategory(category) }
            .onSuccess { stories ->
                val recommendedStories = recommendedStoriesUseCase.getRecommendedStories()
                    .filter {
                        !it.categories.contains(category)
                    }

                reduce {
                    state.copy(
                        stories = stories,
                        recommendedStories = recommendedStories,
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

    fun onBackPressed() = intent {
        router.exit()
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
                    second = "CATEGORY_RECOMMENDED"
                )
            )
        )
        openStory(storyId)
    }

    fun openStoryFromList(storyId: String) = intent {
        amplitudeAnalytics.logEvent(
            event = "open_story",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                ),
                Pair(
                    first = "start_point",
                    second = "CATEGORY"
                )
            )
        )
        openStory(storyId)
    }

    private fun openStory(storyId: String) = intent {
        router.navigateTo(AppScreens.StoryProcessScreen(storyId))
    }
}