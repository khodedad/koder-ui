package koder.ui

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView

class KoderSwitchView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var isCheckedState: Boolean by mutableStateOf(false)
    var onCheckedChangeListener: ((Boolean) -> Unit)? = null

    @Composable
    override fun Content() {
        KoderSwitch(
            checked = isCheckedState,
            onCheckedChange = { checked ->
                isCheckedState = checked
                onCheckedChangeListener?.invoke(checked)
            }
        )
    }

    fun setOnCheckedChangeListener(listener: OnCheckedChangeListener) {
        onCheckedChangeListener = { checked -> listener.onCheckedChange(checked) }
    }

    fun interface OnCheckedChangeListener {
        fun onCheckedChange(checked: Boolean)
    }
}
