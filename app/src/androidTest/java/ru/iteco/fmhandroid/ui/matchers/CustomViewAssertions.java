package ru.iteco.fmhandroid.ui.matchers;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso.onViewWithTimeout;

public class CustomViewAssertions {
    public static void checkToastMessageIsDisplayed(String message) {
        onViewWithTimeout(withText(message)).inRoot(ToastMatcher.isToast()).checkWithTimeout(matches(isDisplayed()));
    }
}
