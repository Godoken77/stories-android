package com.example.stories.android.feature.choose.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.views.Button
import com.example.stories.android.common.design.views.ButtonViewState
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.Title1
import org.neural.stories.R
import org.orbitmvi.orbit.compose.collectAsState

@Composable
internal fun CategoryChooseScreen(
    viewModel: ChooseCategoryViewModel
) {
    val state = viewModel.collectAsState().value

    val firstCategory = state.firstCategory
    val secondCategory = state.secondCategory

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)
    ) {
        Title1(
            text = stringResource(id = R.string.choose_category_title),
            textAlign = TextAlign.Center
        )
        MarginVertical(margin = 24.dp)
        firstCategory?.let { categoryWithStoryId ->
            Button(
                state = ButtonViewState(
                    title = stringResource(id = categoryWithStoryId.first.nameId),
                    startIconId = categoryWithStoryId.first.iconId,
                    borderColor = AppColors.Purple
                ),
                onClick = {
                    viewModel.openStory(categoryWithStoryId.second)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = 62.dp)
            )
        }
        MarginVertical(margin = 10.dp)
        secondCategory?.let { categoryWithStoryId ->
            Button(
                state = ButtonViewState(
                    title = stringResource(id = categoryWithStoryId.first.nameId),
                    startIconId = categoryWithStoryId.first.iconId,
                    borderColor = AppColors.Purple
                ),
                onClick = {
                    viewModel.openStory(categoryWithStoryId.second)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = 62.dp)
            )
        }
    }
}