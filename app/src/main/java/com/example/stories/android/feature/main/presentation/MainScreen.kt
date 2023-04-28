package com.example.stories.android.feature.main.presentation

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.views.ButtonContinueStory
import com.example.stories.android.common.design.views.ButtonContinueStoryViewState
import com.example.stories.android.common.design.views.CategoryItem
import com.example.stories.android.common.design.views.CategoryItemViewState
import com.example.stories.android.common.design.views.MarginHorizontal
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.StoryItem
import com.example.stories.android.common.design.views.StoryItemViewState
import com.example.stories.android.common.design.views.Title1
import org.neural.stories.R
import org.orbitmvi.orbit.compose.collectAsState

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun MainScreen(
    viewModel: MainViewModel
) {
    val state = viewModel.collectAsState().value

    val recommendedStoriesLazyRowState = rememberLazyListState()
    val categoriesLazyRowState = rememberLazyListState()
    val recentlyStoriesLazyRowState = rememberLazyListState()

    LazyColumn(
        state = rememberLazyListState(),
        modifier = Modifier
            .fillMaxSize()
            .animateContentSize()
            .background(AppColors.Background)
    ) {
        item {
            Column(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
            ) {
                MarginVertical(margin = 10.dp)
                ButtonContinueStory(
                    state = ButtonContinueStoryViewState(
                        storyToContinue = state.storyToContinue
                    ),
                    onClick = { storyId ->
                        viewModel.continueStory(storyId)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 80.dp),
                )
                MarginVertical(margin = 30.dp)
            }
        }
        item {
            Column {
                Title1(
                    text = stringResource(R.string.main_recommended_title),
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                MarginVertical(margin = 10.dp)
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    flingBehavior = rememberSnapFlingBehavior(lazyListState = recommendedStoriesLazyRowState),
                    state = recommendedStoriesLazyRowState,
                    modifier = Modifier
                        .animateContentSize()
                ) {
                    item {
                        MarginHorizontal(margin = 2.dp)
                    }
                    items(state.recommendedStories) { story ->
                        StoryItem(
                            state = StoryItemViewState(
                                id = story.id,
                                name = story.name,
                                picture = story.pictureUrl
                            ),
                            onClick = {
                                viewModel.openRecommendedStory(it.id)
                            }
                        )
                    }
                    item {
                        MarginHorizontal(margin = 4.dp)
                    }
                }
                MarginVertical(margin = 30.dp)
            }
        }
        item {
            Column {
                Title1(
                    text = stringResource(R.string.main_categories_title),
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                MarginVertical(margin = 10.dp)
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    flingBehavior = rememberSnapFlingBehavior(lazyListState = categoriesLazyRowState),
                    state = categoriesLazyRowState
                ) {
                    item {
                        MarginHorizontal(margin = 2.dp)
                    }
                    items(state.categories) { category ->
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
                MarginVertical(margin = 30.dp)
            }
        }
        item {
            Column(
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                if (state.recentlyStories.isNotEmpty()) {
                    Title1(
                        text = stringResource(R.string.main_recently_title),
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    MarginVertical(margin = 10.dp)
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        flingBehavior = rememberSnapFlingBehavior(lazyListState = recentlyStoriesLazyRowState),
                        state = recentlyStoriesLazyRowState,
                        modifier = Modifier
                            .animateContentSize()
                    ) {
                        item {
                            MarginHorizontal(margin = 2.dp)
                        }
                        items(state.recentlyStories) { story ->
                            StoryItem(
                                state = StoryItemViewState(
                                    id = story.id,
                                    name = story.name,
                                    picture = story.pictureUrl
                                ),
                                onClick = {
                                    viewModel.openRecentlyStory(it.id)
                                }
                            )
                        }
                        item {
                            MarginHorizontal(margin = 4.dp)
                        }
                    }
                }
            }
        }
    }
}