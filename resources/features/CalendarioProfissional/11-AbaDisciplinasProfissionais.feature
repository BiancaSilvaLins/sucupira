@AbaDisciplinas
Feature: Disciplinas Profissionais

  Scenario Outline: Preencher os dados da disciplina profissional
    Given que estou na tela Dados da Disciplina profissional
    And preencho o campo nome da disciplina profissional "<nome>"
    And seleciono o nivel da disciplina profissional "<nivel>"
    And clico no botao SIM de disciplina profissional obrigatoria
    And preencho o campo de creditos da disciplina profissional "<creditos>"
    And preencho o campo ementa da disciplina profissional "<ementa>"
    And preencho o campo bibliografia da disciplina profissional "<bibliografia>"
    And seleciono a area de concentracao da disciplina profissional "<areaConcentracao>"
    And clico no simbolo MAIS profissional
    When clico no botao inserir disciplina
    Then o sistema insere a nova disciplina e emite a mensagem "<mensagem>"


    Examples:
    |nome  |nivel                 |creditos |ementa |bibliografia |areaConcentracao |mensagem                                  |
    |TESTE |Mestrado Profissional |200      |Teste  |Teste        |Teste            |Disciplina foi cadastrado(a) com sucesso. |


  Scenario Outline: Preencher os dados da disciplina profissional ja cadastrada
    Given que estou na tela Dados da Disciplina profissional
    And preencho o campo nome da disciplina profissional "<nome>"
    And seleciono o nivel da disciplina profissional "<nivel>"
    And clico no botao SIM de disciplina profissional obrigatoria
    And preencho o campo de creditos da disciplina profissional "<creditos>"
    And preencho o campo ementa da disciplina profissional "<ementa>"
    And preencho o campo bibliografia da disciplina profissional "<bibliografia>"
    And seleciono a area de concentracao da disciplina profissional "<areaConcentracao>"
    And clico no simbolo MAIS profissional
    When clico no botao inserir disciplina
    Then o sistema insere a nova disciplina e emite a mensagem "<mensagem>"


    Examples:
      |nome  |nivel                 |creditos |ementa |bibliografia |areaConcentracao |mensagem                           |
      |TESTE |Mestrado Profissional |200      |Teste  |Teste        |Teste            |Esta disciplina ja foi adicionada. |


  Scenario Outline: Preencher os dados da disciplina profissional campos obrigatorios
    Given que estou na tela Dados da Disciplina profissional
    When nao preencho nenhum campo obrigatorio
    Then o sistema apresenta as mensagens "<mensagem1>" "<mensagem2>" "<mensagem3>" "<mensagem4>" "<mensagem5>"


    Examples:
      |mensagem1                                 |mensagem2                                  |mensagem3                                     |mensagem4                                   |mensagem5                                         |
      |Nome: Campo de preenchimento obrigatorio. |Nivel: Campo de preenchimento obrigatorio. |Creditos: Campo de preenchimento obrigatorio. |Ementa: Campo de preenchimento obrigatorio. |Bibliografia: Campo de preenchimento obrigatorio. |


  Scenario Outline: Preencher os dados da disciplina profissional sem Area de Concentracao Obrigatoria
    Given que estou na tela Dados da Disciplina profissional
    And preencho o campo nome da disciplina profissional "<nome>"
    And seleciono o nivel da disciplina profissional "<nivel>"
    And clico no botao NAO de disciplina profissional obrigatoria
    And preencho o campo de creditos da disciplina profissional "<creditos>"
    And preencho o campo ementa da disciplina profissional "<ementa>"
    And preencho o campo bibliografia da disciplina profissional "<bibliografia>"
    When clico no botao inserir disciplina
    Then o sistema insere a nova disciplina e emite a mensagem "<mensagem>"


    Examples:
      |nome      |nivel                 |creditos |ementa |bibliografia |mensagem                                  |
      |TESTE Nao |Mestrado Profissional |400      |Teste  |Teste        |Disciplina foi cadastrado(a) com sucesso. |