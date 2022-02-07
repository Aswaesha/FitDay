package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertTrue;

public class ArticlesNavbarTest extends BaseTest {
    @Test(description = "Open nutrition page across navbar")
    public void clickArticlesNutritionNavbar() throws InterruptedException {
        for (int turn = 0; turn < 20; turn++) {
//            driver.get("https://www.fitday.com/");
//            driver.findElement(By.id("login")).click();
            loginPage.open();
            loginPage.login(username, password);
            //driver.get("https://www.fitday.com/app/reports/home#06FEB2022");
            // driver.get("https://www.fitday.com/fitness/Login.html");
            // driver.navigate().refresh();
//        loginPage.login(username, password);
//        driver.navigate().refresh();
            navbarPage.selectMenuOption("ARTICLES");
            navbarPage.selectSecondMenuOption("NUTRITION");

            assertTrue(articlesNavbarPage.checkoutTitle(), "Nutrition page is not open");
            AllureUtils.takeScreenshot(driver);
            driver.manage().deleteAllCookies();
        }
    }

//    @Test(description = "Open articles across Navbar with click on articles")
//    public void clickArticlesNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.clickOnNavbar("ARTICLES");
//        navbarPage.isPageOpen();
//
//        assertTrue(articlesNavbarPage.isPageOpen(), "Article page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }

//    @Test(description = "Open fitness page across navbar")
//    public void clickArticlesFitnessNavbar() throws InterruptedException {
//        loginPage.open()
//                .login(username, password);
//
//        //navbarPage.selectMenuOption("ARTICLES", "FITNESS");
//        navbarPage.selectMenuOption("ARTICLES");
//        navbarPage.selectSecondMenuOption("FITNESS");
//       // navbarPage.isPageOpen();
//
//        assertTrue(articlesNavbarPage.checkoutTitle(), "Fitness page is not open");
//        AllureUtils.takeScreenshot(driver);
//        AllureUtils.takeScreenshot(driver);
//        driver.manage().deleteAllCookies();
//    }

//    @Test(description = "Open home page across navbar")
//    public void clickArticlesHomeNavbar() throws InterruptedException {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("ARTICLES", "HOME");
//        navbarPage.isPageOpen();
//
//        assertTrue(dietitianNavbarPage.isPageOpen(), "Home page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
}


