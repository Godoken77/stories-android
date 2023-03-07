package com.example.stories.android.feature.stories.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.views.ButtonBack
import com.example.stories.android.common.design.views.MarginHorizontal
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.StoryItem
import com.example.stories.android.common.design.views.StoryItemViewState
import com.example.stories.android.common.design.views.Title1
import com.example.stories.android.feature.stories.domain.model.IStoryItem
import org.orbitmvi.orbit.compose.collectAsState

@Composable
internal fun StoriesScreen(
    viewModel: StoriesViewModel
) {
    val state = viewModel.collectAsState().value

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(
                start = 10.dp,
                end = 10.dp,
                bottom = 40.dp
            )
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                header {
                    Column {
                        MarginVertical(margin = 20.dp)
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                ButtonBack(
                                    onClick = viewModel::onBackPressed
                                )
                                Spacer(modifier = Modifier.weight(1f))
                            }
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(id = state.category.iconId),
                                    contentDescription = null,
                                    tint = Color.Unspecified,
                                    modifier = Modifier.size(32.dp)
                                )
                                MarginHorizontal(margin = 10.dp)
                                Title1(text = stringResource(id = state.category.nameId))
                            }
                        }
                        MarginVertical(margin = 10.dp)
                    }
                }
                items(state.stories) {story ->
                    if (story is IStoryItem.StoryItem) {
                        StoryItem(
                            state = StoryItemViewState(
                                id = story.id,
                                name = story.name,
                                picture = story.pictureUrl
                            ),
                            onClick = {
                                viewModel.openStory(it.id)
                            },
                            height = 180.dp,
                            width = 180.dp
                        )
                    }
                }
            }
        }
    }
}

private fun LazyGridScope.header(
    content: @Composable LazyGridItemScope.() -> Unit
) {
    item(span = { GridItemSpan(this.maxLineSpan) }, content = content)
}