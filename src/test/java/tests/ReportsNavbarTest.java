package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;

public class ReportsNavbarTest extends BaseTest {
    @Test(description = "Open calorie report across navbar")
    public void clickReportsCalorieNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS", "CALORIE");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Calories", "Calorie report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open nutrition report across navbar")
    public void clickReportsNutritionNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS", "NUTRITION");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Nutrition", "Nutrition report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open weight report across navbar")
    public void clickReportsWeightNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS", "WEIGHT");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Weight Report", "Weight report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open body report across navbar")
    public void clickReportsBodyNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS", "BODY");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Body Measurement Report", "Body report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open mood report across navbar")
    public void clickReportsMoodNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS", "MOOD");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Mood Report", "Mood report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open custom report across navbar")
    public void clickReportsCustomNavbar() {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS", "CUSTOM");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Custom Reports", "Custom report is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
