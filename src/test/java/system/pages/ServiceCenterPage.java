package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import java.util.List;

public class ServiceCenterPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    private By serviceCenterBtn = By.xpath("//a[text()='Centro de Serviços']");
    private By mobileMenuBtn = By.id("tab10001");
    private By searchItem = By.id("searchItem");
    private By kmBtn20Km = By.cssSelector("a[data-emit-name='Km:20']");
    private String groupServiceCenter = "div[class='map-result-w'] > ul > li[class='result-list__item']";

    //Construtor
    public ServiceCenterPage(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void clickServiceCenterBtn(){
        driver.findElement(serviceCenterBtn).click();
    }

    public void clickMobileMenuBtn(){
        driver.findElement(mobileMenuBtn).click();
    }

    public void sendTextSearchItem(){
        driver.findElement(searchItem).sendKeys("51010-000");

    }
    public void clickKmBtn20Km(){
        driver.findElement(kmBtn20Km).click();

    }

    public void listGroupService(){
        List<WebElement> elements = driver.findElements(
                By.cssSelector(groupServiceCenter));

        elements.stream().map(WebElement::getText).forEach(System.out::println);


    }

}
