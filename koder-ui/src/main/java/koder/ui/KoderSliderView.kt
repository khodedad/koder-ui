package koder.ui

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView

class KoderSliderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var value by mutableFloatStateOf(0.0f)
    var onValueChange by mutableStateOf({ _: Float -> })

    @Composable
    override fun Content() {
        KoderSlider(value = value, onValueChange = onValueChange)
    }
}
