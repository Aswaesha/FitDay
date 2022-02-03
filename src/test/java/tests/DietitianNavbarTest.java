package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DietitianNavbarTest extends BaseTest{
    @Test(description = "Open articles across Navbar with click on dietitian")
    public void clickDietitianNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        dietitianNavbarPage.clickOnDietitianNavbar();

        assertTrue(dietitianNavbarPage.isPageOpen(), "Article page is not open");
    }
}
