package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.AllureUtils;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogNavbarTest extends BaseTest {

    @Test(description = "Add food in dashboard")
    public void addFoodAtDashboard() throws InterruptedException {
        loginPage.open();
        loginPage.login(username, password);

        logNavbarPage.clickAddFoodButton();

        logNavbarPage.inputFoodText();
        logNavbarPage.clickPlusButton();

        assertEquals(logNavbarPage.checkFoodTable(), "Apple, raw", "Food not found");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Add activity at dashboard")
    public void addActivityAtDashboard() throws InterruptedException {
        loginPage.open();
        loginPage.login(username, password);

        logNavbarPage.clickAddActivityButton();
        logNavbarPage.inputActivityText();
        logNavbarPage.clickPlusButton();
        Thread.sleep(5000);
        logNavbarPage.clickAddToActivityLogButton();
        assertEquals(logNavbarPage.checkActivityTable(), "fast ballroom dancing", "Activity not found");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Change weight data")
    public void changeWeight() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/weight");

        logNavbarPage.clickEditButton();
        logNavbarPage.clickInput();
        logNavbarPage.inputWeightText();
        logNavbarPage.clickSaveButton();

        assertEquals(logNavbarPage.checkoutWeight(), "109.0 lbs", "Weight is not correct");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Change weight data")
    public void checkPopUp() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/stats");

        logNavbarPage.clickDropdown();
        logNavbarPage.clickDropdownValue("custom");
        logNavbarPage.clickPlusButton();

        assertTrue(logNavbarPage.checkoutPopup(), "Popup is not displayed");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Add mood  at diary")
    public void addMoodInDiary() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/diary");

        //logNavbarPage.clickEditGreyButton();
        logNavbarPage.inputMoodText();
        logNavbarPage.clickSaveButton();

        assertEquals(logNavbarPage.checkoutTextMood(), "I am happy", "Mood is not add");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }
}
