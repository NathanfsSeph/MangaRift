package com.sephirita.mangarift.ui.component.text

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun StrokedText(
    modifier: Modifier = Modifier,
    text: String = "",
    textColor: Color = Color.White,
    size: TextUnit = 20.sp,
    textStrokeColor: Color = Color.Black,
    textStrokeWidth: Float = 12f,
    textStrokeMiter: Float = 4f,
    textStrokeJoin: StrokeJoin = StrokeJoin.Round
) {
    Box(modifier = modifier) {
        Text(
            text = text,
            style = LocalTextStyle.current.merge(
                TextStyle(
                    color = textStrokeColor,
                    fontSize = size,
                    drawStyle = Stroke(
                        width = textStrokeWidth,
                        miter = textStrokeMiter,
                        join = textStrokeJoin
                    )
                )
            )
        )

        Text(
            text = text,
            color = textColor,
            fontSize = size
        )
    }
}