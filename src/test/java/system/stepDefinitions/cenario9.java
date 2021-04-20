package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario9 {
    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @Given("o user acessa o site")
    public void oUserAcessaOSite() {
        DriverManager.getDriver();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
    }
    @When("o user clica no botão de {string}")
    public void oUserClicaNoNotaoDePesquisa(String string) {
        samsungHomePage.clickSearchItemBtn();
    }
    @When("o user digita o nome {string} e tecla enter")
    public void oUserDigitaONomeETeclaEnter(String string) throws InterruptedException {
        samsungHomePage.sendTextSearchField();
    }
    @When("o usuário clica no botao comprar geladeira desejada")
    public void oUsuárioClicaNoBotaoComprarGeladeiraDesejada() {
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.clickComprarGeladeira();
    }
    @When("o user escolhe a voltagem da geladeira clicando no botão {string}")
    public void oUserEscolheAVoltagemDaGeladeiraClicandoNoBotão(String string) {
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickVoltage110Btn();
    }
    @When("o user adiciona a geladeira clicando no botão {string}")
    public void oUserAdicionaAGeladeiraClicandoNoBotão(String string) {
         samsungHomePage.clickAddCarBtn();
    }
    @When("o user clica no botao {string}")
    public void oUserClicaNoBotaoVoltar(String string) {
        samsungHomePage.clickVoltarBtnCarrinho();
    }
    @When("o user houver o mouse no {string}")
    public void oUserHouverOMouseNoIconeDoCarrinho(String string) {
        samsungHomePage.mouseHoverCarIconHomePage();
    }
    @When("o user clica no botao {string} do carrinho")
    public void oUserClicaNoBotaoExcluirDoCarrinho(String string) {
        samsungHomePage.clickRemoveBtn();
    }
    @Then("o user valida a mensagem de carrinho vazio")
    public void oUserValidaAMensagemDeCarrinhoVazio() {
        samsungHomePage.validatedValueEmptyMyCarHomePage();
    }

}
