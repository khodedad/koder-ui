package koder.ui

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView

class KoderSliderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var sliderValue: Float by mutableFloatStateOf(0f)
    var onValueChangeListener: ((Float) -> Unit)? = null

    @Composable
    override fun Content() {
        KoderSlider(
            value = sliderValue,
            onValueChange = { newValue ->
                sliderValue = newValue
                onValueChangeListener?.invoke(newValue)
            }
        )
    }

    fun setOnSliderValueChangeListener(listener: OnValueChangeListener) {
        onValueChangeListener = { valValue -> listener.onValueChange(valValue) }
    }

    fun interface OnValueChangeListener {
        fun onValueChange(value: Float)
    }
}
