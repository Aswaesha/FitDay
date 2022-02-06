//package tests;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import utils.AllureUtils;
//
//import static org.testng.Assert.assertEquals;
//
//public class LogNavbarTest extends BaseTest {
//    @Test(description = "Open food across Navbar with click on log")
//    public void clickDietitianNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.clickOnNavbar("LOG");
//
//        assertEquals(homeNavbarPage.checkoutTitles(), "Food Log", "Food page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//
//    @Test(description = "Open activity page across navbar")
//    public void clickLogActivityNavbar() throws InterruptedException {
//        loginPage.open()
//                .login(username, password);
//
//       // homePage.isPageOpen();
//
//        AllureUtils.takeScreenshot(driver);
//        navbarPage.selectMenuOption("LOG");
//        navbarPage.selectSecondMenuOption("ACTIVITY");
//
//
//
//        assertEquals(homeNavbarPage.checkoutTitles(), "Activity Log", "Activity page is not open");
//
//    }
//
//    @Test(description = "Open weight page across navbar")
//    public void clickLogWeightNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("LOG", "WEIGHT");
//
//        assertEquals(homeNavbarPage.checkoutTitles(), "Weight Log", "Weight page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//
//    @Test(description = "Open mood page across navbar")
//    public void clickLogMoodNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("LOG", "MOOD");
//
//        assertEquals(homeNavbarPage.checkoutTitles(), "Mood Log", "Mood page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//
//    @Test(description = "Open body page across navbar")
//    public void clickLogBodyNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("LOG", "BODY");
//
//        assertEquals(homeNavbarPage.checkoutTitles(), "Body Log", "Body page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//
//    @Test(description = "Open custom page across navbar")
//    public void clickLogCustomNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("LOG", "CUSTOM");
//
//        assertEquals(homeNavbarPage.checkoutTitles(), "Custom Log", "Custom page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//}
