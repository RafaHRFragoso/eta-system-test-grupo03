package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class TelefoniaPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    private By telefoniaTitle = By.xpath("//a[text()='Telefonia']");
    private By ordenarPorRelevanciaBtn = By.xpath("//span[text()='Relevância']");
    private By maisVendidoOrdemBtn = By.xpath("//button[text()='Mais Vendidos']");
    private By ordenarPorMaisVendidoText = By.xpath("//span[text()='Mais Vendidos']");


    //Construtor
    public TelefoniaPage(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();

    }

    public void clickTelefoniaTitle(){
        driver.findElement(telefoniaTitle).click();
    }

    public void waitOrdenarPorRelevanciaBtn(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ordenarPorRelevanciaBtn));
        driver.findElement(ordenarPorRelevanciaBtn).click();
    }

    public void clickMaisVendidoOrdemBtn(){
        driver.findElement(maisVendidoOrdemBtn).click();
    }

    public void waitOrdenarPorMaisVendidoText(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ordenarPorMaisVendidoText));

    }
    public String validatedOrdenarPorMaisVendidoText(){
        return driver.findElement(ordenarPorMaisVendidoText).getText();

    }

}
