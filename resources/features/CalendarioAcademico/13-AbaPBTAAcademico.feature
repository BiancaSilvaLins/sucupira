@13AbaProducaoBibliograficaTecnicaEArtisticaAcademico
Feature: Producao Bibliografica Tecnica e Artitisca  Academico

  Scenario Outline: Preencher os dados de Producao Bibliografica Tecnica e Artistica academica
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica academico
    And seleciono o campo docente academico "<docente>"
    And preencho data de producao academica "<data>"
    And preencho campo nome academico "<nome>"
    And seleciono o tipo de producao academica "<tipoProducao>"
    And seleciono o subtipo de producao academica "<subtipoProducao>"
    And preencho o campo natureza bibliografica academica "<natureza>"
    And preencho o campo nome da editora academica "<editora>"
    And preencho o campo idioma academico "<idioma>"
    And seleciono o tipo da divulgacao da producao academica "<tipoDivulgacao>"
    And preencho campo nome de um subAutor academico "<nome2>"
    And preencho o campo abreviatura de um subAutor academico "<abreviatura>"
    And clico no botao Inserir Autor academico
    And o sistema insere um novo autor da producao e exibe a lista de autores academicos "<listaAutores>"
    When clico no botao inserir Producao academica
    Then o sistema insere a nova producao academica e emite a mensagem academica "<mensagem>"


    Examples:
    |docente                         |data     |nome  |tipoProducao  |subtipoProducao |natureza |editora |idioma    |tipoDivulgacao |nome2 |abreviatura |listaAutores                        |mensagem                                |
    |BIANCA SILVA LINS (10382939441) |01062019 |Teste |BIBLIOGRÁFICA |OUTRO           |Teste    |Teste   |Português |IMPRESSO       |João  |J.O         |Autore(s) Adicionado(s) na produção |Produção foi cadastrado(a) com sucesso. |


  Scenario Outline: Excluir os dados de Producao Bibliografica Tecnica e Artistica academica
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica academico
    And seleciono o campo docente academico "<docente>"
    And seleciono o checkbox da producao academica desejada
    When clico no botao remover producoes academicas
    Then o sistema exclui a producao academica e emite a mensagem academica "<mensagem>"

    Examples:
      |docente                         |mensagem                               |
      |BIANCA SILVA LINS (10382939441) |Produções foram removidas com sucesso. |


  Scenario Outline: Editar os dados de Producao Bibliografica Tecnica e Artistica academica
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica academico
    And seleciono o campo docente academico "<docente>"
    And clico no editar
    And preencho data de producao academica "<data>"
    And preencho campo nome academico "<nome>"
    And preencho o campo natureza bibliografica academica "<natureza>"
    And preencho o campo nome da editora academica "<editora>"
    And preencho o campo idioma academico "<idioma>"
    When clico no botao atualizar producao academica
    Then o sistema atualiza a producao academica e emite a mensagem academica "<mensagem>"

    Examples:
      |docente                         |data     |nome        |natureza     |editora      |idioma           |mensagem                               |
      |BIANCA SILVA LINS (10382939441) |06062019 |Teste Editar|Teste Editar |Teste Editar |Português Brasil |Produção foi alterado(a) com sucesso.  |

