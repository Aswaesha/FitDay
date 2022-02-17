package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MainTest extends BaseTest {
    @Test(description = "Check title after click at Nutrition")
    public void checkLearnMoreClickNutrition() {
        mainPage.open();
        mainPage.isPageOpen();

        mainPage.listClickOnLearnMore();
        mainPage.listClickOnNutrition();

        assertEquals(mainPage.getTextTitleOfPage(), "Nutrition", "Title is not found");
    }

    @Test(description = "Check title after click at Fitness")
    public void checkLearnMoreClickFitness() {
        mainPage.open();
        mainPage.isPageOpen();

        mainPage.listClickOnLearnMore();
        mainPage.listClickOnFitness();

        assertEquals(mainPage.getTextTitleOfPage(), "Fitness", "Title is not found");
    }

    @Test(description = "Check title after click at Forums")
    public void checkLearnMoreClickForums() {
        mainPage.open();
        mainPage.isPageOpen();

        mainPage.listClickOnLearnMore();
        mainPage.listClickOnForums();

        assertEquals(mainPage.getTextTitleOfForums(), "FitDay Discussion Boards", "Title is not found");
    }

    @Test(description = "Check title after click at Nutrition in All Categories")
    public void clickOnButtonNutrition() {
        mainPage.open();
        mainPage.listClickOnNutritionButton();

        assertEquals(mainPage.getTextTitleOfPage(), "Nutrition", "Title is not found");
    }

    @Test(description = "Check title after click at Fitness in All Categories")
    public void clickOnButtonFitness() {
        mainPage.open();
        mainPage.listClickOnFitnessButton();

        assertEquals(mainPage.getTextTitleOfPage(), "Fitness", "Title is not found");
    }

    @Test(description = "Search in a search box")
    public void searchTest() {
        mainPage.open()
                .searchInput("apple");

        assertTrue(mainPage.checkoutLink(), "Search page is not open");
    }

}
