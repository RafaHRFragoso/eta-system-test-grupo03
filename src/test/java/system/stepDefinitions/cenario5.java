package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario5 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @Given("o usuário esta no site")
    public void oUsuárioAcessouOSite() {
        DriverManager.getDriver();
        samsungHomePage.waitImplicity();
        samsungHomePage.closeCookies();
        samsungHomePage.clickPopUp();
    }
    @When("o usuário clica o botão de {string}")
    public void oUsuárioClicaOBotãoDe(String string) {
        samsungHomePage.clickSearchItemBtn();
    }
    @And("o usuário digita o produto {string} e tecla enter")
    public void oUsuárioDigitaProdutoETeclaEnter(String string) throws InterruptedException {
        samsungHomePage.sendTextSearchField();
    }
    @And("o usuário clica geladeira desejada")
    public void oUsuárioClicaGeladeiraDesejada() {
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemGeladeira();
    }
    @And("o usuario escolhe voltagem da geladeira clicando no botão {string}")
    public void oUsuarioEscolheVoltagemDaGeladeiraClicandoNoBotão (String string){
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickVoltage110Btn();

    }
    @And("o usuário adiciona a geladeira clicando no botão {string}")
    public void oUsuárioAdicionaAGeladeiraClicandoNoBotão(String string) {
        samsungHomePage.clickAddCarBtn();
    }
    @And("o usuário remove o item do carrinho clicando no botão {string}")
    public void oUsuárioRemoveOItemDoCarrinhoClicandoNoBotão(String string) {
        samsungHomePage.waitMyCarTextPage();
        samsungHomePage.clickRemoveItemCarBtn();
    }
    @Then("o usuário ver a mensagem de carrinho vazio")
    public void oUsuárioPodeVerAMessagemDeCarrinhoVazio() {
        samsungHomePage.waitEmptyCarMessage();
        samsungHomePage.validatedValueEmptyMyCar();
    }


}
