package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class HomeNavbarPage extends BasePage {
    public static final By CALENDAR_TABLE = By.xpath("//div[@id='j-calendar']");
    public static final By PROFILE_TITLE = By.xpath("//div[@id='profile-top']//div[@class='title']");
    public static final By ADD_BUTTON = By.xpath("//tr//td[1]//a//span[text()='Add »']");
    public static final By INPUT_TEXT = By.xpath("//input[@value='What did you eat today?']");
    public static final By PLUS_BUTTON = By.xpath("//td[@class='actions']//a");
    public static final By FOOD_ITEM =By.xpath("//tr[@class='food_log fd_food_log_u-998897-620009B5-c']//td[@class='name']//a[text()='Apple, raw']");


    @Step("Check  food at table")
    public String checkFoodTable() {
        log.info("get food at table");
        return driver.findElement(FOOD_ITEM).getText();
    }
    @Step("click on plus button")
    public void clickPlusButton() {
        driver.findElement(PLUS_BUTTON).click();
        log.info("click on plus button");
    }
    @Step("Input text")
    public void inputText() {
        driver.findElement(INPUT_TEXT).sendKeys("apple");
       // Thread.sleep(5000);
        log.info("text in input");
    }

    @Step("click on nutrition button")
    public void clickAddButton() {
        driver.findElement(ADD_BUTTON).click();
        log.info("click on add button");
    }

    @Step("Check calendar after click on calendar in home navbar")
    public boolean checkoutCalendarTable() {
        return driver.findElement(CALENDAR_TABLE).isDisplayed();
    }

    @Step("Check title after click on home in profile navbar")
    public String checkoutTitleHomeProfile() {
        log.info("get title for profile page");
        return driver.findElement(PROFILE_TITLE).getText();
    }

    @Step("Check title after click on home in settings navbar")
    public String checkoutTitles() {
        log.info("get title for settings page");
        return driver.findElement(PAGES_ITEM_TITLE).getText();
    }

    public HomeNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
