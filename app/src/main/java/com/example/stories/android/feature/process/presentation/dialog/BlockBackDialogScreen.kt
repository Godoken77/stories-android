package com.example.stories.android.feature.process.presentation.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.views.BackgroundCorneredWithBorder
import com.example.stories.android.common.design.views.Button
import com.example.stories.android.common.design.views.ButtonViewState
import com.example.stories.android.common.design.views.MarginVertical
import com.example.stories.android.common.design.views.Title1
import org.neural.stories.R

@Composable
internal fun BlockBackDialogScreen(
    onDismissClicked: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        BackgroundCorneredWithBorder(
            borderColor = AppColors.Grey,
            backgroundColor = AppColors.Background,
            roundedCornerSize = 32.dp
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(
                    horizontal = 32.dp,
                    vertical = 32.dp
                )
            ) {
                Title1(
                    text = stringResource(id = R.string.story_process_block_back_title),
                    textAlign = TextAlign.Center
                )
                MarginVertical(margin = 24.dp)
                Row(horizontalArrangement = Arrangement.Center) {
                    Button(
                        state = ButtonViewState(
                            title = stringResource(id = R.string.common_ok),
                            backgroundColor = AppColors.Grey
                        ),
                        onClick = {
                            onDismissClicked()
                        },
                        modifier = Modifier
                            .width(148.dp)
                            .defaultMinSize(minHeight = 58.dp)
                    )
                }
            }
        }
    }
}