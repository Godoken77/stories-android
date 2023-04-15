package com.example.stories.android.feature.process.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring.StiffnessVeryLow
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.animation.core.spring
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.AsyncImage
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.views.Button
import com.example.stories.android.common.design.views.ButtonBack
import com.example.stories.android.common.design.views.ButtonIcon
import com.example.stories.android.common.design.views.ButtonViewState
import com.example.stories.android.common.design.views.CategoryItem
import com.example.stories.android.common.design.views.CategoryItemViewState
import com.example.stories.android.common.design.views.Grip
import com.example.stories.android.common.design.views.MarginHorizontal
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.PlainText
import com.example.stories.android.common.design.views.RemarkItem
import com.example.stories.android.common.design.views.RemarkItemViewState
import com.example.stories.android.common.design.views.Title1
import com.example.stories.android.common.design.views.Title4
import com.example.stories.android.feature.process.domain.StoryProcessSideEffect
import com.example.stories.android.feature.process.domain.StoryProcessState
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.presentation.dialog.ResetConfirmationDialogScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.neural.stories.R
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun StoryProcessScreen(
    viewModel: StoryProcessViewModel,
    showAd: () -> Unit,
    startPayment: () -> Unit
) {
    val state = viewModel.collectAsState().value

    val scrollState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    val modalBottomSheetState: ModalBottomSheetState = androidx.compose.material.rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        skipHalfExpanded = true
    )

    val resetConfirmationDialogVisibility = remember {
        mutableStateOf(false)
    }

    val rateAppState = remember {
        mutableStateOf(false)
    }

    viewModel.collectSideEffect {
        when(it) {
            is StoryProcessSideEffect.ScrollToLastArticle -> {
                scope.launch {
                    // Dirty hack
                    delay(150)
                    scrollState.animateScrollToItem(
                        index = scrollState.layoutInfo.totalItemsCount - 1
                    )
                }
            }
            is StoryProcessSideEffect.ShowResetConfirmationDialog -> {
                resetConfirmationDialogVisibility.value = true
            }
            is StoryProcessSideEffect.DismissResetConfirmationDialog -> {
                resetConfirmationDialogVisibility.value = false
            }
            is StoryProcessSideEffect.ShowRateBottomSheet -> {
                scope.launch {
                    modalBottomSheetState.show()
                }
            }
            is StoryProcessSideEffect.HideRateBottomSheet -> {
                scope.launch {
                    modalBottomSheetState.hide()
                }.invokeOnCompletion {
                    rateAppState.value = false
                }
            }
            is StoryProcessSideEffect.ShowAd -> {
                showAd()
            }
            is StoryProcessSideEffect.StartPayment -> {
                startPayment()
            }
        }
    }

    if (state.storyProcessModel is IStoryProcess.StoryProcessModel &&
        resetConfirmationDialogVisibility.value
    ) {
        Dialog(
            onDismissRequest = {
                resetConfirmationDialogVisibility.value = false
            },
            properties = DialogProperties(
                dismissOnClickOutside = true,
                usePlatformDefaultWidth = false
            )
        ) {
            ResetConfirmationDialogScreen(
                onConfirmClicked = {
                    viewModel.onConfirmResetClicked(state.storyProcessModel)
                },
                onDismissClicked = viewModel::onDismissResetClicked
            )
        }
    }

    ModalBottomSheetLayout(
        sheetContent = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        end = 10.dp,
                        bottom = 40.dp
                    )
                    .fillMaxWidth()
                    .animateContentSize()
            ) {
                MarginVertical(margin = 8.dp)
                Grip(Modifier.align(Alignment.CenterHorizontally))
                MarginVertical(margin = 28.dp)
                if (!rateAppState.value) {
                    Title4(
                        text = stringResource(id = R.string.story_process_rate_story_title),
                        textAlign = TextAlign.Center
                    )
                    MarginVertical(margin = 20.dp)
                    Row(horizontalArrangement = Arrangement.Center) {
                        ButtonIcon(
                            iconId = R.drawable.ic_like,
                            onClick = {
                                viewModel.onLikeClicked()
                                rateAppState.value = true
                            },
                            buttonSize = 72.dp,
                            iconSize = 24.dp,
                            backgroundColor = AppColors.Green
                        )
                        MarginHorizontal(margin = 20.dp)
                        ButtonIcon(
                            iconId = R.drawable.ic_dislike,
                            onClick = {
                                viewModel.onDislikeClicked()
                            },
                            buttonSize = 72.dp,
                            iconSize = 24.dp,
                            backgroundColor = AppColors.Red
                        )
                    }
                } else {
                    Title4(
                        text = stringResource(id = R.string.story_process_rate_app_title),
                        textAlign = TextAlign.Center
                    )
                    MarginVertical(margin = 20.dp)
                    Button(
                        state = ButtonViewState(
                            title = stringResource(id = R.string.story_process_rate_app_confirm),
                            backgroundColor = AppColors.Purple
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .defaultMinSize(minHeight = 58.dp),
                        onClick = {
                            viewModel.onRateConfirmClicked()
                        }
                    )
                    MarginVertical(margin = 10.dp)
                    Button(
                        state = ButtonViewState(
                            title = stringResource(id = R.string.story_process_rate_app_dismiss),
                            titleColor = AppColors.WhiteTitle.copy(alpha = 0.6f)
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .defaultMinSize(minHeight = 58.dp),
                        onClick = {
                            viewModel.onRateDismissClicked()
                        }
                    )
                }
            }
        },
        content = {
            ScreenContent(
                viewModel = viewModel,
                state = state,
                scrollState = scrollState
            )
        },
        sheetState = modalBottomSheetState,
        sheetShape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp),
        sheetBackgroundColor = AppColors.Background
    )
}

