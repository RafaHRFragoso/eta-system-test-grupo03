package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.helpers.DriverManager;
import system.pages.CarrinhoPage;
import system.pages.SamsungHomePage;

public class cenario4 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();

    @When("o usuário clica no botão de {string}")
    public void oUsuárioClicaNoBotãoDe(String string) {
        samsungHomePage.clickSearchItemBtn();
    }
    @And("o usuário digita o nome {string} e tecla enter")
    public void oUsuárioDigitaONomeETeclaEnter(String string) throws InterruptedException {
        samsungHomePage.sendTextSearchField(string);
    }
    @And("o usuário clica na geladeira desejada")
    public void oUsuárioClicaNaGeladeiraDesejada() {
        samsungHomePage.waitExplicityShowFirstItem();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemGeladeira();
    }
    @And("o usuario escolhe a voltagem da geladeira clicando no botão {string}")
    public void oUsuarioEscolheAVoltagemDaGeladeiraClicandoNoBotão(String string) {
        carrinhoPage.waitExplicityCar();
        samsungHomePage.clickVoltage110Btn();

    }

    @Then("o usuário ver o seu item dentro do carinho")
    public void oUsuárioVerOSeiItemDentroDoCarinho() {
        carrinhoPage.waitMyCarTextPage();
        String myCarMsg = carrinhoPage.getMsgMyCarText();
        Assertions.assertEquals("Meu carrinho", myCarMsg);
    }

    @And("o usuário clica no aparelho desejado")
    public void oUsuárioClicaNoAparelhoDesejado() {
        samsungHomePage.waitExplicityShowFirstSmart();
        samsungHomePage.closeCookies();
        samsungHomePage.clickItemAparelho();
    }

    @When("o usuário escolhe o modelo clicando no botão {string}")
    public void oUsuárioEscolheOModeloClicandoNoBotão(String string) {
        samsungHomePage.clickModeloA32GBtn();
    }

    @When("o usuário escolhe a cor clicando no botão {string}")
    public void oUsuárioEscolheACorClicandoNoBotão(String string) {
        samsungHomePage.clickCorAparelhoBtn();

    }
    @When("o usuário escolhe a memoria clicando no botão {string}")
    public void oUsuárioEscolheAMemoriaClicandoNoBotão(String string) {
        carrinhoPage.waitExplicityCar();
        samsungHomePage.clickMemoriaAparelhoBtn();

    }

    @When("o usuário adiciona o aparelho clicando no botão {string}")
    public void oUsuárioAdicionaOAparelhoClicandoNoBotão(String string) {
        carrinhoPage.waitExplicityCar();
        carrinhoPage.clickAddCarBtn();

    }
}
