package system.stepDefinitions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;
import system.pages.URL;

public class Main {

    private WebDriver driver;
    private WebDriverWait wait;
    private SamsungHomePage samsungHomePage;
    //private DriverManager driverManager = new DriverManager();
    //private DriverManager driverManager;

    @Test
    @Disabled
    void cenario1() {
        //driverManager.getDriver();
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.mouseHover();
        samsungHomePage.waitExplicitySmartWatchesMenuBtn();
        samsungHomePage.clickBotaoSmartWatches();
        samsungHomePage.waitImplicity();
        samsungHomePage.closeCookies();
        samsungHomePage.scrollScreenUntilFooter();
        samsungHomePage.waitImplicity();
        samsungHomePage.listElements();
        DriverManager.endSession();

    }
    @Test
    @Disabled
    void cenario2() {
       // driverManager.getDriver();
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.closeCookies();
        samsungHomePage.clickPopUp();
        samsungHomePage.mouseHover();
        samsungHomePage.waitExplicitySmartWatchesMenuBtn();
        samsungHomePage.clickBotaoSmartWatches();
        samsungHomePage.closeCookies();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickThirdItem();
        samsungHomePage.waitImplicitySpecial();
        samsungHomePage.scrollScreenUntilFooter();
        samsungHomePage.waitImplicity();
        samsungHomePage.scrollScreenUntilFooterAndBackUntilElement1();
        samsungHomePage.clickMoreSpecificationBtn();
        samsungHomePage.waitImplicity();
        samsungHomePage.listElements1();
        DriverManager.endSession();
    }
    @Test
    public void cenario3(){
        //driverManager.getDriver();
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.scrollScreenUntilFooter();
        samsungHomePage.closeCookies();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickServiceCenterBtn();
        samsungHomePage.waitImplicity();
        samsungHomePage.scrollUntilElement();
        samsungHomePage.clickMobileMenuBtn();
        samsungHomePage.waitImplicity();
        samsungHomePage.sendTextSearchItem();
        samsungHomePage.clickKmBtn20Km();
        samsungHomePage.listElements2();
        DriverManager.endSession();

    }

    @Test
    public void cenario4() throws InterruptedException {
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.clickSearchItemBtn();
        samsungHomePage.sendTextSearchField();
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemGeladeira();
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickVoltage110Btn();
        samsungHomePage.clickAddCarBtn();
        samsungHomePage.waitMyCarTextPage();
        samsungHomePage.validatedMsgMyCarText();
        DriverManager.endSession();

    }

    @Test
    @Disabled
    public void cenario5() throws InterruptedException {
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.closeCookies();
        samsungHomePage.clickPopUp();
        samsungHomePage.clickSearchItemBtn();
        samsungHomePage.sendTextSearchField();
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemGeladeira();
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickVoltage110Btn();
        samsungHomePage.clickAddCarBtn();
        samsungHomePage.waitMyCarTextPage();
        samsungHomePage.clickRemoveItemCarBtn();
        samsungHomePage.waitEmptyCarMessage();
        samsungHomePage.validatedValueEmptyMyCar();
        DriverManager.endSession();

    }
    @Test
    public void cenario6(){
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.mouseHoverCarIconHomePage();
        samsungHomePage.waitEmptyCarMessageHomePage();
        samsungHomePage.validatedValueEmptyMyCarHomePage();
        DriverManager.endSession();
    }
    @Test
    public void cenario7(){
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItauCardBtn();
        samsungHomePage.waitPecaOSeuBtn();
        samsungHomePage.waitImplicity();
        samsungHomePage.validatedCartaoSamsungItaucardText();
        DriverManager.endSession();
    }
    @Test
    public void cenario8(){
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.mouseHover();
        samsungHomePage.clickTelefoniaTitle();
        samsungHomePage.closeCookies();
        samsungHomePage.waitOrdenarPorRelevanciaBtn();
        samsungHomePage.clickMaisVendidoOrdemBtn();
        samsungHomePage.waitOrdenarPorMaisVendidoText();
        samsungHomePage.validatedOrdenarPorMaisVendidoText();
        DriverManager.endSession();

    }

    @Test
    public void cenario9() throws InterruptedException {
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.clickSearchItemBtn();
        samsungHomePage.sendTextSearchField();
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.clickComprarGeladeira();
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickVoltage110Btn();
        samsungHomePage.clickAddCarBtn();
        samsungHomePage.clickVoltarBtnCarrinho();
        samsungHomePage.mouseHoverCarIconHomePage();
        samsungHomePage.clickRemoveBtn();
        samsungHomePage.validatedValueEmptyMyCarHomePage();
        DriverManager.endSession();

    }

    @Test
    public void cenario10(){
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.scrollScreenUntilFooter();
        samsungHomePage.clickPromocao();
        samsungHomePage.validatePagePromocoes();
        DriverManager.endSession();

    }

    @Test
    public void cenario11(){
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.mouseHoverInformatica();
        samsungHomePage.waitExplicityNotebookGamerMenuBtn();
        samsungHomePage.clickNotebookGamerMenu();
        samsungHomePage.imprimeNumeroDeNotebookGamer();
        DriverManager.endSession();

    }

}
