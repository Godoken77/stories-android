package com.example.stories.android.core.design.views

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.example.stories.android.core.design.colors.AppColors
import com.example.stories.android.core.design.fonts.AppTypography

@Composable
fun Title1(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = AppColors.WhiteTitle,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        textAlign = textAlign,
        text = text,
        style = AppTypography.Text24SemiBold,
        modifier = modifier,
        color = color,
        overflow = overflow,
        maxLines = maxLines
    )
}

@Composable
fun Title2(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = AppColors.WhiteTitle,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        textAlign = textAlign,
        text = text,
        style = AppTypography.Text15Bold,
        modifier = modifier,
        color = color,
        overflow = overflow,
        maxLines = maxLines
    )
}

@Composable
fun Title3(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = AppColors.WhiteTitle,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        textAlign = textAlign,
        text = text,
        style = AppTypography.Text15SemiBold,
        modifier = modifier,
        color = color,
        overflow = overflow,
        maxLines = maxLines
    )
}

@Composable
fun SubTitle(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = AppColors.WhiteTitle,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        textAlign = textAlign,
        text = text,
        style = AppTypography.Text15Medium,
        modifier = modifier,
        color = color,
        overflow = overflow,
        maxLines = maxLines
    )
}

@Composable
fun PlainText(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = AppColors.WhiteTitle,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        textAlign = textAlign,
        text = text,
        style = AppTypography.Text15MediumPlainText,
        modifier = modifier,
        color = color,
        overflow = overflow,
        maxLines = maxLines
    )
}