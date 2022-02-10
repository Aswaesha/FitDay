package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ReportsNavbarPage extends BasePage {
    public static final By TABLE_REPORT = By.xpath("//table[@class='ib-list']");
    public static final By TABLE_LINK = By.xpath("//a[@class='nutri-total-table']");
    public static final By PRIMARY_DROPDOWN = By.xpath("//select[@class='primary']");
    public static final By REPORTS_ITEM_TITLE = By.xpath("//div[@id='main-full']//h1");
    public static final By SECONDARY_DROPDOWN = By.xpath("//select[@class='secondary']");
    public static final String PRIMARY_DROPDOWN_VALUE = "//select[@class='primary']//option[@value='%s']";
    public static final String SECONDARY_DROPDOWN_VALUE = "//select[@class='secondary']//option[@value='%s']";

    @Step("Check table")
    public boolean checkoutTable() {
        return driver.findElement(TABLE_REPORT).isDisplayed();
    }

    @Step("click on link table")
    public void clickLinkTable() {
        driver.findElement(TABLE_LINK).click();
        log.info("click on link table");
    }

    @Step("click on primary dropdown")
    public void clickPrimaryDropdown() {
        driver.findElement(PRIMARY_DROPDOWN).click();
        log.info("click on primary dropdown");
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

    @Step("Check title after click on reports navbar")
    public String checkoutReportsTitles() {
        log.info("get title for reports");
        return driver.findElement(REPORTS_ITEM_TITLE).getText();
    }

    public ReportsNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
