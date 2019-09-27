@14AbaProjetosDePesquisa
Feature: Dados dos Projetos de Pesquisa Academica

  Scenario Outline: Preencher dados dos projetos de pesquisa academica
    Given que estou na tela de Dados dos Projetos de Pesquisa Academica
    And preencho o campo nome do projeto academico "<nomeProjeto>"
    And seleciono uma linha de pesquisa academica "<linhaPesquisa>"
    And preencho o campo data de inicio academico "<dataInicio>"
    And preencho o campo descricao do projeto academico "<descricao>"
    And preencho o campo descricao do financiador academico "<descFinanciador>"
    And seleciono um docente academico "<docente>"
    And clico no botao MAIS academico para inserir o docente
    And seleciono o checkbox do responsavel academico
    When clico no botao inserir projeto academico
    Then o sistema insere o novo projeto e apresenta uma mensagem de sucesso "<mensagem>"


    Examples:
   |nomeProjeto |linhaPesquisa |dataInicio |descricao |descFinanciador |docente                        |mensagem                                           |
   |Teste       |teste         |20082019   |TESTE     |Teste           |BIANCA SILVA LINS (10382939441)|Projeto de Pesquisa foi cadastrado(a) com sucesso. |



  Scenario Outline: Alterar dados dos projetos de pesquisa academica
    Given que estou na tela de Dados dos Projetos de Pesquisa Academica
    And clico no botao editar projeto academico
    And preencho o campo nome do projeto academico "<nomeProjeto>"
    And seleciono uma linha de pesquisa academica "<linhaPesquisa>"
    And preencho o campo data de inicio academico "<dataInicio>"
    And preencho o campo descricao do projeto academico "<descricao>"
    And preencho o campo descricao do financiador academico "<descFinanciador>"
    When clico no botao atualizar projeto academico
    Then o sistema insere o novo projeto e apresenta uma mensagem de sucesso "<mensagem>"

    Examples:
      |nomeProjeto  |linhaPesquisa |dataInicio |descricao    |descFinanciador |mensagem                                         |
      |Teste Editar |teste         |21082019   |TESTE EDITAR |Teste Editar    |Projeto de Pesquisa foi alterado(a) com sucesso. |


  Scenario Outline: Campo Docente Obrigatorio clicando no botao MAIS academico
    Given que estou na tela de Dados dos Projetos de Pesquisa Academica
    And clico no botao MAIS academico para inserir o docente
    Then o sistema apresenta uma mensagem de de erro "<mensagem>"

    Examples:
     |mensagem                                     |
     |Docente: Campo de preenchimento obrigatório. |


  Scenario Outline: Campos Obrigatorios clicando no botao inserir projeto academico
    Given que estou na tela de Dados dos Projetos de Pesquisa Academica
    And preencho o campo nome do projeto academico "<nomeProjeto>"
    And seleciono uma linha de pesquisa academica "<linhaPesquisa>"
    And preencho o campo data de inicio academico "<dataInicio>"
    And preencho o campo descricao do projeto academico "<descricao>"
    And seleciono um docente academico "<docente>"
    And clico no botao MAIS academico para inserir o docente
    And seleciono o checkbox do responsavel academico
    When clico no botao atualizar projeto academico
    Then o sistema insere o novo projeto e apresenta uma mensagem de sucesso "<mensagem>"

    Examples:
      |nomeProjeto  |linhaPesquisa |dataInicio |descricao |docente                           |mensagem                                               |
      |             |teste         |21082019   |TESTE     |WALTER MEUCCI NIQUE (15055752068) |Nome: Campo de preenchimento obrigatório.              |
      |teste        |teste         |           |TESTE     |WALTER MEUCCI NIQUE (15055752068) |Data de Início: Campo de preenchimento obrigatório.    |
      |TESTE        |teste         |21082019   |          |WALTER MEUCCI NIQUE (15055752068) |Descrição: Campo de preenchimento obrigatório.         |


