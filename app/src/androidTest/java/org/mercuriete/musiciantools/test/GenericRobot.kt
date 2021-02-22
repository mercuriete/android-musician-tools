package org.mercuriete.musiciantools.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withResourceName
import androidx.test.espresso.matcher.ViewMatchers.withText

open class GenericRobot {
    fun genericAssertTextView(textViewResName: String, text: String) {
        onView(withResourceName(textViewResName)).check(matches(withText(text)))
    }

    fun genericClickOnView(resName: String) {
        onView(withResourceName(resName)).perform(click())
    }
}
