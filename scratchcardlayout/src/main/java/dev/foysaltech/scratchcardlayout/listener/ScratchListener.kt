package dev.foysaltech.scratchcardlayout.listener

import dev.foysaltech.scratchcardlayout.ui.ScratchCardLayout

interface ScratchListener {

    fun onScratchStarted()
    fun onScratchProgress(scratchCardLayout: ScratchCardLayout, atLeastScratchedPercent: Int)
    fun onScratchComplete()
}