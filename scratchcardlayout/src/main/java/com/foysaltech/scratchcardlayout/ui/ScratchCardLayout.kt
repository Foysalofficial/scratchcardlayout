package com.foysaltech.scratchcardlayout.ui

import com.foysaltech.scratchcardlayout.listener.ScratchListener
import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

public class ScratchCardLayout : CardView, ScratchCard.ScratchCardInterface {
    private lateinit var scratchCard: ScratchCard

    constructor(context: Context) : super(context) {
        init(context, null, 0)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs, defStyleAttr)
    }

    private fun init(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        scratchCard = ScratchCard(context, attrs, defStyleAttr)
        scratchCard.setRevealListener(this)
        setupScratchView()
        resetScratch()
    }

    fun setScratchWidthDip(mScratchWidthDip: Float) {
        scratchCard.setScratchWidthDip(mScratchWidthDip)
    }
    fun setScratchDrawable(mScratchDrawable: Drawable?) {
        scratchCard.setScratchDrawable(mScratchDrawable)
    }

    fun setScratchListener(mListener: ScratchListener) {
        scratchCard.setListener(mListener)
    }

    private fun setupScratchView() {
        scratchCard.layoutParams = LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT)
        post { addView(scratchCard) }
    }

    private fun stopScratching() {
        scratchCard.visibility = View.GONE
    }

    fun setRevealFullAtPercent(revealFullAtPercent: Int) {
        scratchCard.setRevealFullAtPercent(revealFullAtPercent)
    }

    override fun onFullReveal() {
        stopScratching()
    }

    fun setScratchEnabled(enableScratching: Boolean) {
        scratchCard.setScratchEnabled(enableScratching)
    }

    fun resetScratch() {
        setScratchEnabled(true)
        scratchCard.resetScratch()
    }

    fun revealScratch(){
        scratchCard.revealScratch()
    }
}