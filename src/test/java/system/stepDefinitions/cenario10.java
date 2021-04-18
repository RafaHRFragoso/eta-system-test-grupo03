package system.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.pages.SamsungHomePage;

public class cenario10 {
    SamsungHomePage samsungHomePage = new SamsungHomePage();

    @Given("o usuário acesso o site")
    public void oUsuárioAcessoOSite() {
    }
    @When("o usuário scroll a página")
    public void oUsuárioScrollAPáginal() {
    }
    @And("o usuario clica no botão {string}")
    public void o_usuario_clica_no_botão(String string) {
        samsungHomePage.closeCookies();
        samsungHomePage.clickPromocao();
    }
    @Then("o usuário valida estar na pagina de promocoes")
    public void o_usuário_valida_estar_na_pagina_de_promocoes() {
        samsungHomePage.validatePagePromocoes();


    }
}