package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso.onViewWithTimeout;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso;

public class AboutPage {
    public static TimeoutEspresso.TimedViewInteraction appBarPanel = onViewWithTimeout(withId(R.id.container_custom_app_bar_include_on_fragment_about));
    public static TimeoutEspresso.TimedViewInteraction aboutLabel = onViewWithTimeout(withId(R.id.about_company_info_label_text_view));
    public static TimeoutEspresso.TimedViewInteraction versionText = onViewWithTimeout(withId(R.id.about_version_title_text_view));
    public static TimeoutEspresso.TimedViewInteraction versionNumber = onViewWithTimeout(withId(R.id.about_version_value_text_view));
    public static TimeoutEspresso.TimedViewInteraction privacyPolicyText = onViewWithTimeout(withId(R.id.about_privacy_policy_label_text_view));
    public static TimeoutEspresso.TimedViewInteraction privacyPolicyLink = onViewWithTimeout(withId(R.id.about_privacy_policy_value_text_view));
    public static TimeoutEspresso.TimedViewInteraction termOfUseText = onViewWithTimeout(withId(R.id.about_terms_of_use_label_text_view));
    public static TimeoutEspresso.TimedViewInteraction termOfUseLink = onViewWithTimeout(withId(R.id.about_terms_of_use_value_text_view));

}
