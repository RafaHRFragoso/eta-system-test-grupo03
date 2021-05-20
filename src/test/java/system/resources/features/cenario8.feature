#language: en

@cenario8
Feature: Produto mais vendidos de telefonia
  Eu como usuário potêncial
  quero poder ordernar os produtos de telefonia desejado por mais vendidos
  para que eu possa ver a lista dos produtos mais vendidos

  Scenario: Ordernar produto de telefonia por mais vendidos
    Given o usuário acessou o site
    When o usuário passa o mouse sobre o menu "Telefonia" e depois clica em "Telefonia"
    And o ver os itens ordenados por relevância e clica no botão "ORDENAR POR RELEVÂNCIA"
    And o usuário clica no botão "Mais vendidos"
    Then o usuário ver os produtos ordenados por mais vendidos