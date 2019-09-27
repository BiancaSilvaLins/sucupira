@5AbaPropostaCurso
Feature: Preenche Dados da aba de Proposta e Curso

  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Fusão de Curso Existente
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento academico
    And seleciono SIM para graduacao na area afim academico
    And preencho o  ano de inicio academico "<anoInicio>"
    And seleciono a modalidade de ensino "<modalidade>"
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico academico do curso na capes "<historicoCurso>"
    And preencho o campo de codigo do primeiro programa academico original "<primeiroCodigoProgramaOriginal>"
    And clico no simbolo MAIS academico
    And preencho o campo de codigo do segundo programa academico original "<segundoCodigoProgramaOriginal>"
    And clico no simbolo MAIS academico
    And surgir a tabela de Programas Academicos Associados
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | anoInicio               |modalidade            | nivelCursoProposto  | historicoCurso            | primeiroCodigoProgramaOriginal     |segundoCodigoProgramaOriginal|
      |           2000          | Educação a Distância | Mestrado            | Fusão de Curso Existente  |     23001011026P4                  |     23001011007P0           |
      |           2000          | Educação Presencial  | Doutorado           | Fusão de Curso Existente  |     23001011026P4                  |     23001011007P0           |

  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Desmembramento de Curso Existente
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento academico
    And seleciono SIM para graduacao na area afim academico
    And preencho o  ano de inicio academico "<anoInicio>"
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico do curso na capes "<historicoCurso>"
    And preencho o campo de codigo do primeiro programa academico original "<primeiroCodigoProgramaOriginal>"
    And clico no simbolo MAIS academico
    And surgir a tabela de Programas Academicos Associados
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | anoInicio               |nivelCursoProposto      | historicoCurso                         | primeiroCodigoProgramaOriginal|
      |           2000          | Doutorado              | Desmembramento de Curso Existente      |     23001011026P4                  |
      |           2000          | Mestrado               | Desmembramento de Curso Existente      |     23001011026P4                  |


  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Reapresentação da Proposta de Curso ou Nova Proposta de Curso
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento academico
    And seleciono SIM para graduacao na area afim academico
    And preencho o  ano de inicio academico "<anoInicio>"
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico do curso na capes "<historicoCurso>"
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | anoInicio               |nivelCursoProposto      | historicoCurso                      |
      |           2000          | Doutorado              | Nova Proposta de Curso              |
      |           2000          | Doutorado              | Reapresentação da Proposta de Curso |
      |           2000          | Mestrado               | Nova Proposta de Curso              |
      |           2000          | Mestrado               | Reapresentação da Proposta de Curso |

  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao NAO em graduacao na area afim e Desmembramento de Curso Existente ou Fusão de Curso Existente
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento academico
    And seleciono SIM para graduacao na area afim academico
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico do curso na capes "<historicoCurso>"
    And preencho o campo de codigo do primeiro programa academico original "<primeiroCodigoProgramaOriginal>"
    And clico no simbolo MAIS academico
    And surgir a tabela de Programas Academicos Associados
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | nivelCursoProposto      | historicoCurso                         | primeiroCodigoProgramaOriginal|
      |     Doutorado           | Desmembramento de Curso Existente      |     23001011026P4                  |
      |      Doutorado          | Fusão de Curso Existente               |     23001011026P4                  |
      |     Mestrado            | Desmembramento de Curso Existente      |     23001011026P4                  |
      |       Mestrado          | Fusão de Curso Existente               |     23001011026P4                  |

  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Reapresentação da Proposta de Curso ou Nova Proposta de Curso
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento
    And seleciono SIM para graduacao na area afim academico
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico do curso na capes "<historicoCurso>"
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | nivelCursoProposto      | historicoCurso                      |
      | Doutorado               | Nova Proposta de Curso              |
      | Doutorado               | Reapresentação da Proposta de Curso |
      |  Mestrado               | Nova Proposta de Curso              |
      |  Mestrado               | Reapresentação da Proposta de Curso |