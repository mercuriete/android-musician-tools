package org.mercuriete.musiciantools.bpmcalculator

import android.support.annotation.Nullable
import javax.inject.Inject

class BPMCalculatorPresenter : BPMCalculatorContract.Presenter {
    @Nullable
    private var bpmCalculatorView: BPMCalculatorContract.View? = null

    private var bpmCalculatorService: BPMCalculatorService

    @Inject
    constructor(bpmCalculatorService: BPMCalculatorService) {
        this.bpmCalculatorService = bpmCalculatorService
    }

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
