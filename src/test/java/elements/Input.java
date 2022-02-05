package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class Input {
    String inputLocator = "//label[text()='%s']//ancestor::p//input";
    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing text '%s' input with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).sendKeys(text);
    }
}