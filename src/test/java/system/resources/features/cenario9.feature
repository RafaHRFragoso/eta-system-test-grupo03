#language: en

@cenario9
Feature: Excluir geladeira no carrinho na home page
  Como usuário potencial
  Eu quero adicionar um item no carrinho
  Para que eu possa remover o meu produto no carrinho da home page

  Scenario: Excluir geladeira no carrinho na home page
    Given o user acessa o site
    When o user clica no botão de "Pesquisar"
    And o user digita o nome "Geladeira" e tecla enter
    And o usuário clica no botao comprar geladeira desejada
    And o user escolhe a voltagem da geladeira clicando no botão "110 V"
    And o user adiciona a geladeira clicando no botão "ADICIONAR AO CARRINHO"
    And o user clica no botao "Voltar"
    And o user houver o mouse no "Carrinho"
    And o user clica no botao "Excluir" do carrinho
    Then o user valida a mensagem de carrinho vazio

