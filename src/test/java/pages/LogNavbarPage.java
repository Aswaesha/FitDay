package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

@Log4j2
public class LogNavbarPage extends BasePage {
    public static final By DROPDOWN = By.xpath("//select[@class='pkey']");
    public static final By MOOD = By.xpath("//div[@class='text-wrapper']");
    public static final By MOOD_INPUT = By.xpath("//textarea[@name='text']");
    public static final By WEIGHT_INPUT = By.xpath("//input[@name='weight']");
    public static final By EDIT_BUTTON_GREY = By.xpath("//a[@class='edit button grey']");
    public static final By WEIGHT_VALUE = By.xpath("//td[text()='Weight']//ancestor::tr//td[3]");
    public static final By POPUP = By.xpath("//div[@class='content fd_premium_lightbox green']");
    public static final String PARAMS_DROPDOWN = "//select[@class='pkey']//option[@value='custom']";
    public static final By PROFILE_TITLE = By.xpath("//div[@id='profile-top']//div[@class='title']");
    public static final By ADD_TO_ACTIVITY_LOG_BUTTON = By.xpath("//div[@class='right']//a//span[2]");
    public static final By FOOD_ITEM = By.xpath("//table[@class='ib-list']//tbody//tr[last()]//td/a");
    public static final By ADD_ACTIVITY_BUTTON = By.xpath("//tr//td[2]//a[@class='add button']//span[2]");
    public static final By TITLE_WEIGHT_INPUT = By.xpath("//div[@class='ib-box plain'][1]//div[@class='title']");
    public static final By ACTIVITY_ITEM = By.xpath("//table[@class='ib-list']//tbody//tr[last()-1]//td[@class='name']");

    @Step("Check popup")
    public boolean checkoutPopup() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(POPUP) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(DROPDOWN).click();
            driver.findElement(By.xpath(PARAMS_DROPDOWN)).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(PLUS_BUTTON).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(POPUP).isDisplayed();
    }

    @Step("Check  food at table")
    public String checkFoodTable() {
        log.info("get food at table");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver.findElement(FOOD_ITEM).getText();
    }

    private int count;

    @Step("Check title after click on home in profile navbar")
    public String checkoutTitleHomeProfile() {
        log.info("get title for profile page");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(PROFILE_TITLE) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(PROFILE_TITLE).getText();
    }

    @Step("Check mood diary")
    public String checkoutTextMood() {
        log.info("get mood");
        if (!isExist(MOOD) && count < 15) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        }
        return driver.findElement(MOOD).getText();
    }

    @Step("Check activity at table")
    public String checkActivityTable() {
        log.info("get activity at table");
        return driver.findElement(ACTIVITY_ITEM).getText();
    }

    @Step("Click on dropdown params")
    public void clickDropdownValue() {
        driver.findElement(By.xpath(PARAMS_DROPDOWN)).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("click on dropdown params");
    }

    @Step("click on plus button")
    public void clickPlusListButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PLUS_BUTTON_LIST).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("click on plus button");
    }

    @Step("click on plus button")
    public void clickPlusActivityButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PLUS_BUTTON_ACTIVITY).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("click on plus button");
    }

    @Step("click on plus button")
    public void clickPlusButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(PLUS_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("click on plus button");
    }

    @Step("click on edit button")
    public void clickEditButton() {
        if (!isExist(EDIT_BUTTON) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        driver.findElement(EDIT_BUTTON).click();
        log.info("click on edit button");
    }

    @Step("click on edit button")
    public void clickEditGreyButton() {
        if (!isExist(EDIT_BUTTON_GREY)) {
            driver.findElement(TITLE_WEIGHT_INPUT).click();
        } else {
            driver.findElement(EDIT_BUTTON_GREY).click();
            log.info("click on edit button");
        }
    }

    @Step("click on save button")
    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
    public void clickAddToActivityLogButton() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(ADD_TO_ACTIVITY_LOG_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("click on activity log add button");
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
    public void inputFoodText() {
        if (!isExist(INPUT_TEXT) && count < 10) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        driver.findElement(INPUT_TEXT).sendKeys("apple");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("text in input");
    }

    @Step("Input text")
    public void inputActivityText() {
        if (!isExist(INPUT_TEXT) && count < 10) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        driver.findElement(INPUT_TEXT).sendKeys("Dancing");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("text in input");
    }

    @Step("Input mood text")
    public void inputMoodText() {
        driver.findElement(MOOD_INPUT).clear();
        driver.findElement(MOOD_INPUT).sendKeys("I am happy");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("text in input");
    }

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
