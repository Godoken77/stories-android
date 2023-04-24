package com.example.stories.android.common.design.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.stories.android.common.design.colors.AppColors
import org.neural.stories.R

data class StoryItemViewState(
    val id: String,
    val name: String,
    val picture: String
)

@Composable
fun StoryItem(
    state: StoryItemViewState,
    onClick: (StoryItemViewState) -> Unit,
    height: Dp = 150.dp,
    width: Dp = 116.dp
) {
    Column(
        modifier = Modifier.clickable(
            role = Role.Button,
            onClick = {
                onClick(state)
            }
        )
    ) {
        AsyncImage(
            model = state.picture,
            contentScale = ContentScale.Crop,
            contentDescription = null,
            placeholder = painterResource(id = R.drawable.image_placeholder),
            modifier = Modifier
                .height(height)
                .width(width)
                .clip(RoundedCornerShape(16.dp)),
        )
        MarginVertical(margin = 6.dp)
        SubTitle(
            text = state.name,
            color = AppColors.WhiteTitle.copy(alpha = 0.8f),
            textAlign = TextAlign.Start,
            modifier = Modifier.width(width),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
private fun PreviewStoryItem() {
    val picture = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png"
    val name = "Белый Бим Название Название"
    val id = "id"

    val state = StoryItemViewState(
        id = id,
        name = name,
        picture = picture
    )

    MaterialTheme {
        Box(
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
        ) {
            StoryItem(
                state = state,
                onClick = {}
            )
        }
    }
}