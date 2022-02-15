package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavbarTest extends BaseTest {
    @Test(description = "Open articles across Navbar with click on dietitian")
    public void clickDietitianNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.clickOnNavbar("DIETITIAN");

        assertTrue(navbarPage.buttonFitness(), "Article page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open details page across navbar")
    public void clickDietitianDetailsNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("DIETITIAN");
        navbarPage.selectSecondMenuOption("DETAILS");

        assertEquals(navbarPage.checkoutTitleDetailsPag(), "We are not accepting purchases at this time.", "Details page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open nutrition page across navbar")
    public void clickArticlesNutritionNavbar() throws InterruptedException {
        loginPage.open();
        loginPage.login(username, password);

        navbarPage.selectMenuOption("ARTICLES");
        navbarPage.selectSecondMenuOption("NUTRITION");

        assertTrue(navbarPage.checkoutTitle(), "Nutrition page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open articles across Navbar with click on articles")
    public void clickArticlesNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.clickOnNavbar("ARTICLES");
        navbarPage.isPageOpen();

        assertTrue(navbarPage.buttonFitness(), "Article page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open fitness page across navbar")
    public void clickArticlesFitnessNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("ARTICLES");
        navbarPage.selectSecondMenuOption("FITNESS");
        navbarPage.isPageOpen();

        assertTrue(navbarPage.buttonFitness(), "Fitness page is not open");
        AllureUtils.takeScreenshot(driver);
        driver.manage().deleteAllCookies();
    }

    @Test(description = "Open home page across navbar")
    public void clickArticlesHomeNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("ARTICLES");
        navbarPage.selectSecondMenuOption("HOME");
        navbarPage.isPageOpen();

        assertTrue(navbarPage.buttonFitness(), "Home page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open forums across Navbar")
    public void clickForumNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.clickOnNavbar("FORUMS");

        assertEquals(navbarPage.checkoutTitleDiscussionBoards(), "FitDay Discussion Boards", "Forums page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open forum page across navbar forums home")
    public void clickForumsHomeNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("FORUMS");
        navbarPage.selectSecondMenuOption("HOME");

        assertEquals(navbarPage.checkoutTitleDiscussionBoards(), "FitDay Discussion Boards", "Forums page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open calendar page across navbar")
    public void clickHomeCalendarNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("CALENDAR");

        assertTrue(navbarPage.checkoutCalendarTable(), "Calendar page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open profile page across navbar")
    public void clickHomeProfileNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("PROFILE");

        assertEquals(logNavbarPage.checkoutTitleHomeProfile(), "Profile", "Profile page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open settings page across navbar")
    public void clickSettingsHomeNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("HOME");
        navbarPage.selectSecondMenuOption("SETTINGS");

        assertEquals(navbarPage.checkoutTitles(), "Settings", "Settings page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open calorie report across navbar")
    public void clickReportsCalorieNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("CALORIE");

        assertEquals(navbarPage.checkoutReportsTitles(), "Calories", "Calorie report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open nutrition report across navbar")
    public void clickReportsNutritionNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("NUTRITION");

        assertEquals(navbarPage.checkoutReportsTitles(), "Nutrition", "Nutrition report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open weight report across navbar")
    public void clickReportsWeightNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("WEIGHT");

        assertEquals(navbarPage.checkoutReportsTitles(), "Weight Report", "Weight report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open mood report across navbar")
    public void clickReportsMoodNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("MOOD");

        assertEquals(navbarPage.checkoutReportsTitles(), "Mood Report", "Mood report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open custom report across navbar" )
    public void clickReportsCustomNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("CUSTOM");

        assertEquals(navbarPage.checkoutReportsTitles(), "Custom Reports", "Custom report is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open food across Navbar with click on log")
    public void clickLogDietitianNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.clickOnNavbar("LOG");

        assertEquals(navbarPage.checkoutTitles(), "Food Log", "Food page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open activity page across navbar")
    public void clickLogActivityNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        AllureUtils.takeScreenshot(driver);
        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("ACTIVITY");

        assertEquals(navbarPage.checkoutTitles(), "Activity Log", "Activity page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open weight page across navbar")
    public void clickLogWeightNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("WEIGHT");

        assertEquals(navbarPage.checkoutTitles(), "Weight Log", "Weight page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open mood page across navbar")
    public void clickLogMoodNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("MOOD");

        assertEquals(navbarPage.checkoutTitles(), "Mood Log", "Mood page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open custom page across navbar")
    public void clickLogCustomNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("CUSTOM");

        assertEquals(navbarPage.checkoutTitles(), "Custom Log", "Custom page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open body page across navbar")
    public void clickLogBodyNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("LOG");
        navbarPage.selectSecondMenuOption("BODY");

        assertEquals(navbarPage.checkoutTitles(), "Body Log", "Body page is not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Open body report across navbar")
    public void clickReportsBodyNavbar() throws InterruptedException {
        loginPage.open()
                .login(username, password);

        navbarPage.selectMenuOption("REPORTS");
        navbarPage.selectSecondMenuOption("BODY");

        assertEquals(navbarPage.checkoutReportsTitles(), "Body Measurement Report", "Body report is not open");
        AllureUtils.takeScreenshot(driver);
    }
}
