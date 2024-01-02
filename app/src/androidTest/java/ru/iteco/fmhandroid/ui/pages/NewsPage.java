package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.matchers.CustomViewMatcher.childAtPosition;
import static ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso.onViewWithTimeout;

import androidx.test.espresso.matcher.RootMatchers;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso;

public class NewsPage {
    private static String newsTitle = "Новости";

    public static TimeoutEspresso.TimedViewInteraction title = onViewWithTimeout(withText(newsTitle));
    public static TimeoutEspresso.TimedViewInteraction newsContainer = onViewWithTimeout(withId(R.id.container_list_news_include));

    public static TimeoutEspresso.TimedViewInteraction appBarPanel = onViewWithTimeout(withId(R.id.container_custom_app_bar_include_on_fragment_news_list));
    public static TimeoutEspresso.TimedViewInteraction sortButton = onViewWithTimeout(withId(R.id.sort_news_material_button));
    public static TimeoutEspresso.TimedViewInteraction filterButton = onViewWithTimeout(withId(R.id.filter_news_material_button));
    public static TimeoutEspresso.TimedViewInteraction editButton = onViewWithTimeout(withId(R.id.edit_news_material_button));
    public static TimeoutEspresso.TimedViewInteraction newsList = onViewWithTimeout(15000, withId(R.id.news_list_recycler_view));

    public static class ItemNews {
        public static TimeoutEspresso.TimedViewInteraction newsWithTitle(String title) {
            return onViewWithTimeout(allOf(withId(R.id.news_item_title_text_view), withText(title)));
        }

        public static TimeoutEspresso.TimedViewInteraction newsWithDescription(String description) {
            return onViewWithTimeout(allOf(withId(R.id.news_item_description_text_view), withText(description)));
        }

