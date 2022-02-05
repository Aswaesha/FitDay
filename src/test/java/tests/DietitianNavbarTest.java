package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DietitianNavbarTest extends BaseTest {
    @Test(description = "Open articles across Navbar with click on dietitian")
    public void clickDietitianNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.clickOnNavbar("DIETITIAN");

        assertTrue(dietitianNavbarPage.isPageOpen(), "Article page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open details page across navbar")
    public void clickDietitianDetailsNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("DIETITIAN", "DETAILS");
        assertEquals(dietitianNavbarPage.checkoutTitleDetailsPag(), "We are not accepting purchases at this time.", "Details page is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
