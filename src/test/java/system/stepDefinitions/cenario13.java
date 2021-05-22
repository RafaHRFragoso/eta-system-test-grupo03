package system.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario13 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();

    @When("o usuário acessa a tela de Fale Conosco")
    public void oUsuárioAcessaATelaDeFaleConosco() {
        samsungHomePage.closeCookies();
        samsungHomePage.clickSupportFaleConoscoBtn();
    }

    @Then("o usuário será redirecionado para a sessão de fale conosco")
    public void oUsuárioSeráRedirecionadoParaASessãoDeFaleConosco() {
        String actualTitle = samsungHomePage.getTitle();
        String expectedTitle = "Contato | Samsung Brasil";
        Assertions.assertEquals(expectedTitle,actualTitle);

        String contactSession = samsungHomePage.getTitleContactSession();
        Assertions.assertEquals("Canais de contato",contactSession);
    }

    @Then("irá ver as informações de contato de telefone")
    public void iráVerAsInformaçõesDeContatoDeTelefone() {
         samsungHomePage.getCardContactInfos();
    }


}

