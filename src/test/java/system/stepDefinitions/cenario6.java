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

    @When("o usuário hover o nouse no icone do carrinho")
    public void oUsuárioHoverONouseNoIconeDoCarrinho() throws InterruptedException {
        samsungHomePage.mouseHoverCarIconHomePage();
    }

    @Then("o usuário pode validar a mensagem mostrada")
    public void oUsuárioPodeValidarAMensagemMostrada() {
        samsungHomePage.waitEmptyCarMessageHomePage();
        samsungHomePage.validatedValueEmptyMyCarHomePage();
    }

}
