package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.hasSibling;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import androidx.test.espresso.contrib.RecyclerViewActions;

import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.matchers.CustomViewAction.clickOnViewWithId;
import static ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso.onViewWithTimeout;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.newsList;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.DataGenerator;
import ru.iteco.fmhandroid.ui.pages.NewsPage;

public class NewsActions {
    private static String defaultCategory = "Объявление";
    private static String defaultDate = DataGenerator.getCurrentDate();
    private static String defaultTime = DataGenerator.getCurrentTime();

    public static void addNews(String category, String title, String date, String time, String description) {
        Allure.step("Создание новой новости:");
        OpenPage.newsControlPanel();

        try {
            GeneralActions.News.ControlPanel.clickOnAddNewsButton();
            GeneralActions.News.Filter.clickOnCategoryField();
            GeneralActions.News.Filter.clickOnCategory(category);
            GeneralActions.News.ControlPanel.CreateEdit.insertInTitleField(title);
            GeneralActions.News.ControlPanel.CreateEdit.insertInDateField(date);
            GeneralActions.News.ControlPanel.CreateEdit.insertInTimeField(time);
            GeneralActions.News.ControlPanel.CreateEdit.insertInDescriptionField(description);

            GeneralActions.News.ControlPanel.CreateEdit.clickOnSaveButton();
        }
        catch (Exception e) {
        }

    }

    public static void addNews(String title) {
        addNews(defaultCategory, title, defaultDate, defaultTime, title);
    }

    public static void deleteNewsWithTitle(String title) {
        Allure.step("Удаление новости с заголовком: \"" + title + "\"");
        OpenPage.newsControlPanel();
        NewsPage.ControlPanelPage.newsList.perform(RecyclerViewActions.actionOnItem(
                        hasDescendant(withText(title)),
                        clickOnViewWithId(R.id.delete_news_item_image_view)));
    }
}
