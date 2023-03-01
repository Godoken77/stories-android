package com.example.stories.android.feature.main.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.main.domain.MainSideEffect
import com.example.stories.android.feature.main.domain.MainState
import com.example.stories.android.feature.main.domain.model.StoryItem
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val router: Router
) : ViewModel(), ContainerHost<MainState, MainSideEffect> {

    override val container: Container<MainState, MainSideEffect> =
        container(
            initialState = MainState(
                recentlyStories = emptyList(),
                recommendedStories = emptyList(),
                categories = Category.values().asList(),
                storyToContinue = StoryItem(id = "id")
            ),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {

    }
}