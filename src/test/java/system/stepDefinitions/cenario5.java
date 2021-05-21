package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario5 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @When("o usuário clica o botão de {string}")
    public void oUsuárioClicaOBotãoDe(String string) {

        samsungHomePage.clickSearchItemBtn();
    }

    @And("o usuário clica geladeira desejada")
    public void oUsuárioClicaGeladeiraDesejada() {
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemGeladeira();
    }

    @And("o usuário adiciona a geladeira clicando no botão {string}")
    public void oUsuárioAdicionaAGeladeiraClicandoNoBotão(String string) {

        samsungHomePage.clickAddCarBtn();
    }
    @And("o usuário remove o item do carrinho clicando no botão {string}")
    public void oUsuárioRemoveOItemDoCarrinhoClicandoNoBotão(String string) throws InterruptedException {
        samsungHomePage.waitMyCarTextPage();
        samsungHomePage.clickRemoveItemCarBtn();
    }
    @Then("o usuário ver a mensagem de carrinho vazio")
    public void oUsuárioPodeVerAMessagemDeCarrinhoVazio() {
        samsungHomePage.waitEmptyCarMessage();
        String emptyCarMsg = samsungHomePage.validatedValueEmptyMyCar();
        Assertions.assertEquals("Seu carrinho está vazio.", emptyCarMsg);

    }

    @And("o user clica no botao {string}")
    public void oUserClicaNoBotaoVoltar(String string) throws InterruptedException {
        samsungHomePage.clickVoltarBtnCarrinho();
    }
    @And("o user houver o mouse no {string}")
    public void oUserHouverOMouseNoIconeDoCarrinho(String string) throws InterruptedException {
        samsungHomePage.mouseHoverCarIconHomePage();
    }
    @And("o user clica no botao {string} do carrinho")
    public void oUserClicaNoBotaoExcluirDoCarrinho(String string) {
         samsungHomePage.clickRemoveBtn();
    }
    @Then("o user valida a mensagem de carrinho vazio")
    public void oUserValidaAMensagemDeCarrinhoVazio() {
        String emptyCarMsgHomepage = samsungHomePage.validatedValueEmptyMyCarHomePage();
        Assertions.assertEquals("Teu carrinho está vazio", emptyCarMsgHomepage);

    }

}
