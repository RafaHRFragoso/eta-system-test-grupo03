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

    private By popBtnNaoObrigado = By.xpath("//*[text()='NÃO, OBRIGADO']");

    private By cookiesCloseBtnBanner = By.id("banner-cookie");
    private String telefoniaMenuBtn = ".samsungbr-samsung-store-0-x-gnb__depth1 > li:first-child > a > span[class='samsungbr-samsung-store-0-x-gnb__depth1-link-text']";

    private By smartWatchesMenuBtn = By.xpath("//span[text()='Smartwatches']");
    private String listCompleteName = "h3.samsungbr-samsung-store-0-x-productBrand.samsungbr-samsung-store-0-x-nameComplete";

    private By thirdItem = By.cssSelector("div[class='vtex-search-result-3-x-gallery flex flex-row flex-wrap items-stretch bn ph1 na4 pl9-l'] > div:nth-child(3)");
    private By showMoreSpecificationBtn = By.cssSelector("#inpage_container > div:nth-child(4) > div > div:nth-child(2) > div > div > div[title='Mostrar mais ESPECIFICAÇÕES']");
    private String specificationsName = "div.inpage_block.flix-specs.flix-hidden2";

    private By serviceCenterBtn = By.xpath("//a[text()='Centro de Serviços']");
    private By faleConoscoBtn = By.xpath("//a[text()='Fale Conosco']");
    private By mobileMenuBtn = By.id("tab10001");
    private By searchItem = By.id("searchItem");
    private By kmBtn20Km = By.cssSelector("a[data-emit-name='Km:20']");
    private String groupServiceCenter = "div[class='map-result-w'] > ul > li[class='result-list__item']";

    //Novos elementos para pesquisar e adicionar um produto no carrinho
    private By searchBtn = By.cssSelector("li.undefined .samsungbr-samsung-store-0-x-gnb__search-btn > svg[id='search-bold']");
    private By serachTextField = By.id("downshift-0-input");

    private By fisrtItemGeladeira = By.cssSelector("div[class='pr0 items-stretch vtex-flex-layout-0-x-stretchChildrenWidth   flex'] > div:nth-child(2) > div:nth-child(2)");
    private By voltage110Btn = By.cssSelector(".vtex-store-components-3-x-skuSelectorNameContainer.ma1 > div:nth-child(2) > div[class='vtex-store-components-3-x-skuSelectorItem vtex-store-components-3-x-skuSelectorItem--110-v relative di pointer flex items-center outline-0 ma2']");

    private By addCarBtn = By.cssSelector(".bg-black-90.mb6.undefined > div > div:nth-child(3) > button");
    private By myCarText = By.cssSelector("body > div[class='container'] > div > div:first-child");

    // Elementos cenario 12 * Grace Amaral *
    private By ItemAparelho = By.cssSelector(".vtex-store-components-3-x-discountContainer.relative.dib > div:nth-child(2) > img[alt='Galaxy A32']");
    private By modeloAparelho = By.cssSelector(".vtex-store-components-3-x-skuSelectorNameContainer.ma1 > div:nth-child(2) > div[class='vtex-store-components-3-x-skuSelectorItem vtex-store-components-3-x-skuSelectorItem--a32 relative di pointer flex items-center outline-0 ma2']");
    private By corAparelho = By.cssSelector("#sku-selector-model > div > div:nth-child(2) > div > div:nth-child(2) > div:first-child");
    private By memoriaAparelho = By.cssSelector("#sku-selector-model > div > div:nth-child(3) > div > div:nth-child(2) > div");

    //Novos elementos para fazer um novo cenário
    private By removeItemCar = By.cssSelector(".item-remove > a[class='item-link-remove data-omni-remove']");
    private By emptyCarMessage = By.cssSelector(".cart-template.full-cart.span12.active > div > div > h2");

    //Novos elementos carrinho na tela home page
    private String carIconHomePage = "div[class='samsungbr-samsung-store-0-x-gnb__sub'] > ul:nth-child(3) > li:nth-child(2) > aside > div > div > button";
    private By cartIconHomePage = By.cssSelector(carIconHomePage);
    private By emptyCarMessageHomePage = By.cssSelector(".lh-copy.vtex-rich-text-0-x-paragraph.vtex-rich-text-0-x-paragraph--ptbr");

    //Itaú card botão
    private By itauCardBtn = By.cssSelector("div[class='samsungbr-samsung-store-0-x-gnb__sub'] > div > div");
    private By pecaOSeuBtn = By.cssSelector("div[data-testid='base-modal'] > div > div > a:nth-child(2)");
    private By cartaoSamsungItaucardText = By.cssSelector(".floating-navigation__headline  > strong[class='floating-navigation__headline-text'] > em");

    //telefonia titulo
    private By telefoniaTitle = By.xpath("//a[text()='Telefonia']");
    private By ordenarPorRelevanciaBtn = By.xpath("//span[text()='Relevância']");
    private By maisVendidoOrdemBtn = By.xpath("//button[text()='Mais Vendidos']");
    private By ordenarPorMaisVendidoText = By.xpath("//span[text()='Mais Vendidos']");

    //Promoção
    private By promocaoBtn = By.linkText("Promoções");
    private By promocaoValidate = By.cssSelector(".text-block-container__headline");

    //Menu Informatica
    private String informaticaMenuBtn = ("li.samsungbr-samsung-store-0-x-gnb__depth1-menu:nth-child(5)");
    private By numeroDeNotebooks = By.cssSelector("#render-store\\.home > div > div.vtex-store__template.bg-base > div > div:nth-child(3) > div > div:nth-child(2) > section > div.relative.justify-center.flex > div > div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--resultRow > section > div > div:nth-child(2) > div > div:nth-child(1) > div > div > div:nth-child(1) > div > div > div > span");
    private By notebookGamerMenuBtn = By.cssSelector("#render-store\\.home > div > div.vtex-store__template.bg-base > div > div.samsungbr-samsung-store-0-x-gnb > div.samsungbr-samsung-store-0-x-gnb__nav > div > div > div.samsungbr-samsung-store-0-x-gnb__menu-wrap.null > div > div.samsungbr-samsung-store-0-x-gnb__main > ul > li.samsungbr-samsung-store-0-x-gnb__depth1-menu.samsungbr-samsung-store-0-x-has-depth-menu.samsungbr-samsung-store-0-x-active > div > div.samsungbr-samsung-store-0-x-gnb__depth2-inner.samsungbr-samsung-store-0-x-active > ul > li.samsungbr-samsung-store-0-x-gnb__depth2-menu.samsungbr-samsung-store-0-x-has-depth-menu.samsungbr-samsung-store-0-x-active > div > div > ul > li:nth-child(4) > a > span");

    private By voltarBtnCarrinho = By.cssSelector(".samsungbr-vtexcommercestable-com-br.body-cart > div.container > div:first-child > div:nth-child(2) > a > svg");
    private By removeBtn = By.cssSelector("button[id^='remove-button']");

    //Elementos cenario13
    private By titleContactSession = By.cssSelector("#contactinfo h2");
    private By cardContactTitle = By.cssSelector("#contactinfo .card-visible:nth-child(1) h3");
    private By cardContactContent = By.cssSelector("#contactinfo .card-visible:nth-child(1) span");

    //Construtor
    public SamsungHomePage(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();

    }

    public void clickSearchItemBtn(){

        driver.findElement(searchBtn).click();
    }

    public void clickItemGeladeira(){
        driver.findElement(fisrtItemGeladeira).click(); }


    public void clickAddCarBtn(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCarBtn));
        driver.findElement(addCarBtn).click(); }

    public void clickRemoveItemCarBtn() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeItemCar));
        driver.findElement(removeItemCar).click(); }


    public void clickItemAparelho(){
        driver.findElement(ItemAparelho).click(); }

    public void clickModeloA32GBtn(){
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,300)");
        driver.findElement(modeloAparelho).click();
         }
    public void clickCorAparelhoBtn(){
        driver.findElement(corAparelho).click();
       }

    public void clickMemoriaAparelhoBtn(){
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,300)");
        driver.findElement(memoriaAparelho).click();
    }

    //Função para clicar na opção NÃO, OBRIGADO do Pop-Up
    public void clickPopUp(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(popBtnNaoObrigado));
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

    public void clickVoltarBtnCarrinho(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(voltarBtnCarrinho));
        driver.findElement(voltarBtnCarrinho).click();
    }

    public void clickSupportFaleConoscoBtn(){
        driver.findElement(faleConoscoBtn).click();
    }

    public void clickRemoveBtn(){
        driver.findElement(removeBtn).click();
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

    }

    public void clickMaisVendidoOrdemBtn(){
        driver.findElement(maisVendidoOrdemBtn).click();
    }

    public void clickThirdItem(){
        driver.findElement(thirdItem).click();
    }

    public void clickPromocao(){
        driver.findElement(promocaoBtn).click();
    }

    public void clickNotebookGamerMenu(){
        driver.findElement(notebookGamerMenuBtn).click();
    }

    //Função do hover do mouse
    public void mouseHover(){
        Actions action = new Actions(driver);
        WebElement telefoniaMenu = driver.findElement(By.cssSelector(telefoniaMenuBtn));
        action.moveToElement(telefoniaMenu).build().perform();
    }

    public void mouseHoverCarIconHomePage(){

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartIconHomePage));

        Actions action = new Actions(driver);
        WebElement carIcon = driver.findElement(By.cssSelector(carIconHomePage));
        action.moveToElement(carIcon).build().perform();
    }

    public void mouseHoverInformatica(){
        Actions action = new Actions(driver);
        WebElement informaticaMenu = driver.findElement(By.cssSelector(informaticaMenuBtn));
        action.moveToElement(informaticaMenu).build().perform();
    }

    public void sendTextSearchItem(){
        driver.findElement(searchItem).sendKeys("51010-000");

    }

    public void sendTextSearchField(String item){
        driver.findElement(serachTextField).sendKeys(item + Keys.ENTER);

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
        js.executeScript("window.scrollBy(0,-1000)");
    }

    public void scrollUntilElement(){
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,900)");

    }

    //Função de uma lista de elemento e imprimir o conteúdo
    public void listSmartWatchNames(){
        List<WebElement> elements = driver.findElements(
                By.cssSelector(listCompleteName));

        elements.stream().map(WebElement::getText).forEach(System.out::println);

    }

    public void listEspecificacoes(){
        List<WebElement> elements = driver.findElements(
                By.cssSelector(specificationsName));

        elements.stream().map(WebElement::getText).forEach(System.out::println);

    }

    public void listGroupService(){
        List<WebElement> elements = driver.findElements(
                By.cssSelector(groupServiceCenter));

        elements.stream().map(WebElement::getText).forEach(System.out::println);


    }

    public void imprimeNumeroDeNotebookGamer(){
        String imprimteNumeroDeNotebooks = driver.findElement(numeroDeNotebooks).getText();
        System.out.println(imprimteNumeroDeNotebooks);
    }

    //Função de uma espera explicita
    public void waitExplicitySmartWatchesMenuBtn(){
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(smartWatchesMenuBtn));

    }

    public void waitExplicityShowFirstSmart() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ItemAparelho));
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
        wait = new WebDriverWait(driver, 10);
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

    public void waitExplicityNotebookGamerMenuBtn(){
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(notebookGamerMenuBtn));

    }

    public String getMsgMyCarText(){
        return driver.findElement(myCarText).getText();

    }

    public String validatedValueEmptyMyCar(){
        return driver.findElement(emptyCarMessage).getText();

    }

    public String validatedValueEmptyMyCarHomePage(){
         return driver.findElement(emptyCarMessageHomePage).getText();
    }

    public String validatedCartaoSamsungItaucardText(){
          return driver.findElement(cartaoSamsungItaucardText).getText();

    }

    public String validatedOrdenarPorMaisVendidoText(){
        return driver.findElement(ordenarPorMaisVendidoText).getText();

    }

    public String validatePagePromocoes(){
        return driver.findElement(promocaoValidate).getText();

    }

    public String getTitle(){
        return driver.getTitle();

    }

    public String getTitleContactSession(){
        return  driver.findElement(titleContactSession).getText();

    }

    public void getCardContactInfos(){
        String cardTitle = driver.findElement(cardContactTitle).getText();
        String cardContent = driver.findElement(cardContactContent).getText();
        System.out.println(cardTitle);
        System.out.println(cardContent);

    }


    public void closeCookies(){
        try {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(cookiesCloseBtnBanner).click();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
