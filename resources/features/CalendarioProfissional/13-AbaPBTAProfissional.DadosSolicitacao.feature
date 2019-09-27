@AbaProducaoBibliograficaTecnicaEArtisticaProfissionalDadosSolicitacao
Feature: Producao Bibliografica Tecnica e Artitisca  Profissional

  Scenario Outline: Preencher os dados de Producao Bibliografica Tecnica e Artistica profissional - Solicitacao de Veiculos
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica profissional
    And clico na opcao para cadastrar um novo veiculo profissional
    And preencho o campo titulo profissional "<titulo>"
    And preencho o campo valor do identificador profissional "<valor>"
    And preencho o campo justificativa profissional "<justificativa>"
    And clico no botao enviar profissional
    And o sistema insere a nova solicitacao profissional e emite a mensagem profissional "<mensagem>"
    And clico no botao retornar para o cadastro profissional
    And clico na aba Producao Bibliografica Tecnica e Artistica profissional
    And clico na opcao solicitacoes de veiculos profissionais
    Then o sistema apresenta a nova solicitacao de veiculos na "<listaVeiculos>" profissional


    Examples:
    |titulo                |valor    |justificativa         |mensagem                                                      |listaVeiculos |
    |Teste Automatizado!!! |91456854 |Teste Automatizado!!! |A solicitação de cadastro de veículo foi enviada com sucesso. |TESTE         |


