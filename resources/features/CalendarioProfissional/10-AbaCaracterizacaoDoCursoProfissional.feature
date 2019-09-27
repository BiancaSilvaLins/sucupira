@CaracterizacaoDoCursoProfissional
Feature: Caracterizacao do Curso Profissional

  Scenario Outline: Preencher o detalhamento do curso de Mestrado Profissional
    Given que estou na tela Caracterizacao do Curso Profissional
    And clico na opcao Mestrado Profissional
    And Preencho o campo nome Mestrado "<nome>"
    And Seleciono a Periodicidade da Selecao Mestrado"<periodicidade>"
    And Preencho o campo Objetivo do curso Mestrado "<objetivoCurso>"
    And Preencho as horas da disciplina Mestrado"<disciplina>"
    And Preencho as horas da tese Mestrado"<tese>"
    And Preencho o numero da vagas Mestrado"<vagas>"
    And Preencho as horas de equivalencia Mestrado"<equivalencia>"
    And Preencho as horas dos Outros Creditos Mestrado"<outrosCreditos>"
    And Preencho a descricao sintetica do esquema de oferta de curso Mestrado"<descOfertaCurso>"
    When Seleciono uma area de concentracao Mestrado"<areaConcentracao>"
    Then Clico no botao atualizar os dados do curso Mestrado


    Examples:
      |nome                     |periodicidade |objetivoCurso            |disciplina |tese |vagas |equivalencia |outrosCreditos |descOfertaCurso          |areaConcentracao        |
      |Teste Automatizado 2019! |SEMESTRAL     |Teste Automatizado 2019! |300        |200  |200   |200          |200            |Teste Automatizado 2019! |Teste Automatizado 2019 |


  Scenario Outline: Preencher o detalhamento do curso de Doutorado Profissional
    Given que estou na tela Caracterizacao do Curso Profissional
    And clico na opcao Doutorado Profissional
    And Preencho o campo nome Doutorado "<nome>"
    And Seleciono a Periodicidade da Selecao Doutorado "<periodicidade>"
    And Preencho o campo Objetivo do curso Doutorado "<objetivoCurso>"
    And Preencho as horas da disciplina Doutorado "<disciplina>"
    And Preencho as horas da tese Doutorado "<tese>"
    And Preencho o numero da vagas Doutorado "<vagas>"
    And Preencho as horas de equivalencia Doutorado "<equivalencia>"
    And Preencho as horas dos Outros Creditos Doutorado "<outrosCreditos>"
    And Preencho a descricao sintetica do esquema de oferta de curso Doutorado "<descOfertaCurso>"
    When Seleciono uma area de concentracao Doutorado "<areaConcentracao>"
    Then Clico no botao atualizar os dados do curso Doutorado


    Examples:
      |nome                     |periodicidade |objetivoCurso            |disciplina |tese |vagas |equivalencia |outrosCreditos |descOfertaCurso          |areaConcentracao        |
      |Teste Automatizado 2019! |SEMESTRAL     |Teste Automatizado 2019! |300        |200  |200   |200          |200            |Teste Automatizado 2019! |Teste Automatizado 2019 |


