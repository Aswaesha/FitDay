package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Log4j2
public class LogNavbarPage extends BasePage {
    public static final By EDIT_WEIGHT_BUTTON = By.xpath("//td[@class='weight-current']//a[@class='edit button']//span");
    public static final By WEIGHT_INPUT = By.xpath("//input[@name='weight']");
    public static final By WEIGHT_VALUE= By.xpath("//td[text()='Weight']//ancestor::tr//td[3]");

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
    public void inputWeightText(){
        driver.findElement(WEIGHT_INPUT).sendKeys("109");
        log.info("text in input");
    }
    @Step("click on edit button")
    public void clickEditButton() {
        driver.findElement(EDIT_WEIGHT_BUTTON).click();
        log.info("click on edit button");
    }

    @Step("Open log item page")
    public LogNavbarPage open(String url) {
        driver.get(BASE_URL + url);
        log.info("open log item page");
        return this;
    }
    public LogNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
