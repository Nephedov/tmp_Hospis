//package ru.iteco.fmhandroid.ui.tests.ui;
//
//import static androidx.test.espresso.assertion.ViewAssertions.matches;
//import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
//import static androidx.test.espresso.matcher.ViewMatchers.withHint;
//import static androidx.test.espresso.matcher.ViewMatchers.withText;
//
//import static org.hamcrest.Matchers.not;
//
//import static ru.iteco.fmhandroid.ui.steps.Authorization.tryLogIn;
//import static ru.iteco.fmhandroid.ui.steps.Authorization.tryLogOut;
//
//import androidx.test.ext.junit.rules.ActivityScenarioRule;
//import androidx.test.filters.LargeTest;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import io.qameta.allure.android.rules.ScreenshotRule;
//import io.qameta.allure.android.runners.AllureAndroidJUnit4;
//import io.qameta.allure.kotlin.Description;
//import io.qameta.allure.kotlin.Epic;
//import io.qameta.allure.kotlin.Feature;
//import io.qameta.allure.kotlin.Story;
//import ru.iteco.fmhandroid.ui.AppActivity;
//import ru.iteco.fmhandroid.ui.pages.AppBarPanel;
//import ru.iteco.fmhandroid.ui.pages.NewsPage;
//import ru.iteco.fmhandroid.ui.pages.NewsPage.*;
//import ru.iteco.fmhandroid.ui.steps.GeneralActions;
//import ru.iteco.fmhandroid.ui.steps.OpenPage;
//
//@LargeTest
//@RunWith(AllureAndroidJUnit4.class)
//public class NewsPageTest {
//    @Rule
//    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
//            new ActivityScenarioRule<>(AppActivity.class);
//    @Rule
//    public ScreenshotRule screenshotRuleFailure = new ScreenshotRule(ScreenshotRule.Mode.FAILURE, "test_failure");
//
//    @Before
//    public void setUp() {
//        tryLogIn();
//        OpenPage.news();
//    }
//    @After
//    public void tearDown() {
//        tryLogOut();
//    }
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Панель AppBar")
//    @Story(value = "AppBar на странице \"Новости\"")
//    @Test
//    @Description(value = "Тест проверяет отображение AppBar панели на странице \"Новости\"")
//    public void shouldCheckAppBarOnNewsIsDisplayed() {
//        NewsPage.appBarPanel.checkWithTimeout(matches(isDisplayed()));
//    }
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Панель AppBar")
//    @Story(value = "Лого AppBar на странице \"Новости\"")
//    @Test
//    @Description(value = "Тест проверяет отображение главной иконки на панели AppBar на странице \"Новости\"")
//    public void shouldCheckAppBarLogoOnNewsIsDisplayed() {
//        AppBarPanel.mainImage.checkWithTimeout(matches(isDisplayed()));
//    }
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Страница \"Новости\"")
//    @Story(value = "Заголовок")
//    @Test
//    @Description(value = "Тест проверяет отображение заголовка страницы новостей")
//    public void shouldCheckNewsTitleIsDisplayed() {
//        NewsPage.title.checkWithTimeout(matches(isDisplayed()));
//    }
//
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Страница \"Новости\"")
//    @Story(value = "Список новостей")
//    @Test
//    @Description(value = "Тест проверяет отображение списка новостей страницы новости")
//    public void shouldCheckNewsListIsDisplayed() {
//        NewsPage.newsList.checkWithTimeout(matches(isDisplayed()));
//    }
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Страница \"Новости\"")
//    @Story(value = "Кнопки управления")
//    @Test
//    @Description(value = "Тест проверяет отображение кнопок управления новостями")
//    public void shouldCheckControlButtonsIsDisplayed() {
//        NewsPage.sortButton.checkWithTimeout(matches(isDisplayed()));
//        NewsPage.filterButton.checkWithTimeout(matches(isDisplayed()));
//        NewsPage.editButton.checkWithTimeout(matches(isDisplayed()));
//    }
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Страница \"Новости\"")
//    @Story(value = "Элементы скрытой новости")
//    @Test()
//    @Description(value = "Тест проверяет отображение элементов первой в списке нераскрытой новости")
//    public void shouldCheckHiddenFirstNewsElementsIsDisplayed() {
//        int numberOfNews = 1;
//
//        ItemNews.titleOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.iconOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.dropButtonOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.dateOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.descriptionOfNews(numberOfNews).checkWithTimeout(matches(not(isDisplayed())));
//    }
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Страница \"Новости\"")
//    @Story(value = "Элементы раскрытой новости")
//    @Test
//    @Description(value = "Тест проверяет отображение элементов первой в списке раскрытой новости")
//    public void shouldCheckFirstNewsElementsIsDisplayed() {
//        int numberOfNews = 1;
//
//        GeneralActions.News.clickOnNews(numberOfNews);
//
//        ItemNews.titleOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.iconOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.dropButtonOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.dateOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//        ItemNews.descriptionOfNews(numberOfNews).checkWithTimeout(matches(isDisplayed()));
//    }
//
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Страница \"Новости\"")
//    @Story(value = "Форма фильтра новостей")
//    @Test
//    @Description(value = "Тест проверяет отображение элементов формы фильтра")
//    public void shouldCheckFilterFormElementsIsDisplayed() {
//        String formTitle = "Фильтровать новости";
//        String categoryHint = "Категория";
//        String dateFormat = "ДД.ММ.ГГГГ";
//        String acceptButton = "Фильтровать";
//        String cancelButton = "Отмена";
//
//        GeneralActions.News.clickOnFilterButton();
//
//        FilterForm.title.checkWithTimeout(matches(isDisplayed())).check(matches(withText(formTitle)));
//        FilterForm.categoryField.checkWithTimeout(matches(isDisplayed())).check(matches(withHint(categoryHint)));
//        FilterForm.dateStartField.checkWithTimeout(matches(isDisplayed())).check(matches(withHint(dateFormat)));
//        FilterForm.dateEndField.checkWithTimeout(matches(isDisplayed())).check(matches(withHint(dateFormat)));
//        FilterForm.acceptButton.checkWithTimeout(matches(isDisplayed())).check(matches(withText(acceptButton)));
//        FilterForm.cancelButton.checkWithTimeout(matches(isDisplayed())).check(matches(withText(cancelButton)));
//    }
//    @Epic(value = "Тестирование UI")
//    @Feature(value = "Страница \"Новости\"")
//    @Story(value = "Форма фильтра новостей")
//    @Test
//    @Description(value = "Тест проверяет отображение категорий формы фильтра")
//    public void shouldCheckFilterFormCategoriesIsDisplayed() {
//        GeneralActions.News.clickOnFilterButton();
//        GeneralActions.News.Filter.clickOnCategoryField();
//
//        FilterForm.announcementCategory.checkWithTimeout(matches(isDisplayed()));
//        FilterForm.salaryCategory.checkWithTimeout(matches(isDisplayed()));
//        FilterForm.birthdayCategory.checkWithTimeout(matches(isDisplayed()));
//        FilterForm.tradeUnionCategory.checkWithTimeout(matches(isDisplayed()));
//        FilterForm.holidayCategory.checkWithTimeout(matches(isDisplayed()));
//        FilterForm.massageCategory.checkWithTimeout(matches(isDisplayed()));
//        FilterForm.gratitudeCategory.checkWithTimeout(matches(isDisplayed()));
//        FilterForm.helpIsNeededCategory.checkWithTimeout(matches(isDisplayed()));
//
//        GeneralActions.returnBack();
//    }
//}
