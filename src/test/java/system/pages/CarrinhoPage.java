package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class CarrinhoPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    private By addCarBtn = By.cssSelector(".bg-black-90.mb6.undefined > div > div:nth-child(3) > button");
    private By myCarText = By.cssSelector("body > div[class='container'] > div > div:first-child");
    private By removeItemCar = By.cssSelector(".item-remove > a[class='item-link-remove data-omni-remove']");
    private By emptyCarMessage = By.cssSelector(".cart-template.full-cart.span12.active > div > div > h2");
    private By voltarBtnCarrinho = By.cssSelector(".samsungbr-vtexcommercestable-com-br.body-cart > div.container > div:first-child > div:nth-child(2) > a > svg");

    //Carinho home page
    private String carIconHomePage = "div[class='samsungbr-samsung-store-0-x-gnb__sub'] > ul:nth-child(3) > li:nth-child(2) > aside > div > div > button";
    private By cartIconHomePage = By.cssSelector(carIconHomePage);
    private By emptyCarMessageHomePage = By.cssSelector(".lh-copy.vtex-rich-text-0-x-paragraph.vtex-rich-text-0-x-paragraph--ptbr");
    private By removeBtn = By.cssSelector("button[id^='remove-button']");

    //Construtor
    public CarrinhoPage(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void waitMyCarTextPage(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(myCarText));

    }

    public void clickAddCarBtn(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCarBtn));
        driver.findElement(addCarBtn).click();
    }

    public String getMsgMyCarText(){
        return driver.findElement(myCarText).getText();

    }

    public void waitExplicityCar(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCarBtn));

    }

    public void clickRemoveItemCarBtn() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeItemCar));
        driver.findElement(removeItemCar).click();
    }
    public void waitEmptyCarMessage(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCarMessage));

    }

    public String validatedValueEmptyMyCar(){
        return driver.findElement(emptyCarMessage).getText();

    }

    public void clickVoltarBtnCarrinho(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(voltarBtnCarrinho));
        driver.findElement(voltarBtnCarrinho).click();
    }
    public void mouseHoverCarIconHomePage(){

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartIconHomePage));

        Actions action = new Actions(driver);
        WebElement carIcon = driver.findElement(By.cssSelector(carIconHomePage));
        action.moveToElement(carIcon).build().perform();
    }

    public void waitEmptyCarMessageHomePage(){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCarMessageHomePage));
    }

    public String validatedValueEmptyMyCarHomePage(){
        return driver.findElement(emptyCarMessageHomePage).getText();
    }

    public void clickRemoveBtn(){

        driver.findElement(removeBtn).click();
    }

}
