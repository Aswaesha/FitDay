package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.AllureUtils;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogNavbarTest extends BaseTest {

    @Test(description = "Add food in dashboard")
    public void addFoodAtDashboard(){
        loginPage.open();
        loginPage.login(username, password);

        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickAddFoodButton();

        loginPage.checkLoginPage(username,password);
        logNavbarPage.inputFoodText();

        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickPlusListButton();
        loginPage.checkLoginPage(username,password);
        assertEquals(logNavbarPage.checkFoodTable(), "Apple, raw", "Food not found");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Add activity at dashboard")
    public void addActivityAtDashboard() {
        loginPage.open();
        loginPage.login(username, password);
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickAddActivityButton();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.inputActivityText();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickPlusActivityButton();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickAddToActivityLogButton();
        loginPage.checkLoginPage(username,password);
        assertEquals(logNavbarPage.checkActivityTable(), "fast ballroom dancing", "Activity not found");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Change weight data")
    public void changeWeight(){
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/weight");
        loginPage.checkLoginPage(username,password);

        logNavbarPage.clickEditButton();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickInput();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.inputWeightText();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickSaveButton();
        loginPage.checkLoginPage(username,password);

        assertEquals(logNavbarPage.checkoutWeight(), "109.0 lbs", "Weight is not correct");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Check popup")
    public void checkPopUp(){
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/stats");
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickDropdown();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickDropdownValue();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickPlusButton();
        loginPage.checkLoginPage(username,password);

        assertTrue(logNavbarPage.checkoutPopup(), "Popup is not displayed");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Add mood  at diary")
    public void addMoodInDiary() {
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/diary");
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickEditGreyButton();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.inputMoodText();
        loginPage.checkLoginPage(username,password);
        logNavbarPage.clickSaveButton();
        loginPage.checkLoginPage(username,password);

        assertEquals(logNavbarPage.checkoutTextMood(), "I am happy", "Mood is not add");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }
}
