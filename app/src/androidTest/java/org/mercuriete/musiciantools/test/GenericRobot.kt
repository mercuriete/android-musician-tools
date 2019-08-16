package org.mercuriete.musiciantools.test

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

open class GenericRobot {
    protected fun genericAssertTextView(@IdRes textViewId: Int, text: String) {
        onView(withId(textViewId)).check(matches(withText(text)))
    }
}
