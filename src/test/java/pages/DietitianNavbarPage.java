package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DietitianNavbarPage extends BasePage {
    public static final By DIETITIAN_BUTTON_NAVBAR = By.xpath("//div[@id='menu']/ul//li//a/span[text()='DIETITIAN']");

    @Step("click on dietitian navbar")
    public void clickOnDietitianNavbar() {
        driver.findElement(DIETITIAN_BUTTON_NAVBAR).click();
        log.info("click on dietitian navbar");
    }

    public DietitianNavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(FITNESS_BUTTON);
    }
}
