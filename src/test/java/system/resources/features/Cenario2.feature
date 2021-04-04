#language: en

@cenario2
Feature: Mostrar as especificações do terceiro Smartwatches
  Como usuário potencial
  Eu quero imprimir as especificações do terceiro Smartwatches selecionados
  Para que eu possa ver as especificações do Smartwatches

  Scenario: Imprimir as especificações do terceiro Smartwatches selecionado
    Given o usuário acessou o site
    When o usuário hover o nouse no menu "Telefonia"
    And o usuário clica em "Smartwatches"
    And o usuário seleciona o terceiro Smartwatches
    And o usuário scroll a tela até o menu Mostrar mais especificações
    And o usuário clica em "Mostrar mais especficiações" para expandir
    Then o usuário lista as especificações do Smartwatches e imprime elas em cada linha
