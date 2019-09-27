@PreencheDadosInstituicao
Feature: Preenche Dados da Instituição

  Scenario Outline: Preencher dados da instituicao de ensino superior quando a proposta NAO corresponde a um novo curso vinculado a programa recomendado pela CAPES
    Given estou na tela de solicitacao de novos cursos profissionais "<titulo>"
    And preencho o campo "<dadosDaInstituicao>" com as tres primeira iniciais da ies profissional
    And seleciono a "<instituicaoDeEnsino>" profissional
    And seleciono Nao para a opcao de correspondencia a um novo curso vinculado a programa profissional
    And Preencho o campo de "<programa>" profissional
    And seleciono o "<tipoDeDocumento>" do coordenador profissional
    And preencho o campo "<numeroDoDocumento>" profissional
    And preencho os campos "<ddd>" e "<telefone>" profissional
    When clico no botao de criar proposta profissional
    Then sera encaminhado pagina de Dados da Proposta de Programa profissional

    Examples:
      | titulo                      | dadosDaInstituicao | instituicaoDeEnsino                                        | programa                       | tipoDeDocumento | numeroDoDocumento | ddd | telefone  |
      | Solicitacao de Novos Cursos | ufrn               | 23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN)| teste automatizado academico   | CPF             | 80732810400       | 61  | 123456789 |

  Scenario Outline: Preencher dados da instituição de ensino superior quando a proposta  corresponde a um novo curso vinculado a programa recomendado pela CAPES
    Given estou na tela de solicitacao de novos cursos profissionais "<tituloProfissional>"
    And preencho o campo "<dadosDaInstituicaoProfissional>" com as tres primeira iniciais da ies profissional
    And seleciono a "<instituicaoDeEnsinoProfissional>" profissional
    And seleciono Sim para a opcao de correspondencia a um novo curso vinculado a programa profissional
    And seleciono o "<programaProfissional>" profissional
    And a aba de Dados do "<CoordenadorProfissional>" aparecer profissional
    And preencho os campos login "<loginProfissional>" e senha "<senhaProfissional>" profissional
    When clico no botao de criar proposta confirmacao profissional
    Then sera encaminhado pagina de Dados da Proposta de Programa profissional

    Examples:
      | tituloProfissional          | dadosDaInstituicaoProfissional | instituicaoDeEnsinoProfissional                             | programaProfissional  | CoordenadorProfissional        | loginProfissional | senhaProfissional |
      | Solicitacao de Novos Cursos | ufrn                           | 23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) | TESTE (23001011178P9) | RUBENS MARIBONDO DO NASCIMENTO | 80732810400       | sucup1r4          |


