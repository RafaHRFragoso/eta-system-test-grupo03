#language: en

@cenario7
Feature: Verificar mensagem Cartão Samsung Itaucard
  Como usuário potencial
  Eu quero validar a mensagem exibida sobre o cartão itaú

  Scenario: Validar se a mensagem Cartão Samsung Itaucard será mostrada
    Given o usuário acessou o site
    When o cliente clica no botão "SAMSUNG ITAUCARD"
    And o clica em "Peça o Seu"
    Then o cliente valida a mensagem mostrada