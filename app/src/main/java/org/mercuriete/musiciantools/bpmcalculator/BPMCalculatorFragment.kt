package org.mercuriete.musiciantools.bpmcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.bpm_calculator_fragment.*
import org.mercuriete.musiciantools.R
import javax.inject.Inject


class BPMCalculatorFragment @Inject constructor() : DaggerFragment(), BPMCalculatorContract.View {

    @Inject
    lateinit var presenter: BPMCalculatorContract.Presenter

    override fun showBPM(bpm: String) {
        bpmText.text = bpm
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bpm_calculator_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            presenter.addBeat()
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onDestroy() {
        presenter.dropView()  //prevent leaking activity in
        // case presenter is orchestrating a long running task
        super.onDestroy()
    }

}
