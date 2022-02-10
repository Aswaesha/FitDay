package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class HomeNavbarPage extends BasePage {
    public static final By INPUT_MONTH = By.xpath("//select[@class='month']");
    public static final By CALENDAR_TABLE = By.xpath("//div[@id='j-calendar']");
    public static final By VALUE_MONTH = By.xpath("//select[@class='month']//option[5]");
    public static final By ACTIVITY_ITEM = By.xpath("//td[text()='fast ballroom dancing']");
    public static final By ADD_FOOD_BUTTON = By.xpath("//tr//td[1]//a//span[text()='Add »']");
    public static final By DEFAULT_CHART_CLICK = By.xpath("//select[@name='dashboard_chart']");
    public static final By PROFILE_TITLE = By.xpath("//div[@id='profile-top']//div[@class='title']");
    public static final By ADD_TO_ACTIVITY_LOG_BUTTON = By.xpath("//div[@class='right']//a//span[2]");
    public static final By INPUT_TEXT = By.xpath("//form[@class='fd-search-bar']//input[@type='text']");
    public static final By FOOD_ITEM = By.xpath("//table[@class='ib-list']//tbody//td[@class='name']//a");
    public static final By ADD_ACTIVITY_BUTTON = By.xpath("//tr//td[2]//a[@class='add button']//span[2]");
    public static final By CHECK_BMI = By.xpath("//td[text()='Default Chart']//ancestor::tr//td[text()='BMI']");
    public static final By CHECK_MONTH = By.xpath("//td[text()='Birthday']//ancestor::tr//td[text()='May 1 1997']");
    public static final By DEFAULT_CHART_VALUE = By.xpath("//select[@name='dashboard_chart']//option[@value='weight_bmi']");

    @Step("Open home item page")
    public HomeNavbarPage open(String url) {
        driver.get(BASE_URL + url);
        log.info("open home item page");
        return this;
    }

    @Step("Check  food at table")
    public String checkFoodTable() {
        log.info("get food at table");
        return driver.findElement(FOOD_ITEM).getText();
    }

    @Step("Check  month at table")
    public String checkMonthTable() {
        log.info("get may at table");
        return driver.findElement(CHECK_MONTH).getText();
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

    @Step("Check  default chart")
    public String checkDefaultChart() {
        log.info("get default chart value at table");
        return driver.findElement(CHECK_BMI).getText();
    }

    @Step("Check activity at table")
    public String checkActivityTable() {
        log.info("get activity at table");
        return driver.findElement(ACTIVITY_ITEM).getText();
    }

    @Step("click on plus button")
    public void clickPlusButton() {
        driver.findElement(PLUS_BUTTON).click();
        log.info("click on plus button");
    }

    @Step("click on edit button")
    public void clickEditButton() {
        driver.findElement(EDIT_BUTTON).click();
        log.info("click on edit button");
    }

    @Step("click on save button")
    public void clickSaveButton() throws InterruptedException {
        driver.findElement(SAVE_BUTTON).click();
        Thread.sleep(3000);
        log.info("click on save button");
    }

    @Step("click on input month")
    public void clickMonth() {
        driver.findElement(INPUT_MONTH).click();
        log.info("click on input month");
    }

    @Step("Click on input default chart")
    public void clickDefaultChartValue() {
        driver.findElement(DEFAULT_CHART_VALUE).click();
        log.info("click on input default chart");
    }

    @Step("Click on value month")
    public void clickValueMonth() {
        driver.findElement(VALUE_MONTH).click();
        log.info("click on value month");
    }

    @Step("Click on food add button")
    public void clickAddFoodButton() {
        driver.findElement(ADD_FOOD_BUTTON).click();
        log.info("click on food add button");
    }

    @Step("Click on activity add button")
    public void clickAddActivityButton() {
        driver.findElement(ADD_ACTIVITY_BUTTON).click();
        log.info("click on activity add button");
    }

    @Step("Click on to activity log add button")
    public void clickAddToActivityLogButton() {
        driver.findElement(ADD_TO_ACTIVITY_LOG_BUTTON).click();
        log.info("click on to activity log add button");
    }

    @Step("Click on default chart")
    public void clickDefaultChart() {
        driver.findElement(DEFAULT_CHART_CLICK).click();
        log.info("click on default chart");
    }

    @Step("Input text")
    public void inputFoodText() throws InterruptedException {
        driver.findElement(INPUT_TEXT).sendKeys("apple");
        Thread.sleep(5000);
        log.info("text in input");
    }

    @Step("Input text")
    public void inputActivityText() throws InterruptedException {
        driver.findElement(INPUT_TEXT).sendKeys("Dancing");
        Thread.sleep(5000);
        log.info("text in input");
    }

    @Step("Check calendar after click on calendar in home navbar")
    public boolean checkoutCalendarTable() {
        return driver.findElement(CALENDAR_TABLE).isDisplayed();
    }

    public HomeNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
