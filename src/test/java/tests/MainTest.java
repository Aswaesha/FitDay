package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MainTest extends BaseTest {
    @Test(description = "Check title after click at Nutrition")
    public void checkLearnMoreClickNutrition() {
        mainPage.open();
        loginPage.checkLoginPage(username,password);
        mainPage.isPageOpen();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnLearnMore();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnNutrition();
        loginPage.checkLoginPage(username,password);
        assertEquals(mainPage.getTextTitleOfPage(), "Nutrition", "Title is not found");
    }

    @Test(description = "Check title after click at Fitness")
    public void checkLearnMoreClickFitness() {
        mainPage.open();
        mainPage.isPageOpen();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnLearnMore();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnFitness();
        loginPage.checkLoginPage(username,password);
        assertEquals(mainPage.getTextTitleOfPage(), "Fitness", "Title is not found");
    }

    @Test(description = "Check title after click at Forums")
    public void checkLearnMoreClickForums() {
        mainPage.open();
        mainPage.isPageOpen();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnLearnMore();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnForums();
        loginPage.checkLoginPage(username,password);

        assertEquals(mainPage.getTextTitleOfForums(), "FitDay Discussion Boards", "Title is not found");
    }

    @Test(description = "Check title after click at Nutrition in All Categories")
    public void clickOnButtonNutrition() {
        mainPage.open();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnNutritionButton();
        loginPage.checkLoginPage(username,password);

        assertEquals(mainPage.getTextTitleOfPage(), "Nutrition", "Title is not found");
    }

    @Test(description = "Check title after click at Fitness in All Categories")
    public void clickOnButtonFitness() {
        mainPage.open();
        loginPage.checkLoginPage(username,password);
        mainPage.listClickOnFitnessButton();
        loginPage.checkLoginPage(username,password);

        assertEquals(mainPage.getTextTitleOfPage(), "Fitness", "Title is not found");
    }

    @Test(description = "Search in a search box")
    public void searchTest() {
        mainPage.open()
                .searchInput("apple");
        loginPage.checkLoginPage(username,password);

        assertTrue(mainPage.checkoutLink(), "Search page is not open");
    }

}
