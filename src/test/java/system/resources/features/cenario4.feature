#language: en

@cenario4
Feature: Adicionar item no carrinho
  Como usuário potencial
  Eu quero adicionar um item no carrinho
  Para que eu possa ver o meu produto no carrinho

  Scenario: Adicionar item no carrinho
    Given o usuário acessa o site
    When o usuário clica no botão de "Pesquisar"
    And o usuário digita o nome "Geladeira" e tecla enter
    And o usuário clica na geladeira desejada
    And o usuario escolhe a voltagem da geladeira clicando no botão "110 V"
    And o usuário adiciona a geladeira clicando no botão "ADICIONAR AO CARRINHO"
    Then o usuário ver o seu item dentro do carinho