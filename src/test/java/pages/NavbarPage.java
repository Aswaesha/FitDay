package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Log4j2
public class NavbarPage extends BasePage {
    public static final String MAIN_ITEM_NAVBAR = "//a[span[text()='%s']]";
    public static final By CALENDAR_TABLE = By.xpath("//div[@id='j-calendar']");
    public static final By TITLE_DETAILS = By.xpath("//div[@class='Holder']//h1");
    public static final String SIDE_ITEM_BUTTON_NAVBAR = "//ul[not(contains(@style, 'none'))]/li//a[text()='%s']";

    @Step("Click on items navbar")
    public void selectMenuOption(String firstMenuOption, String secondMenuOption) {
        log.info("click start");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(String.format(MAIN_ITEM_NAVBAR, firstMenuOption)));
        action.moveToElement(we).build().perform();
        if (!isExist(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, firstMenuOption))) && count < 10) {
            count++;
            log.info("###### attempt1 number: " + count);
            driver.navigate().refresh();
        }

        driver.findElement(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))).click();
        if (!isExist(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))) && count < 10) {
            count++;
            log.info("###### attempt2 number: " + count);
            driver.navigate().refresh();


        }
    }

    private int count;

    //    @Step("Click on items navbar")
//    public void selectSecondMenuOption(String secondMenuOption){
//        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SIDE_ITEM_BUTTON_NAVBAR);
//       //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption);
//        driver.findElement(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))).click();
//                if (!isExist(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))) && count < 10){
//            count++;
//            log.info("###### attempt number: " + count);
//                    driver.navigate().refresh();
//
//        }
//        log.info("click on item articles navbar");
//
//    }
    @Step("Check title after click on home in settings navbar")
    public String checkoutTitles() {
        log.info("get title for settings page");

        return driver.findElement(PAGES_ITEM_TITLE).getText();
    }

    @Step("Check calendar after click on calendar in home navbar")
    public boolean checkoutCalendarTable() {
        return driver.findElement(CALENDAR_TABLE).isDisplayed();
    }

    @Step("Click on item navbar")
    public void clickOnNavbar(String menuOption) {
        driver.findElement(By.xpath(String.format(MAIN_ITEM_NAVBAR, menuOption))).click();
        log.info("click on articles navbar");
    }

    @Step("Check title after click on details in dietitian navbar")
    public String checkoutTitleDetailsPag() {
        log.info("get title for details pade");
        return driver.findElement(TITLE_DETAILS).getText();
    }

    @Step("Check title after click on fitness in article navbar")
    public boolean checkoutTitle() {
        return driver.findElement(TITLE_CATEGORIES).isDisplayed();
    }

    @Step("Check title after click on home in forums navbar")
    public String checkoutTitleDiscussionBoards() {
        log.info("get title for details pade");
        return driver.findElement(TITLE_DISCUSSION_BOARDS).getText();
    }

    @Step("Check fitness button")
    public boolean buttonFitness() {
        return driver.findElement(FITNESS_BUTTON).isDisplayed();
    }

    @Step("Check title after click on reports navbar")
    public String checkoutReportsTitles() {
        log.info("get title for reports");
        return driver.findElement(REPORTS_ITEM_TITLE).getText();
    }

    public NavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(TITLE_CATEGORIES);
    }

}
