@3PaginaDeAcesso
Feature: Preenche Dados da Pagina de acesso

  Scenario Outline: Preencher dados da pagina de acesso
    Given estou na pagina de acesso academico
    And preencho os campos login academico "<login>" e senha "<senha>" para acesso
    When clico no botao de Login academico
    Then sou direcionado a pagina de Minhas Propostas academicas

    Examples:
      |login       |senha    |
      |80732810400 |sucup1r4 |