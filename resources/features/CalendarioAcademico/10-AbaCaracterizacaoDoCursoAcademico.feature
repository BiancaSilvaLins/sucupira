@10CaracterizacaoDoCursoAcademico
Feature: Caracterizacao do Curso Academico

  Scenario Outline: Preencher o detalhamento do curso de Mestrado Academico
    Given que estou na tela Caracterizacao do Curso Academico
    And clico na opcao Mestrado Academico
    And Preencho o campo nome "<nome>"
    And Seleciono a Periodicidade da Selecao "<periodicidade>"
    And Preencho o campo Objetivo do curso "<objetivoCurso>"
    And Preencho as horas da disciplina "<disciplina>"
    And Preencho as horas da tese "<tese>"
    And Preencho o numero da vagas "<vagas>"
    And Preencho as horas de equivalencia "<equivalencia>"
    And Preencho as horas dos Outros Creditos "<outrosCreditos>"
    And Preencho a descricao sintetica do esquema de oferta de curso "<descOfertaCurso>"
    When Seleciono uma area de concentracao "<areaConcentracao>"
    Then Clico no botao atualizar os dados do curso


    Examples:
    |nome                     |periodicidade |objetivoCurso            |disciplina |tese |vagas |equivalencia |outrosCreditos |descOfertaCurso          |areaConcentracao        |
    |Teste Automatizado 2019! |SEMESTRAL     |Teste Automatizado 2019! |300        |200  |200   |200          |200            |Teste Automatizado 2019! |Teste Automatizado 2019 |


  Scenario Outline: Preencher o detalhamento do curso de Doutorado Academico
    Given que estou na tela Caracterizacao do Curso Academico
    And clico na opcao Doutorado Academico
    And Preencho o campo nome doutorado "<nome>"
    And Seleciono a Periodicidade da Selecao doutorado "<periodicidade>"
    And Preencho o campo Objetivo do curso doutorado "<objetivoCurso>"
    And Preencho as horas da disciplina doutorado "<disciplina>"
    And Preencho as horas da tese doutorado "<tese>"
    And Preencho o numero da vagas doutorado "<vagas>"
    And Preencho as horas de equivalencia doutorado "<equivalencia>"
    And Preencho as horas dos Outros Creditos doutorado "<outrosCreditos>"
    And Preencho a descricao sintetica do esquema de oferta de curso doutorado "<descOfertaCurso>"
    When Seleciono uma area de concentracao doutorado "<areaConcentracao>"
    Then Clico no botao atualizar os dados do curso doutorado


    Examples:
      |nome                     |periodicidade |objetivoCurso            |disciplina |tese |vagas |equivalencia |outrosCreditos |descOfertaCurso          |areaConcentracao        |
      |Teste Automatizado 2019! |SEMESTRAL     |Teste Automatizado 2019! |300        |200  |200   |200          |200            |Teste Automatizado 2019! |Teste Automatizado 2019 |


