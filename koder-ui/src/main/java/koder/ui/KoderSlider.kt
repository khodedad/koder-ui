package koder.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme

@Composable
fun KoderSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f
) {
    val trackColor = MaterialTheme.colorScheme.surfaceVariant
    val activeColor = MaterialTheme.colorScheme.primary
    
    val animatedValue by animateFloatAsState(
        targetValue = value,
        animationSpec = tween(durationMillis = 200),
        label = "slider_animation"
    )

    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(36.dp) // 1.5x original 24.dp height
            .pointerInput(Unit) {
                detectHorizontalDragGestures { change, _ ->
                    val fraction = (change.position.x / size.width.toFloat()).coerceIn(0f, 1f)
                    val newValue = valueRange.start + fraction * (valueRange.endInclusive - valueRange.start)
                    onValueChange(newValue)
                }
            }
    ) {
        val trackHeight = size.height
        val cornerRadius = CornerRadius(trackHeight / 2, trackHeight / 2)
        val progress = (animatedValue - valueRange.start) / (valueRange.endInclusive - valueRange.start)
        
        // Draw full track
        drawRoundRect(
            color = trackColor,
            topLeft = Offset.Zero,
            size = size,
            cornerRadius = cornerRadius
        )
        
        // Active width, minimum size is the height (making it a circle)
        val activeWidth = (progress * size.width).coerceAtLeast(trackHeight)
        
        // Draw active track
        drawRoundRect(
            color = activeColor,
            topLeft = Offset.Zero,
            size = Size(activeWidth, trackHeight),
            cornerRadius = cornerRadius
        )
    }
}
