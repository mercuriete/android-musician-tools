package org.mercuriete.musiciantools.test

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then

class MainActivitySteps {
    private val robot = MainActivityScreenRobot()

    @Given("^I start the application$")
    fun i_start_app() {
        robot.launchMainActivityScreen()
    }

    @Then("^I expect to see \"(.*)\" text$")
    fun i_expect_to_see_a_text_message(text: String) {
        robot.genericAssertTextView(text)
    }

    @Then("^I click on \"(.*)\" view$")
    fun i_click_on_view(text: String) {
        robot.genericClickOnView(text)
    }
}
