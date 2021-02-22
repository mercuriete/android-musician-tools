package org.mercuriete.musiciantools.test

import androidx.test.core.app.launchActivity
import org.mercuriete.musiciantools.MainActivity

class MainActivityScreenRobot : GenericRobot() {
    fun launchMainActivityScreen() {
        launchActivity<MainActivity>()
    }
}
