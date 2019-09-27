@PaginaMinhasPropostasProfissionais
Feature: Preenche Dados da Pagina Minhas Propostas

  Scenario Outline: Preencher dados da Pagina Minhas propostas profissionais
    Given estou na pagina de Minhas propostas profissionais
    And estou na aba Propostas profissionais
    And possuo uma tabela referente a "<instituicaoDeEnsino>"
    When clico no icone de play referente ao programa profissional "<programa>"
    Then sou direcionado a "<aba>" Proposta e Curso profissional

    Examples:
      | instituicaoDeEnsino                           | programa                        |   aba          |
      | UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE   | teste automatizado profissional |Proposta/Curso  |

