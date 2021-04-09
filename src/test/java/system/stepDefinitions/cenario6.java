package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario6 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @Given("o usuario acessa o site")
    public void oUsuarioAcessaOSite() {
        driverManager.getDriver();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
    }
    @When("o usuário hover o nouse no icone do carrinho")
    public void oUsuárioHoverONouseNoIconeDoCarrinho() {
        samsungHomePage.mouseHoverCarIconHomePage();
    }
    /*@And("o usuario ver a mensagem exibida")
    public void oUsuarioVerAMensagemExibida() {
        samsungHomePage.waitEmptyCarMessageHomePage();
    }*/
    @Then("o usuário pode validar a mensagem mostrada")
    public void oUsuárioPodeValidarAMensagemMostrada() {
        samsungHomePage.waitEmptyCarMessageHomePage();
        samsungHomePage.validatedValueEmptyMyCarHomePage();
    }

}
