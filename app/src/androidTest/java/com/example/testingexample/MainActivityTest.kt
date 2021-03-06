package com.example.testingexample

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
    //navigation test
//    @Test
//    fun test_navSecondaryActivity() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
//        onView(withId(R.id.button_nextActivity)).perform(click())
//        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
//    }
//
//    @Test
//    fun test_backPress_toMainActivity() {
//        val activityScenario = ActivityScenario.launch(SecondaryActivity::class.java)
//
//        onView(withId(R.id.button_nextActivity)).perform(click())
//        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
//
//        onView(withId(R.id.button_backActivity)).perform(click()) //method 1
////        pressBack() //method 2
//        onView(withId(R.id.main)).check(matches(isDisplayed()))
//    }
    //end of navigation test

    //launch the activity and the app works the way it should i.e the title and button next exists
    @Test
    fun test_isActivity_inView() {
        //testing with espresso
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_title_nextButton() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
        onView(withId(R.id.button_nextActivity)).check(matches(isDisplayed()))//method 1

        // Method 2 of checking visibility
//        onView(withId(R.id.button_nextActivity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun test_isTitleText_Displayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainActivity)))
    }
}