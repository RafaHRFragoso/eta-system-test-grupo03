package system.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
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
    private By showMoreSpecificationBtn = By.cssSelector("#inpage_container > div:nth-child(4) > div > div:nth-child(2) > div > div > div[title='Mostrar mais ESPECIFICAÇÕES']");
    private String specificationsName = "div.inpage_block.flix-specs.flix-hidden2";
    private By serviceCenterBtn = By.cssSelector("a[data-omni='footer:suporte_centro de serviços']");
    private By mobileMenuBtn = By.id("tab10001");
    private By searchItem = By.id("searchItem");
    private By kmBtn20Km = By.cssSelector("a[data-emit-name='Km:20']");
    private String groupServiceCenter = "div[class='map-result-w']";

    //Novos elementos para pesquisar e adicionar um produto no carrinho
    private By searchBtn = By.cssSelector("div[class='acupula-samsung-store-0-x-gnb__sub'] > ul:nth-child(3) > li:nth-child(3) > a > svg");
    private By serachTextField = By.id("downshift-0-input");
    private By fisrtItemGeladeira = By.cssSelector(".vtex-search-result-3-x-resultGallery > div:nth-child(3) > div:first-child");
    //private By galaxyBudsProBtn = By.cssSelector("img[alt='Galaxy Buds Pro']");
    private By galaxyBudsProColor = By.cssSelector(".pr0.items-stretch.vtex-flex-layout-0-x-stretchChildrenWidth.flex > div > div:nth-child(3) > div > div > div > div > div:nth-child(2) > div:first-child");
    private By voltage110Btn = By.cssSelector(".vtex-store-components-3-x-skuSelectorNameContainer.ma1 > div:nth-child(2) > div[class='vtex-store-components-3-x-skuSelectorItem vtex-store-components-3-x-skuSelectorItem--110-v relative di pointer flex items-center outline-0 ma2'] > div:first-child");
    private By addCarBtn = By.cssSelector(".bg-black-90.mb6.undefined > div > div:nth-child(3) > button");

    private By myCarText = By.cssSelector("body > div[class='container'] > div > div:first-child");
    // private String nameGalaxyBudsPro =  "product-name1771";
    //Seletor da quantidade no carrinho na tela do carrinho
    //private String qntCarItem = "item-quantity-1771";

    //Novos elementos para fazer um novo cenário
    private By removeItemCar = By.cssSelector(".item-remove > a[class='item-link-remove data-omni-remove']");
    private By emptyCarMessage = By.cssSelector(".cart-template.full-cart.span12.active > div > div > h2");

    //Novos elementos carrinho na tela home page
    private String carIconHomePage = ".acupula-samsung-store-0-x-gnb__utility > li:nth-child(2) > aside > div > div > button";
    private By emptyCarMessageHomePage = By.cssSelector(".lh-copy.vtex-rich-text-0-x-paragraph.vtex-rich-text-0-x-paragraph--ptbr");

    //Itaú card botão
    private By itauCardBtn = By.cssSelector(".acupula-samsung-store-0-x-gnb__sub > div > div");
    private By pecaOSeuBtn = By.cssSelector("div[data-testid='base-modal'] > div > div > a:nth-child(2)");
    //private By pecaOSeuBtn = By.cssSelector(".vtex-rich-text-0-x-wrapper.vtex-rich-text-0-x-wrapper--button-samsungItau > p > a");
    private By cartaoSamsungItaucardText = By.cssSelector(".floating-navigation__headline  > strong[class='floating-navigation__headline-text'] > em");

    //telefonia titulo
    private By telefoniaTitle = By.cssSelector(".acupula-samsung-store-0-x-gnb__depth2-wrap > div:nth-child(2) > div > strong > a[href='/br/mobile']");
    private By ordenarPorRelevanciaBtn = By.cssSelector(".vtex-search-result-3-x-orderBy > div > button > span > span");
    private By maisVendidoOrdemBtn = By.cssSelector(".vtex-search-result-3-x-orderBy > div > div > button:nth-child(2)");
    private By ordenarPorMaisVendidoText = By.xpath("//span[text()='Mais Vendidos']");
