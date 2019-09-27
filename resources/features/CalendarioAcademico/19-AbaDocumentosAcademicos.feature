@19AbaDocumentos
Feature: Aba Documentos academicos

  Scenario Outline: Preencher dados de Documentos academicos
    Given que estou na tela de Dados de Documentos academicos
    And preencho o campo Credenciamento academico
    And clico no botao Anexar credenciamento academico
    And preencho o campo Regimento academico
    And clico no botao Anexar regimento academico
    And preencho o campo Regulamento do curso academico
    And clico no botao Anexar regulamento academico
    And preencho o campo Autorizacao academica
    And clico no botao Anexar autorizacao academico
    When clico no avancar para salvar os documentos academicos
    Then o sistema salva documentos academicos e exibe a mensagem "<mensagem>" na tela de finalizar proposta

    Examples:
    |mensagem                |
    |Não existem pendências. |



  Scenario Outline: Enviar dados de Proposta academica
    Given que estou na tela de finalizar proposta academica
    And clico no botao enviar dados academicos
    When o sistema salva os dados da nova proposta academica e exibe a mensagem "<mensagem>" e finaliza solicitacao da proposta
    Then clico no botao concluir para finalizar a solicitacao academica


    Examples:
    |mensagem                                                                                            |
    |A proposta de solicitação de novo(s) curso(s) foi enviada com sucesso para análise da Pró-Reitoria. |