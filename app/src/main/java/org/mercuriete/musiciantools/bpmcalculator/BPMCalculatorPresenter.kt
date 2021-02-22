package org.mercuriete.musiciantools.bpmcalculator

import androidx.annotation.Nullable
import javax.inject.Inject

class BPMCalculatorPresenter @Inject constructor(private var bpmCalculatorService: BPMCalculatorService) :
    BPMCalculatorContract.Presenter {
    @Nullable
    private var bpmCalculatorView: BPMCalculatorContract.View? = null

    override fun addBeat() {
        bpmCalculatorService.beat()
        bpmCalculatorView?.showBPM("%.2f".format(bpmCalculatorService.getBPM()))
    }

    override fun takeView(view: BPMCalculatorContract.View) {
        bpmCalculatorView = view
    }

    override fun dropView() {
        bpmCalculatorView = null
    }
}
