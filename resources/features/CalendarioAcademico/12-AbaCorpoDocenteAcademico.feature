@12AbaCorpoDocenteAcademico
Feature: Corpo Docente Academico

  Scenario Outline: Preencher os dados de corpo docente academico
    Given que estou na tela Dados de corpo docente academico
    And preencho o campo numero do documento academico"<cpf>"
    And clico no campo email institucional academico
    And preencho o campo abreviatura academico "<abreviatura>"
    And clico no botao MAIS academico
    And seleciono o nivel de titulacao academico "<nivel>"
    And preencho o campo ano da titulacao academico "<ano>"
    And seleciono pais da instituicao da titulacao academico "<pais>"
    And preencho o campo instituicao da titulacao academico "<sigla>" "<instTitulacao>"
    And seleciono a categoria do vinculo academico "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao academico "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa academico "<horasPrograma>"
    And clico no botao Sim se ele pertence a uma instituicao de ensino vinculada a proposta academico
    And seleciono a instituicao de ensino academico "<instituicaoEnsino>"
    When clico no botao inserir docente academico
    Then o sistema insere o novo docente academico e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel    |ano  |pais   |sigla |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |instituicaoEnsino                                  |mensagem                               |
      |10382939441 |Teste       |Mestrado |2000 |Brasil |ufrn  |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |40            |UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Docente foi cadastrado(a) com sucesso. |


  Scenario Outline: Preencher os dados de corpo docente academico ja cadastrado
    Given que estou na tela Dados de corpo docente academico
    And preencho o campo numero do documento academico"<cpf>"
    And clico no campo email institucional academico
    And preencho o campo abreviatura academico "<abreviatura>"
    And clico no botao MAIS academico
    And seleciono o nivel de titulacao academico "<nivel>"
    And preencho o campo ano da titulacao academico "<ano>"
    And seleciono pais da instituicao da titulacao academico "<pais>"
    And preencho o campo instituicao da titulacao academico "<sigla>" "<instTitulacao>"
    And seleciono a categoria do vinculo academico "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao academico "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa academico "<horasPrograma>"
    And clico no botao Sim se ele pertence a uma instituicao de ensino vinculada a proposta academico
    And seleciono a instituicao de ensino academico "<instituicaoEnsino>"
    When clico no botao inserir docente academico
    Then o sistema insere o novo docente academico e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel    |ano  |pais   |sigla |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |instituicaoEnsino                                  |mensagem                        |
      |10382939441 |Teste       |Mestrado |2000 |Brasil |ufrn  |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |40            |UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Este docente já foi adicionado. |





  Scenario Outline: Preencher os dados de corpo docente academico sem pertencer a mesma instituicao
    Given que estou na tela Dados de corpo docente academico
    And preencho o campo numero do documento academico"<cpf>"
    And clico no campo email institucional academico
    And preencho o campo abreviatura academico "<abreviatura>"
    And clico no botao MAIS academico
    And seleciono o nivel de titulacao academico "<nivel>"
    And preencho o campo ano da titulacao academico "<ano>"
    And seleciono pais da instituicao da titulacao academico "<pais>"
    And preencho o campo instituicao da titulacao academico "<sigla1>" "<instTitulacao>"
    And seleciono a categoria do vinculo academico "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao academico "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa academico "<horasPrograma>"
    And clico no botao Nao se ele pertence a uma instituicao de ensino vinculada a proposta academico
    And preencho a instituicao de ensino academico "<sigla>" "<instituicaoEnsino>"
    When clico no botao inserir docente academico
    Then o sistema insere o novo docente academico e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel    |ano  |pais   |sigla1 |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |sigla |instituicaoEnsino                                                     |mensagem                               |
      |15055752068 |Teste       |Mestrado |2000 |Brasil |ufrn   |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |  40          |ufrn  |24.365.710/0001-83 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Docente foi cadastrado(a) com sucesso. |

  Scenario Outline: Preencher os dados de corpo docente academico sem pertencer a mesma instituicao ja cadastrado
    Given que estou na tela Dados de corpo docente academico
    And preencho o campo numero do documento academico"<cpf>"
    And clico no campo email institucional academico
    And preencho o campo abreviatura academico "<abreviatura>"
    And clico no botao MAIS academico
    And seleciono o nivel de titulacao academico "<nivel>"
    And preencho o campo ano da titulacao academico "<ano>"
    And seleciono pais da instituicao da titulacao academico "<pais>"
    And preencho o campo instituicao da titulacao academico "<sigla1>" "<instTitulacao>"
    And seleciono a categoria do vinculo academico "<categoria>"
    And preencho o campo horas de dedicacao semanal na instituicao academico "<horasInstituicao>"
    And preencho o campo horas de dedicacao semanal no programa academico "<horasPrograma>"
    And clico no botao Nao se ele pertence a uma instituicao de ensino vinculada a proposta academico
    And preencho a instituicao de ensino academico "<sigla>" "<instituicaoEnsino>"
    When clico no botao inserir docente academico
    Then o sistema insere o novo docente academico e emite a mensagem "<mensagem>"


    Examples:
      |cpf         |abreviatura |nivel    |ano  |pais   |sigla1 |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |sigla |instituicaoEnsino                                                     |mensagem                        |
      |15055752068 |Teste       |Mestrado |2000 |Brasil |ufrn   |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |  40          |ufrn  |24.365.710/0001-83 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Este docente já foi adicionado. |