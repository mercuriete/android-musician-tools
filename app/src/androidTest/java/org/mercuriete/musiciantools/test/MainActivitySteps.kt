package org.mercuriete.musiciantools.test

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then

class MainActivitySteps {
    private val robot = MainActivityScreenRobot()

    @Given("^I start the application$")
    fun i_start_app() {
        robot.launchMainActivityScreen()
    }

    @Then("^I expect to see \"(.*)\" text on \"(.*)\" TextView$")
    fun i_expect_to_see_a_text_message_on_textView(text: String, textViewResName: String) {
        robot.genericAssertTextView(textViewResName, text)
    }

    @Then("^I click on \"(.*)\" view$")
    fun i_click_on_view(resName: String) {
        robot.genericClickOnView(resName)
    }
}
