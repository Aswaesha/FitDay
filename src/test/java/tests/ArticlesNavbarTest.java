package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ArticlesNavbarTest extends BaseTest {
    @Test(description = "Open articles across Navbar with click on articles")
    public void clickArticlesNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        articlesNavbarPage.clickOnArticlesNavbar();

        assertTrue(articlesNavbarPage.isPageOpen(), "Article page is not open");
    }

    @Test(description = "Open fitness page across navbar")
    public void clickArticlesFitnessNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        articlesNavbarPage.clickOnArticlesFitnessNavbar();

        assertTrue(articlesNavbarPage.checkoutTitle(), "Fitness page is not open");
    }

    @Test(description = "Open nutrition page across navbar")
    public void clickArticlesNutritionNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        articlesNavbarPage.clickOnArticlesNutritionNavbar();

        assertTrue(articlesNavbarPage.checkoutTitle(), "Nutrition page is not open");
    }

    @Test(description = "Open nutrition page across navbar")
    public void clickArticlesHomeNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        articlesNavbarPage.clickOnArticlesHomeNavbar();

        assertTrue(dietitianNavbarPage.isPageOpen(), "Home page is not open");
    }
}
