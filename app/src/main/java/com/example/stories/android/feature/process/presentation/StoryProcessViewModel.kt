package com.example.stories.android.feature.process.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.process.domain.StoryProcessSideEffect
import com.example.stories.android.feature.process.domain.StoryProcessState
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import com.example.stories.android.feature.process.domain.usecase.StoryProcessUseCase
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class StoryProcessViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val storyProcessUseCase: StoryProcessUseCase,
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
                storyProcessModel = IStoryProcess.ShimmerItem
            ),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {
        storyProcessUseCase
            .runCatching { getStoryProcessByStoryId(storyId) }
            .onSuccess { storyProcess ->
                reduce {
                    state.copy(
                        storyProcessModel = storyProcess,
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

    fun openStoriesByCategory(category: Category) = intent {
        router.navigateTo(AppScreens.StoriesScreen(category))
    }

    fun onBackPressed() = intent {
        router.exit()
    }

    fun onContinueClicked(storyProcess: IStoryProcess.StoryProcessModel) = intent {
        val storyParts = storyProcess.storyParts
        val currentStoryPart = storyParts.first {
            it.partId == storyProcess.currentPartId
        }

        val nextArticle = currentStoryPart.articles.first { !it.isOpen }

        reduce {
            state.copy(
                storyProcessModel = storyProcess.copy(
                    storyParts = storyParts.map {
                        if (it.partId == currentStoryPart.partId) {
                            currentStoryPart.copy(
                                articles = currentStoryPart.articles.map { article ->
                                    if (article.id == nextArticle.id) {
                                        article.copy(isOpen = true)
                                    } else {
                                        article
                                    }
                                }
                            )
                        } else {
                            it
                        }
                    }
                )
            )
        }
        postSideEffect(StoryProcessSideEffect.ScrollToLastArticle)
    }

    fun onChoiceClicked(choice: Choice, storyProcess: IStoryProcess.StoryProcessModel) = intent {
        if (choice.nextStoryPartId != null) {
            reduce {
                state.copy(
                    storyProcessModel = storyProcess.copy(
                        currentPartId = choice.nextStoryPartId
                    )
                )
            }
        }
    }

    fun onResetProgressClicked(storyId: String) = intent {
        // Open dialog to confirm reset
    }
}