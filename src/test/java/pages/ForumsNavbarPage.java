package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ForumsNavbarPage extends BasePage {
    public static final By FORUM_BUTTON_NAVBAR = By.xpath("//div[@id='menu']/ul//li//a/span[text()='FORUMS']");

    @Step("click on nutrition button")
    public void clickOnForumNavbar() {
        driver.findElement(FORUM_BUTTON_NAVBAR).click();
        log.info("click on forums at navbar");
    }

    public ForumsNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(FORUMS_TITLE);
    }
}
