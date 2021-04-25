package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario12 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();


    @And("o usuário clica no aparelho desejado")
    public void oUsuárioClicaNoAparelhoDesejado() {
        samsungHomePage.waitExplicityShowFirstSmart();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemAparelho();
    }

    @When("o usuário escolhe o modelo clicando no botão {string}")
    public void oUsuárioEscolheOModeloClicandoNoBotão(String string) {

        samsungHomePage.clickModeloA32GBtn();
    }

    @When("o usuário escolhe a cor clicando no botão {string}")
    public void oUsuárioEscolheACorClicandoNoBotão(String string) {
        samsungHomePage.clickCorAparelhoBtn();

    }
    @When("o usuário escolhe a memoria clicando no botão {string}")
    public void oUsuárioEscolheAMemoriaClicandoNoBotão(String string) {
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickMemoriaAparelhoBtn();

    }

    @When("o usuário adiciona o aparelho clicando no botão {string}")
    public void oUsuárioAdicionaOAparelhoClicandoNoBotão(String string) {
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickAddCarrinhoBtn();

    }

    @Then("o usuário vê o seu item dentro do carrinho")
    public void oUsuárioVerOSeiItemDentroDoCarinho() {
        samsungHomePage.waitMyCarTextPage();
        samsungHomePage.validatedMsgMyCarText();
    }
}



