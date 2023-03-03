package com.example.stories.android.feature.main.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.stories.android.R
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.views.CategoryItem
import com.example.stories.android.common.design.views.CategoryItemViewState
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.StoryItem
import com.example.stories.android.common.design.views.StoryItemViewState
import com.example.stories.android.common.design.views.Title1
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

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Background)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .padding(start = 10.dp)
        ) {
            Title1(
                text = stringResource(R.string.main_recommended_title)
            )
            MarginVertical(margin = 10.dp)
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                flingBehavior = rememberSnapFlingBehavior(lazyListState = recommendedStoriesLazyRowState),
                state = recommendedStoriesLazyRowState
            ) {
                items(state.recommendedStories) { story ->
                    StoryItem(
                        state = StoryItemViewState(
                            id = story.id,
                            name = story.name,
                            picture = story.pictureUrl
                        ),
                        onClick = {
                            viewModel.openStory(it.id)
                        }
                    )
                }
            }
            MarginVertical(margin = 30.dp)
            Title1(
                text = stringResource(R.string.main_categories_title)
            )
            MarginVertical(margin = 10.dp)
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                flingBehavior = rememberSnapFlingBehavior(lazyListState = categoriesLazyRowState),
                state = categoriesLazyRowState
            ) {
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
            }
            MarginVertical(margin = 30.dp)
            if (state.recentlyStories.isNotEmpty()) {
                Title1(
                    text = stringResource(R.string.main_recently_title)
                )
                MarginVertical(margin = 10.dp)
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    flingBehavior = rememberSnapFlingBehavior(lazyListState = recentlyStoriesLazyRowState),
                    state = recentlyStoriesLazyRowState
                ) {
                    items(state.recentlyStories) { story ->
                        StoryItem(
                            state = StoryItemViewState(
                                id = story.id,
                                name = story.name,
                                picture = story.pictureUrl
                            ),
                            onClick = {
                                viewModel.openStory(it.id)
                            }
                        )
                    }
                }
            }
        }
    }
}