//span[text()="Mais Vendidos"]
    //private By ordenarPorMaisVendidoText = By.cssSelector(".vtex-search-result-3-x-orderBy > div > button");
    //private By ordenarPorMaisVendidoText = By.cssSelector(".vtex-search-result-3-x-orderBy > div > button > span > span");

    //Construtor
    public SamsungHomePage(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();

    }
    public void clickSearchItemBtn(){
        driver.findElement(searchBtn).click();
    }

   /* public void clickCarIconHomePage(){
        driver.findElement(carIconHomePage).click();
    }*/

    public void clickItemGeladeira(){
        driver.findElement(fisrtItemGeladeira).click();
    }

    public void clickGalaxyBudsProColor(){
        driver.findElement(galaxyBudsProColor);
    }

    public void clickAddCarBtn(){
        driver.findElement(addCarBtn).click();
    }

    public void clickRemoveItemCarBtn(){
        driver.findElement(removeItemCar).click();
    }

    //Função para clicar na opção NÃO, OBRIGADO do Pop-Up
    public void clickPopUp(){
        driver.findElement(popBtnNaoObrigado).click();
    }

    public void clickVoltage110Btn(){
        driver.findElement(voltage110Btn).click();
    }

    public void clickItauCardBtn(){
        driver.findElement(itauCardBtn).click();
    }

    public void clickTelefoniaTitle(){
        driver.findElement(telefoniaTitle).click();
    }

    //Função do hover do mouse
    public void mouseHover(){
        Actions action = new Actions(driver);
        WebElement telefoniaMenu = driver.findElement(By.cssSelector(telefoniaMenuBtn));
        action.moveToElement(telefoniaMenu).build().perform();
    }

    public void mouseHoverCarIconHomePage(){
        Actions action = new Actions(driver);
        WebElement carIcon = driver.findElement(By.cssSelector(carIconHomePage));
        action.moveToElement(carIcon).build().perform();
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
    public void clickMaisVendidoOrdemBtn(){
        driver.findElement(maisVendidoOrdemBtn).click();
    }

   /*public void validatedProductName(){
        WebElement productName = driver.findElement(By.cssSelector(nameGalaxyBudsPro));
        productName.getText();
    }*/

    public void sendTextSearchItem(){
        driver.findElement(searchItem).sendKeys("51010-000");
        waitImplicity();
    }

    public void sendTextSearchField() throws InterruptedException {
        driver.findElement(serachTextField).sendKeys("Geladeira" + Keys.ENTER);

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

    public void waitExplicityShowFirstItem(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(fisrtItemGeladeira));

    }
    public void waitExplicityCar(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCarBtn));

    }
    public void waitMyCarTextPage(){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(myCarText));

    }
    public void waitEmptyCarMessageHomePage(){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCarMessageHomePage));
    }

    public void waitEmptyCarMessage(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCarMessage));

    }

    public void waitPecaOSeuBtn(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(pecaOSeuBtn));
        driver.findElement(pecaOSeuBtn).click();

    }

    public void waitOrdenarPorRelevanciaBtn(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ordenarPorRelevanciaBtn));
        driver.findElement(ordenarPorRelevanciaBtn).click();

    }

    public void waitOrdenarPorMaisVendidoText(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ordenarPorMaisVendidoText));

    }

    public void validatedMsgMyCarText(){
        String myCarMsg = driver.findElement(myCarText).getText();
        Assertions.assertEquals("Meu carrinho", myCarMsg);
    }
    public void validatedValueEmptyMyCar(){
        String emptyCarMsg = driver.findElement(emptyCarMessage).getText();
        Assertions.assertEquals("Seu carrinho está vazio.", emptyCarMsg);
    }
    public void validatedValueEmptyMyCarHomePage(){
        String emptyCarMsgHomepage = driver.findElement(emptyCarMessageHomePage).getText();
        Assertions.assertEquals("Teu carrinho está vazio", emptyCarMsgHomepage);
    }

    public void validatedCartaoSamsungItaucardText(){
        String msgCartaoSamsungItauCard = driver.findElement(cartaoSamsungItaucardText).getText();
        Assertions.assertEquals("Cartão Samsung Itaucard", msgCartaoSamsungItauCard);
    }

    public void validatedOrdenarPorMaisVendidoText(){
        String textOrdenarPorMaisVendido = driver.findElement(ordenarPorMaisVendidoText).getText();
        Assertions.assertEquals("ORDENAR POR MAIS VENDIDOS", textOrdenarPorMaisVendido);
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
