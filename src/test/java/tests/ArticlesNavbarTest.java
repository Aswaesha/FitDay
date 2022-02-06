package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertTrue;

public class ArticlesNavbarTest extends BaseTest {
    @Test(description = "Open nutrition page across navbar")
    public void clickArticlesNutritionNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

         homePage.isPageOpen();

        navbarPage.selectMenuOption("ARTICLES", "NUTRITION");
        navbarPage.isPageOpen();

        assertTrue(articlesNavbarPage.checkoutTitle(), "Nutrition page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open articles across Navbar with click on articles")
    public void clickArticlesNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.clickOnNavbar("ARTICLES");
        navbarPage.isPageOpen();

        assertTrue(articlesNavbarPage.isPageOpen(), "Article page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open fitness page across navbar")
    public void clickArticlesFitnessNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

         homePage.isPageOpen();

        navbarPage.selectMenuOption("ARTICLES", "FITNESS");
        navbarPage.isPageOpen();

        assertTrue(articlesNavbarPage.checkoutTitle(), "Fitness page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open home page across navbar")
    public void clickArticlesHomeNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("ARTICLES", "HOME");
        navbarPage.isPageOpen();

        assertTrue(dietitianNavbarPage.isPageOpen(), "Home page is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
