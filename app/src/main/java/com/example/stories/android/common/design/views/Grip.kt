package com.example.stories.android.common.design.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.colors.AppColors

@Composable
fun Grip(modifier: Modifier) {
    Box(
        modifier = modifier
            .height(4.dp)
            .width(40.dp)
            .background(
                AppColors.Grey,
                RoundedCornerShape(80.dp)
            )
    )
}