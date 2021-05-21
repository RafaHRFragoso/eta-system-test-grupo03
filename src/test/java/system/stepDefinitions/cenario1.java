package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario1 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @Given("o usuário acessou o site")
    public void oUsuárioAcessaOSite() {
        DriverManager.getDriver();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
    }
    @When("o usuário hover o nouse no menu {string}")
    public void oUsuárioHoverONouseNoMenu(String string) {
        samsungHomePage.mouseHover();
        samsungHomePage.waitExplicitySmartWatchesMenuBtn();

    }
    @And("o usuário clica em {string}")
    public void oUsuárioClicaEm(String string) {
        samsungHomePage.clickBotaoSmartWatches();
    }
    @And("o usuário scroll a página até o final")
    public void oUsuárioScrollAPáginaAtéOFinal() {
        samsungHomePage.scrollScreenUntilFooter();
    }
    @Then("o usuário lista os nomes dos Smartwatches e imprime o nomes deles em cada linha")
    public void oUsuárioListaOsNomesDosSmartwatchesEImprimeONomesDelesEmCadaLinha() {
        samsungHomePage.listSmartWatchNames();
    }



}
