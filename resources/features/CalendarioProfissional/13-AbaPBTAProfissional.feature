@AbaProducaoBibliograficaTecnicaEArtisticaProfissional
Feature: Producao Bibliografica Tecnica e Artitisca  Profissional

  Scenario Outline: Preencher os dados de Producao Bibliografica Tecnica e Artistica profissional
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica profissional
    And seleciono o campo docente profissional "<docente>"
    And preencho data de producao profissional "<data>"
    And preencho campo nome profissional "<nome>"
    And seleciono o tipo de producao profissional "<tipoProducao>"
    And seleciono o subtipo de producao profissional "<subtipoProducao>"
    And preencho o campo natureza bibliografica profissional "<natureza>"
    And preencho o campo nome da editora profissional "<editora>"
    And preencho o campo idioma profissional "<idioma>"
    And seleciono o tipo da divulgacao da producao profissional "<tipoDivulgacao>"
    And preencho campo nome de um subAutor profissional "<nome2>"
    And preencho o campo abreviatura de um subAutor profissional "<abreviatura>"
    And clico no botao Inserir Autor profissional
    And o sistema insere um novo autor da producao e exibe a lista de autores profissionais "<listaAutores>"
    When clico no botao inserir Producao profissional
    Then o sistema insere a nova producao profissional e emite a mensagem profissional "<mensagem>"


    Examples:
    |docente                                  |data     |nome  |tipoProducao  |subtipoProducao |natureza |editora |idioma    |tipoDivulgacao |nome2 |abreviatura |listaAutores                        |mensagem                                |
    |ANA BEVILAQUA PENNA FRANCA (01402495757) |01062019 |Teste |BIBLIOGRÁFICA |OUTRO           |Teste    |Teste   |Português |IMPRESSO       |João  |J.O         |Autore(s) Adicionado(s) na produção |Produção foi cadastrado(a) com sucesso. |


  Scenario Outline: Excluir os dados de Producao Bibliografica Tecnica e Artistica profissional
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica profissional
    And seleciono o campo docente profissional "<docente>"
    And seleciono o checkbox da producao profissional desejada
    When clico no botao remover producoes profissionais
    Then o sistema exclui a producao profissional e emite a mensagem profissional "<mensagem>"

    Examples:
      |docente                                  |mensagem                               |
      |ANA BEVILAQUA PENNA FRANCA (01402495757) |Produções foram removidas com sucesso. |


  Scenario Outline: Editar os dados de Producao Bibliografica Tecnica e Artistica profissional
    Given que estou na tela de Producao Bibliografica Tecnica e Artistica profissional
    And seleciono o campo docente profissional "<docente>"
    And clico no editar profissional
    And preencho data de producao profissional "<data>"
    And preencho campo nome profissional "<nome>"
    And preencho o campo natureza bibliografica profissional "<natureza>"
    And preencho o campo nome da editora profissional "<editora>"
    And preencho o campo idioma profissional "<idioma>"
    When clico no botao atualizar producao profissional
    Then o sistema atualiza a producao profissional e emite a mensagem profissional "<mensagem>"

    Examples:
      |docente                                  |data     |nome        |natureza     |editora      |idioma           |mensagem                               |
      |ANA BEVILAQUA PENNA FRANCA (01402495757) |06062019 |Teste Editar|Teste Editar |Teste Editar |Português Brasil |Produção foi alterado(a) com sucesso.  |

