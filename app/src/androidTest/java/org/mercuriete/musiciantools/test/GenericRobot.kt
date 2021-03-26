package org.mercuriete.musiciantools.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.allOf

open class GenericRobot {
    fun genericAssertTextView(text: String) {
        onView(
            allOf(
                withText(text),
                withEffectiveVisibility(Visibility.VISIBLE)
            )
        ).check(matches(isCompletelyDisplayed()))
    }

    fun genericClickOnView(text: String) {
        onView(
            allOf(
                withText(text),
                withEffectiveVisibility(Visibility.VISIBLE)
            )
        ).check(matches(isCompletelyDisplayed())).perform(click())
    }
}
