package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoPage extends BasePage{
   public static final By LOGO = By.xpath("//a[@id='logo']");

    @Override
    public boolean isPageOpen() {
        return isExist(LOGO);
    }

    public LogoPage(WebDriver driver) {
        super(driver);
    }

}
