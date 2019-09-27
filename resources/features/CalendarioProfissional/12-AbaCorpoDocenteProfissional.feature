@AbaCorpoDocenteProfissional
Feature: Corpo Docente Profissional

  Scenario Outline: Preencher os dados de corpo docente profissional
    Given que estou na tela Dados de corpo docente profissional
    And preencho o campo numero do documento profissional"<cpf>"
    And clico no campo email institucional profissional
    And preencho o campo abreviatura profissional "<abreviatura>"
    And clico no botao MAIS profissional
    And seleciono o nivel de titulacao profissional "<nivel>"
    And preencho o campo ano da titulacao profissional "<ano>"
    And seleciono pais da instituicao da titulacao profissional "<pais>"
    And preencho o campo instituicao da titulacao profissional "<sigla>" "<instTitulacao>"
    And seleciono a categoria do vinculo profissional "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao profissional "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa profissional "<horasPrograma>"
    And clico no botao Sim se ele pertence a uma instituicao de ensino vinculada a proposta profissional
    And seleciono a instituicao de ensino profissional "<instituicaoEnsino>"
    When clico no botao inserir docente profissional
    Then o sistema insere o novo docente profissional e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel                 |ano  |pais   |sigla |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |instituicaoEnsino                                  |mensagem                               |
      |10382939441 |Teste       |Mestrado Profissional |2000 |Brasil |ufrn  |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |40            |UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Docente foi cadastrado(a) com sucesso. |


  Scenario Outline: Preencher os dados de corpo docente profissional ja cadastrado
    Given que estou na tela Dados de corpo docente profissional
    And preencho o campo numero do documento profissional"<cpf>"
    And clico no campo email institucional profissional
    And preencho o campo abreviatura profissional "<abreviatura>"
    And clico no botao MAIS profissional
    And seleciono o nivel de titulacao profissional "<nivel>"
    And preencho o campo ano da titulacao profissional "<ano>"
    And seleciono pais da instituicao da titulacao profissional "<pais>"
    And preencho o campo instituicao da titulacao profissional "<sigla>" "<instTitulacao>"
    And seleciono a categoria do vinculo profissional "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao profissional "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa profissional "<horasPrograma>"
    And clico no botao Sim se ele pertence a uma instituicao de ensino vinculada a proposta profissional
    And seleciono a instituicao de ensino profissional "<instituicaoEnsino>"
    When clico no botao inserir docente profissional
    Then o sistema insere o novo docente profissional e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel                 |ano  |pais   |sigla |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |instituicaoEnsino                                  |mensagem                        |
      |10382939441 |Teste       |Mestrado Profissional |2000 |Brasil |ufrn  |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |40            |UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Este docente já foi adicionado. |





  Scenario Outline: Preencher os dados de corpo docente profissional sem pertencer a mesma instituicao
    Given que estou na tela Dados de corpo docente profissional
    And preencho o campo numero do documento profissional"<cpf>"
    And clico no campo email institucional profissional
    And preencho o campo abreviatura profissional "<abreviatura>"
    And clico no botao MAIS profissional
    And seleciono o nivel de titulacao profissional "<nivel>"
    And preencho o campo ano da titulacao profissional "<ano>"
    And seleciono pais da instituicao da titulacao profissional "<pais>"
    And preencho o campo instituicao da titulacao profissional "<sigla1>" "<instTitulacao>"
    And seleciono a categoria do vinculo profissional "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao profissional "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa profissional "<horasPrograma>"
    And clico no botao Nao se ele pertence a uma instituicao de ensino vinculada a proposta profissional
    And preencho a instituicao de ensino profissional "<sigla>" "<instituicaoEnsino>"
    When clico no botao inserir docente profissional
    Then o sistema insere o novo docente profissional e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel                 |ano  |pais   |sigla1 |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |sigla |instituicaoEnsino                                                     |mensagem                               |
      |15055752068 |Teste       |Mestrado Profissional |2000 |Brasil |ufrn   |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |  40          |ufrn  |24.365.710/0001-83 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Docente foi cadastrado(a) com sucesso. |

  Scenario Outline: Preencher os dados de corpo docente profissional sem pertencer a mesma instituicao ja cadastrado
    Given que estou na tela Dados de corpo docente profissional
    And preencho o campo numero do documento profissional"<cpf>"
    And clico no campo email institucional profissional
    And preencho o campo abreviatura profissional "<abreviatura>"
    And clico no botao MAIS profissional
    And seleciono o nivel de titulacao profissional "<nivel>"
    And preencho o campo ano da titulacao profissional "<ano>"
    And seleciono pais da instituicao da titulacao profissional "<pais>"
    And preencho o campo instituicao da titulacao profissional "<sigla1>" "<instTitulacao>"
    And seleciono a categoria do vinculo profissional "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao profissional "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa profissional "<horasPrograma>"
    And clico no botao Nao se ele pertence a uma instituicao de ensino vinculada a proposta profissional
    And preencho a instituicao de ensino profissional "<sigla>" "<instituicaoEnsino>"
    When clico no botao inserir docente profissional
    Then o sistema insere o novo docente profissional e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel                 |ano  |pais   |sigla1 |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |sigla |instituicaoEnsino                                                     |mensagem                        |
      |15055752068 |Teste       |Mestrado Profissional |2000 |Brasil |ufrn   |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |  40          |ufrn  |24.365.710/0001-83 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Este docente já foi adicionado. |