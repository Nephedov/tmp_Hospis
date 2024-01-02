//package ru.iteco.fmhandroid.ui.tests.functional;
//
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.assertion.ViewAssertions.matches;
//import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static androidx.test.espresso.matcher.ViewMatchers.withText;
//import static org.hamcrest.Matchers.allOf;
//import static ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso.onViewWithTimeout;
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
//import ru.iteco.fmhandroid.ui.data.DataGenerator;
//import ru.iteco.fmhandroid.ui.pages.NewsPage;
//import ru.iteco.fmhandroid.ui.steps.GeneralActions;
//import ru.iteco.fmhandroid.ui.steps.NewsActions;
//import ru.iteco.fmhandroid.ui.steps.OpenPage;
//
//@LargeTest
//@RunWith(AllureAndroidJUnit4.class)
//public class NewsTest {
//    @Rule
//    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
//            new ActivityScenarioRule<>(AppActivity.class);
//    @Rule
//    public ScreenshotRule screenshotRuleFailure = new ScreenshotRule(ScreenshotRule.Mode.FAILURE, "test_failure");
//
//    @Before
//    public void setUp() {
//        tryLogIn();
//    }
//    @After
//    public void tearDown() {
//        tryLogOut();
//    }
//    @Epic(value = "Функциональное тестирование")
//    @Feature(value = "Операции с новостями")
//    @Story(value = "Добавление новости")
//    @Test
//    @Description(value = "Тест проверяет добавление валидно заполненной новости")
//    public void shouldCheckAddNewNews() {
//        String newsCategory = "Зарплата";
//        String newsTitle = DataGenerator.RandomString.getRandomRuString(5);
//        String newsDate = DataGenerator.getCurrentDate();
//        String newsTime = DataGenerator.getCurrentTime();
//        String newsDescription = DataGenerator.RandomString.getRandomRuString(10);
//
//        NewsActions.addNews(newsCategory,newsTitle, newsDate, newsTime, newsDescription);
//
//        OpenPage.news();
//        NewsPage.ItemNews.newsWithTitle(newsTitle).checkWithTimeout(matches(isDisplayed()));
//        GeneralActions.News.clickOnNews(newsTitle);
//
//
//        NewsPage.ItemNews.newsWithDescription(newsDescription).checkWithTimeout(matches(isDisplayed()));
//
//        NewsActions.deleteNewsWithTitle(newsTitle);
//    }
//
//}
