@AbaDocumentos
Feature: Aba Documentos profissionais

  Scenario Outline: Preencher dados de Documentos profissionais
    Given que estou na tela de Dados de Documentos profissionais
    And preencho o campo Credenciamento profissional
    And clico no botao Anexar credenciamento profissional
    And preencho o campo Regimento profissional
    And clico no botao Anexar regimento profissional
    And preencho o campo Regulamento do curso profissional
    And clico no botao Anexar regulamento profissional
    And preencho o campo Autorizacao profissional
    And clico no botao Anexar autorizacao profissional
    When clico no avancar para salvar os documentos profissionais
    Then o sistema salva documentos profissionais e exibe a mensagem "<mensagem>" na tela de finalizar proposta

    Examples:
    |mensagem                |
    |Não existem pendências. |



  Scenario Outline: Enviar dados de Proposta profissional
    Given que estou na tela de finalizar proposta profissional
    And clico no botao enviar dados profissionais
    When o sistema salva os dados da nova proposta profissional e exibe a mensagem "<mensagem>" e finaliza solicitacao da proposta
    Then clico no botao concluir para finalizar a solicitacao profissional


    Examples:
    |mensagem                                                                                            |
    |A proposta de solicitação de novo(s) curso(s) foi enviada com sucesso para análise da Pró-Reitoria. |