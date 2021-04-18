#language: en

@cenario5
Feature: Remove item carrinho
  Como usuário potencial
  Eu quero remover um item do carrinho
  Para que eu possa ver a mensagem mostrada

  Scenario: Remover item do carrinho
    Given o usuário acessa o site
    When o usuário clica o botão de "Pesquisar"
    And o usuário digita o produto "Geladeira" e tecla enter
    And o usuário clica geladeira desejada
    And o usuario escolhe voltagem da geladeira clicando no botão "110 V"
    And o usuário adiciona a geladeira clicando no botão "ADICIONAR AO CARRINHO"
    And o usuário remove o item do carrinho clicando no botão "Remover"
    Then o usuário ver a mensagem de carrinho vazio