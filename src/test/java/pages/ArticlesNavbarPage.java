package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ArticlesNavbarPage extends BasePage {
    public static final By ARTICLES_BUTTON_NAVBAR = By.xpath("//div[@id='menu']/ul//li//a/span[text()='ARTICLES']");

    @Step("click on articles navbar")
    public void clickOnArticlesNavbar() {
        driver.findElement(ARTICLES_BUTTON_NAVBAR).click();
        log.info("click on articles navbar");
    }

    public ArticlesNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(FITNESS_BUTTON);
    }
}
