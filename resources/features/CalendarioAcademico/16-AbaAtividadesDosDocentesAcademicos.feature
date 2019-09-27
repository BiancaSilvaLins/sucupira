@16AbaAtividadesDosDocentes
Feature: Dados das Atividades Dos Docentes Academicos

  Scenario Outline: Preencher dados das Atividades dos Docentes Academicos
    Given que estou na tela de dados das Atividades dos Docentes Academicos
    And seleciono um docente academico para preencher os dados "<docente>"
    And preencho o campo iniciacao cientifica academica "<iniciacaoCientifica>"
    And preencho o campo especializacao academica "<especializacao>"
    And preencho o campo mestrado academico "<mestrado>"
    And preencho o campo trabalho de conclusao de curso academico "<trabConclusao>"
    And preencho o campo doutorado academico "<doutorado>"
    And preencho o campo mestrado academico2 "<mestrado2>"
    And preencho o campo doutorado academico2 "<doutorado2>"
    And preencho o campo participacao em projetos academicos "<participacaoProjetos>"
    And preencho o campo artes cenicas academico "<artesCenicas>"
    And preencho o campo artes visuais academico "<artesVisuais>"
    And preencho o campo musica academico "<musica>"
    And preencho o campo outra producao cultural academico "<outraProd>"
    And preencho o campo artigo em jornal ou revista academico "<artigoJR>"
    And preencho o campo artigo em periodico academico "<artigoPeriodico>"
    And preencho o campo livro academico "<livro>"
    And preencho o campo outro academico "<outro>"
    And preencho o campo partitura musical academico "<partituraMusical>"
    And preencho o campo trabalho em anais academico "<trabalhoAnais>"
    And preencho o campo traducao academico "<traducao>"
    And preencho o campo apresentacao de trabalho academico "<apresentacaoTrab>"
    And preencho o campo cartas academico "<cartas>"
    And preencho o campo curso de curta duracao academico "<cursoCurto>"
    And preencho o campo desenvolvimento de aplicativo academico "<desenvApp>"
    And preencho o campo desenvolvimento de material didatico e instrucional academico "<desenvMaterial>"
    And preencho o campo desenvolvimento de producao academico "<desenvProd>"
    And preencho o campo desenvolvimento de tecnica academico "<desenvTecnica>"
    And preencho o campo editoria academico "<editoria>"
    And preencho o campo manutencao de obra artistica academico "<manutArtistica>"
    And preencho o campo maquete academico "<maquete>"
    And preencho o campo organizacao de evento academico "<organizacao>"
    And preencho o campo outros academico "<outros>"
    And preencho o campo patente academico "<patente>"
    And preencho o campo programa de radio ou tv academico "<progRadioTv>"
    And preencho o campo relatorio de pesquisa academico "<relatorio>"
    And preencho o campo servicos tecnicos academico "<servTecnicos>"
    When clico no botao salvar dados academicos
    Then o sistema salva as atividades academicas do docente e exibe a mensagem "<mensagem>"

    Examples:
   |docente                         |iniciacaoCientifica |especializacao |mestrado |trabConclusao |doutorado |mestrado2 |doutorado2 |participacaoProjetos |artesCenicas |artesVisuais|musica|outraProd|artigoJR|artigoPeriodico|livro|outro|partituraMusical|trabalhoAnais|traducao|apresentacaoTrab|cartas|cursoCurto|desenvApp|desenvMaterial|desenvProd|desenvTecnica|editoria|manutArtistica|maquete|organizacao|outros|patente|progRadioTv|relatorio|servTecnicos|mensagem                                                           |
   |BIANCA SILVA LINS (10382939441) |10                  |10             |10       |10            |10        |10        |10         |10                   |10           |10          |10    |10       |10      |10             |10   |10   |10              |10           |10      |10              |10    |10        |10       |10            |10        |10           |10      |10            |10     |10         |10    |10     |10         |10       |10          |Os dados da Atividades dos Docentes foram cadastrados com sucesso. |