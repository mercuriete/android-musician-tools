package org.mercuriete.musiciantools.test

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry

open class GenericRobot {
    protected fun genericAssertTextView(@IdRes textViewId: Int, text: String) {
        onView(withId(textViewId)).check(matches(withText(text)))
    }

    fun genericClickOnView(resName: String) {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val id = context.resources.getIdentifier(resName, "id", context.packageName)
        onView(withId(id)).perform(click())
    }
}
