package koder.ui

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView

class KoderButtonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var koderText: String by mutableStateOf("Button")
    var onKoderClick: (() -> Unit)? = null

    @Composable
    override fun Content() {
        KoderButton(
            text = koderText,
            onClick = { onKoderClick?.invoke() }
        )
    }

    fun setOnKoderClickListener(listener: Runnable) {
        onKoderClick = { listener.run() }
    }
}
