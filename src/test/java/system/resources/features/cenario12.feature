#language: en

@cenario12
Feature: Adicionar item no carrinho
  Como usuário potencial
  Eu quero adicionar um item no carrinho
  Para que eu possa ver o meu produto no carrinho

  Scenario: Adicionar item no carrinho
    Given o usuário acessa o site
    When o usuário clica no botão de "Pesquisar"
    And o usuário digita o nome "Galaxy A72 Preto 128GB" e tecla enter
    And o usuário clica no aparelho desejado
    And o usuário escolhe o modelo clicando no botão "A32"
    And o usuário escolhe a cor clicando no botão "PRETO"
    And o usuário escolhe a memoria clicando no botão "128 GB"
    And o usuário adiciona o aparelho clicando no botão "ADICIONAR AO CARRINHO"
    Then o usuário vê o seu item dentro do carrinho