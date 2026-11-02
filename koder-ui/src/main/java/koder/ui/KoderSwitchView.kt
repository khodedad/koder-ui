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

    var checked by mutableStateOf(false)
    var onCheckedChange by mutableStateOf({ _: Boolean -> })

    @Composable
    override fun Content() {
        KoderSwitch(checked = checked, onCheckedChange = onCheckedChange)
    }
}
