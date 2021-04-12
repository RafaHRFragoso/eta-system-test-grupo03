package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario7 {

    DriverManager driverManager = new DriverManager();
    SamsungHomePage samsungHomePage = new SamsungHomePage();

    @Given("o usuário acessou a pagina")
    public void oUsuárioAcessouAPagina() {
        DriverManager.getDriver();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickPopUp();
    }

    @When("o cliente clica no botão {string}")
    public void oClienteClicaNoBotão(String string) {
        samsungHomePage.clickItauCardBtn();
    }

    @And("o clica em {string}")
    public void oClicaEm(String string) {
        samsungHomePage.waitPecaOSeuBtn();
        samsungHomePage.waitImplicity();
    }

    @Then("o cliente valida a mensagem mostrada")
    public void oClienteValidaAMensagemMostrada() {
        samsungHomePage.validatedCartaoSamsungItaucardText();
    }

}
