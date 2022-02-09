package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ReportsNavbarPage extends BasePage {
    public static final By REPORTS_ITEM_TITLE = By.xpath("//div[@id='main-full']//h1");

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
