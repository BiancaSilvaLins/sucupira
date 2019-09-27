@11AbaDisciplinas
Feature: Disciplinas Academicas

  Scenario Outline: Preencher os dados da disciplina academica
    Given que estou na tela Dados da Disciplina academica
    And preencho o campo nome da disciplina academica "<nome>"
    And seleciono o nivel da disciplina academica "<nivel>"
    And clico no botao SIM de disciplina academica obrigatoria
    And preencho o campo de creditos da disciplina academica "<creditos>"
    And preencho o campo ementa da disciplina academica "<ementa>"
    And preencho o campo bibliografia da disciplina academica "<bibliografia>"
    And seleciono a area de concentracao da disciplina academica "<areaConcentracao>"
    And clico no simbolo MAIS academica
    When clico no botao inserir disciplina academica
    Then o sistema insere a nova disciplina academica e emite a mensagem "<mensagem>"


    Examples:
      |nome  |nivel    |creditos |ementa |bibliografia |areaConcentracao        |mensagem                                  |
      |TESTE |Mestrado |200      |Teste  |Teste        |Teste Automatizado 2019 |Disciplina foi cadastrado(a) com sucesso. |


  Scenario Outline: Preencher os dados da disciplina academica ja cadastrada
    Given que estou na tela Dados da Disciplina academica
    And preencho o campo nome da disciplina academica "<nome>"
    And seleciono o nivel da disciplina academica "<nivel>"
    And clico no botao SIM de disciplina academica obrigatoria
    And preencho o campo de creditos da disciplina academica "<creditos>"
    And preencho o campo ementa da disciplina academica "<ementa>"
    And preencho o campo bibliografia da disciplina academica "<bibliografia>"
    And seleciono a area de concentracao da disciplina academica "<areaConcentracao>"
    And clico no simbolo MAIS academica
    When clico no botao inserir disciplina academica
    Then o sistema insere a nova disciplina academica e emite a mensagem "<mensagem>"


    Examples:
      |nome  |nivel    |creditos |ementa |bibliografia |areaConcentracao        |mensagem                           |
      |TESTE |Mestrado |200      |Teste  |Teste        |Teste Automatizado 2019 |Esta disciplina ja foi adicionada. |
#

  Scenario Outline: Preencher os dados da disciplina academica campos obrigatorios
    Given que estou na tela Dados da Disciplina academica
    When nao preencho nenhum campo obrigatorio academico
    Then o sistema apresenta as mensagens academicas "<mensagem1>" "<mensagem2>" "<mensagem3>" "<mensagem4>" "<mensagem5>"


    Examples:
      |mensagem1                                 |mensagem2                                  |mensagem3                                     |mensagem4                                   |mensagem5                                         |
      |Nome: Campo de preenchimento obrigatorio. |Nivel: Campo de preenchimento obrigatorio. |Creditos: Campo de preenchimento obrigatorio. |Ementa: Campo de preenchimento obrigatorio. |Bibliografia: Campo de preenchimento obrigatorio. |


  Scenario Outline: Preencher os dados da disciplina academica sem Area de Concentracao Obrigatoria
    Given que estou na tela Dados da Disciplina academica
    And preencho o campo nome da disciplina academica "<nome>"
    And seleciono o nivel da disciplina academica "<nivel>"
    And clico no botao NAO de disciplina academica obrigatoria
    And preencho o campo de creditos da disciplina academica "<creditos>"
    And preencho o campo ementa da disciplina academica "<ementa>"
    And preencho o campo bibliografia da disciplina academica "<bibliografia>"
    When clico no botao inserir disciplina academica
    Then o sistema insere a nova disciplina academica e emite a mensagem "<mensagem>"


    Examples:
      |nome      |nivel    |creditos |ementa |bibliografia |mensagem                                  |
      |TESTE Nao |Mestrado |400      |Teste  |Teste        |Disciplina foi cadastrado(a) com sucesso. |