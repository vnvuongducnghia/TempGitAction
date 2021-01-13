package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Created by nghia.vuong on 11,January,2021
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun btnAddition() {
        // input number
        onView(withId(R.id.edtA)).perform(replaceText("5"))
        Thread.sleep(1000)
        onView(withId(R.id.edtB)).perform(replaceText("2"))

        // perform click
        onView(withId(R.id.btnAddition)).check(matches(isDisplayed())).perform(click())
        Thread.sleep(2000)

        // result
        onView(withId(R.id.tvResult)).check(matches(withText("7")))
        Thread.sleep(4000)
    }

    @After
    fun tearDown() {
        activityRule.finishActivity()
    }

}