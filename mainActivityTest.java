package com.example.myapplication;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);


   // @Test
   // public void mainActivityTestIsDisplayed() {
       // onView(withId(R.id.button)).check(matches(isDisplayed()));
   // }
    @Test
    public void mainActivityTest1() {
        onView(withId(R.id.editText1)).perform(typeText("2"));
        onView(withId(R.id.editText2)).perform(typeText("3"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView3)).check(matches(withText("8.0")));
    }
    @Test
    public void mainActivityTest2() {
        onView(withId(R.id.editText1)).perform(typeText("1001"));
        onView(withId(R.id.editText2)).perform(typeText("3"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView3)).check(matches(withText("Вы допустили ошибку при вводе числа. Попробуйте еще раз.")));
    }

    @Test
    public void mainActivityTest3() {
        onView(withId(R.id.editText1)).perform(typeText("555"));
        onView(withId(R.id.editText2)).perform(typeText("2"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView3)).check(matches(withText("308025.0")));
    }

    @Test
    public void mainActivityTest4() {
        onView(withId(R.id.editText1)).perform(typeText("999"));
        onView(withId(R.id.editText2)).perform(typeText("2"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView3)).check(matches(withText("998001.0")));
    }



    }

