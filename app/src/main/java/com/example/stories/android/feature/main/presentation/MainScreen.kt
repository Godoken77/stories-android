package com.example.stories.android.feature.main.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.stories.android.R
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.StoryItem
import com.example.stories.android.common.design.views.StoryItemViewState
import com.example.stories.android.common.design.views.Title1
import com.example.stories.android.feature.main.domain.MainSideEffect
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
internal fun MainScreen(
    viewModel: MainViewModel
) {
    val state = viewModel.collectAsState().value

    viewModel.collectSideEffect {
        when (it) {
            is MainSideEffect.OpenStory -> {
            }
            is MainSideEffect.OpenStoriesByCategory -> {
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Background)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 10.dp)
        ) {
            Title1(
                text = stringResource(R.string.main_recommended_title)
            )
            MarginVertical(margin = 10.dp)
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(state.recommendedStories) { story ->
                    StoryItem(
                        state = StoryItemViewState(
                            id = story.id,
                            name = story.name,
                            picture = story.pictureUrl
                        ),
                        onClick = {}
                    )
                }
            }
        }
    }
}