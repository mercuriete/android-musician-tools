package org.mercuriete.musiciantools.bpmcalculator

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.content_menu.*
import org.mercuriete.musiciantools.R
import javax.inject.Inject

class BPMCalculatorActivity : DaggerAppCompatActivity(), BPMCalculatorContract.View {

    @Inject
    lateinit var presenter: BPMCalculatorContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)
        presenter.takeView(this)

        button.setOnClickListener { _ ->
            presenter.addBeat()
        }
    }

    override fun showBPM(bpm: String) {
        bpmText.text = bpm
    }

}
