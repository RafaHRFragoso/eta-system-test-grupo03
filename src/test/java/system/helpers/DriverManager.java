package system.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static system.helpers.Constants.CHROME_DRIVER_PATH;

public class DriverManager {

    private static WebDriver driver;
    private static WebDriverWait driverWait;

    public static WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
            System.setProperty("webdriver.chrome.silentOutput", "True");
            driver = new ChromeDriver();
            driver.get("https://shop.samsung.com/br/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return driver;
    }

    public static WebDriverWait getDriverWait(){
        if (driverWait == null) {
            driverWait = new WebDriverWait(driver, 5);
        }

        return driverWait;
    }

    public static void endSession() {
        if (driver != null) {
            driver.quit();
            driver = null;
            driverWait = null;
        }
    }
}
