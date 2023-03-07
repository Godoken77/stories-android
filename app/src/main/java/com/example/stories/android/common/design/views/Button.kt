package com.example.stories.android.common.design.views

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stories.android.R
import com.example.stories.android.common.design.colors.AppColors

data class ButtonViewState(
    val title: String,
    val description: String? = null,
    @DrawableRes val iconId: Int? = null,
    val backgroundColor: Color = AppColors.Transparent,
    val borderColor: Color? = null
)

@Composable
fun Button(
    modifier: Modifier = Modifier,
    state: ButtonViewState,
    onClick: (ButtonViewState) -> Unit
) {
    if (state.borderColor == null) {
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
    } else {
        BackgroundCorneredWithBorder(
            borderColor = state.borderColor,
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
}

@Composable
private fun ButtonContent(
    modifier: Modifier,
    state: ButtonViewState,
    onClick: (ButtonViewState) -> Unit
) {
    Box(
        modifier = modifier
            .clickable(
                role = Role.Button,
                onClick = {
                    onClick(state)
                }
            )
            .padding(
                vertical = 16.dp,
                horizontal = 16.dp
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Title2(
                    text = state.title,
                    maxLines = 1
                )
                if (state.iconId != null) {
                    MarginHorizontal(margin = 4.dp)
                    Icon(
                        painter = painterResource(id = state.iconId),
                        contentDescription = null,
                        tint = AppColors.White.copy(alpha = 0.8f),
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
            if (state.description != null) {
                MarginVertical(margin = 4.dp)
                SubTitle2(
                    text = state.description,
                    maxLines = 1,
                    color = AppColors.White.copy(alpha = 0.8f)
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewButton() {
    val state = ButtonViewState(
        title = "Продолжить",
        backgroundColor = AppColors.Purple
    )

    val stateChoiceButton = ButtonViewState(
        title = "Продолжить",
        backgroundColor = AppColors.Grey
    )

    val statePayButton = ButtonViewState(
        title = "Получить за 40 монет",
        backgroundColor = AppColors.Green
    )

    val statePayButtonWithIcon = ButtonViewState(
        title = "Приобрести 40 монет",
        backgroundColor = AppColors.Green,
        iconId = R.drawable.ic_coin
    )

    val statePayButtonWithIconAndDescription = ButtonViewState(
        title = "Приобрести 40 монет",
        description = "за 200 ₽",
        backgroundColor = AppColors.Green,
        iconId = R.drawable.ic_coin
    )

    val statePayButtonWithDescription = ButtonViewState(
        title = "Приобрести 40 монет",
        backgroundColor = AppColors.Green,
        description = "за 200 ₽"
    )

    val statePayBorderedButtonWithIconAndDescription = ButtonViewState(
        title = "Приобрести 40 монет",
        description = "за 200 ₽",
        backgroundColor = AppColors.Transparent,
        iconId = R.drawable.ic_coin,
        borderColor = AppColors.Green
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
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    state = state,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 58.dp),
                    onClick = {}
                )
                Button(
                    state = stateChoiceButton,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 58.dp),
                    onClick = {}
                )
                Button(
                    state = statePayButton,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 74.dp),
                    onClick = {}
                )
                Button(
                    state = statePayButtonWithIcon,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 74.dp),
                    onClick = {}
                )
                Button(
                    state = statePayButtonWithIconAndDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 74.dp),
                    onClick = {}
                )
                Button(
                    state = statePayButtonWithDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 74.dp),
                    onClick = {}
                )
                Button(
                    state = statePayBorderedButtonWithIconAndDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {}
                )
            }
        }
    }
}