@AbaInformacoesComplementares
Feature: Aba Informacoes Complementares profissionais

  Scenario Outline: Preencher dados de Informacoes Complementares profissionais
    Given que estou na tela de dados de Informacoes Complementares profissionais
    And preencho o campo Observacoes profissionais "<observacoes>"
    And preencho o campo Criticas e Sugestoes profissionais "<criticasSugestoes>"
    When clico no botao salvar dados das Informacoes Complementares profissionais
    Then o sistema salva os dados das Informacoes Complementares profissional e exibe a mensagem "<mensagem>"

    Examples:
    |observacoes |criticasSugestoes |mensagem                                                              |
    |Teste       |Teste             |Os dados da Informações complementares foram cadastrados com sucesso. |