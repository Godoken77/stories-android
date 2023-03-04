package com.example.stories.android.common.design.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.colors.AppColors

@Composable
fun BackgroundCornered(
    modifier: Modifier = Modifier,
    backgroundColor: Color = AppColors.Transparent,
    roundedCornerSize: Dp = 16.dp,
    content: @Composable () -> Unit
) {
    Surface(
        color = Color.Unspecified,
        modifier = modifier
            .background(
                backgroundColor,
                RoundedCornerShape(size = roundedCornerSize)
            )
            .wrapContentSize()
    ) {
        content()
    }
}

@Composable
fun BackgroundCorneredWithBorder(
    modifier: Modifier = Modifier,
    backgroundColor: Color = AppColors.Transparent,
    borderColor: Color,
    roundedCornerSize: Dp = 16.dp,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier
            .wrapContentSize()
            .border(
                1.dp,
                color = borderColor,
                shape = RoundedCornerShape(size = roundedCornerSize)
            ),
        shape = RoundedCornerShape(size = roundedCornerSize),
        color = backgroundColor
    ) {
        content()
    }
}