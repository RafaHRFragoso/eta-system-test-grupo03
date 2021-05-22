package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.CarrinhoPage;
import system.pages.SamsungHomePage;

public class cenario6 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();

    @When("o usuário hover o nouse no icone do carrinho")
    public void oUsuárioHoverONouseNoIconeDoCarrinho() throws InterruptedException {
        carrinhoPage.mouseHoverCarIconHomePage();
    }

    @Then("o usuário pode validar a mensagem mostrada")
    public void oUsuárioPodeValidarAMensagemMostrada() {
        carrinhoPage.waitEmptyCarMessageHomePage();
        carrinhoPage.validatedValueEmptyMyCarHomePage();
    }

}
