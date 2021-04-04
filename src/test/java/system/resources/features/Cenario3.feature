#language: en

@cenario3
Feature: Mostrar os centros de serviços autorizados
  Como usuário potencial
  Eu quero imprimir as especificações do terceiro Smartwatches selecionados
  Para que eu possa ver as especificações do Smartwatches

  Scenario: Imprimir as informações sobre os centros de serviços autorizados
    Given o user acessou o site
    When o usuário scroll a página até o rodapé
    And o usuário clica em "Centro de Serviços" na seção de suporte
    And o usuário scroll a tela até a seção Encontre nossos serviços de suporte
    And o usuário clica em "Mobile" na lista de menu
    And o usuário encontra Procurar um local campo e enviar o CEP "51010-000"
    And o usuário seleciona o botão "20 KM"
    Then o usuário imprime as informações do centro de serviço encontrado