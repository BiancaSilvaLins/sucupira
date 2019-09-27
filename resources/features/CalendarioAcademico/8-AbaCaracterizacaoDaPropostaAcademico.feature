@8AbaCaracterizacaoDaProposta
Feature: Preenche Dados da aba de Caracterizacao da Proposta

  Scenario Outline: Preencher dados da aba Caracterizacao da Proposta Academica
    Given estou na aba de Caracterizacao da Proposta Academica
    And preencho o campo Contextualizacao Institucional e Regional da Proposta "<contextualizacao>"
    And preencho o campo Historico do Curso "<historicoCurso>"
    And preencho o campo Cooperacao e Intercambio "<cooperacaoIntercambio>"
    Then clico no botao Avancar

    Examples:
      |contextualizacao        |historicoCurso          |cooperacaoIntercambio   |
      |Teste Automatizado 2019 |Teste Automatizado 2019 |Teste Automatizado 2019 |