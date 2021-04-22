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

    @Given("o usuário acessa o site")
    public void oUsuárioAcessaOSite() {
        DriverManager.getDriver();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
    }
    @When("o usuário clica no botão de {string}")
    public void oUsuárioClicaNoBotãoDe(String string) {
        samsungHomePage.clickSearchItemBtn();
    }
    @And("o usuário digita o nome {string} e tecla enter")
    public void oUsuárioDigitaONomeETeclaEnter(String string) throws InterruptedException {
        samsungHomePage.sendTextSearchField();
    }
    @And("o usuário clica no aparelho desejado")
    public void oUsuárioClicaNoAparelhoDesejado() {
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemAparelho();
    }
    @And("o usuario escolhe o modelo clicando no botão {string}")
    public void oUsuarioEscolheOModeloDoAparelhoClicandoNoBotão(String string) {
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickModeloA32GBtn();
    }

    @And("o usuario escolhe a cor clicando no botão {string}")
    public void oUsuarioEscolheACorClicandoNoBotão(String string) {
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickCorAparelhoBtn();

    }

    @And("o usuario escolhe a memoria clicando no botão {string}")
    public void oUsuarioEscolheAMemoriaClicandoNoBotão(String string) {
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickMemoriaAparelhoBtn();
        samsungHomePage.clickAddCarBtn();
    }

    @Then("o usuário vê o seu item dentro do carrinho")
    public void oUsuárioVerOSeiItemDentroDoCarinho() {
        samsungHomePage.waitMyCarTextPage();
        samsungHomePage.validatedMsgMyCarText();
    }
}


