package app

import dev.fritz2.core.render
import dev.fritz2.core.storeOf
import kotlinx.browser.window

fun main() {
    val closeButtonClicked = storeOf(false)

    render {
        div {
            button {
                +"Close Window"
                clicks handledBy closeButtonClicked.handle {
                    window.close()
                    true
                }
            }
        }
    }
}