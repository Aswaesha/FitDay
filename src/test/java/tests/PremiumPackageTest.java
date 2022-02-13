package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PremiumPackageTest extends BaseTest {
    @Test(description = "Check title after click on FitDay premium")
    public void checkTitleClickPremium() {
        loginPage.open();
        premiumPackagePage.clickFitDayPremium();

        assertEquals(premiumPackagePage.checkoutTitleAtProductPage(), "Premium $4.16 / month", "Title is not found");
    }

    @Test(description = "Check Check title after click on FitDay pc")
    public void checkTitleClickPc() {
        loginPage.open();
        premiumPackagePage.clickFitDayPC();

        assertEquals(premiumPackagePage.checkoutTitleAtProductPage(), "PC $29.95 (was $39.95)", "Title is not found");
    }

    @Test(description = "Check popup ")
    public void checkPopUp() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/reports/custom");

        premiumPackagePage.clickPrimaryDropdown();
        premiumPackagePage.clickPrimaryDropdownValue("food");

        premiumPackagePage.clickSecondaryDropdown();
        premiumPackagePage.clickSecondaryDropdownValue("Calories");

        logNavbarPage.clickPlusButton();

        assertTrue(logNavbarPage.checkoutPopup(), "Popup is not displayed");
        AllureUtils.takeScreenshot(driver);
    }
}
