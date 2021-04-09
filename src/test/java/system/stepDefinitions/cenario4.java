package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario4 {

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
    @And("o usuário clica na geladeira desejada")
    public void oUsuárioClicaNaGeladeiraDesejada() {
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemGeladeira();
    }
    @And("o usuario escolhe a voltagem da geladeira clicando no botão {string}")
    public void oUsuarioEscolheAVoltagemDaGeladeiraClicandoNoBotão(String string) {
        samsungHomePage.waitExplicityCar();
        samsungHomePage.clickVoltage110Btn();
        samsungHomePage.clickAddCarBtn();
    }

    @Then("o usuário ver o sei item dentro do carinho")
    public void oUsuárioVerOSeiItemDentroDoCarinho() {
        samsungHomePage.waitMyCarTextPage();
        samsungHomePage.validatedMsgMyCarText();
    }
}
