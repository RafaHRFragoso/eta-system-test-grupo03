package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario8 {
    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @Given("o usuário esta no site")
    public void oUsuárioEstaNoSite() {
        DriverManager.getDriver();
        samsungHomePage = new SamsungHomePage();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();

    }
    @When("o usuário passa o mouse sobre o menu {string} e depois clica em {string}")
    public void oUsuárioPassaOMouseSobreOMenuEDepoisClicaEm(String string, String string2) {
        samsungHomePage.mouseHover();
        samsungHomePage.clickTelefoniaTitle();
    }
    @And("o ver os itens ordenados por relevância e clica no botão {string}")
    public void oVerOsItensOrdenadosPorRelevânciaEClicaNoBotão(String string) {
        samsungHomePage.closeCookies();
        samsungHomePage.waitOrdenarPorRelevanciaBtn();
        samsungHomePage.clickMaisVendidoOrdemBtn();
    }
    @And("o usuário clica no botão {string}")
    public void oUsuárioClicaNoBotão(String string) {
        samsungHomePage.waitOrdenarPorMaisVendidoText();
    }
    @Then("o usuário ver os produtos ordenados por mais vendidos")
    public void oUsuárioVerOsProdutosOrdenadosPorMaisVendidos() {
        samsungHomePage.validatedOrdenarPorMaisVendidoText();
    }

}
