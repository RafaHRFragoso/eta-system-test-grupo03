package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.helpers.DriverManager;
import system.pages.SamsungHomePage;
import system.pages.TelefoniaPage;

public class cenario8 {

    SamsungHomePage samsungHomePage = new SamsungHomePage();
    TelefoniaPage telefoniaPage = new TelefoniaPage();

    @When("o usuário passa o mouse sobre o menu {string} e depois clica em {string}")
    public void oUsuárioPassaOMouseSobreOMenuEDepoisClicaEm(String string, String string2) {
        samsungHomePage.mouseHover();
        telefoniaPage.clickTelefoniaTitle();
    }
    @And("o ver os itens ordenados por relevância e clica no botão {string}")
    public void oVerOsItensOrdenadosPorRelevânciaEClicaNoBotão(String string) {
        samsungHomePage.closeCookies();
        telefoniaPage.waitOrdenarPorRelevanciaBtn();
        telefoniaPage.clickMaisVendidoOrdemBtn();
    }
    @And("o usuário clica no botão {string}")
    public void oUsuárioClicaNoBotão(String string) {
        telefoniaPage.waitOrdenarPorMaisVendidoText();
    }
    @Then("o usuário ver os produtos ordenados por mais vendidos")
    public void oUsuárioVerOsProdutosOrdenadosPorMaisVendidos() {
        String textOrdenarPorMaisVendido = telefoniaPage.validatedOrdenarPorMaisVendidoText();
        Assertions.assertEquals("ORDENAR POR MAIS VENDIDOS", textOrdenarPorMaisVendido);
    }

}
