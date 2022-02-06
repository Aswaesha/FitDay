package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertTrue;

public class ArticlesNavbarTest extends BaseTest {
    @Test(description = "Open nutrition page across navbar")
    public void clickArticlesNutritionNavbar() {
        loginPage.open()
                .login(username, password);

         homePage.isPageOpen();

        navbarPage.selectMenuOption("ARTICLES", "NUTRITION");

        assertTrue(articlesNavbarPage.checkoutTitle(), "Nutrition page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open articles across Navbar with click on articles")
    public void clickArticlesNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.clickOnNavbar("ARTICLES");

        assertTrue(articlesNavbarPage.isPageOpen(), "Article page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open fitness page across navbar")
    public void clickArticlesFitnessNavbar() {
        loginPage.open()
                .login(username, password);

         homePage.isPageOpen();

        navbarPage.selectMenuOption("ARTICLES", "FITNESS");

        assertTrue(articlesNavbarPage.checkoutTitle(), "Fitness page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open home page across navbar")
    public void clickArticlesHomeNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("ARTICLES", "HOME");

        assertTrue(dietitianNavbarPage.isPageOpen(), "Home page is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
