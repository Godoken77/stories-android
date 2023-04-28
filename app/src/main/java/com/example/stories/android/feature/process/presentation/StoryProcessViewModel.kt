package com.example.stories.android.feature.process.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.analytics.domain.AmplitudeAnalytics
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.process.domain.PayOffer
import com.example.stories.android.feature.process.domain.StoryProcessSideEffect
import com.example.stories.android.feature.process.domain.StoryProcessState
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import com.example.stories.android.feature.process.domain.usecase.AdvertisementUseCase
import com.example.stories.android.feature.process.domain.usecase.RateAppUseCase
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
    private val rateAppUseCase: RateAppUseCase,
    private val amplitudeAnalytics: AmplitudeAnalytics,
    private val router: Router
) : ViewModel(), ContainerHost<StoryProcessState, StoryProcessSideEffect> {

    companion object {
        const val STORY_ID = "storyId"
        const val IS_FIRST_STORY_STATE = "isFirstStory"
    }

    private val storyId: String by lazy {
        requireNotNull(savedStateHandle[STORY_ID])
    }

    private val isFirstStory: Boolean by lazy {
        savedStateHandle[IS_FIRST_STORY_STATE] ?: false
    }

    private var adCount: Int = 0

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
        if (isFirstStory) {
            return@intent
        }
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

    fun onBackPressed() = intent {
        router.exit()
    }

    fun onResetProgressClicked() = intent {
        postSideEffect(StoryProcessSideEffect.ShowResetConfirmationDialog)
    }

    fun onConfirmResetClicked(storyProcess: IStoryProcess.StoryProcessModel) = intent {
        amplitudeAnalytics.logEvent(
            event = "reset_progress_confirm",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                )
            )
        )
        resetProgress(storyProcess)
        postSideEffect(StoryProcessSideEffect.DismissResetConfirmationDialog)
    }

    fun onDismissResetClicked() = intent {
        postSideEffect(StoryProcessSideEffect.DismissResetConfirmationDialog)
    }

    fun onLikeClicked() = intent {
        amplitudeAnalytics.logEvent(
            event = "rate_story",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                ),
                Pair(
                    first = "rate_state",
                    second = "GOOD"
                )
            )
        )
        storyProcessUseCase.setStoryRated(storyId = storyId)
        if (!rateAppUseCase.isAppRated()) {
            postSideEffect(StoryProcessSideEffect.ShowRateAppBottomSheet)
        } else {
            postSideEffect(StoryProcessSideEffect.HideRateBottomSheet)
        }
    }

    fun onDislikeClicked() = intent {
        amplitudeAnalytics.logEvent(
            event = "rate_story",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                ),
                Pair(
                    first = "rate_state",
                    second = "BAD"
                )
            )
        )
        storyProcessUseCase.setStoryRated(storyId = storyId)
        postSideEffect(StoryProcessSideEffect.HideRateBottomSheet)
    }

    fun onRateConfirmClicked() = intent {
        amplitudeAnalytics.logEvent(
            event = "rate_app",
            properties = mapOf(
                Pair(
                    first = "story_id",
                    second = storyId
                )
            )
        )
        rateAppUseCase.setAppRated()
        postSideEffect(StoryProcessSideEffect.OpenPlayMarket)
        //Go to Play Market
    }

    fun onRateDismissClicked() = intent {
        postSideEffect(StoryProcessSideEffect.HideRateBottomSheet)
    }

    fun onPayClicked() = intent {
        postSideEffect(StoryProcessSideEffect.StartPayment)
    }

    /*fun updatePrice(productDetails: DataWrappers.ProductDetails) = intent {
        reduce {
            state.copy(
                payOffer = state.payOffer.copy(
                    price = productDetails.price.orEmpty()
                )
            )
        }
    }*/

    fun onPaymentConfirmed() = intent {
        reduce {
            state.copy(
                payOffer = state.payOffer.copy(
                    isEnabled = false
                )
            )
        }
    }

    fun onShowAdClicked() = intent {
        advertisementUseCase.runCatching { resetAlreadyReadArticleCount() }
            .onSuccess {
                reduce {
                    state.copy(
                        payOffer = state.payOffer.copy(
                            isEnabled = false
                        )
                    )
                }
                postSideEffect(StoryProcessSideEffect.ShowAd)
            }
    }

    fun onContinueClicked(storyProcess: IStoryProcess.StoryProcessModel) = intent {
        val isNeedToShowAd = advertisementUseCase.isNeedToShowAd()

        if (advertisementUseCase.isAdvertisementEnabled() && !isFirstStory) {
            if (isNeedToShowAd) {
                if (!state.payOffer.price.isNullOrEmpty()) {
                    reduce {
                        state.copy(
                            payOffer = PayOffer(
                                isEnabled = true
                            )
                        )
                    }
                    postSideEffect(StoryProcessSideEffect.ScrollToLastArticle)
                } else {
                    adCount += 1
                    amplitudeAnalytics.logEvent(
                        event = "ad_open",
                        properties = mapOf(
                            Pair(
                                first = "story_id",
                                second = storyId
                            ),
                            Pair(
                                first = "ad_count",
                                second = adCount
                            )
                        )
                    )
                    onShowAdClicked()
                }
                return@intent
            }
        } else {
            if (isNeedToShowAd) {
                adCount += 1
                amplitudeAnalytics.logEvent(
                    event = "ad_lost",
                    properties = mapOf(
                        Pair(
                            first = "story_id",
                            second = storyId
                        ),
                        Pair(
                            first = "ad_count",
                            second = adCount
                        )
                    )
                )
                advertisementUseCase.resetAlreadyReadArticleCount()
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
            if (!storyProcess.isRated) {
                amplitudeAnalytics.logEvent(
                    event = "rate_story_open",
                    properties = mapOf(
                        Pair(
                            first = "story_id",
                            second = storyId
                        )
                    )
                )
                postSideEffect(StoryProcessSideEffect.ShowRateBottomSheet)
            }
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