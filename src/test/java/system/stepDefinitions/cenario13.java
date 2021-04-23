package system.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario13 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();


    @When("o usuário acessa a tela de Fale Conosco")
    public void oUsuárioAcessaATelaDeFaleConosco() {
        samsungHomePage.closeCookies();
        samsungHomePage.waitImplicity();
        samsungHomePage.clickSupportFaleConoscoBtn();
    }

    @Then("o usuário será redirecionado para a sessão de fale conosco")
    public void oUsuárioSeráRedirecionadoParaASessãoDeFaleConosco() {
        samsungHomePage.validatePageTitle("contact | Samsung Brasil");
        samsungHomePage.validateTitleContactSession();
    }
    @Then("irá ver as informações de contato de telefone")
    public void iráVerAsInformaçõesDeContatoDeTelefone() {
        samsungHomePage.getCardContactInfos();
    }


}

