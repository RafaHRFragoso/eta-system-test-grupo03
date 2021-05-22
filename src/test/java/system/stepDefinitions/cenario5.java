package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.helpers.DriverManager;
import system.pages.CarrinhoPage;
import system.pages.SamsungHomePage;

public class cenario5 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();

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
        carrinhoPage.clickAddCarBtn();
    }
    @And("o usuário remove o item do carrinho clicando no botão {string}")
    public void oUsuárioRemoveOItemDoCarrinhoClicandoNoBotão(String string) throws InterruptedException {
        carrinhoPage.waitMyCarTextPage();
        carrinhoPage.clickRemoveItemCarBtn();
    }
    @Then("o usuário ver a mensagem de carrinho vazio")
    public void oUsuárioPodeVerAMessagemDeCarrinhoVazio() {
        carrinhoPage.waitEmptyCarMessage();
        String emptyCarMsg = carrinhoPage.validatedValueEmptyMyCar();
        Assertions.assertEquals("Seu carrinho está vazio.", emptyCarMsg);

    }

    @And("o user clica no botao {string}")
    public void oUserClicaNoBotaoVoltar(String string) throws InterruptedException {
        carrinhoPage.clickVoltarBtnCarrinho();
    }
    @And("o user houver o mouse no {string}")
    public void oUserHouverOMouseNoIconeDoCarrinho(String string) throws InterruptedException {
        carrinhoPage.mouseHoverCarIconHomePage();
    }
    @And("o user clica no botao {string} do carrinho")
    public void oUserClicaNoBotaoExcluirDoCarrinho(String string) {
        carrinhoPage.clickRemoveBtn();
    }
    @Then("o user valida a mensagem de carrinho vazio")
    public void oUserValidaAMensagemDeCarrinhoVazio() {
        String emptyCarMsgHomepage = carrinhoPage.validatedValueEmptyMyCarHomePage();
        Assertions.assertEquals("Teu carrinho está vazio", emptyCarMsgHomepage);

    }

}
