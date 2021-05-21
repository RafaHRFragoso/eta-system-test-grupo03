package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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




    public CarrinhoPage(WebDriver driver){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }
}
