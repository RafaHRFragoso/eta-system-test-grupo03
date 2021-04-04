package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import system.helpers.DriverManager;

import java.util.ArrayList;
import java.util.List;

public class SamsungHomePage {

    private WebDriver driver;
    private JavascriptExecutor js;

    private By popBtnNaoObrigado = By.xpath("//button[contains(text(),'NÃO, OBRIGADO.')]");
    private By cookiesCloseBtnBanner = By.xpath("#banner-cookie > div > button[class='acupula-samsung-store-0-x-closeBtnBanner']");
    //terminei aqui ainda falta ver as demais coias o método está dando erro.
    private String telefoniaMenuBtn = ("div[class='acupula-samsung-store-0-x-gnb__depth1-container'] > div > ul > li > a[data-omni='TELEFONIA']");
    private By smartWatchesMenuBtn = By.cssSelector("a > span[data-omni='telefonia:smartwatches']");
    //lista terminei aqui
    private By listCompleteNane = By.cssSelector("h3.acupula-samsung-store-0-x-productBrand.acupula-samsung-store-0-x-nameComplete");
;
    public SamsungHomePage(){
        driver = DriverManager.getDriver();
    }

    //Função para clicar no elemento
    public void click(By locato){
        driver.findElement(smartWatchesMenuBtn).click();
    }

    //Função do hover do mouse
    public void mouseHover(String element){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector(telefoniaMenuBtn));
        action.moveToElement(we).build().perform();
    }

    //Função para scroll a tela até o rodapé
    public void scrollScreen(){
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

    //Função de uma lista de elemento
    public void listElements(){
        List<WebElement> elements = new ArrayList<>();
        elements = driver.findElements(
                By.cssSelector(listCompleteNane));

        elements.stream().map(WebElement::getText).forEach(System.out::println);

    }
    //Função para pegar o texto do elemento
    public String getText(WebElement element){
        return element.getText();
    }
}
