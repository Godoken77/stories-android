package com.example.stories.android.common.design.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.colors.AppColors
import com.valentinilk.shimmer.shimmer

@Composable
fun Shimmer(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.shimmer(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppColors.BackgroundLight, RoundedCornerShape(size = 50.dp))
        )
    }
}

@Composable
fun ShimmerRectangle(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.shimmer(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppColors.BackgroundLight, RoundedCornerShape(size = 16.dp))
        )
    }
}

@Preview
@Composable
private fun ShimmerPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = AppColors.Background)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Shimmer(
                modifier = Modifier
                    .height(80.dp)
                    .width(160.dp)
            )
            MarginVertical(margin = 16.dp)
            ShimmerRectangle(
                modifier = Modifier
                    .height(80.dp)
                    .width(120.dp)
            )
        }
    }
}