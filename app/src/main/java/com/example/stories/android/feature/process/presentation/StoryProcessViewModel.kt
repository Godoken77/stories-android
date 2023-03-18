package com.example.stories.android.feature.process.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.process.domain.PayOffer
import com.example.stories.android.feature.process.domain.StoryProcessSideEffect
import com.example.stories.android.feature.process.domain.StoryProcessState
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import com.example.stories.android.feature.process.domain.usecase.AdvertisementUseCase
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
    private val advertisementUseCase: AdvertisementUseCase,
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
            .runCatching { getStoryProcessWithStoryParts(storyId) }
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

    fun onResetProgressClicked() = intent {
        postSideEffect(StoryProcessSideEffect.ShowResetConfirmationDialog)
    }

    fun onConfirmResetClicked(storyProcess: IStoryProcess.StoryProcessModel) = intent {
        resetProgress(storyProcess)
        postSideEffect(StoryProcessSideEffect.DismissResetConfirmationDialog)
    }

    fun onDismissResetClicked() = intent {
        postSideEffect(StoryProcessSideEffect.DismissResetConfirmationDialog)
    }

    fun onLikeClicked() = intent {
        //Analytics
    }

    fun onDislikeClicked() = intent {
        //Analytics
        postSideEffect(StoryProcessSideEffect.HideRateBottomSheet)
    }

    fun onRateConfirmClicked() = intent {
        //Go to Play Market
        postSideEffect(StoryProcessSideEffect.HideRateBottomSheet)
    }

    fun onRateDismissClicked() = intent {
        postSideEffect(StoryProcessSideEffect.HideRateBottomSheet)
    }

    fun onPayClicked() = intent {
        // Make pay for ad block
    }

    fun onShowAdClicked() = intent {
        advertisementUseCase.runCatching { resetAlreadyReadArticleCount() }
            .onSuccess {
                reduce {
                    state.copy(
                        payOffer = null
                    )
                }
                postSideEffect(StoryProcessSideEffect.ShowAd)
            }
    }

    fun onContinueClicked(storyProcess: IStoryProcess.StoryProcessModel) = intent {
        if (advertisementUseCase.isAdvertisementEnabled()) {
            val isNeedToShowAd = advertisementUseCase.isNeedToShowAd()
            if (isNeedToShowAd) {
                val price = advertisementUseCase.getBlockAdPrice()
                reduce {
                    state.copy(
                        payOffer = PayOffer(
                            price = price
                        )
                    )
                }
                postSideEffect(StoryProcessSideEffect.ScrollToLastArticle)
                return@intent
            }
        }

        reduce {
            state.copy(
                isProgress = true
            )
        }

        val storyParts = storyProcess.storyParts
        val currentStoryPart = storyParts.first {
            it.partId == storyProcess.currentPartId
        }

        val currentArticle = currentStoryPart.articles.last { it.isOpen }
        val nextArticle = currentStoryPart.articles.firstOrNull { !it.isOpen }

        if (nextArticle == null && currentStoryPart.partId == storyParts.last().partId) {
            reduce {
                state.copy(
                    isProgress = false
                )
            }
            postSideEffect(StoryProcessSideEffect.ShowRateBottomSheet)
            return@intent
        }

        if (nextArticle == null) {
            openNextStoryPart(
                choice = currentArticle.choices.first(),
                storyProcess = storyProcess
            )
            return@intent
        }

        storyProcessUseCase.runCatching {
            setArticleOpened(
                storyId = storyProcess.id,
                partId = storyProcess.currentPartId,
                articleId = nextArticle.id
            )
        }.onSuccess { updatedArticles ->
            advertisementUseCase.increaseReadArticleCount()
            reduce {
                state.copy(
                    storyProcessModel = storyProcess.copy(
                        storyParts = storyParts.map { storyPart ->
                            if (storyPart.partId == storyProcess.currentPartId) {
                                storyPart.copy(
                                    articles = updatedArticles
                                )
                            } else {
                                storyPart
                            }
                        }
                    ),
                    isProgress = false
                )
            }
        }.onFailure {
            reduce {
                state.copy(
                    isProgress = false
                )
            }
        }

        postSideEffect(StoryProcessSideEffect.ScrollToLastArticle)
    }

    private fun openNextStoryPart(choice: Choice, storyProcess: IStoryProcess.StoryProcessModel) = intent {
        if (choice.nextStoryPartId != null) {
            storyProcessUseCase.runCatching {
                setStoryPart(
                    storyId = storyProcess.id,
                    partId = choice.nextStoryPartId
                )
            }.onSuccess {
                reduce {
                    state.copy(
                        storyProcessModel = storyProcess.copy(
                            currentPartId = it
                        )
                    )
                }
            }.onFailure {
                reduce {
                    state.copy(
                        isProgress = false
                    )
                }
            }
        }
    }

    private suspend fun resetProgress(storyProcess: IStoryProcess.StoryProcessModel) = intent {
        reduce {
            state.copy(
                isProgress = true
            )
        }

        storyProcessUseCase.runCatching { resetStoryProgress(storyProcess.id) }
            .onSuccess { defaultStoryPartId ->
                val defaultStoryParts = storyProcess.storyParts.map { part ->
                    part.copy(
                        articles = part.articles.mapIndexed { index, article ->
                            if (index == 0) {
                                article.copy(isOpen = true)
                            } else {
                                article.copy(isOpen = false)
                            }
                        }
                    )
                }

                reduce {
                    state.copy(
                        storyProcessModel = storyProcess.copy(
                            currentPartId = defaultStoryPartId,
                            storyParts = defaultStoryParts
                        )
                    )
                }
            }
    }
}