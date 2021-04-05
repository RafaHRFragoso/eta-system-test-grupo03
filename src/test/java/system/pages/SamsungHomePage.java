package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SamsungHomePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    private By popBtnNaoObrigado = By.xpath("//button[contains(text(),'NÃO, OBRIGADO.')]");
    private String cookiesCloseBtnBanner = "#banner-cookie > div > button[class='acupula-samsung-store-0-x-closeBtnBanner']";
    private String telefoniaMenuBtn = "div[class='acupula-samsung-store-0-x-gnb__depth1-container'] > div > ul > li > a[data-omni='TELEFONIA']";
    private By smartWatchesMenuBtn = By.cssSelector("a > span[data-omni='telefonia:smartwatches']");
    private String listCompleteNane = "h3.acupula-samsung-store-0-x-productBrand.acupula-samsung-store-0-x-nameComplete";
    private By thirdItem = By.cssSelector("div[class='vtex-search-result-3-x-gallery flex flex-row flex-wrap items-stretch bn ph1 na4 pl9-l'] > div:nth-child(3)");
    //private By showMoreSpecificationBtn = By.cssSelector("div[title='Mostrar mais ESPECIFICAÇÕES']");
    private By showMoreSpecificationBtn = By.cssSelector("#inpage_container > div:nth-child(4) > div > div:nth-child(2) > div > div > div[title='Mostrar mais ESPECIFICAÇÕES']");
    private String specificationsName = "div.inpage_block.flix-specs.flix-hidden2";
    private By serviceCenterBtn = By.cssSelector("a[data-omni='footer:suporte_centro de serviços']");
    private By mobileMenuBtn = By.id("tab10001");
    private By searchItem = By.id("searchItem");
    private By kmBtn20Km = By.cssSelector("a[data-emit-name='Km:20']");
    //private By groupServiceCenter = By.cssSelector("div[class='map-result-w']");
    //private String groupServiceCenter = driver.findElement(By.cssSelector("div[class='map-result-w']"));
    private String groupServiceCenter = "div[class='map-result-w']";



    //Construtor
    public SamsungHomePage(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();

    }

    //Função para clicar na opção NÃO, OBRIGADO do Pop-Up
    public void clickPopUp(){
        driver.findElement(popBtnNaoObrigado).click();
    }

    //Função do hover do mouse
    public void mouseHover(){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector(telefoniaMenuBtn));
        action.moveToElement(we).build().perform();
    }

    //Função para clicar no menu Smartwatches
    public void clickBotaoSmartWatches(){
        driver.findElement(smartWatchesMenuBtn).click();

    }

    public void clickMoreSpecificationBtn(){
        driver.findElement(showMoreSpecificationBtn).click();
    }

    public void clickServiceCenterBtn(){
        driver.findElement(serviceCenterBtn).click();
    }

    public void clickMobileMenuBtn(){
        driver.findElement(mobileMenuBtn).click();
    }

    public void clickKmBtn20Km(){
        driver.findElement(kmBtn20Km).click();
        waitImplicity();
    }

    public void sendTextSearchItem(){
        driver.findElement(searchItem).sendKeys("51010-000");
        waitImplicity();
    }

    //Função para scroll a tela até o rodapé
    public void scrollScreenUntilFooter(){
       js = (JavascriptExecutor) driver;
        try {
            long lastHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
            while (true) {
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(2000);
                long newHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollScreenUntilFooterAndBackUntilElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long lastHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            waitImplicity();

            long newHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
            if (newHeight == lastHeight) {
                break;
            }
            lastHeight = newHeight;
        }
        waitImplicity();
        js.executeScript("window.scrollBy(0,-900)");
        waitExplicityShowMoreSpecificationBtn();
    }

    public void scrollScreenUntilFooterAndBackUntilElement1(){
        js.executeScript("window.scrollBy(0,-1000)");
    }

    public void scrollUntilElement(){
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,900)");
        waitImplicity();
    }

    //Função de uma lista de elemento e imprimir o conteúdo
    public void listElements(){
        List<WebElement> elements = driver.findElements(
                By.cssSelector(listCompleteNane));

        elements.stream().map(WebElement::getText).forEach(System.out::println);

    }

    public void listElements1(){
        List<WebElement> elements = driver.findElements(
                By.cssSelector(specificationsName));

        elements.stream().map(WebElement::getText).forEach(System.out::println);

    }


    public void listElements2(){
        List<WebElement> elements = driver.findElements(
                By.cssSelector(groupServiceCenter));

        elements.stream().map(WebElement::getText).forEach(System.out::println);
        waitImplicity();

    }

    //Função de uma espera implicita
    public void waitImplicity(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void waitImplicitySpecial(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Função de uma espera explicita
    public void waitExplicitySmartWatchesMenuBtn(){
       wait = new WebDriverWait(driver, 2);
       wait.until(ExpectedConditions.visibilityOfElementLocated(smartWatchesMenuBtn));

    }
    public void waitExplicityShowMoreSpecificationBtn(){
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(showMoreSpecificationBtn));

    }

    public void clickThirdItem(){
        driver.findElement(thirdItem).click();
    }

    public void closeCookies(){
        try {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector(cookiesCloseBtnBanner)).click();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
