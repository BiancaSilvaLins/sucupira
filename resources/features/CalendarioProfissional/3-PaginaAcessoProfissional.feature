@PaginaDeAcesso
Feature: Preenche Dados da Pagina de acesso

  Scenario Outline: Preencher dados da pagina de acesso
    Given estou na pagina de acesso
    And preencho os campos login "<login>" e senha "<senha>" para acesso
    When clico no botao de Login
    Then sou direcionado a pagina de Minhas Propostas

    Examples:
      | login       | senha   |
      | 80732810400 |sucup1r4 |