package com.example.airbnbclone.ui.core.extensions

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

val TextStyle.thin: TextStyle
    get() = this.copy(fontWeight = FontWeight.Thin)

val TextStyle.extraLight: TextStyle
    get() = this.copy(fontWeight = FontWeight.ExtraLight)

val TextStyle.light: TextStyle
    get() = this.copy(fontWeight = FontWeight.Light)

val TextStyle.normal: TextStyle
    get() = this.copy(fontWeight = FontWeight.Normal)

val TextStyle.medium: TextStyle
    get() = this.copy(fontWeight = FontWeight.Medium)

val TextStyle.semiBold: TextStyle
    get() = this.copy(fontWeight = FontWeight.SemiBold)

val TextStyle.bold: TextStyle
    get() = this.copy(fontWeight = FontWeight.Bold)

val TextStyle.extraBold: TextStyle
    get() = this.copy(fontWeight = FontWeight.ExtraBold)

val TextStyle.black: TextStyle
    get() = this.copy(fontWeight = FontWeight.Black)