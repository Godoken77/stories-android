package com.example.stories.android.common.design.fonts

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.neural.stories.R

object AppTypography {

    private val velaSansRegular = FontFamily(
        Font(R.font.vela_sans_regular, FontWeight.W400)
    )

    private val velaSansBold = FontFamily(
        Font(R.font.vela_sans_bold, FontWeight.W700)
    )

    val velaSansSemiBold = FontFamily(
        Font(R.font.vela_sans_semibold, FontWeight.W600)
    )

    private val velaSansMedium = FontFamily(
        Font(R.font.vela_sans_medium, FontWeight.W500)
    )

    private val nexaTextMedium = FontFamily(
        Font(R.font.nexa_text_regular, FontWeight.W500)
    )

    val Text12MediumNexa = TextStyle(
        fontFamily = nexaTextMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
    )

    val Text15Regular = TextStyle(
        fontFamily = velaSansRegular,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp,
    )

    val Text15Bold = TextStyle(
        fontFamily = velaSansBold,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        lineHeight = 21.sp,
    )

    val Text24SemiBold = TextStyle(
        fontFamily = velaSansSemiBold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 33.sp,
    )

    val Text20SemiBold = TextStyle(
        fontFamily = velaSansSemiBold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
    )

    val Text15SemiBold = TextStyle(
        fontFamily = velaSansSemiBold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        lineHeight = 21.sp,
    )

    val Text15Medium = TextStyle(
        fontFamily = velaSansMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 17.sp,
    )

    val Text15MediumPlainText = TextStyle(
        fontFamily = velaSansMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 23.sp,
    )
}