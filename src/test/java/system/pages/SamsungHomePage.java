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
    private By faleConoscoBtn = By.xpath("//a[text()='Fale Conosco']");

    //Novos elementos para pesquisar e adicionar um produto no carrinho
    private By searchBtn = By.cssSelector("li.undefined .samsungbr-samsung-store-0-x-gnb__search-btn > svg[id='search-bold']");
    private By serachTextField = By.id("downshift-0-input");
    private By fisrtItemGeladeira = By.cssSelector("div[class='pr0 items-stretch vtex-flex-layout-0-x-stretchChildrenWidth   flex'] > div:nth-child(2) > div:nth-child(2)");
    private By voltage110Btn = By.cssSelector(".vtex-store-components-3-x-skuSelectorNameContainer.ma1 > div:nth-child(2) > div[class='vtex-store-components-3-x-skuSelectorItem vtex-store-components-3-x-skuSelectorItem--110-v relative di pointer flex items-center outline-0 ma2']");
    private By ItemAparelho = By.cssSelector(".vtex-store-components-3-x-discountContainer.relative.dib > div:nth-child(2) > img[alt='Galaxy A32']");
    private By modeloAparelho = By.cssSelector(".vtex-store-components-3-x-skuSelectorNameContainer.ma1 > div:nth-child(2) > div[class='vtex-store-components-3-x-skuSelectorItem vtex-store-components-3-x-skuSelectorItem--a32 relative di pointer flex items-center outline-0 ma2']");
    private By corAparelho = By.cssSelector("#sku-selector-model > div > div:nth-child(2) > div > div:nth-child(2) > div:first-child");
    private By memoriaAparelho = By.cssSelector("#sku-selector-model > div > div:nth-child(3) > div > div:nth-child(2) > div");

    //Promoção
    private By promocaoBtn = By.linkText("Promoções");
    private By promocaoValidate = By.cssSelector(".text-block-container__headline");

    //Menu Informatica
    private String informaticaMenuBtn = ("li.samsungbr-samsung-store-0-x-gnb__depth1-menu:nth-child(5)");
    private By numeroDeNotebooks = By.cssSelector("#render-store\\.home > div > div.vtex-store__template.bg-base > div > div:nth-child(3) > div > div:nth-child(2) > section > div.relative.justify-center.flex > div > div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--resultRow > section > div > div:nth-child(2) > div > div:nth-child(1) > div > div > div:nth-child(1) > div > div > div > span");
    private By notebookGamerMenuBtn = By.cssSelector("#render-store\\.home > div > div.vtex-store__template.bg-base > div > div.samsungbr-samsung-store-0-x-gnb > div.samsungbr-samsung-store-0-x-gnb__nav > div > div > div.samsungbr-samsung-store-0-x-gnb__menu-wrap.null > div > div.samsungbr-samsung-store-0-x-gnb__main > ul > li.samsungbr-samsung-store-0-x-gnb__depth1-menu.samsungbr-samsung-store-0-x-has-depth-menu.samsungbr-samsung-store-0-x-active > div > div.samsungbr-samsung-store-0-x-gnb__depth2-inner.samsungbr-samsung-store-0-x-active > ul > li.samsungbr-samsung-store-0-x-gnb__depth2-menu.samsungbr-samsung-store-0-x-has-depth-menu.samsungbr-samsung-store-0-x-active > div > div > ul > li:nth-child(4) > a > span");

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

    public void clickSupportFaleConoscoBtn(){
        driver.findElement(faleConoscoBtn).click();
    }

    //Função para clicar no menu Smartwatches
    public void clickBotaoSmartWatches(){
        driver.findElement(smartWatchesMenuBtn).click();

    }

    public void clickMoreSpecificationBtn(){
        driver.findElement(showMoreSpecificationBtn).click();
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

    public void mouseHoverInformatica(){
        Actions action = new Actions(driver);
        WebElement informaticaMenu = driver.findElement(By.cssSelector(informaticaMenuBtn));
        action.moveToElement(informaticaMenu).build().perform();
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

    public void waitExplicityNotebookGamerMenuBtn(){
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(notebookGamerMenuBtn));

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
