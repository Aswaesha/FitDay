package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

@Log4j2
public class NavbarPage extends BasePage {
    public static final String MAIN_ITEM_NAVBAR = "//a[span[text()='%s']]";
    public static final By CALENDAR_TABLE = By.xpath("//div[@id='j-calendar']");
    public static final By TITLE_DETAILS = By.xpath("//div[@class='Holder']//h1");
    public static final String SIDE_ITEM_BUTTON_NAVBAR = "//ul[not(contains(@style, 'none'))]/li//a[text()='%s']";

    @Step("Click on items navbar")
    public void selectMenuOption(String firstMenuOption) {
        log.info("hover start");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(String.format(MAIN_ITEM_NAVBAR, firstMenuOption)));
        action.moveToElement(we).build().perform();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("finish click");
    }

    private int count;
    private int count2;

        @Step("Click on items navbar")
    public void selectSecondMenuOption(String secondMenuOption){
        driver.findElement(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))).click();
                if (!isExist(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))) && count < 10){
            count++;
            log.info("###### attempt number: " + count);
        }
        log.info("click on item articles navbar");
    }

    @Step("Check title after click on home in settings navbar")
    public String checkoutTitles() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(PAGES_ITEM_TITLE) && count < 5){
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(PAGES_ITEM_TITLE).getText();
    }

    @Step("Check calendar after click on calendar in home navbar")
    public boolean checkoutCalendarTable() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(CALENDAR_TABLE) && count < 5){
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(CALENDAR_TABLE).isDisplayed();
    }

    @Step("Click on item navbar")
    public void clickOnNavbar(String menuOption) {
        driver.findElement(By.xpath(String.format(MAIN_ITEM_NAVBAR, menuOption))).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        log.info("click on articles navbar");
    }

    @Step("Check title after click on details in dietitian navbar")
    public String checkoutTitleDetailsPag() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (!isExist(TITLE_DETAILS) && count < 5){
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        log.info("get title for details pade");
        return driver.findElement(TITLE_DETAILS).getText();
    }

    @Step("Check title after click on fitness in article navbar")
    public boolean checkoutTitle() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (!isExist(TITLE_CATEGORIES) && count < 5){
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver.findElement(TITLE_CATEGORIES).isDisplayed();
    }

    @Step("Check title after click on home in forums navbar")
    public String checkoutTitleDiscussionBoards() {
        log.info("get title for details pade");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(TITLE_DISCUSSION_BOARDS) && count < 5){
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(TITLE_DISCUSSION_BOARDS).getText();
    }

    @Step("Check fitness button")
    public boolean buttonFitness() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(FITNESS_BUTTON) && count < 5){
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(FITNESS_BUTTON).isDisplayed();
    }

    @Step("Check title after click on reports navbar")
    public String checkoutReportsTitles() {
        log.info("get title for reports");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(REPORTS_ITEM_TITLE) && count < 5){
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
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
