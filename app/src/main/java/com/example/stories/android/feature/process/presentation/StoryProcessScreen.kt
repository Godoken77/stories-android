package com.example.stories.android.feature.process.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring.StiffnessVeryLow
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.animation.core.spring
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
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
import coil.compose.AsyncImage
import com.example.stories.android.R
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.views.Button
import com.example.stories.android.common.design.views.ButtonBack
import com.example.stories.android.common.design.views.ButtonIcon
import com.example.stories.android.common.design.views.ButtonViewState
import com.example.stories.android.common.design.views.CategoryItem
import com.example.stories.android.common.design.views.CategoryItemViewState
import com.example.stories.android.common.design.views.MarginHorizontal
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.PlainText
import com.example.stories.android.common.design.views.Title1
import com.example.stories.android.common.design.views.Title4
import com.example.stories.android.feature.process.domain.StoryProcessSideEffect
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
internal fun StoryProcessScreen(
    viewModel: StoryProcessViewModel
) {
    val state = viewModel.collectAsState().value

    val scrollState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    viewModel.collectSideEffect {
        when(it) {
            is StoryProcessSideEffect.ScrollToLastArticle -> {
                scope.launch {
                    scrollState.animateScrollToItem(scrollState.layoutInfo.totalItemsCount)
                }
            }
        }
    }

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

                Column {
                    MarginVertical(margin = 88.dp)
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                color = AppColors.Background,
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
                            PlainText(
                                text = item.text,
                                modifier = Modifier.padding(horizontal = 10.dp)
                            )
                        }
                    }
                    item {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                                .animateContentSize()
                        ) {
                            val choices = currentStoryPart.articles.lastOrNull { it.isOpen }?.choices
                            if (!choices.isNullOrEmpty()) {
                                MarginVertical(margin = 24.dp)
                                Button(
                                    state = ButtonViewState(
                                        title = choices.first().title,
                                        backgroundColor = AppColors.Purple
                                    ),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .defaultMinSize(minHeight = 58.dp),
                                    onClick = {
                                        viewModel.onChoiceClicked(
                                            choice = choices.first(),
                                            storyProcess = state.storyProcessModel
                                        )
                                    }
                                )
                                MarginVertical(margin = 8.dp)
                            } else {
                                val storyParts = state.storyProcessModel.storyParts

                                if (currentPartIsFirstPart) {
                                    val lastOpenedArticleId = storyParts.first().articles.last { it.isOpen }.id
                                    if (lastOpenedArticleId == "1") {
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
                                onClick = {
                                    viewModel.onResetProgressClicked(state.storyProcessModel)
                                }
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