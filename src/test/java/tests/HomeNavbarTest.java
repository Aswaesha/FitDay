package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeNavbarTest extends BaseTest {
    @Test
    public void  addFoodAtDashboard() throws InterruptedException {
        loginPage.open();
        loginPage.login(username,password);
       //driver.get("https://www.fitday.com/app/home/dashboard#06FEB2022");
        driver.navigate().refresh();
       driver.findElement(By.xpath("//tr//td[1]//a//span[text()='Add »']")).click();
       driver.findElement(By.xpath("//input[@value='What did you eat today?']")).sendKeys("apple");
        Thread.sleep(5000);
       driver.findElement(By.xpath("//td[@class='actions']//a")).click();
       assertEquals(driver.findElement(By.xpath("//tr[@class='food_log fd_food_log_u-998897-620009B5-c']//td[@class='name']//a[text()='Apple, raw']")).getText(),"Apple, raw","Food not found");
    }
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

}
