@15AbaVinculoDeDocenteAsDisciplinas
Feature: Dados dos Vinculo de Docente as Disciplinas Academicas

  Scenario Outline: Preencher dados do Vinculo de Docente as Disciplinas academicas
    Given que estou na tela de Dados dos Vinculo de Docente as Disciplinas Academicas
    And seleciono o docente academico "<docente>"
    And seleciono a disciplina academica "<disciplina>"
    When clico no botao associar
    Then o sistema associa o docente a disciplina academica selecionada e exibe a mensagem "<mensagem>"

    Examples:
   |docente                         |disciplina |mensagem                       |
   |BIANCA SILVA LINS (10382939441) |TESTE      |Docente vinculado com sucesso. |


  Scenario Outline: Preencher dados do Vinculo de Docente as Disciplinas academicas Campos Obrigatorios
    Given que estou na tela de Dados dos Vinculo de Docente as Disciplinas Academicas
    And seleciono o docente academico "<docente>"
    And seleciono a disciplina academica "<disciplina>"
    When clico no botao associar
    Then o sistema associa o docente a disciplina academica selecionada e exibe a mensagem "<mensagem>"

    Examples:
      |docente                         |disciplina    |mensagem                                        |
      |BIANCA SILVA LINS (10382939441) |--SELECIONE-- |Disciplina: Campo de preenchimento obrigatório. |
      |--SELECIONE--                   |TESTE         |Docente: Campo de preenchimento obrigatório.    |

  Scenario Outline: Preencher dados do Vinculo de Docente as Disciplinas academicas duplicado
    Given que estou na tela de Dados dos Vinculo de Docente as Disciplinas Academicas
    And seleciono o docente academico "<docente>"
    And seleciono a disciplina academica "<disciplina>"
    When clico no botao associar
    Then o sistema associa o docente a disciplina academica selecionada e exibe a mensagem "<mensagem>"

    Examples:
      |docente                         |disciplina |mensagem                                         |
      |BIANCA SILVA LINS (10382939441) |TESTE      |Este docente já foi vinculado a esta disciplina. |