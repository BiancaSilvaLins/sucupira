@9AbaAreasDeConcentracaoLinhasPesquisa
Feature: Preenche Dados da aba de Areas de Concentracao e Linhas de Pesquisa

  Scenario Outline: Preencher dados de Areas de Concentracao Academica
    Given estou na aba de Areas de Concentracao e Linhas de Pesquisa Academica
    And preencho o campo nome da area "<nomeArea>"
    When preencho o campo descricao da area "<descricaoArea>"
    Then clico no botao Inserir Area


    Examples:
      |nomeArea                 |descricaoArea            |
      |Teste Automatizado 2019! |Teste Automatizado 2019! |


  Scenario Outline: Preencher dados de Linhas de Pesquisa Academica
    Given estou na aba de Areas de Concentracao e Linhas de Pesquisa Academica
    And preencho o campo nome da linha de pesquisa "<nomeLinha>"
    And seleciono a area de concentracao "<areaConcentracao>"
    When preencho o campo descricao da linha de pesquisa "<descricaoLinha>"
    Then clico no botao Inserir Linha

    Examples:
    |nomeLinha                |areaConcentracao         | descricaoLinha         |
    |Teste Automatizado 2019! |Teste Automatizado 2019! |Teste Automatizado 2019 |