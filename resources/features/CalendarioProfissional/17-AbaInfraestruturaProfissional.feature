@AbaInfraestrutura
Feature: Dados da Infraestrutura profissional

  Scenario Outline: Preencher dados da Infraestrutura profissional Fluxo Principal
    Given que estou na tela de dados da Infraestrutura profissional
    And preencho o campo Municipio para programas a distancia profissional "<municipio>"
    And clico na opcao Sim para infraestrutura administrativa exclusiva profissional
    And clico na opcao Sim para salas para docentes profissionais
    And preencho o campo Numero de Salas profissional "<numeroSalas1>"
    And clico na opcao Sim para salas equipadas com computadores profissionais
    And preencho o campo Numero de Salas equipada com computadores profissional "<numeroSalas2>"
    And preencho o campo Labotarios para pesquisas profissionais "<laboratorios>"
    And clico na opcao Sim para biblioteca ligada a rede mundial de computadores profissionais
    And preencho o campo Numero de Computadores na biblioteca profissional"<numeroComputadores>"
    And preencho o campo Caracterizacao do Acervo da biblioteca profissional "<acervo>"
    And preencho o campo Financiamentos profissionais "<financiamentos>"
    And preencho o campo Informacoes adicionais profissionais "<adicionais>"
    When clico no botao salvar dados da infraestrutura profissional
    Then o sistema salva os dados da infraestrutura profissional e exibe a mensagem "<mensagem>"

    Examples:
   |municipio |numeroSalas1 |numeroSalas2 |laboratorios |numeroComputadores |acervo |financiamentos |adicionais |adicionais |mensagem                                                                              |
   |Teste     |50           |20           |Teste        |100                |Teste  |Teste          |Teste      |Teste      |Os dados da Infraestrutura (Preenchimento Obrigatório) foram cadastrados com sucesso. |

  Scenario Outline: Preencher dados da Infraestrutura profissional Fluxo Alternativo com a opcao Nao
    Given que estou na tela de dados da Infraestrutura profissional
    And preencho o campo Municipio para programas a distancia profissional "<municipio>"
    And clico na opcao Nao para infraestrutura administrativa exclusiva profissional
    And clico na opcao Nao para salas para docentes profissionais
    And clico na opcao Nao para salas equipadas com computadores profissionais
    And preencho o campo Labotarios para pesquisas profissionais "<laboratorios>"
    And clico na opcao Nao para biblioteca ligada a rede mundial de computadores profissionais
    And preencho o campo Caracterizacao do Acervo da biblioteca profissional "<acervo>"
    And preencho o campo Financiamentos profissionais "<financiamentos>"
    And preencho o campo Informacoes adicionais profissionais "<adicionais>"
    When clico no botao salvar dados da infraestrutura profissional
    Then o sistema salva os dados da infraestrutura profissional e exibe a mensagem "<mensagem>"

    Examples:
      |municipio |laboratorios |acervo |financiamentos |adicionais |adicionais |mensagem                                                                              |
      |Teste     |Teste        |Teste  |Teste          |Teste      |Teste      |Os dados da Infraestrutura (Preenchimento Obrigatório) foram cadastrados com sucesso. |
