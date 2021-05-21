package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario7 {

    DriverManager driverManager = new DriverManager();
    SamsungHomePage samsungHomePage = new SamsungHomePage();

    @When("o cliente clica no botão {string}")
    public void oClienteClicaNoBotão(String string) {

        samsungHomePage.clickItauCardBtn();
    }

    @And("o clica em {string}")
    public void oClicaEm(String string) {
        samsungHomePage.waitPecaOSeuBtn();
    }

    @Then("o cliente valida a mensagem mostrada")
    public void oClienteValidaAMensagemMostrada() {
        String msgCartaoSamsungItauCard = samsungHomePage.validatedCartaoSamsungItaucardText();
        Assertions.assertEquals("Cartão Samsung Itaucard", msgCartaoSamsungItauCard);
    }

}
