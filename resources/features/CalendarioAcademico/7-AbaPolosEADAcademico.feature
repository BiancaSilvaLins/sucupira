@7PolosEAD
Feature: Polos EAD

  Scenario Outline: Incluir um novo Polo EAD Academico
    Given que estou na tela Polos EAD Academico
    And seleciono uma "<uf>"
    And seleciono um "<municipio>"
    And seleciono um Polo disponivel "<polo>"
    And clico no botao Adicionar Polo
    When verifico se o "<polo>" foi incluso
    Then clico no botao avancar

    Examples:
      |uf         |municipio |polo            |
      |Pernambuco |Recife    |RECIFE-PE CENTRO|

  Scenario Outline: Incluir um Polo EAD Academico já cadastrado
    Given que estou na tela Polos EAD Academico
    And seleciono uma "<uf>"
    And seleciono um "<municipio>"
    And seleciono um Polo disponivel "<polo>"
    When clico no botao Adicionar Polo
    Then o sistema apresenta mensagem de erro "<mensagemErro>"

    Examples:
      |uf         |municipio |polo            |mensagemErro                                               |
      |Pernambuco |Recife    |RECIFE-PE CENTRO|Já existe um polo adicionado com a configuração informada. |


  Scenario Outline: Excluir um Polo EAD Academico já cadastrado
    Given que estou na tela Polos EAD Academico
    And verifico se existe um "<polo>" cadastrado
    When clico no botao excluir
    Then o sistema exclui o polo adicionado e apresenta uma "<mensagem>" na tela

    Examples:
      |polo            |mensagem                          |
      |RECIFE-PE CENTRO|Nenhum polo adicionado à proposta |