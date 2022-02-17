package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@Log4j2
public class MainPage extends BasePage {
    public static final By LEARN_MORE_BUTTON = By.xpath("//ul[@class='dropdown']//li");
    public static final By SEARCH_INPUT = By.xpath("//form[@id='cse-search-box']//input[@name='q']");
    public static final By NUTRITION_BUTTON = By.xpath("//div[@class='main-cat']//a[text()='Nutrition']");
    public static final By SEARCH_BUTTON = By.xpath("//form[@id='cse-search-box']//input[@value='Search']");
    public static final By SEARCH_RESULT_LINK = By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']");
    public static final By FORUMS_LINK = By.xpath("//ul[@class='dropdown']//ul[@class='sub_menu']//li//a[text()='Forums']");
    public static final By FITNESS_LINK = By.xpath("//ul[@class='dropdown']//ul[@class='sub_menu']//li//a[text()='Fitness']");
    public static final By NUTRITION_LINK = By.xpath("//ul[@class='dropdown']//ul[@class='sub_menu']//li//a[text()='Nutrition']");

    @Step("Input text in search input")
    public void searchInput(String text) {
        driver.findElement(SEARCH_INPUT).sendKeys(text);
        driver.findElement(SEARCH_BUTTON).click();
    }

    @Step("Check popup")
    public boolean checkoutLink() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(SEARCH_RESULT_LINK) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(SEARCH_RESULT_LINK).isDisplayed();
    }

    @Step("click on nutrition button")
    public void listClickOnNutritionButton() {
        driver.findElement(NUTRITION_BUTTON).click();
        log.info("click on nutrition button at all categories");
    }

    @Step("click on fitness button")
    public void listClickOnFitnessButton() {
        driver.findElement(FITNESS_BUTTON).click();
        log.info("click on fitness button at all categories");
    }

    @Step("click on learn more button")
    public void listClickOnLearnMore() {
        driver.findElement(LEARN_MORE_BUTTON).click();
        log.info("click on learn more button");
    }

    @Step("click on nutrition at learn more")
    public void listClickOnNutrition() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(NUTRITION_LINK) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(LEARN_MORE_BUTTON).click();
        }
        driver.findElement(NUTRITION_LINK).click();
        log.info("click on nutrition");
    }

    @Step("click on fitness  at learn more")
    public void listClickOnFitness() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(FITNESS_LINK) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(LEARN_MORE_BUTTON).click();
        }
        driver.findElement(FITNESS_LINK).click();
        log.info("click on fitness");
    }

    @Step("click on forums  at learn more")
    public void listClickOnForums() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(FORUMS_LINK) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(LEARN_MORE_BUTTON).click();
        }
        driver.findElement(FORUMS_LINK).click();
        log.info("click on forums");
    }

    private int count;

    @Step("Get text title")
    public String getTextTitleOfPage() {
        log.info("get error message for titles");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(TITLE_CATEGORIES) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(TITLE_CATEGORIES).getText();
    }

    @Step("Title forum message")
    public String getTextTitleOfForums() {
        log.info("get error message for forum title");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (!isExist(TITLE_DISCUSSION_BOARDS) && count < 5) {
            count++;
            log.info("###### attempt number: " + count);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.findElement(TITLE_DISCUSSION_BOARDS).getText();
    }

    @Step("Open main page")
    public MainPage open() {
        driver.get(BASE_URL);
        log.info("open main page");
        return this;
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LEARN_MORE_BUTTON);
    }

}
