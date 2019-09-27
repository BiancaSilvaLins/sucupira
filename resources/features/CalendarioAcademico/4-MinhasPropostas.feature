@4PaginaMinhasPropostas
Feature: Preenche Dados da Pagina Minhas Propostas

  Scenario Outline: Preencher dados da Pagina Minhas propostas
    Given estou na pagina de Minhas propostas
    And estou na aba Propostas
    And possuo uma tabela referente a "<instituicaoDeEnsino>"
    When clico no icone de play referente ao "<programa>"
    Then sou direcionado a "<aba>" Proposta e Curso

    Examples:
      | instituicaoDeEnsino                         | programa           | aba             |
      | UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE | teste automatizado | Proposta/Curso  |

