package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


@Log4j2
public class LogNavbarPage extends BasePage {
    public static final By DROPDOWN = By.xpath("//select[@class='pkey']");
    public static final By MOOD = By.xpath("//div[@class='text-wrapper']");
    public static final By MOOD_INPUT = By.xpath("//textarea[@name='text']");
    public static final By WEIGHT_INPUT = By.xpath("//input[@name='weight']");
    public static final By EDIT_BUTTON_GREY = By.xpath("//a[@class='edit button grey']");
    public static final By TIME_ACTIVITY_INPUT = By.xpath("//input[@class='hours valid']");
    public static final By ADD_FOOD_BUTTON = By.xpath("//tr//td[1]//a//span[text()='Add »']");
    public static final String PARAMS_DROPDOWN = "//select[@class='pkey']//option[@value='%s']";
    public static final By WEIGHT_VALUE = By.xpath("//td[text()='Weight']//ancestor::tr//td[3]");
    public static final By POPUP = By.xpath("//div[@class='content fd_premium_lightbox green']");
    public static final By PROFILE_TITLE = By.xpath("//div[@id='profile-top']//div[@class='title']");
    public static final By ADD_TO_ACTIVITY_LOG_BUTTON = By.xpath("//div[@class='right']//a//span[2]");
    public static final By FOOD_ITEM = By.xpath("//table[@class='ib-list']//tbody//tr[last()]//td/a");
    public static final By INPUT_TEXT = By.xpath("//form[@class='fd-search-bar']//input[@type='text']");
    public static final By ADD_ACTIVITY_BUTTON = By.xpath("//tr//td[2]//a[@class='add button']//span[2]");
    public static final By ACTIVITY_ITEM = By.xpath("//table[@class='ib-list']//tbody//tr[last()-1]//td[@class='name']");

    @Step("Check popup")
    public boolean checkoutPopup() {
        return driver.findElement(POPUP).isDisplayed();
    }

    @Step("Check  food at table")
    public String checkFoodTable() throws InterruptedException {
        log.info("get food at table");
        Thread.sleep(5000);
        return driver.findElement(FOOD_ITEM).getText();
    }

    @Step("Check title after click on home in profile navbar")
    public String checkoutTitleHomeProfile() {
        log.info("get title for profile page");
        return driver.findElement(PROFILE_TITLE).getText();
    }

    @Step("Check mood diary")
    public String checkoutTextMood() {
        log.info("get mood");
        return driver.findElement(MOOD).getText();
    }

    @Step("Check activity at table")
    public String checkActivityTable() {
        log.info("get activity at table");
        return driver.findElement(ACTIVITY_ITEM).getText();
    }

    @Step("Click on dropdown params")
    public void clickDropdownValue(String dropdownOption) {
        driver.findElement(By.xpath(String.format(PARAMS_DROPDOWN, dropdownOption))).click();
        log.info("click on dropdown params");
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

    @Step("click on edit button")
    public void clickEditGreyButton() {
        driver.findElement(EDIT_BUTTON_GREY).click();
        log.info("click on edit button");
    }

    @Step("click on save button")
    public void clickSaveButton() throws InterruptedException {
        driver.findElement(SAVE_BUTTON).click();
        Thread.sleep(3000);
        log.info("click on save button");
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
    public void clickAddToActivityLogButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(ADD_TO_ACTIVITY_LOG_BUTTON).click();
        log.info("click on to activity log add button");
    }

    @Step("Check changed weight")
    public String checkoutWeight() {
        log.info("get weight");
        return driver.findElement(WEIGHT_VALUE).getText();
    }

    @Step("click on input")
    public void clickInput() {
        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(WEIGHT_INPUT)).perform();
        log.info("click on input");
    }

    @Step("Input text")
    public void inputFoodText() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(INPUT_TEXT).sendKeys("apple");
        Thread.sleep(5000);
        log.info("text in input");
    }

    @Step("Input text")
    public void inputActivityText() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(INPUT_TEXT).sendKeys("Dancing");
        Thread.sleep(5000);
        log.info("text in input");
    }

    @Step("Input mood text")
    public void inputMoodText() throws InterruptedException {
        driver.findElement(MOOD_INPUT).clear();
        driver.findElement(MOOD_INPUT).sendKeys("I am happy");
        Thread.sleep(3000);
        log.info("text in input");
    }

//    @Step("Input time")
//    public void inputTime() {
//        driver.findElement(TIME_ACTIVITY_INPUT).click();
//        driver.findElement(TIME_ACTIVITY_INPUT).clear();
//        driver.findElement(TIME_ACTIVITY_INPUT).sendKeys("1");
//        log.info("text time");
//    }

    @Step("Input text")
    public void inputWeightText() {
        driver.findElement(WEIGHT_INPUT).sendKeys("109");
        log.info("text in input");
    }

    @Step("click on dropdown")
    public void clickDropdown() {
        driver.findElement(DROPDOWN).click();
        log.info("click on dropdown");
    }

    @Step("Open log item page")
    public void open(String url) {
        driver.get(BASE_URL + url);
        log.info("open log item page");
    }

    public LogNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
