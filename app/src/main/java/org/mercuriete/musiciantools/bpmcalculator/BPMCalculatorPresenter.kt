package org.mercuriete.musiciantools.bpmcalculator

import android.support.annotation.Nullable
import javax.inject.Inject

class BPMCalculatorPresenter @Inject constructor(private var bpmCalculatorService: BPMCalculatorService) : BPMCalculatorContract.Presenter {
    @Nullable
    private var bpmCalculatorView: BPMCalculatorContract.View? = null

    override fun addBeat() {
        bpmCalculatorService.beat()
        bpmCalculatorView?.showBPM(String.format("%.2f", bpmCalculatorService.getBPM()))
    }

    override fun takeView(view: BPMCalculatorContract.View) {
        bpmCalculatorView = view
    }

    override fun dropView() {
        bpmCalculatorView = null
    }
}
