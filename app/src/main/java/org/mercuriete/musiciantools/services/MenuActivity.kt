package org.mercuriete.musiciantools.services

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.content_menu.*
import org.mercuriete.musiciantools.R
import javax.inject.Inject

class MenuActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var bpmCalculatorService: BPMCalculatorService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)

        button.setOnClickListener { _ ->
            bpmCalculatorService.beat()
            bpmText.text = String.format("%.2f", bpmCalculatorService.getBPM())
        }
    }
}
