@17AbaInfraestrutura
Feature: Dados da Infraestrutura academica

  Scenario Outline: Preencher dados da Infraestrutura academica Fluxo Principal
    Given que estou na tela de dados da Infraestrutura academica
    And preencho o campo Municipio para programas a distancia academica "<municipio>"
    And clico na opcao Sim para infraestrutura administrativa exclusiva academica
    And clico na opcao Sim para salas para docentes academicos
    And preencho o campo Numero de Salas Academico "<numeroSalas1>"
    And clico na opcao Sim para salas equipadas com computadores academicos
    And preencho o campo Numero de Salas equipada com computadores Academico "<numeroSalas2>"
    And preencho o campo Labotarios para pesquisas academicas "<laboratorios>"
    And clico na opcao Sim para biblioteca ligada a rede mundial de computadores academicos
    And preencho o campo Numero de Computadores na biblioteca "<numeroComputadores>"
    And preencho o campo Caracterizacao do Acervo da biblioteca academica "<acervo>"
    And preencho o campo Financiamentos academicos "<financiamentos>"
    And preencho o campo Informacoes adicionais academicas "<adicionais>"
    When clico no botao salvar dados da infraestrutura academica
    Then o sistema salva os dados da infraestrutura academica e exibe a mensagem "<mensagem>"

    Examples:
   |municipio |numeroSalas1 |numeroSalas2 |laboratorios |numeroComputadores |acervo |financiamentos |adicionais |adicionais |mensagem                                                                              |
   |Teste     |50           |20           |Teste        |100                |Teste  |Teste          |Teste      |Teste      |Os dados da Infraestrutura (Preenchimento Obrigatório) foram cadastrados com sucesso. |

  Scenario Outline: Preencher dados da Infraestrutura academica Fluxo Alternativo com a opcao Nao
    Given que estou na tela de dados da Infraestrutura academica
    And preencho o campo Municipio para programas a distancia academica "<municipio>"
    And clico na opcao Nao para infraestrutura administrativa exclusiva academica
    And clico na opcao Nao para salas para docentes academicos
    And clico na opcao Nao para salas equipadas com computadores academicos
    And preencho o campo Labotarios para pesquisas academicas "<laboratorios>"
    And clico na opcao Nao para biblioteca ligada a rede mundial de computadores academicos
    And preencho o campo Caracterizacao do Acervo da biblioteca academica "<acervo>"
    And preencho o campo Financiamentos academicos "<financiamentos>"
    And preencho o campo Informacoes adicionais academicas "<adicionais>"
    When clico no botao salvar dados da infraestrutura academica
    Then o sistema salva os dados da infraestrutura academica e exibe a mensagem "<mensagem>"

    Examples:
      |municipio |laboratorios |acervo |financiamentos |adicionais |adicionais |mensagem                                                                              |
      |Teste     |Teste        |Teste  |Teste          |Teste      |Teste      |Os dados da Infraestrutura (Preenchimento Obrigatório) foram cadastrados com sucesso. |
