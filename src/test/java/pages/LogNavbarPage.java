package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LogNavbarPage extends BasePage {

    public LogNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
