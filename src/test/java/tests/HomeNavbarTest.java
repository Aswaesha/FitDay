package tests;


import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeNavbarTest extends BaseTest {
    @Test(description = "Change profile data")
    public void changeProfile() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        homeNavbarPage.open("/app/home/profile#09FEB2022");

        homeNavbarPage.clickEditButton();
        homeNavbarPage.clickMonth();
        homeNavbarPage.clickValueMonth();
        homeNavbarPage.clickSaveButton();

        assertEquals(homeNavbarPage.checkMonthTable(), "May 1 1997", "Profile page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Add food in dashboard")
    public void addFoodAtDashboard() throws InterruptedException {
        loginPage.open();
        loginPage.login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        homeNavbarPage.clickAddFoodButton();

        homeNavbarPage.inputFoodText();
        homeNavbarPage.clickPlusButton();

        assertEquals(homeNavbarPage.checkFoodTable(), "Apple, raw", "Food not found");
    }

    @Test(description = "Add activity at dashboard")
    public void addActivityAtDashboard() throws InterruptedException {
        loginPage.open();
        loginPage.login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        homeNavbarPage.clickAddActivityButton();
        homeNavbarPage.inputActivityText();
        homeNavbarPage.clickPlusButton();
        Thread.sleep(5000);
        homeNavbarPage.clickAddToActivityLogButton();

        assertEquals(homeNavbarPage.checkActivityTable(), "fast ballroom dancing", "Activity not found");
    }

    @Test(description = "Open calendar page across navbar")
    public void clickHomeCalendarNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("CALENDAR");

        assertTrue(homeNavbarPage.checkoutCalendarTable(), "Calendar page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open profile page across navbar")
    public void clickHomeProfileNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);


        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("PROFILE");

        assertEquals(homeNavbarPage.checkoutTitleHomeProfile(), "Profile", "Profile page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open settings page across navbar")
    public void clickSettingsHomeNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("SETTINGS");

        assertEquals(homeNavbarPage.checkoutTitles(), "Settings", "Settings page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open settings page across navbar")
    public void changeSettingsHome() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        homeNavbarPage.open("/app/home/settings#10FEB2022");
        homeNavbarPage.clickEditButton();
        homeNavbarPage.clickDefaultChart();
        homeNavbarPage.clickDefaultChartValue();
        homeNavbarPage.clickSaveButton();

        assertEquals(homeNavbarPage.checkDefaultChart(), "BMI", "Settings page is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
