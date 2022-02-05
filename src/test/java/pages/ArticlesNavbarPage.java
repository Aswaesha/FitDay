package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ArticlesNavbarPage extends BasePage {
    @Step("Check title after click on fitness in article navbar")
    public boolean checkoutTitle() {
        return driver.findElement(TITLE_CATEGORIES).isDisplayed();
    }

    public ArticlesNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(FITNESS_BUTTON);
    }
}


