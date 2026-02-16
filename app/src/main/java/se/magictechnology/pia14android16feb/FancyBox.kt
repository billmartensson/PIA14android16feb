package se.magictechnology.pia14android16feb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FancyBox(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .width(50.dp)
        .height(50.dp)
        .background(Color.Magenta)
    ) { }
}