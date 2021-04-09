#language: en

@cenario6
Feature: Validar carrinho mensagem
  Como usuário potencial
  Eu quero validar a mensagem exibida no pop-up do carrinho
  Para que eu possa ter certeza da mensagem mostrada

  Scenario: Validar mensagem carrinho página inicial
    Given o usuario acessa o site
    When o usuário hover o nouse no icone do carrinho
    #And o usuario ver a mensagem exibida
    Then o usuário pode validar a mensagem mostrada