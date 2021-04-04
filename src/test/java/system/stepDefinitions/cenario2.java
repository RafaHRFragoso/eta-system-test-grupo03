package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario2 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @Given("o cliente acessou o site")
    public void oUsuárioAcessouOSite() {
        driverManager.getDriver();
    }
    @When("o cliente hover o nouse no menu {string}")
    public void oClienteHoverONouseNoMenu(String string) {
        samsungHomePage.closeCookies();
        samsungHomePage.clickPopUp();
        samsungHomePage.mouseHover();
        samsungHomePage.waitExplicitySmartWatchesMenuBtn();
    }
    @And("o cliente clica em {string}")
    public void oClienteClicaEm(String string) {
        samsungHomePage.clickBotaoSmartWatches();
    }
    @And("o usuário seleciona o terceiro Smartwatches")
    public void oUsuárioSelecionaOTerceiroSmartwatches() {
        samsungHomePage.closeCookies();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickThirdItem();
    }
    @And("o usuário scroll a tela até o menu Mostrar mais especificações")
    public void oUsuárioScrollATelaAtéOMenuMostrarMaisEspecificações() {
        samsungHomePage.waitImplicitySpecial();
        samsungHomePage.scrollScreenUntilFooter();
        samsungHomePage.waitImplicity();
        samsungHomePage.scrollScreenUntilFooterAndBackUntilElement1();
    }
    @And("o usuário clica em {string} para expandir")
    public void oUsuárioClicaEmParaExpandir(String string) {
        samsungHomePage.waitImplicity();
        samsungHomePage.clickMoreSpecificationBtn();
        samsungHomePage.waitImplicity();
    }
    @Then("o usuário lista as especificações do Smartwatches e imprime elas em cada linha")
    public void oUsuárioListaAsEspecificaçõesDoSmartwatchesEImprimeElasEmCadaLinha() {
        samsungHomePage.listElements1();
    }
}
