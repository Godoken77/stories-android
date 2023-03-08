package com.example.stories.android.common.design.views

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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

@Composable
fun ButtonIcon(
    @DrawableRes iconId: Int,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .background(
                AppColors.Background,
                CircleShape
            )
            .clickable(
                role = Role.Button,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Preview
@Composable
fun ButtonIconPreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .background(AppColors.BackgroundDark)
                .fillMaxSize()
                .padding(
                    vertical = 16.dp,
                    horizontal = 10.dp
                )
        ) {
            ButtonIcon(
                iconId = R.drawable.ic_refresh,
                onClick = {}
            )
        }
    }
}