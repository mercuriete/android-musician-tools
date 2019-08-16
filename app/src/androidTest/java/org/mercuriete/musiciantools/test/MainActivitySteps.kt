package org.mercuriete.musiciantools.test

import androidx.test.rule.ActivityTestRule
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import org.mercuriete.musiciantools.MainActivity

class MainActivitySteps {
    private val robot = MainActivityScreenRobot()

    private val activityRule = ActivityTestRule(MainActivity::class.java, false, false)
    @Given("^I start the application$")
    fun i_start_app() {
        robot.launchMainActivityScreen(activityRule)
    }
    @Then("^I expect to see \"(.*)\" text on bpmText TextView$")
    fun i_expect_to_see_a_text_message_on_bpmText_TextView(text: String) {
        robot.canSeeAMessageOnBpmText(text)
    }
}
