@AbaPropostaCursoProfissional
Feature: Preenche Dados da aba de Proposta e Curso

  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Fusão de Curso Existente
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento "<areaConhecimento>"
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
      | areaConhecimento             | anoInicio               |modalidade            | nivelCursoProposto  | historicoCurso            | primeiroCodigoProgramaOriginal     |segundoCodigoProgramaOriginal|
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Educação a Distância | Mestrado            | Fusão de Curso Existente  |     23001011026P4                  |     23001011007P0           |
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Educação Presencial  | Doutorado           | Fusão de Curso Existente  |     23001011026P4                  |     23001011007P0           |


  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Desmembramento de Curso Existente
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento "<areaConhecimento>"
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
      | areaConhecimento             | anoInicio               |nivelCursoProposto      | historicoCurso                         | primeiroCodigoProgramaOriginal|
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Doutorado              | Desmembramento de Curso Existente      |     23001011026P4                  |
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Mestrado               | Desmembramento de Curso Existente      |     23001011026P4                  |


  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Reapresentação da Proposta de Curso ou Nova Proposta de Curso
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento "<areaConhecimento>"
    And seleciono SIM para graduacao na area afim academico
    And preencho o  ano de inicio academico "<anoInicio>"
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico do curso na capes "<historicoCurso>"
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | areaConhecimento             | anoInicio               |nivelCursoProposto      | historicoCurso                      |
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Doutorado              | Nova Proposta de Curso              |
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Doutorado              | Reapresentação da Proposta de Curso |
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Mestrado               | Nova Proposta de Curso              |
      | FÍSICA MATEMÁTICA (10104011) |           2000          | Mestrado               | Reapresentação da Proposta de Curso |


  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao NAO em graduacao na area afim e Desmembramento de Curso Existente ou Fusão de Curso Existente
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento academico"<areaConhecimento>"
    And seleciono SIM para graduacao na area afim academico
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico do curso na capes "<historicoCurso>"
    And preencho o campo de codigo do primeiro programa academico original "<primeiroCodigoProgramaOriginal>"
    And clico no simbolo MAIS academico
    And surgir a tabela de Programas Academicos Associados
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | areaConhecimento             | nivelCursoProposto      | historicoCurso                         | primeiroCodigoProgramaOriginal|
      | FÍSICA MATEMÁTICA (10104011) |     Doutorado           | Desmembramento de Curso Existente      |     23001011026P4                  |
      | FÍSICA MATEMÁTICA (10104011) |      Doutorado          | Fusão de Curso Existente               |     23001011026P4                  |
      | FÍSICA MATEMÁTICA (10104011) |     Mestrado            | Desmembramento de Curso Existente      |     23001011026P4                  |
      | FÍSICA MATEMÁTICA (10104011) |       Mestrado          | Fusão de Curso Existente               |     23001011026P4                  |

  Scenario Outline: Preencher dados da aba Proposta e Curso para opcao SIM em graduacao na area afim e Reapresentação da Proposta de Curso ou Nova Proposta de Curso
    Given estou na aba de Proposta e Curso Academico
    And preencho o campo area de conhecimento "<areaConhecimento>"
    And seleciono SIM para graduacao na area afim academico
    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
    And seleciono o historico do curso na capes "<historicoCurso>"
    When clico no botao Inserir curso academico
    Then a tabela Propostas de Cursos Academicos Cadastrados surgira

    Examples:
      | areaConhecimento             | nivelCursoProposto      | historicoCurso                      |
      | FÍSICA MATEMÁTICA (10104011) | Doutorado               | Nova Proposta de Curso              |
      | FÍSICA MATEMÁTICA (10104011) | Doutorado               | Reapresentação da Proposta de Curso |
      | FÍSICA MATEMÁTICA (10104011) |  Mestrado               | Nova Proposta de Curso              |
      | FÍSICA MATEMÁTICA (10104011) |  Mestrado               | Reapresentação da Proposta de Curso |