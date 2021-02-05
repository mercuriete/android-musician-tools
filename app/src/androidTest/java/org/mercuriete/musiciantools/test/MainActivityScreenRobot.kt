package org.mercuriete.musiciantools.test

import androidx.test.core.app.launchActivity
import org.mercuriete.musiciantools.MainActivity
import org.mercuriete.musiciantools.R

class MainActivityScreenRobot : GenericRobot() {
    fun launchMainActivityScreen() {
        launchActivity<MainActivity>()
    }

    fun canSeeAMessageOnBpmText(text: String) {
        genericAssertTextView(R.id.bpmText, text)
    }

    fun clickOnBPMCalculatorButton() {
        genericClickOnView(R.id.BPMCalculatorFragment)
    }

    fun clickOnAboutMeButton() {
        genericClickOnView(R.id.AboutMeFragment)
    }

    fun clickOnTapMeButton() {
        genericClickOnView(R.id.tapMe)
    }
}
