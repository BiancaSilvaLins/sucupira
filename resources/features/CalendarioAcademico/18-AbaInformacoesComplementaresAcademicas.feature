@18AbaInformacoesComplementares
Feature: Aba Informacoes Complementares academicas

  Scenario Outline: Preencher dados de Informacoes Complementares academicas
    Given que estou na tela de dados de Informacoes Complementares academicas
    And preencho o campo Observacoes academicas "<observacoes>"
    And preencho o campo Criticas e Sugestoes academicas "<criticasSugestoes>"
    When clico no botao salvar dados das Informacoes Complementares academicas
    Then o sistema salva os dados das Informacoes Complementares academica e exibe a mensagem "<mensagem>"

    Examples:
    |observacoes |criticasSugestoes |mensagem                                                              |
    |Teste       |Teste             |Os dados da Informações complementares foram cadastrados com sucesso. |