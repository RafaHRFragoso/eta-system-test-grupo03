package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;

public class cenario3 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @When("o usuário scroll a página até o rodapé")
    public void oUsuárioScrollAPáginaAtéORodapé() {
         samsungHomePage.scrollScreenUntilFooter();
    }
    @And("o usuário clica em {string} na seção de suporte")
    public void oUsuárioClicaEmNaSeçãoDeSuporte(String string) {
        samsungHomePage.closeCookies();
        samsungHomePage.clickServiceCenterBtn();
    }
    @And("o usuário scroll a tela até a seção Encontre nossos serviços de suporte")
    public void oUsuárioScrollATelaAtéASeçãoEncontreNossosServiçosDeSuporte() {
        samsungHomePage.scrollUntilElement();
        samsungHomePage.clickMobileMenuBtn();
    }
    @And("o usuário clica em {string} na lista de menu")
    public void oUsuárioClicaEmNaListaDeMenu(String string) {
        samsungHomePage.clickMobileMenuBtn();
    }
    @And("o usuário encontra Procurar um local campo e enviar o CEP {string}")
    public void oUsuárioEncontraProcurarUmLocalCampoEEnviarOCEP(String string) {
        samsungHomePage.sendTextSearchItem();
    }
    @And("o usuário seleciona o botão {string}")
    public void oUsuárioSelecionaOBotão(String string) {

        samsungHomePage.clickKmBtn20Km();
    }
    @Then("o usuário imprime as informações do centro de serviço encontrado")
    public void oUsuárioImprimeAsInformaçõesDoCentroDeServiçoEncontrado() {
        samsungHomePage.listGroupService();
    }

}
