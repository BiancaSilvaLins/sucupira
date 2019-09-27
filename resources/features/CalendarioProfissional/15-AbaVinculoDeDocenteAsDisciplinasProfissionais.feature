@AbaVinculoDeDocenteAsDisciplinas
Feature: Dados dos Vinculo de Docente as Disciplinas Profissionais

  Scenario Outline: Preencher dados do Vinculo de Docente as Disciplinas profissionais
    Given que estou na tela de Dados dos Vinculo de Docente as Disciplinas Profissionais
    And seleciono o docente profissional "<docente>"
    And seleciono a disciplina profissional "<disciplina>"
    When clico no botao associar profissional
    Then o sistema associa o docente a disciplina profissional selecionada e exibe a mensagem "<mensagem>"

    Examples:
   |docente                         |disciplina |mensagem                       |
   |BIANCA SILVA LINS (10382939441) |Teste      |Docente vinculado com sucesso. |


  Scenario Outline: Preencher dados do Vinculo de Docente as Disciplinas profissionais Campos Obrigatorios
    Given que estou na tela de Dados dos Vinculo de Docente as Disciplinas Profissionais
    And seleciono o docente profissional "<docente>"
    And seleciono a disciplina profissional "<disciplina>"
    When clico no botao associar profissional
    Then o sistema associa o docente a disciplina profissional selecionada e exibe a mensagem "<mensagem>"

    Examples:
      |docente                         |disciplina    |mensagem                                        |
      |BIANCA SILVA LINS (10382939441) |--SELECIONE-- |Disciplina: Campo de preenchimento obrigatório. |
      |--SELECIONE--                   |Teste         |Docente: Campo de preenchimento obrigatório.    |


  Scenario Outline: Preencher dados do Vinculo de Docente as Disciplinas profissionais duplicado
    Given que estou na tela de Dados dos Vinculo de Docente as Disciplinas Profissionais
    And seleciono o docente profissional "<docente>"
    And seleciono a disciplina profissional "<disciplina>"
    When clico no botao associar profissional
    Then o sistema associa o docente a disciplina profissional selecionada e exibe a mensagem "<mensagem>"

    Examples:
      |docente                         |disciplina |mensagem                                         |
      |BIANCA SILVA LINS (10382939441) |Teste      |Este docente já foi vinculado a esta disciplina. |