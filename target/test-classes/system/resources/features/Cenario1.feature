#language: en

  @cenario1
  Feature: Smartwatches nomes
    Como usuário potencial
    Eu quero imprimir os nomes dos smartphones selecionados
    Para que eu possa ver os nomes dos Smartwatches

  Scenario: Imprimir os nomes dos Smartwatches
    Given o usuário acessou o site
    When o usuário hover o nouse no menu "Telefonia"
    And o usuário clica em "Smartwatches"
    And o usuário scroll a página até o final
    Then o usuário lista os nomes dos Smartwatches e imprime o nomes deles em cada linha



