package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;

public class LogNavbarTest extends BaseTest {
    @Test(description = "Change weight data")
    public void changeWeight() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        logNavbarPage.open("/app/log/weight#10FEB2022");

        logNavbarPage.clickEditButton();
        logNavbarPage.clickInput();
        logNavbarPage.inputWeightText();
        homeNavbarPage.clickSaveButton();

        assertEquals(logNavbarPage.checkoutWeight(), "109.0 kgs", "Weight is not correct");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open food across Navbar with click on log")
    public void clickDietitianNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.clickOnNavbar("LOG");

        assertEquals(homeNavbarPage.checkoutTitles(), "Food Log", "Food page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open activity page across navbar")
    public void clickLogActivityNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        AllureUtils.takeScreenshot(driver);
        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("ACTIVITY");

        assertEquals(homeNavbarPage.checkoutTitles(), "Activity Log", "Activity page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open weight page across navbar")
    public void clickLogWeightNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("WEIGHT");

        assertEquals(homeNavbarPage.checkoutTitles(), "Weight Log", "Weight page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open mood page across navbar")
    public void clickLogMoodNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("MOOD");

        assertEquals(homeNavbarPage.checkoutTitles(), "Mood Log", "Mood page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open body page across navbar")
    public void clickLogBodyNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("BODY");

        assertEquals(homeNavbarPage.checkoutTitles(), "Body Log", "Body page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open custom page across navbar")
    public void clickLogCustomNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.refreshPage();
        homePage.isPageOpen();

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("CUSTOM");

        assertEquals(homeNavbarPage.checkoutTitles(), "Custom Log", "Custom page is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
