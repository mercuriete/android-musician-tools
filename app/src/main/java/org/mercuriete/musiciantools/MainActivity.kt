package org.mercuriete.musiciantools

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import org.mercuriete.musiciantools.bpmcalculator.BPMCalculatorFragment
import org.mercuriete.musiciantools.util.replaceFragmentInActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var injectedFragment: BPMCalculatorFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)


        val bpmCalculatorFragment = supportFragmentManager.findFragmentById(R.id.content)
            as BPMCalculatorFragment? ?: injectedFragment.also {
            replaceFragmentInActivity(it, R.id.content)
        }

    }

}
