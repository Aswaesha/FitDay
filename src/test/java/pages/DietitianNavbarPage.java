package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DietitianNavbarPage extends BasePage {
    public static final By TITLE_DETAILS = By.xpath("//div[@class='Holder']//h1");

    @Step("Check title after click on details in dietitian navbar")
    public String checkoutTitleDetailsPag() {
        log.info("get title for details pade");
        return driver.findElement(TITLE_DETAILS).getText();
    }

    public DietitianNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(FITNESS_BUTTON);
    }
}
