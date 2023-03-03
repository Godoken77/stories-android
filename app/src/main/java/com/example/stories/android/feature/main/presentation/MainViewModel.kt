package com.example.stories.android.feature.main.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.category.domain.usecase.CategoryUseCase
import com.example.stories.android.feature.main.domain.MainSideEffect
import com.example.stories.android.feature.main.domain.MainState
import com.example.stories.android.feature.main.domain.model.StoryItem
import com.example.stories.android.feature.main.domain.usecase.RecentlyStoriesUseCase
import com.example.stories.android.feature.main.domain.usecase.RecommendedStoriesUseCase
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
    private val router: Router
) : ViewModel(), ContainerHost<MainState, MainSideEffect> {

    override val container: Container<MainState, MainSideEffect> =
        container(
            initialState = MainState(
                recentlyStories = emptyList(),
                recommendedStories = emptyList(),
                categories = emptyList(),
                storyToContinue = StoryItem(
                    id = "id",
                    pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                    name = "Белый Бим"
                )
            ),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {
        recommendedStoriesUseCase
            .runCatching { getRecommendedStories() }
            .onSuccess { recommendedStories ->
                val categories = categoryUseCase.getCategories()
                val recentlyStories = recentlyStoriesUseCase.getRecentlyStories()
                reduce {
                    state.copy(
                        recommendedStories = recommendedStories,
                        categories = categories,
                        recentlyStories = recentlyStories,
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

    fun openStory(storyId: String) {
        // Go to Story
    }

    fun openStoriesByCategory(category: Category) {
        // Go to Stories List by Category
    }
}