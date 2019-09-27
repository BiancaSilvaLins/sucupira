@PolosEAD
Feature: Polos EAD

  Scenario Outline: Incluir um novo Polo EAD Profissional
    Given que estou na tela Polos EAD Profissional
    And seleciono uma "<uf>" Profissional
    And seleciono um "<municipio>" Profissional
    And seleciono um Polo disponivel "<polo>" Profissional
    And clico no botao Adicionar Polo Profissional
    When verifico se o "<polo>" foi incluso profissional
    Then clico no botao avancar Profissional

    Examples:
      |uf         |municipio |polo            |
      |Pernambuco |Recife    |RECIFE-PE CENTRO|

  Scenario Outline: Incluir um Polo EAD Profissional já cadastrado
    Given que estou na tela Polos EAD Profissional
    And seleciono uma "<uf>" Profissional
    And seleciono um "<municipio>" Profissional
    And seleciono um Polo disponivel "<polo>" Profissional
    When clico no botao Adicionar Polo ja cadastrado Profissional
    Then o sistema apresenta mensagem de erro "<mensagemErro>" Profissional

    Examples:
      |uf         |municipio |polo            |mensagemErro                                               |
      |Pernambuco |Recife    |RECIFE-PE CENTRO|Já existe um polo adicionado com a configuração informada. |


  Scenario Outline: Excluir um Polo EAD Profissional já cadastrado
    Given que estou na tela Polos EAD Profissional
    And verifico se existe um "<polo>" cadastrado Profissional
    When clico no botao excluir Profissional
    Then o sistema exclui o polo adicionado e apresenta uma "<mensagem>" na tela Profissional

    Examples:
      |polo            |mensagem                          |
      |RECIFE-PE CENTRO|Nenhum polo adicionado à proposta |