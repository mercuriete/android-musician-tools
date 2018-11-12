package org.mercuriete.musiciantools.bpmcalculator

import org.mercuriete.musiciantools.BasePresenter
import org.mercuriete.musiciantools.BaseView

interface BPMCalculatorContract {

    interface View : BaseView<Presenter> {
        fun showBPM(bpm: String)
    }

    interface Presenter : BasePresenter<View> {
        fun addBeat()
    }
}
