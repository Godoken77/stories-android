package com.example.stories.android.common.design.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.stories.android.R
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.stories.domain.model.IStoryItem

data class ButtonContinueStoryViewState(
    val storyToContinue: IStoryItem,
    val backgroundColor: Color = AppColors.Purple
)

@Composable
fun ButtonContinueStory(
    modifier: Modifier = Modifier,
    state: ButtonContinueStoryViewState,
    onClick: (String) -> Unit
) {
    BackgroundCornered(
        backgroundColor = state.backgroundColor,
        roundedCornerSize = 57.dp
    ) {
        ButtonContent(
            modifier = modifier,
            state = state,
            onClick = onClick
        )
    }
}

@Composable
private fun ButtonContent(
    modifier: Modifier,
    state: ButtonContinueStoryViewState,
    onClick: (String) -> Unit
) {
    Box(
        modifier = modifier
            .clickable(
                role = Role.Button,
                onClick = {
                    if (state.storyToContinue is IStoryItem.StoryItem) {
                        onClick(state.storyToContinue.id)
                    }
                }
            )
            .padding(
                start = 30.dp,
                end = 10.dp,
                top = 10.dp,
                bottom = 10.dp
            ),
        contentAlignment = Alignment.Center
    ) {
        if (state.storyToContinue is IStoryItem.StoryItem) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Title2(
                        text = stringResource(id = R.string.main_continue_story_title),
                        maxLines = 1
                    )
                    MarginVertical(margin = 2.dp)
                    SubTitle2(
                        text = state.storyToContinue.name,
                        maxLines = 1
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                AsyncImage(
                    model = state.storyToContinue.pictureUrl,
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape),
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewButtonContinueStory() {
    val state = ButtonContinueStoryViewState(
        storyToContinue = IStoryItem.StoryItem(
            id = "id",
            name = "«Перси Джексон и проклятие титана»",
            pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
            categories = listOf(Category.FANTASY, Category.ADVENTURE)
        )
    )

    MaterialTheme {
        Box(
            modifier = Modifier
                .background(AppColors.Background)
                .fillMaxSize()
                .padding(
                    vertical = 16.dp,
                    horizontal = 10.dp
                )
        ) {
            ButtonContinueStory(
                state = state,
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = 80.dp),
                onClick = {}
            )
        }
    }
}