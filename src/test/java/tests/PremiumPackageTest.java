package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PremiumPackageTest extends BaseTest {
    @Test(description = "Check title after click on FitDay premium")
    public void checkTitleClickPremium() {
        loginPage.open();
        loginPage.checkLoginPage(username,password);
        premiumPackagePage.clickFitDayPremium();
        loginPage.checkLoginPage(username,password);

        assertEquals(premiumPackagePage.checkoutTitleAtProductPage(), "Premium $4.16 / month", "Title is not found");
    }

    @Test(description = "Check Check title after click on FitDay pc")
    public void checkTitleClickPc() {
        loginPage.open();
        loginPage.checkLoginPage(username,password);
        premiumPackagePage.clickFitDayPC();
        loginPage.checkLoginPage(username,password);

        assertEquals(premiumPackagePage.checkoutTitleAtProductPage(), "PC $29.95 (was $39.95)", "Title is not found");
    }

    @Test(description = "Check popup ")
    public void checkPopUp(){
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/reports/custom");
        loginPage.checkLoginPage(username,password);
        premiumPackagePage.clickPrimaryDropdown();
        loginPage.checkLoginPage(username,password);
        premiumPackagePage.clickPrimaryDropdownValue("food");
        loginPage.checkLoginPage(username,password);

        premiumPackagePage.clickSecondaryDropdown();
        loginPage.checkLoginPage(username,password);
        premiumPackagePage.clickSecondaryDropdownValue("Calories");
        loginPage.checkLoginPage(username,password);

        logNavbarPage.clickPlusButton();
        loginPage.checkLoginPage(username,password);
        assertTrue(logNavbarPage.checkoutPopup(), "Popup is not displayed");
        AllureUtils.takeScreenshot(driver);
    }
}