@Composable
private fun ScreenContent(
    viewModel: StoryProcessViewModel,
    state: StoryProcessState,
    scrollState: LazyListState
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null
        ) {
            if (state.storyProcessModel is IStoryProcess.StoryProcessModel) {
                viewModel.onContinueClicked(state.storyProcessModel)
            }
        }
    ) {
        when (state.storyProcessModel) {
            is IStoryProcess.StoryProcessModel -> {
                val currentStoryPart = state.storyProcessModel.storyParts.first {
                    it.partId == state.storyProcessModel.currentPartId
                }

                val currentPartIsFirstPart =
                    state.storyProcessModel.storyParts.first().partId == currentStoryPart.partId

                val backgroundColor = if (currentPartIsFirstPart && state.storyProcessModel.storyParts.size != 1) {
                    AppColors.Background
                } else {
                    AppColors.Transparent
                }

                Column {
                    MarginVertical(margin = 88.dp)
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                color = backgroundColor,
                                shape = RoundedCornerShape(
                                    topStart = 40.dp,
                                    topEnd = 40.dp
                                )
                            )
                    )
                }
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    state = scrollState,
                    modifier = Modifier
                        .animateContentSize()
                ) {

                    item {
                        if (currentPartIsFirstPart) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                MarginVertical(margin = 20.dp)
                                AsyncImage(
                                    model = state.storyProcessModel.pictureUrl,
                                    contentScale = ContentScale.Crop,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(174.dp)
                                        .width(115.dp)
                                        .clip(RoundedCornerShape(16.dp)),
                                )
                                MarginVertical(margin = 10.dp)
                                Title1(
                                    text = state.storyProcessModel.name,
                                    modifier = Modifier.width(275.dp),
                                    textAlign = TextAlign.Center
                                )
                                MarginVertical(margin = 10.dp)
                                LazyRow(
                                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    item {
                                        MarginHorizontal(margin = 10.dp)
                                    }
                                    items(state.storyProcessModel.categories) { category ->
                                        CategoryItem(
                                            state = CategoryItemViewState(
                                                category = category.category,
                                                name = stringResource(id = category.nameId),
                                                iconId = category.iconId
                                            ),
                                            onClick = {
                                                viewModel.openStoriesByCategory(it.category)
                                            }
                                        )
                                    }
                                    item {
                                        MarginHorizontal(margin = 4.dp)
                                    }
                                }
                                MarginVertical(margin = 16.dp)
                            }
                        } else {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        start = 10.dp,
                                        end = 10.dp
                                    ),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                MarginVertical(margin = 30.dp)
                                Title4(
                                    text = state.storyProcessModel.name,
                                    modifier = Modifier.width(250.dp),
                                    overflow = TextOverflow.Ellipsis,
                                    textAlign = TextAlign.Center,
                                    maxLines = 1
                                )
                                MarginVertical(margin = 32.dp)
                            }
                        }
                    }

                    itemsIndexed(
                        items = currentStoryPart.articles,
                        key = { _: Int, article: Article -> article.id }
                    ) { _: Int, item: Article ->
                        AnimatedVisibility(
                            visible = item.isOpen,
                            enter = slideInVertically(
                                initialOffsetY  = { it / 2 },
                                animationSpec = spring(
                                    stiffness = StiffnessVeryLow,
                                    visibilityThreshold = IntOffset.VisibilityThreshold
                                )
                            )
                        ) {
                            if (item.remark == null) {
                                PlainText(
                                    text = item.text.orEmpty(),
                                    modifier = Modifier
                                        .padding(horizontal = 10.dp)
                                )
                            } else {
                                val remark = item.remark

                                RemarkItem(
                                    modifier = Modifier
                                        .padding(
                                            horizontal = 10.dp,
                                        ),
                                    state = RemarkItemViewState(
                                        name = remark.name,
                                        remark = remark.remark,
                                        colorIcon = when (remark.color) {
                                            RemarkColor.FIRSTLY -> AppColors.PurpleLight
                                            RemarkColor.SECONDARY -> AppColors.BlueLight
                                        }
                                    )
                                )
                            }
                        }
                    }
                    item {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                                .padding(top = if (currentPartIsFirstPart) 50.dp else 220.dp)
                                .animateContentSize()
                        ) {
                            val price = state.payOffer.price
                            val isEnabled = state.payOffer.isEnabled

                            if (isEnabled) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    price?.let {
                                        Button(
                                            state = ButtonViewState(
                                                backgroundColor = AppColors.Green,
                                                title = stringResource(
                                                    id = R.string.story_process_pay_offer_title,
                                                    it
                                                ),
                                                iconId = R.drawable.ic_dollar,
                                                iconEndColor = AppColors.WhiteTitle
                                            ),
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .defaultMinSize(minHeight = 58.dp),
                                            onClick = {
                                                viewModel.onPayClicked()
                                            }
                                        )
                                    }
                                    Button(
                                        state = ButtonViewState(
                                            title = stringResource(id = R.string.story_process_pay_offer_title_dismiss),
                                            titleColor = AppColors.WhiteTitle.copy(alpha = 0.6f)
                                        ),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .defaultMinSize(minHeight = 58.dp),
                                        onClick = {
                                            viewModel.onShowAdClicked()
                                        }
                                    )
                                }
                            }

                            if (!isEnabled) {
                                val storyParts = state.storyProcessModel.storyParts
                                val lastOpenedArticleId = storyParts.first().articles.last { it.isOpen }.id

                                if (currentPartIsFirstPart && lastOpenedArticleId == "1") {
                                    MarginVertical(margin = 24.dp)
                                    Button(
                                        state = ButtonViewState(
                                            title = stringResource(id = R.string.story_process_continue_button_title),
                                            backgroundColor = AppColors.Purple
                                        ),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .defaultMinSize(minHeight = 58.dp),
                                        onClick = {
                                            viewModel.onContinueClicked(state.storyProcessModel)
                                        }
                                    )
                                    MarginVertical(margin = 8.dp)
                                }
                            }
                        }
                    }
                }
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(
                            top = 20.dp,
                            start = 10.dp,
                            end = 10.dp
                        )
                    ) {
                        ButtonBack (
                            onClick = viewModel::onBackPressed
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        if (!currentPartIsFirstPart) {
                            ButtonIcon(
                                iconId = R.drawable.ic_refresh,
                                onClick = viewModel::onResetProgressClicked,
                                buttonSize = 48.dp,
                                iconSize = 20.dp
                            )
                        }
                    }
                }
            }
            is IStoryProcess.ShimmerItem -> {

            }
        }
    }
}