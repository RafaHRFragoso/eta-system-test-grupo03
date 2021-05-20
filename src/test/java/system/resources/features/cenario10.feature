#language: en

@cenario10
Feature: Acessar promocao
  Como usuário potencial
  Eu quero acessar a pagina de Promoções
  Para que eu possa ver as promoções

  Scenario: Validar estar na pagina de promoções
    Given o usuário acessou o site
    When o usuário scroll a página até o final
    And  o usuario clica no botão "Promocões"
    Then o usuário valida estar na pagina de promocoes