@13AbaProducaoBibliograficaTecnicaEArtisticaAcademicoDadosSolicitacao
Feature: Producao Bibliografica Tecnica e Artitisca  Academico

  Scenario Outline: Preencher os dados de Producao Bibliografica Tecnica e Artistica academica - Solicitacao de Veiculos
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica academico
    And clico na opcao para cadastrar um novo veiculo academico
    And preencho o campo titulo academico "<titulo>"
    And preencho o campo valor do identificador academico "<valor>"
    And preencho o campo justificativa academica "<justificativa>"
    And clico no botao enviar academico
    And o sistema insere a nova solicitacao academica e emite a mensagem academica "<mensagem>"
    And clico no botao retornar para o cadastro
    And clico na aba Producao Bibliografica Tecnica e Artistica academico
    And clico na opcao solicitacoes de veiculos academicos
    Then o sistema apresenta a nova solicitacao de veiculos na "<listaVeiculos>" academico


    Examples:
    |titulo                |valor    |justificativa         |mensagem                                                      |listaVeiculos |
    |Teste Automatizado!!! |95322454 |Teste Automatizado!!! |A solicitação de cadastro de veículo foi enviada com sucesso. |teste erro    |


