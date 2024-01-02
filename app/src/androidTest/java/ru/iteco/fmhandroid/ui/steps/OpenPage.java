package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pages.AboutPage;
import ru.iteco.fmhandroid.ui.pages.MainPage;
import ru.iteco.fmhandroid.ui.pages.NewsPage.ControlPanelPage;
import ru.iteco.fmhandroid.ui.pages.NewsPage;
import ru.iteco.fmhandroid.ui.pages.OurMissionPage;

public class OpenPage {
    // Methods for opening application pages
    public static void main() {
        Allure.step("Переход к \"Главной\" странице:");
        try {
            GeneralActions.AppBar.clickOnMainMenuButton();
            GeneralActions.AppBar.clickOnMainPageButton();
        }
        catch (Exception e){
            try {
                GeneralActions.AppBar.clickOnAboutBackButton();
                GeneralActions.AppBar.clickOnMainMenuButton();
                GeneralActions.AppBar.clickOnMainPageButton();
            }
            catch (Exception e1){
            }
        }
        MainPage.newsContainer.checkWithTimeout(matches(isDisplayed()));
    }

    public static void news() {
        Allure.step("Переход к странице \"Новости\":");
        try {
            GeneralActions.AppBar.clickOnMainMenuButton();
            GeneralActions.AppBar.clickOnNewsPageButton();
        }
        catch (Exception e){
            try {
                GeneralActions.AppBar.clickOnAboutBackButton();
                GeneralActions.AppBar.clickOnMainMenuButton();
                GeneralActions.AppBar.clickOnNewsPageButton();
            }
            catch (Exception e1){
            }
        }
        NewsPage.newsContainer.checkWithTimeout(matches(isDisplayed()));
    }

    public static void newsControlPanel() {
        try {
            OpenPage.news();
            GeneralActions.News.clickOnEditButton();
            ControlPanelPage.title.checkWithTimeout(matches(isDisplayed()));
        }
        catch (Exception e){
        }
    }

    public static void about() {
        Allure.step("Переход к странице \"О приложении\":");
        try{
            NewsPage.newsContainer.checkWithTimeout(matches(isDisplayed()));
            GeneralActions.returnBack();
        }
        catch (Exception e) {
        }
        GeneralActions.AppBar.clickOnMainMenuButton();
        GeneralActions.AppBar.clickOnAboutPageButton();
        AboutPage.aboutLabel.checkWithTimeout(matches(isDisplayed()));
    }

    public static void ourMission() {
        Allure.step("Переход к странице тематических цитат:");
        try {
            GeneralActions.AppBar.clickOnOurMissionButton();
        }
        catch (Exception e) {
            GeneralActions.AppBar.clickOnAboutBackButton();
            GeneralActions.AppBar.clickOnOurMissionButton();
        }
        OurMissionPage.title.checkWithTimeout(matches(isDisplayed()));
    }
}
