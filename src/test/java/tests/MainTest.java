//package tests;
//
//import static org.testng.Assert.assertEquals;
//
//import org.testng.annotations.Test;
//
//public class MainTest extends BaseTest {
//    @Test(description = "Check title after click at Nutrition")
//    public void checkLearnMoreClickNutrition() {
//        searchPage.open();
//        mainPage.isPageOpen();
//
//        mainPage.listClickOnLearnMore();
//        mainPage.listClickOnNutrition();
//
//        assertEquals(mainPage.getTextTitleOfPage(), "Nutrition", "Title is not found");
//    }
//
//    @Test(description = "Check title after click at Fitness")
//    public void checkLearnMoreClickFitness() {
//        searchPage.open();
//        mainPage.isPageOpen();
//
//        mainPage.listClickOnLearnMore();
//        mainPage.listClickOnFitness();
//
//        assertEquals(mainPage.getTextTitleOfPage(), "Fitness", "Title is not found");
//    }
//
//    @Test(description = "Check title after click at Forums")
//    public void checkLearnMoreClickForums() {
//        searchPage.open();
//        mainPage.isPageOpen();
//
//        mainPage.listClickOnLearnMore();
//        mainPage.listClickOnForums();
//
//        assertEquals(mainPage.getTextTitleOfForums(), "Forums", "Title is not found");
//    }
//
//    @Test(description = "Check title after click at Nutrition in All Categories")
//    public void clickOnButtonNutrition() {
//        searchPage.open();
//        mainPage.listClickOnNutritionButton();
//
//        assertEquals(mainPage.getTextTitleOfPage(), "Nutrition", "Title is not found");
//    }
//
//    @Test(description = "Check title after click at Fitness in All Categories")
//    public void clickOnButtonFitness() {
//        searchPage.open();
//        mainPage.listClickOnFitnessButton();
//
//        assertEquals(mainPage.getTextTitleOfPage(), "Fitness", "Title is not found");
//    }
//
//
//}