        public static TimeoutEspresso.TimedViewInteraction descriptionOfNews(int num) {
            int number = num -1;
            return onViewWithTimeout(allOf(withId(R.id.news_item_description_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
        }

        public static TimeoutEspresso.TimedViewInteraction dateOfNews(int num) {
            int number = num -1;
            return onViewWithTimeout(allOf(withId(R.id.news_item_date_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
        }

        public static TimeoutEspresso.TimedViewInteraction iconOfNews(int num) {
            int number = num -1;
            return onViewWithTimeout(allOf(withId(R.id.category_icon_image_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
        }

        public static TimeoutEspresso.TimedViewInteraction titleOfNews(int num) {
            int number = num -1;
            return onViewWithTimeout(allOf(withId(R.id.news_item_title_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
        }

        public static TimeoutEspresso.TimedViewInteraction dropButtonOfNews(int num) {
            int number = num -1;
            return onViewWithTimeout(allOf(withId(R.id.view_news_item_image_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
        }
    }

    public static class FilterForm {
        private static String announcement = "Объявление";
        private static String birthday = "День рождения";
        private static String salary = "Зарплата";
        private static String tradeUnion = "Профсоюз";
        private static String holiday = "Праздник";
        private static String massage = "Массаж";
        private static String gratitude = "Благодарность";
        private static String helpIsNeeded = "Нужна помощь";
        public static TimeoutEspresso.TimedViewInteraction title = onViewWithTimeout(withId(R.id.filter_news_title_text_view));
        public static TimeoutEspresso.TimedViewInteraction categoryField = onViewWithTimeout(withId(R.id.news_item_category_text_auto_complete_text_view));
        public static TimeoutEspresso.TimedViewInteraction dateStartField = onViewWithTimeout(withId(R.id.news_item_publish_date_start_text_input_edit_text));
        public static TimeoutEspresso.TimedViewInteraction dateEndField = onViewWithTimeout(withId(R.id.news_item_publish_date_end_text_input_edit_text));
        public static TimeoutEspresso.TimedViewInteraction acceptButton = onViewWithTimeout(withId(R.id.filter_button));
        public static TimeoutEspresso.TimedViewInteraction cancelButton = onViewWithTimeout(withId(R.id.cancel_button));

        public static TimeoutEspresso.TimedViewInteraction announcementCategory = onViewWithTimeout(withText(announcement)).inRoot(RootMatchers.isPlatformPopup());
        public static TimeoutEspresso.TimedViewInteraction salaryCategory = onViewWithTimeout(withText(salary)).inRoot(RootMatchers.isPlatformPopup());
        public static TimeoutEspresso.TimedViewInteraction birthdayCategory = onViewWithTimeout(withText(birthday)).inRoot(RootMatchers.isPlatformPopup());
        public static TimeoutEspresso.TimedViewInteraction tradeUnionCategory = onViewWithTimeout(withText(tradeUnion)).inRoot(RootMatchers.isPlatformPopup());
        public static TimeoutEspresso.TimedViewInteraction holidayCategory = onViewWithTimeout(withText(holiday)).inRoot(RootMatchers.isPlatformPopup());
        public static TimeoutEspresso.TimedViewInteraction massageCategory = onViewWithTimeout(withText(massage)).inRoot(RootMatchers.isPlatformPopup());
        public static TimeoutEspresso.TimedViewInteraction gratitudeCategory = onViewWithTimeout(withText(gratitude)).inRoot(RootMatchers.isPlatformPopup());
        public static TimeoutEspresso.TimedViewInteraction helpIsNeededCategory = onViewWithTimeout(withText(helpIsNeeded)).inRoot(RootMatchers.isPlatformPopup());

    }

    public static class ControlPanelPage {
        private static String ControlPanelTitle = "Панель \n управления";
        public static TimeoutEspresso.TimedViewInteraction newsList = onViewWithTimeout(15000, withId(R.id.news_list_recycler_view));
        public static TimeoutEspresso.TimedViewInteraction sortButton = NewsPage.sortButton;
        public static TimeoutEspresso.TimedViewInteraction filterButton = NewsPage.filterButton;
        public static TimeoutEspresso.TimedViewInteraction title = onViewWithTimeout(withText(ControlPanelTitle));

        public static TimeoutEspresso.TimedViewInteraction appBarPanel = onViewWithTimeout(withId(R.id.container_custom_app_bar_include_on_fragment_news_control_panel));
        public static TimeoutEspresso.TimedViewInteraction addNewsButton = onViewWithTimeout(withId(R.id.add_news_image_view));

        public static class ItemNewsControlPanel extends ItemNews{
            public static TimeoutEspresso.TimedViewInteraction publicationTextField(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.news_item_publication_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction publicationDateField(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.news_item_publication_date_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction creationTextField(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.news_item_creation_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction creationDateField(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.news_item_create_date_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction authorTextField(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.news_item_author_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction authorNameField(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.news_item_author_name_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction publicationStatus(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.news_item_published_text_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction deleteNewsButton(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.delete_news_item_image_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }

            public static TimeoutEspresso.TimedViewInteraction editNewsButton(int num) {
                int number = num -1;
                return onViewWithTimeout(allOf(withId(R.id.edit_news_item_image_view), withParent(withParent(childAtPosition(withId(R.id.news_list_recycler_view), number)))));
            }
        }
        public static class FilterFormControlPanel extends FilterForm {
            public static TimeoutEspresso.TimedViewInteraction checkboxActive = onViewWithTimeout(withId(R.id.filter_news_active_material_check_box));
            public static TimeoutEspresso.TimedViewInteraction checkboxNotActive = onViewWithTimeout(withId(R.id.filter_news_inactive_material_check_box));
        }

        public static class CreateEditForm {
            public static TimeoutEspresso.TimedViewInteraction categoryField = onViewWithTimeout(withId(R.id.news_item_category_text_auto_complete_text_view));
            public static TimeoutEspresso.TimedViewInteraction titleField = onViewWithTimeout(withId(R.id.news_item_title_text_input_edit_text));
            public static TimeoutEspresso.TimedViewInteraction publicationDateField = onViewWithTimeout(withId(R.id.news_item_publish_date_text_input_edit_text));
            public static TimeoutEspresso.TimedViewInteraction publicationTimeField = onViewWithTimeout(withId(R.id.news_item_publish_time_text_input_edit_text));
            public static TimeoutEspresso.TimedViewInteraction descriptionField = onViewWithTimeout(withId(R.id.news_item_description_text_input_edit_text));
            public static TimeoutEspresso.TimedViewInteraction switcher = onViewWithTimeout(withId(R.id.switcher));
            public static TimeoutEspresso.TimedViewInteraction saveButton = onViewWithTimeout(withId(R.id.save_button));
            public static TimeoutEspresso.TimedViewInteraction cancelButton = onViewWithTimeout(withId(R.id.cancel_button));

        }
    }
}
