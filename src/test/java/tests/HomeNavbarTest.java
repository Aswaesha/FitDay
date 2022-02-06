//package tests;
//
//import org.testng.annotations.Test;
//import utils.AllureUtils;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//public class HomeNavbarTest extends BaseTest {
//    @Test(description = "Open calendar page across navbar")
//    public void clickHomeCalendarNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("HOME", "CALENDAR");
//
//        assertTrue(homeNavbarPage.checkoutCalendarTable(), "Calendar page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//
//    @Test(description = "Open profile page across navbar")
//    public void clickArticlesFitnessNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("HOME", "PROFILE");
//
//        assertEquals(homeNavbarPage.checkoutTitleHomeProfile(), "Profile", "Profile page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//
//    @Test(description = "Open settings page across navbar")
//    public void clickArticlesHomeNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("HOME", "SETTINGS");
//
//        assertEquals(homeNavbarPage.checkoutTitles(), "Settings", "Settings page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//}
