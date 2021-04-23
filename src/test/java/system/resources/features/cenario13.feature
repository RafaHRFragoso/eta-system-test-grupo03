#language: en

@cenario13
Feature: Suporte Fale Conosco
  Como um usuário com alguma dúvida ou problema
  Eu quero acessar a área de fale conosco do suporte
  Para buscar informações que solucionem minha dúvida ou probema

  Scenario: Buscar Telefone de Contato do Suporte
    Given o user acessou o site
    When o usuário scroll a página até o rodapé
    And o usuário acessa a tela de Fale Conosco
    Then o usuário será redirecionado para a sessão de fale conosco
    And irá ver as informações de contato de telefone

