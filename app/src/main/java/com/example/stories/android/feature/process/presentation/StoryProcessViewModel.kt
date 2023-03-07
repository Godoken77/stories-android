package com.example.stories.android.feature.process.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.process.domain.StoryProcessSideEffect
import com.example.stories.android.feature.process.domain.StoryProcessState
import com.example.stories.android.feature.process.domain.model.StoryProcessModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class StoryProcessViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val router: Router
) : ViewModel(), ContainerHost<StoryProcessState, StoryProcessSideEffect> {

    companion object {
        const val STORY_ID = "storyId"
    }

    private val storyId: String by lazy {
        requireNotNull(savedStateHandle[STORY_ID])
    }

    override val container: Container<StoryProcessState, StoryProcessSideEffect> =
        container(
            initialState = StoryProcessState(
                storyProcessModel = StoryProcessModel(
                    id = "2",
                    pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                    name = "Белый Бим",
                    categories = listOf(Category.NEW, Category.COMEDY),
                    storyParts = listOf()
                )
            ),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {

    }
}