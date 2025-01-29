package com.foysaltech.scratchcardlayout.util

import android.content.Context


object ScratchCardUtils {

    fun dipToPx(context: Context, dipValue: Float): Float {
        val density = context.resources.displayMetrics.density
        return dipValue * density
    }
}