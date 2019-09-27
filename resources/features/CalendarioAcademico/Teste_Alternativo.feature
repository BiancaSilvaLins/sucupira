#@CalendarioAcademico
#Feature: Calendario Academico
#
#  Scenario Outline: Preencher dados de Areas de Concentracao Academica
#    Given estou na aba de Areas de Concentracao e Linhas de Pesquisa Academica
#    And preencho o campo nome da area "<nomeArea>"
#    And preencho o campo descricao da area "<descricaoArea>"
#    When clico no botao Inserir Area
#    Then o sistema apresenta duas mensagens de campos obrigatorios "<mensagem1>" "<mensagem2>"
#
#
#    Examples:
#      |nomeArea |descricaoArea |mensagem1                                                         | mensagem2                                                             |
#      |         |              |Nome da Área de Concentração: Campo de preenchimento obrigatório. |Descrição da Área de Concentração: Campo de preenchimento obrigatório. |