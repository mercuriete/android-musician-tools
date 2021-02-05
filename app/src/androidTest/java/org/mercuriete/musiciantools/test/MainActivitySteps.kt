package org.mercuriete.musiciantools.test

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then

class MainActivitySteps {
    private val robot = MainActivityScreenRobot()

    @Given("^I start the application$")
    fun i_start_app() {
        robot.launchMainActivityScreen()
    }

    @Then("^I expect to see \"(.*)\" text on bpmText TextView$")
    fun i_expect_to_see_a_text_message_on_bpmText_TextView(text: String) {
        robot.canSeeAMessageOnBpmText(text)
    }

    @Then("^I click on bpm calculator button$")
    fun i_click_on_bpm_calculator_button() {
        robot.clickOnBPMCalculatorButton()
    }

    @Then("^I click on about me button$")
    fun i_click_on_about_me_button() {
        robot.clickOnAboutMeButton()
    }

    @Then("^I click on tap me button$")
    fun i_click_on_tap_me_button() {
        robot.clickOnTapMeButton()
    }
}
