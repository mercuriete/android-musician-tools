package org.mercuriete.musiciantools

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.content_menu.*
import org.mercuriete.musiciantools.services.BPMCalculatorServiceImpl

class MenuActivity : AppCompatActivity() {
    private var bpmCalculatorService = BPMCalculatorServiceImpl()

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
