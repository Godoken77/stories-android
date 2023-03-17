package com.example.stories.android.common.design.views

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.common.design.fonts.AppTypography

data class RemarkItemViewState(
    val colorIcon: Color,
    val remark: String,
    val name: String
)

@Composable
fun RemarkItem(
    modifier: Modifier,
    state: RemarkItemViewState
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Box(
            modifier = Modifier.size(56.dp),
            contentAlignment = Alignment.Center
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawCircle(color = state.colorIcon)
            }
            Text(
                text = state.name.first().toString(),
                color = AppColors.BackgroundDark,
                style = TextStyle(
                    fontFamily = AppTypography.velaSansSemiBold,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp,
                    lineHeight = 36.sp,
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.size(
                    width = 20.dp,
                    height = 36.dp
                )
            )
        }
        MarginHorizontal(margin = 3.dp)
        Column {
            Title5(
                text = state.name.uppercase(),
                color = AppColors.White,
                modifier = Modifier
                    .padding(start = 5.dp)
            )
            MarginVertical(margin = 8.dp)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = 44.dp)
            ) {
                Canvas(
                    modifier = Modifier
                        .height(26.dp)
                        .width(38.dp)
                        .scale(scaleY = 0.6f, scaleX = 0.7f)
                ) {
                    val rect = Rect(Offset.Zero, size)
                    val trianglePath = Path().apply {
                        moveTo(rect.topCenter)
                        lineTo(rect.bottomRight)
                        lineTo(rect.bottomLeft)
                        close()
                    }

                    drawIntoCanvas { canvas ->
                        rotate(50f) {
                            canvas.drawOutline(
                                outline = Outline.Generic(trianglePath),
                                paint = Paint().apply {
                                    color = AppColors.Background
                                    pathEffect = PathEffect.cornerPathEffect(rect.maxDimension / 5)
                                }
                            )
                        }
                    }
                }
                BackgroundCornered(
                    modifier = Modifier
                        .padding(start = 19.dp)
                        .wrapContentWidth()
                        .defaultMinSize(minHeight = 44.dp),
                    backgroundColor = AppColors.Background,
                    roundedCornerSize = 20.dp
                ) {
                    PlainText(
                        modifier = Modifier
                            .padding(
                                horizontal = 16.dp,
                                vertical = 10.dp
                            ),
                        text = state.remark,
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }
}

private fun Path.moveTo(offset: Offset) = moveTo(offset.x, offset.y)
private fun Path.lineTo(offset: Offset) = lineTo(offset.x, offset.y)

@Preview
@Composable
fun RemarkItemPreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .background(AppColors.BackgroundDark)
                .fillMaxSize()
        ) {
            RemarkItem(
                state = RemarkItemViewState(
                    colorIcon = AppColors.Green,
                    remark = "Я хочу вот такую головку сииира," +
                            " Я хочу вот такую головку сииира," +
                            " Я хочу вот такую головку сииира, Я хочу вот такую головку сииира",
                    name = "Крыса"
                ),
                modifier = Modifier.padding(
                    horizontal = 10.dp,
                    vertical = 16.dp
                )
            )
        }
    }
}