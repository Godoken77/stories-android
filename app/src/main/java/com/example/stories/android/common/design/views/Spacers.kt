package com.example.stories.android.common.design.views

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun MarginHorizontal(margin: Dp) {
    Spacer(
        modifier = Modifier
            .width(margin)
    )
}

@Composable
fun MarginVertical(margin: Dp) {
    Spacer(
        modifier = Modifier
            .height(margin)
    )
}