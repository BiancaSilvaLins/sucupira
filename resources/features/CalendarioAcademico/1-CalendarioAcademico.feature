@1CalendarioAcademico
Feature: Calendario Academico

  Scenario Outline: Verificar calendario de propostas de novos cursos
    Given que estou na tela Inicial
    And possuo "<calendario>" de proposta de novos cursos
    When clico no botao de calendario de propostas de novos cursos academico
    Then devo obter tela de solicitacaoo de novos cursos "<tituloTelaSolicitacao>"
    Examples:
      | calendario                                       | tituloTelaSolicitacao       |
      | PROPOSTA DE CURSOS NOVOS - ACADÊMICO (ACADÊMICO) | Solicitação de Novos Cursos |


