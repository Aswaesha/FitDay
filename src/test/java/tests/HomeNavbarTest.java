package tests;


import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeNavbarTest extends BaseTest {
    @Test
    public void  addFoodAtDashboard() throws InterruptedException{
        loginPage.open();
        loginPage.login(username,password);

        driver.navigate().refresh();
        Thread.sleep(5000);

        homeNavbarPage.clickAddButton();
        homeNavbarPage.inputText();
        homeNavbarPage.clickPlusButton();

        assertEquals(homeNavbarPage.checkFoodTable(),"Apple, raw","Food not found");
    }

    @Test(description = "Open calendar page across navbar")
    public void clickHomeCalendarNavbar() throws InterruptedException{
        loginPage.open()
                .login(username, password);

        driver.navigate().refresh();
        Thread.sleep(5000);

       // homePage.isPageOpen();
        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("CALENDAR");

        assertTrue(homeNavbarPage.checkoutCalendarTable(), "Calendar page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open profile page across navbar")
    public void clickArticlesFitnessNavbar() throws InterruptedException{
        loginPage.open()
                .login(username, password);

        //homePage.isPageOpen();
        driver.navigate().refresh();
        Thread.sleep(5000);

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("PROFILE");

        assertEquals(homeNavbarPage.checkoutTitleHomeProfile(), "Profile", "Profile page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open settings page across navbar")
    public void clickArticlesHomeNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        //homePage.isPageOpen();
        driver.navigate().refresh();
        Thread.sleep(5000);

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("SETTINGS");

        assertEquals(homeNavbarPage.checkoutTitles(), "Settings", "Settings page is not open");
        AllureUtils.takeScreenshot(driver);
    }

}
