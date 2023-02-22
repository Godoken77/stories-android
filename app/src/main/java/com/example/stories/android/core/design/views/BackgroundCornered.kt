package com.example.stories.android.core.design.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun BackgroundCornered(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
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