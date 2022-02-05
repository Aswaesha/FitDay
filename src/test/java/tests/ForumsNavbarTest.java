package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertTrue;

public class ForumsNavbarTest extends BaseTest {
    @Test(description = "Open forums across Navbar")
    public void clickForumNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        forumsNavbarPage.clickOnForumNavbar();

        assertTrue(forumsNavbarPage.isPageOpen(), "Forums page is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
