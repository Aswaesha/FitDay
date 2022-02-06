//package tests;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import utils.AllureUtils;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//public class HomeNavbarTest extends BaseTest {
//    @Test
//    public void  addFoodAtDashboard(){
//        loginPage.open();
//        loginPage.login(username,password);
//        driver.navigate().refresh();
//        homeNavbarPage.clickAddButton();
//        homeNavbarPage.inputText();
//        homeNavbarPage.clickPlusButton();
//
//        assertEquals(homeNavbarPage.checkFoodTable(),"Apple, raw","Food not found");
//    }
//    @Test(description = "Open calendar page across navbar")
//    public void clickHomeCalendarNavbar() {
//        loginPage.open()
//                .login(username, password);
//
////            Actions action = new Actions(driver);
////            WebElement we = driver.findElement(By.xpath("//a[span[text()='HOME']]"));
////            action.moveToElement(we).build().perform();
////            Thread.sleep(5000);
//
//        driver.findElement(By.xpath("//ul[not(contains(@style, 'none'))]/li//a[text()='CALENDAR']")).click();
//
//
//        assertTrue(homeNavbarPage.checkoutCalendarTable(), "Calendar page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
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
