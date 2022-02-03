package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ArticlesNavbarTest extends BaseTest {
    @Test(description = "Open articles across Navbar with click on articles")
    public void clickDietitianNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        articlesNavbarPage.clickOnArticlesNavbar();

        assertTrue(articlesNavbarPage.isPageOpen(), "Article page is not open");
    }
}
