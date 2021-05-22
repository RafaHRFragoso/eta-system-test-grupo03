package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class ItauCardPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    private By itauCardBtn = By.cssSelector("div[class='samsungbr-samsung-store-0-x-gnb__sub'] > div > div");
    private By pecaOSeuBtn = By.cssSelector("div[data-testid='base-modal'] > div > div > a:nth-child(2)");
    private By cartaoSamsungItaucardText = By.cssSelector(".floating-navigation__headline  > strong[class='floating-navigation__headline-text'] > em");


    //Construtor
    public ItauCardPage(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();

    }

    public void clickItauCardBtn(){
        driver.findElement(itauCardBtn).click();
    }

    public void waitPecaOSeuBtn(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(pecaOSeuBtn));
        driver.findElement(pecaOSeuBtn).click();

    }

    public String validatedCartaoSamsungItaucardText(){
        return driver.findElement(cartaoSamsungItaucardText).getText();

    }
}
