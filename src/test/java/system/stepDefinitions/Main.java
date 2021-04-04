package system.stepDefinitions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class Main {

    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    void cenario1() {
        driver = DriverManager.getDriver();
        driver.get("https://shop.samsung.com/br/");

        DriverManager.endSession();
    }

}
