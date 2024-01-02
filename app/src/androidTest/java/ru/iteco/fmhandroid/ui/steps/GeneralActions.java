package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.matchers.CustomViewAction.clickOnViewWithId;
import static ru.iteco.fmhandroid.ui.matchers.CustomViewMatcher.childAtPosition;
import static ru.iteco.fmhandroid.ui.matchers.TimeoutEspresso.onViewWithTimeout;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.RootMatchers;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.pages.AboutPage;
import ru.iteco.fmhandroid.ui.pages.AppBarPanel;
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;
import ru.iteco.fmhandroid.ui.pages.MainPage;
import ru.iteco.fmhandroid.ui.pages.NewsPage.*;
import ru.iteco.fmhandroid.ui.pages.NewsPage;

// Class describing actions with page elements
public class GeneralActions {

    public static void returnBack() {
        Allure.step("Клик по кнопке кнопке \"Назад\" устройства");
        onView(isRoot()).perform(ViewActions.pressBack());
    }


    public static class Main {
        public static void clickOnDropButton() {
            Allure.step("Клик по кнопке раскрытия/скрытия блока новостей на главной странице");
            MainPage.dropButton.performWithTimeout(click());
        }
    }

    public static class Authorization {
        public static void insertInLoginField(String login) {
            Allure.step("Ввод \"" + login + "\" в поле ввода \"Логин\"");
            AuthorizationPage.loginField.performWithTimeout(replaceText(login), closeSoftKeyboard());
        }

        public static void insertInPasswordField(String password) {
            Allure.step("Ввод \"" + password + "\" в поле ввода \"Пароль\"");
            AuthorizationPage.passwordField.performWithTimeout(replaceText(password), closeSoftKeyboard());
        }

        public static void clickOnEnterButton() {
            Allure.step("Клик по кнопке \"Войти\"");
            AuthorizationPage.enterButton.performWithTimeout(click());
        }
    }
    public static class AppBar {
        public static void clickOnMainMenuButton() {
            AppBarPanel.mainMenuButton.performWithTimeout(click());
        }

        public static void clickOnAuthButton() {
            AppBarPanel.authorizationButton.performWithTimeout(click());
            Allure.step("Клик по иконке \"Авторизация\" панели AppBar");
        }

        public static void clickOnLogOutButton() {
            Allure.step("Клик по всплывающей кнопке \"Выйти\"");
            AppBarPanel.logOutButton.performWithTimeout(click());
        }

        public static void clickOnMainPageButton() {
            Allure.step("Клик по кнопке \"Главная\" бургерного меню");
            AppBarPanel.mainPageButton.performWithTimeout(click());
        }

        public static void clickOnNewsPageButton() {
            Allure.step("Клик по кнопке \"Новости\" бургерного меню");
            AppBarPanel.newsPageButton.performWithTimeout(click());
        }

        public static void clickOnAboutPageButton() {
            Allure.step("Клик по кнопке \"О приложении\" бургерного меню");
            AppBarPanel.aboutPageButton.performWithTimeout(click());
        }

        public static void clickOnOurMissionButton() {
            Allure.step("Клик по иконке тематических цитат AppBar панели");
            AppBarPanel.ourMissionButton.performWithTimeout(click());
        }

        public static void clickOnAboutBackButton() {
            Allure.step("Клик по иконке \"Назад\" AppBar панели");
            AppBarPanel.aboutBackButton.performWithTimeout(click());
        }
    }
    public static class OurMission {
        public static void clickOnQuote(int num) {
            int number = num -1;
            Allure.step("Клик по " + num + " цитате в списке");
            onViewWithTimeout(childAtPosition(withId(R.id.our_mission_item_list_recycler_view), number)).performWithTimeout(click());
        }
    }

    public static class News {
        public static void clickOnNews(String title) {
            // Method for clicking on news with specified title

            Allure.step("Клик по  новости в списке c заголовком \"" + title + "\"");
            NewsPage.ItemNews.newsWithTitle(title).performWithTimeout(click());
        }
        public static void clickOnNews(int num) {
            // Method for clicking on news from the list
            int number = num -1;
            Allure.step("Клик по " + num + " новости в списке");
            onViewWithTimeout(childAtPosition(withId(R.id.news_list_recycler_view), number)).performWithTimeout(click());
        }

        public static void clickOnFilterButton() {
            Allure.step("Клик по кнопке фильтра");
            NewsPage.filterButton.performWithTimeout(click());
        }

        public static void clickOnEditButton() {
            Allure.step("Клик по кнопке \"Панель управления\"");
            NewsPage.editButton.performWithTimeout(click());
        }

        public static class Filter {
            public static void clickOnCategoryField() {
                Allure.step("Клик по полю выбора категории");
                FilterForm.categoryField.performWithTimeout(click(), closeSoftKeyboard());
            }

            public static void clickOnCategory (String category) {
                Allure.step("Клик по категории \"" + category + "\"");
                onViewWithTimeout(withText(category)).inRoot(RootMatchers.isPlatformPopup()).performWithTimeout(click());
            }
        }

        public static class ControlPanel {
            public static void clickOnAddNewsButton() {
                Allure.step("Клик по кнопке добавления новости");
                ControlPanelPage.addNewsButton.performWithTimeout(click());
            }

            public static void clickOnEditNewsButton(int num) {
                Allure.step("Клик по кнопке редактирования " + num + " новости");
                ControlPanelPage.ItemNewsControlPanel.editNewsButton(num).performWithTimeout(click());
            }

            public static class CreateEdit {
                public static void insertInTitleField (String title) {
                    Allure.step("Ввод в поле \"Заголовок\" значения \"" + title + "\"");
                    ControlPanelPage.CreateEditForm.titleField.performWithTimeout(replaceText(title));
                }

                public static void insertInDescriptionField (String description) {
                    Allure.step("Ввод в поле \"Описание\" значения \"" + description + "\"");
                    ControlPanelPage.CreateEditForm.descriptionField.performWithTimeout(replaceText(description));
                }

                public static void insertInDateField (String date) {
                    Allure.step("Ввод в поле \"Дата\" значения \"" + date + "\"");
                    ControlPanelPage.CreateEditForm.publicationDateField.performWithTimeout(replaceText(date));
                }

                public static void insertInTimeField (String time) {
                    Allure.step("Ввод в поле \"Время\" значения \"" + time + "\"");
                    ControlPanelPage.CreateEditForm.publicationTimeField.performWithTimeout(replaceText(time));
                }

                public static void clickOnSaveButton() {
                    Allure.step("Клик по кнопке \"Сохранить\"");
                    ControlPanelPage.CreateEditForm.saveButton.performWithTimeout(click());
                }
            }
        }
    }

    public static class About {
        public static void clickOnTermOfUseLink() {
            Allure.step("Клик по ссылке о Пользовательском Соглашении");
            AboutPage.termOfUseLink.performWithTimeout(click());
        }

        public static void clickOnPrivacyPolicyLink() {
            Allure.step("Клик по ссылке о Политике Конфиденциальности");
            AboutPage.privacyPolicyLink.performWithTimeout(click());
        }
    }
}
