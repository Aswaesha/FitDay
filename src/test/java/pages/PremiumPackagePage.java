package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class PremiumPackagePage extends BasePage {
    public static final By PC_BUTTON = By.xpath("//li[@class='last']/a//span");
    public static final By PRODUCTS_TITLE = By.xpath("//div[@class='Holder']//h1");
    public static final By PREMIUM_BUTTON = By.xpath("//li[@class='first']/a//span");
    public static final By PRIMARY_DROPDOWN = By.xpath("//select[@class='primary']");
    public static final By SECONDARY_DROPDOWN = By.xpath("//select[@class='secondary']");
    public static final String PRIMARY_DROPDOWN_VALUE = "//select[@class='primary']//option[@value='%s']";
    public static final String SECONDARY_DROPDOWN_VALUE = "//select[@class='secondary']//option[@value='%s']";

    @Step("Check title on products pages")
    public String checkoutTitleAtProductPage() {
        return driver.findElement(PRODUCTS_TITLE).getText();
    }

    @Step("click on primary dropdown")
    public void clickPrimaryDropdown() {
        driver.findElement(PRIMARY_DROPDOWN).click();
        log.info("click on primary dropdown");
    }

    @Step("Click on  FitDay Premium")
    public void clickFitDayPremium() {
        driver.findElement(PREMIUM_BUTTON).click();
        log.info("click on FitDay Premium ");
    }

    @Step("Click on  FitDay PC")
    public void clickFitDayPC() {
        driver.findElement(PC_BUTTON).click();
        log.info("click on FitDay PC");
    }

    @Step("click on secondary dropdown")
    public void clickSecondaryDropdown() {
        driver.findElement(SECONDARY_DROPDOWN).click();
        log.info("click on secondary dropdown");
    }

    @Step("Click on primary dropdown params")
    public void clickPrimaryDropdownValue(String primaryDropdownOption) {
        driver.findElement(By.xpath(String.format(PRIMARY_DROPDOWN_VALUE, primaryDropdownOption))).click();
        log.info("click on primary dropdown params");
    }

    @Step("Click on secondary dropdown params")
    public void clickSecondaryDropdownValue(String secondaryDropdownOption) {
        driver.findElement(By.xpath(String.format(SECONDARY_DROPDOWN_VALUE, secondaryDropdownOption))).click();
        log.info("click on secondary dropdown params");
    }

    public PremiumPackagePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

}
