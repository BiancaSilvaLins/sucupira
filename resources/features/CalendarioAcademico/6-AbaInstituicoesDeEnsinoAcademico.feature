@6AbaInstituicoesDeEnsino
Feature: Aba Instituições de Ensino

  Scenario Outline: Preencher dados da aba Instituicoes de Ensino Academico
    Given estou na aba de Instituicoes de Ensino
    And preencho com os "<dadosDaInstituicao>"
    And preencho o campo Instituicao de ensino superior "<instituicaoDeEnsino>"
    When clico no botao Inserir Instituicao
    Then a tabela Instituicoes Participantes atualiza "<dadosDaInstituicao>"

    Examples:
      |dadosDaInstituicao  | instituicaoDeEnsino                                    |
      | ufrj               | 31001017 UNIVERSIDADE FEDERAL DO RIO DE JANEIRO (UFRJ) |

  Scenario Outline: Preencher dados da aba Instituicoes de Ensino para opcao Inserir Instituicao que ja esta cadastrada Academico
    Given estou na aba de Instituicoes de Ensino Academico
    And preencho com os "<dadosDaInstituicao>"
    And preencho o campo Instituicao de ensino superior "<instituicaoDeEnsino>"
    When clico no botao Inserir Instituicao
    Then o sistema apresenta mensagem de confirmacao "<mensagemDeErro>"

    Examples:
      |dadosDaInstituicao  | instituicaoDeEnsino                                         | mensagemDeErro                                                         |
      | UFRN               | 23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) | A Instituição de Ensino informada já encontra-se associada à Proposta. |

