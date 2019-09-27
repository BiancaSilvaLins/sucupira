@AbaAtividadesDosDocentes
Feature: Dados das Atividades Dos Docentes profissionais

  Scenario Outline: Preencher dados das Atividades dos Docentes profissionais
    Given que estou na tela de dados das Atividades dos Docentes profissionais
    And seleciono um docente profissional para preencher os dados "<docente>"
    And preencho o campo iniciacao cientifica profissional "<iniciacaoCientifica>"
    And preencho o campo especializacao profissional "<especializacao>"
    And preencho o campo mestrado profissional "<mestrado>"
    And preencho o campo trabalho de conclusao de curso profissional "<trabConclusao>"
    And preencho o campo doutorado profissional "<doutorado>"
    And preencho o campo mestrado profissional2 "<mestrado2>"
    And preencho o campo doutorado profissional2 "<doutorado2>"
    And preencho o campo participacao em projetos profissionais "<participacaoProjetos>"
    And preencho o campo artes cenicas profissional "<artesCenicas>"
    And preencho o campo artes visuais profissional "<artesVisuais>"
    And preencho o campo musica profissional "<musica>"
    And preencho o campo outra producao cultural profissional "<outraProd>"
    And preencho o campo artigo em jornal ou revista profissional "<artigoJR>"
    And preencho o campo artigo em periodico profissional "<artigoPeriodico>"
    And preencho o campo livro profissional "<livro>"
    And preencho o campo outro profissional "<outro>"
    And preencho o campo partitura musical profissional "<partituraMusical>"
    And preencho o campo trabalho em anais profissional "<trabalhoAnais>"
    And preencho o campo traducao profissional "<traducao>"
    And preencho o campo apresentacao de trabalho profissional "<apresentacaoTrab>"
    And preencho o campo cartas profissional "<cartas>"
    And preencho o campo curso de curta duracao profissional "<cursoCurto>"
    And preencho o campo desenvolvimento de aplicativo profissional "<desenvApp>"
    And preencho o campo desenvolvimento de material didatico e instrucional profissional "<desenvMaterial>"
    And preencho o campo desenvolvimento de producao profissional "<desenvProd>"
    And preencho o campo desenvolvimento de tecnica profissional "<desenvTecnica>"
    And preencho o campo editoria profissional "<editoria>"
    And preencho o campo manutencao de obra artistica profissional "<manutArtistica>"
    And preencho o campo maquete profissional "<maquete>"
    And preencho o campo organizacao de evento profissional "<organizacao>"
    And preencho o campo outros profissional "<outros>"
    And preencho o campo patente profissional "<patente>"
    And preencho o campo programa de radio ou tv profissional "<progRadioTv>"
    And preencho o campo relatorio de pesquisa profissional "<relatorio>"
    And preencho o campo servicos tecnicos profissional "<servTecnicos>"
    When clico no botao salvar dados profissionais
    Then o sistema salva as atividades profissionais do docente e exibe a mensagem "<mensagem>"

    Examples:
   |docente                         |iniciacaoCientifica |especializacao |mestrado |trabConclusao |doutorado |mestrado2 |doutorado2 |participacaoProjetos |artesCenicas |artesVisuais|musica|outraProd|artigoJR|artigoPeriodico|livro|outro|partituraMusical|trabalhoAnais|traducao|apresentacaoTrab|cartas|cursoCurto|desenvApp|desenvMaterial|desenvProd|desenvTecnica|editoria|manutArtistica|maquete|organizacao|outros|patente|progRadioTv|relatorio|servTecnicos|mensagem                                                           |
   |BIANCA SILVA LINS (10382939441) |10                  |10             |10       |10            |10        |10        |10         |10                   |10           |10          |10    |10       |10      |10             |10   |10   |10              |10           |10      |10              |10    |10        |10       |10            |10        |10           |10      |10            |10     |10         |10    |10     |10         |10       |10          |Os dados da Atividades dos Docentes foram cadastrados com sucesso. |