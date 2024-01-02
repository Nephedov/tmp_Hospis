package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso.onViewWithTimeout;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso;

public class AppBarPanel {
    private static String logOutButtonText = "Выйти";
    private static String aboutPageButtonText = "О приложении";
    private static String mainPageButtonText = "Главная";
    private static String newsPageButtonText = "Новости";

    public static TimeoutEspresso.TimedViewInteraction authorizationButton = onViewWithTimeout(withId(R.id.authorization_image_button));
    public static TimeoutEspresso.TimedViewInteraction logOutButton = onViewWithTimeout(withText(logOutButtonText));
    public static TimeoutEspresso.TimedViewInteraction ourMissionButton = onViewWithTimeout(withId(R.id.our_mission_image_button));
    public static TimeoutEspresso.TimedViewInteraction mainImage = onViewWithTimeout(withId(R.id.trademark_image_view));
    public static TimeoutEspresso.TimedViewInteraction mainMenuButton = onViewWithTimeout(withId(R.id.main_menu_image_button));
    public static TimeoutEspresso.TimedViewInteraction mainPageButton = onViewWithTimeout(withText(mainPageButtonText));
    public static TimeoutEspresso.TimedViewInteraction newsPageButton = onViewWithTimeout(withText(newsPageButtonText));
    public static TimeoutEspresso.TimedViewInteraction aboutPageButton = onViewWithTimeout(withText(aboutPageButtonText));
    public static TimeoutEspresso.TimedViewInteraction aboutBackButton = onViewWithTimeout(withId(R.id.about_back_image_button));
    public static TimeoutEspresso.TimedViewInteraction topLineText = onViewWithTimeout(withId(R.id.custom_app_bar_title_text_view));
    public static TimeoutEspresso.TimedViewInteraction bottomLineText = onViewWithTimeout(withId(R.id.custom_app_bar_sub_title_text_view));
}
