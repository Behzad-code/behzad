package com.behzad.viewmodel.ui.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val default: Dp = 0.dp,
    val spaceExtraExtraExtraSmall: Dp = 1.dp,
    val spaceExtraExtraSmall: Dp = 2.dp,
    val spaceExtraSmall: Dp = 4.dp,
    val spaceSmall: Dp = 8.dp,
    val spaceMidSmall: Dp = 12.dp,
    val spaceMedium: Dp = 16.dp,
    val spaceMidMedium: Dp = 24.dp,
    val spaceLarge: Dp = 32.dp,
    val spaceMidLarge: Dp = 40.dp,
    val spaceXLarge: Dp = 48.dp,
    val spaceXXLarge: Dp = 56.dp,
    val spaceXXXLarge: Dp = 64.dp,
    val spaceXXXXLarge: Dp = 72.dp,
    val spaceXXXXXLarge: Dp = 80.dp,
    val spaceXXXXXXLarge: Dp = 106.dp,
    val spaceXXXXXXXLarge: Dp = 112.dp,
    val spaceXXXXXXXXLarge: Dp = 120.dp,
)

val LocalSpacing = compositionLocalOf { Dimensions() }