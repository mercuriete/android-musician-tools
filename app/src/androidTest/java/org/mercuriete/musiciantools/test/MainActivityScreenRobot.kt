package org.mercuriete.musiciantools.test

import androidx.test.rule.ActivityTestRule
import org.mercuriete.musiciantools.MainActivity
import org.mercuriete.musiciantools.R

class MainActivityScreenRobot : GenericRobot() {
    fun launchMainActivityScreen(testRule: ActivityTestRule<MainActivity>) {
        testRule.launchActivity(null)
    }

    fun canSeeAMessageOnBpmText(text: String) {
        genericAssertTextView(R.id.bpmText, text)
    }
}
