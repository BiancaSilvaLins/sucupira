@2PreencheDadosInstituicao
Feature: Preenche Dados da Instituição

  Scenario Outline: Preencher dados da instituicao de ensino superior quando a proposta NAO corresponde a um novo curso vinculado a programa recomendado pela CAPES
    Given estou na tela de solicitacao de novos cursos "<titulo>"
    And preencho o campo "<dadosDaInstituicao>" com as tres primeira iniciais da ies
    And seleciono a "<instituicaoDeEnsino>"
    And seleciono Nao para a opcao de correspondencia a um novo curso vinculado a programa
    And Preencho o campo de "<programa>"
    And seleciono o "<tipoDeDocumento>" do coordenador
    And preencho o campo "<numeroDoDocumento>"
    And preencho os campos "<ddd>" e "<telefone>"
    When clico no botao de criar proposta
    Then sera encaminhado pagina de Dados da Proposta de Programa

    Examples:
      | titulo                      | dadosDaInstituicao | instituicaoDeEnsino                                        | programa                       | tipoDeDocumento | numeroDoDocumento | ddd | telefone  |
      | Solicitação de Novos Cursos | ufrn               | 23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN)| teste automatizado academico   | CPF             | 80732810400       | 61  | 123456789 |

  Scenario Outline: Preencher dados da instituição de ensino superior quando a proposta  corresponde a um novo curso vinculado a programa recomendado pela CAPES
    Given estou na tela de solicitacao de novos cursos "<titulo>"
    And preencho o campo "<dadosDaInstituicao>" com as tres primeira iniciais da ies
    And seleciono a "<instituicaoDeEnsino>"
    And seleciono Sim para a opcao de correspondencia a um novo curso vinculado a programa
    And seleciono o "<programa>"
    And a aba de Dados do "<Coordenador>" aparecer
    And preencho os campos login "<login>" e senha "<senha>"
    When clico no botao de criar proposta confirmacao
    Then sera encaminhado pagina de Dados da Proposta de Programa

    Examples:
      | titulo                      | dadosDaInstituicao | instituicaoDeEnsino                                         | programa            | Coordenador                    |login       |senha   |
      | Solicitação de Novos Cursos | ufrn               | 23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) | ADM (23001011007P0) | RUBENS MARIBONDO DO NASCIMENTO |80732810400 |sucup1r4|


