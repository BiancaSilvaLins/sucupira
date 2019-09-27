@CalendarioProfissional
Feature: Calendario Profissional

  Scenario Outline: Verificar calendario Profissional de propostas de novos cursos
    Given que estou na tela Inicial
    And possuo "<calendario>" profissional de proposta de novos cursos
    When clico no botao de calendario profissional de propostas de novos cursos academico
    Then devo obter tela de solicitacaoo de novos cursos "<tituloTelaSolicitacao>"
    Examples:
      | calendario                                             | tituloTelaSolicitacao       |
      | PROPOSTA DE CURSOS NOVOS - PROFISSIONAL (PROFISSIONAL) | Solicitação de Novos Cursos |


