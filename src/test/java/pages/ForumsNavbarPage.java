package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ForumsNavbarPage extends BasePage {
    public static final By TITLE_DISCUSSION_BOARDS= By.xpath("//h1//strong");

    @Step("Check title after click on home in forums navbar")
    public String checkoutTitleDiscussionBoards() {
        log.info("get title for details pade");
        return driver.findElement(TITLE_DISCUSSION_BOARDS).getText();
    }
    public ForumsNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(FORUMS_TITLE);
    }
}
