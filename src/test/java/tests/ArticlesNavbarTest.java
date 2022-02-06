package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertTrue;

public class ArticlesNavbarTest extends BaseTest {
    @Test(description = "Open nutrition page across navbar")
    public void clickArticlesNutritionNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

      //   homePage.isPageOpen();
       // navbarPage.isErrorOpen();
//        if (driver.findElement(By.xpath("//div[@class='step']")).isDisplayed()){
//            driver.findElement(By.xpath("//div[@class='close']")).click();
//        }
        AllureUtils.takeScreenshot(driver);
        navbarPage.selectMenuOption("ARTICLES", "NUTRITION");


        assertTrue(articlesNavbarPage.checkoutTitle(), "Nutrition page is not open");

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

    @Test(description = "Open fitness page across navbar")
    public void clickArticlesFitnessNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);
        loginPage.login(username, password);

        //driver.findElement(By.xpath("//div[@class='close']")).click();
        driver.findElement(By.xpath("//div[@id='notice']//div")).click();
        AllureUtils.takeScreenshot(driver);
        navbarPage.selectMenuOption("ARTICLES", "FITNESS");

        navbarPage.isPageOpen();

        assertTrue(articlesNavbarPage.checkoutTitle(), "Fitness page is not open");

    }

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
