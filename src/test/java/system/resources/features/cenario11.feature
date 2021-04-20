#language: en

@cenario11
Feature:
  Como usuário potencial
  Eu quero acessar a pagina de Notebooks gamer
  Para que eu possa ver a quantidade de notebooks

  Scenario: Exibir numero de notebooks gamer
    Given o user acessou no site"
    When o usuário houver o mouse no menu "Informatica"
    And  o user clica no botão "Notebook Gamer"
    Then exibe o numero de notebooks encontrados