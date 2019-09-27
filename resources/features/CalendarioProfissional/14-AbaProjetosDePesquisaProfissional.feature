@AbaProjetosDePesquisa
Feature: Dados dos Projetos de Pesquisa Profissional

  Scenario Outline: Preencher dados dos projetos de pesquisa profissional
    Given que estou na tela de Dados dos Projetos de Pesquisa profissional
    And preencho o campo nome do projeto profissional "<nomeProjeto>"
    And seleciono uma linha de pesquisa profissional "<linhaPesquisa>"
    And preencho o campo data de inicio profissional "<dataInicio>"
    And preencho o campo descricao do projeto profissional "<descricao>"
    And preencho o campo descricao do financiador profissional "<descFinanciador>"
    And seleciono um docente profissional "<docente>"
    And clico no botao MAIS profissional para inserir o docente
    And seleciono o checkbox do responsavel profissional
    When clico no botao inserir projeto profissional
    Then o sistema insere o novo projeto e apresenta uma mensagem de sucesso profissional "<mensagem>"


    Examples:
   |nomeProjeto |linhaPesquisa |dataInicio |descricao |descFinanciador |docente                                 |mensagem                                           |
   |Teste       |linha teste   |20082019   |TESTE     |Teste           |ANA BEVILAQUA PENNA FRANCA (01402495757)|Projeto de Pesquisa foi cadastrado(a) com sucesso. |



  Scenario Outline: Alterar dados dos projetos de pesquisa profissional
    Given que estou na tela de Dados dos Projetos de Pesquisa profissional
    And clico no botao editar projeto profissional
    And preencho o campo nome do projeto profissional "<nomeProjeto>"
    And seleciono uma linha de pesquisa profissional "<linhaPesquisa>"
    And preencho o campo data de inicio profissional "<dataInicio>"
    And preencho o campo descricao do projeto profissional "<descricao>"
    And preencho o campo descricao do financiador profissional "<descFinanciador>"
    When clico no botao atualizar projeto profissional
    Then o sistema insere o novo projeto e apresenta uma mensagem de sucesso profissional "<mensagem>"

    Examples:
      |nomeProjeto  |linhaPesquisa |dataInicio |descricao    |descFinanciador |mensagem                                         |
      |Teste Editar |linha teste   |21082019   |TESTE EDITAR |Teste Editar    |Projeto de Pesquisa foi alterado(a) com sucesso. |


  Scenario Outline: Campo Docente Obrigatorio clicando no botao MAIS Profissional
    Given que estou na tela de Dados dos Projetos de Pesquisa profissional
    And clico no botao MAIS profissional para inserir o docente
    Then o sistema apresenta uma mensagem de de erro profissional "<mensagem>"

    Examples:
     |mensagem                                     |
     |Docente: Campo de preenchimento obrigatório. |


  Scenario Outline: Campos Obrigatorios clicando no botao inserir projeto Profissional
    Given que estou na tela de Dados dos Projetos de Pesquisa profissional
    And preencho o campo nome do projeto profissional "<nomeProjeto>"
    And seleciono uma linha de pesquisa profissional "<linhaPesquisa>"
    And preencho o campo data de inicio profissional "<dataInicio>"
    And preencho o campo descricao do projeto profissional "<descricao>"
    And seleciono um docente profissional "<docente>"
    And clico no botao MAIS profissional para inserir o docente
    And seleciono o checkbox do responsavel profissional
    When clico no botao atualizar projeto profissional
    Then o sistema insere o novo projeto e apresenta uma mensagem de sucesso profissional "<mensagem>"

    Examples:
      |nomeProjeto  |linhaPesquisa |dataInicio |descricao |docente                                 |mensagem                                               |
      |             |linha teste   |21082019   |TESTE     |ANA BEVILAQUA PENNA FRANCA (01402495757)|Nome: Campo de preenchimento obrigatório.              |
      |teste        |linha teste   |           |TESTE     |ANA BEVILAQUA PENNA FRANCA (01402495757)|Data de Início: Campo de preenchimento obrigatório.    |
      |TESTE        |linha teste   |21082019   |          |ANA BEVILAQUA PENNA FRANCA (01402495757)|Descrição: Campo de preenchimento obrigatório.         |


