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

    @And("o usuário seleciona o terceiro Smartwatches")
    public void oUsuárioSelecionaOTerceiroSmartwatches() {
        samsungHomePage.closeCookies();
        samsungHomePage.clickThirdItem();
    }
    @And("o usuário scroll a tela até o menu Mostrar mais especificações")
    public void oUsuárioScrollATelaAtéOMenuMostrarMaisEspecificações() {
        samsungHomePage.scrollScreenUntilFooter();
        samsungHomePage.scrollScreenUntilFooterAndBackUntilElement();
    }
    @And("o usuário clica em {string} para expandir")
    public void oUsuárioClicaEmParaExpandir(String string) {
        samsungHomePage.clickMoreSpecificationBtn();

    }
    @Then("o usuário lista as especificações do Smartwatches e imprime elas em cada linha")
    public void oUsuárioListaAsEspecificaçõesDoSmartwatchesEImprimeElasEmCadaLinha() {
        samsungHomePage.listEspecificacoes();
    }
}
