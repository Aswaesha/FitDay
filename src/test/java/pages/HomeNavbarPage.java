package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class HomeNavbarPage extends BasePage {
    public static final By CALENDAR_TABLE = By.xpath("//div[@id='j-calendar']");
    public static final By PROFILE_TITLE = By.xpath("//div[@id='profile-top']//div[@class='title']");

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
