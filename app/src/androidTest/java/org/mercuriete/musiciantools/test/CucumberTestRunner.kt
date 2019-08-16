package org.mercuriete.musiciantools.test
import android.os.Bundle
import cucumber.api.android.CucumberInstrumentationCore
import androidx.test.runner.AndroidJUnitRunner

class CucumberTestRunner : AndroidJUnitRunner() {
    private val instrumentationCore = CucumberInstrumentationCore(this)
    override fun onCreate(bundle: Bundle) {
        instrumentationCore.create(bundle)
        super.onCreate(bundle)
    }

    override fun onStart() {
        waitForIdleSync()
        instrumentationCore.start()
    }
}
