package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;

public class ReportsNavbarTest extends BaseTest {
    @Test(description = "Open calorie report across navbar")
    public void clickReportsCalorieNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("CALORIE");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Calories", "Calorie report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open nutrition report across navbar")
    public void clickReportsNutritionNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("NUTRITION");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Nutrition", "Nutrition report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open weight report across navbar")
    public void clickReportsWeightNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("WEIGHT");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Weight Report", "Weight report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open body report across navbar")
    public void clickReportsBodyNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("BODY");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Body Measurement Report", "Body report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open mood report across navbar")
    public void clickReportsMoodNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("MOOD");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Mood Report", "Mood report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open custom report across navbar")
    public void clickReportsCustomNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        homePage.isPageOpen();

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("CUSTOM");

        assertEquals(reportsNavbarPage.checkoutReportsTitles(), "Custom Reports", "Custom report is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
