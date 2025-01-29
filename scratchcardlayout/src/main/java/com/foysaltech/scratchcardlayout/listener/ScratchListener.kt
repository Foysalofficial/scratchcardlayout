package com.foysaltech.scratchcardlayout.listener

import com.foysaltech.scratchcardlayout.ui.ScratchCardLayout

interface ScratchListener {

    fun onScratchStarted()
    fun onScratchProgress(scratchCardLayout: ScratchCardLayout, atLeastScratchedPercent: Int)
    fun onScratchComplete()
}