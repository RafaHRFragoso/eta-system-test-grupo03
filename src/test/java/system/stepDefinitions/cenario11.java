package system.stepDefinitions;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class cenario11 {
    SamsungHomePage samsungHomePage = new SamsungHomePage();
    DriverManager driverManager = new DriverManager();

    @When("o usuário houver o mouse no menu {string}")
    public void oUsuárioHouverOMouseNoMenuInformatica(String string) {
        samsungHomePage.clickPopUp();
        samsungHomePage.closeCookies();
        samsungHomePage.mouseHoverInformatica();
    }
    @When("o user clica no botão {string}")
    public void oUserClicaNobotãoNotebookGamer(String string) {
        samsungHomePage.waitExplicityNotebookGamerMenuBtn();
        samsungHomePage.clickNotebookGamerMenu();
    }
    @Then("exibe o numero de notebooks encontrados")
    public void exibeONumeroDeNotebooksEncontrados() {

        samsungHomePage.imprimeNumeroDeNotebookGamer();
    }

}
