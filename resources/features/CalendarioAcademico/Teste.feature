#@CalendarioAcademico
#Feature: Calendario Academico
#
#  Scenario Outline: Verificar calendario de propostas de novos cursos
#    Given que estou na tela Inicial
#    And possuo "<calendario>" de proposta de novos cursos
#    And clico no botao de calendario de propostas de novos cursos academico
#    And devo obter tela de solicitacaoo de novos cursos "<tituloTelaSolicitacao>"
#    And preencho o campo "<dadosDaInstituicao>" com as tres primeira iniciais da ies
#    And seleciono a "<instituicaoDeEnsino>"
#    And seleciono Nao para a opcao de correspondencia a um novo curso vinculado a programa
#    And Preencho o campo de "<programa>"
#    And seleciono o "<tipoDeDocumento>" do coordenador
#    And preencho o campo "<numeroDoDocumento>"
#    And preencho os campos "<ddd>" e "<telefone>"
#    And clico no botao de criar proposta
#    And sera encaminhado pagina de Dados da Proposta de Programa
#    And clico no botao continuar
#    And preencho os campos login academico "<login>" e senha "<senha>" para acesso
#    And clico no botao de Login academico
#    And sou direcionado a pagina de Minhas Propostas academicas
#    And estou na aba de Proposta e Curso Academico
#    And preencho o campo area de conhecimento "<areaConhecimento>"
#    And seleciono SIM para graduacao na area afim academico
#    And preencho o  ano de inicio academico "<anoInicio>"
#    And seleciono a modalidade de ensino "<modalidade>"
#    And seleciono o nivel do curso academico proposto "<nivelCursoProposto>"
#    And seleciono o historico academico do curso na capes "<historicoCurso>"
#    And preencho o campo de codigo do primeiro programa academico original "<primeiroCodigoProgramaOriginal>"
#    And clico no simbolo MAIS academico
#    And preencho o campo de codigo do segundo programa academico original "<segundoCodigoProgramaOriginal>"
#    And clico no simbolo MAIS academico
#    And surgir a tabela de Programas Academicos Associados
#    And clico no botao Inserir curso academico
#    And a tabela Propostas de Cursos Academicos Cadastrados surgira
#    And clico no botao avancar para seguir para a pagina de instituicoes de ensino
#    And preencho com os "<dadosDaInstituicao2>"
#    And preencho o campo Instituicao de ensino superior "<instituicaoDeEnsino2>"
#    And clico no botao Inserir Instituicao
#    And a tabela Instituicoes Participantes atualiza "<dadosDaInstituicao2>"
#    And clico no botao avancar para seguir para a pagina de polos ead
#    And seleciono uma "<uf>"
#    And seleciono um "<municipio>"
#    And seleciono um Polo disponivel "<polo>"
#    And clico no botao Adicionar Polo
#    And verifico se o "<polo>" foi incluso
#    And clico no botao avancar
#    And preencho o campo Contextualizacao Institucional e Regional da Proposta "<contextualizacao>"
#    And preencho o campo Historico do Curso "<historicoCurso2>"
#    And preencho o campo Cooperacao e Intercambio "<cooperacaoIntercambio>"
#    And seleciono o campo uf da proposta "<ufProp>"
#    And seleciono o campo municipio da proposta "<munProp>"
#    And clico no botao Avancar
#    And preencho o campo nome da area "<nomeArea>"
#    And preencho o campo descricao da area "<descricaoArea>"
#    And clico no botao Inserir Area
#    And preencho o campo nome da linha de pesquisa "<nomeLinha>"
#    And seleciono a area de concentracao "<areaConcentracao>"
#    And preencho o campo descricao da linha de pesquisa "<descricaoLinha>"
#    And clico no botao Inserir Linha
#    And clico no botao avancar para seguir para a pagina de caracterizacao do curso
#    And clico na opcao Mestrado Academico
#    And Preencho o campo nome "<nome>"
#    And Seleciono a Periodicidade da Selecao "<periodicidade>"
#    And Preencho o campo Objetivo do curso "<objetivoCurso>"
#    And Preencho as horas da disciplina "<disciplina>"
#    And Preencho as horas da tese "<tese>"
#    And Preencho o numero da vagas "<vagas>"
#    And Preencho as horas de equivalencia "<equivalencia>"
#    And Preencho as horas dos Outros Creditos "<outrosCreditos>"
#    And Preencho a descricao sintetica do esquema de oferta de curso "<descOfertaCurso>"
#    And Seleciono uma area de concentracao "<areaConcentracao>"
#    And Clico no botao atualizar os dados do curso
#    And clico no botao avancar para aba disciplinas
#    And preencho o campo nome da disciplina academica "<nomeDisciplina>"
#    And seleciono o nivel da disciplina academica "<nivel>"
#    And clico no botao NAO de disciplina academica obrigatoria
#    And preencho o campo de creditos da disciplina academica "<creditos>"
#    And preencho o campo ementa da disciplina academica "<ementa>"
#    And preencho o campo bibliografia da disciplina academica "<bibliografia>"
#    And clico no botao inserir disciplina academica
#    And o sistema insere a nova disciplina academica e emite a mensagem "<mensagem>"
#    And clico no botao avancar para aba corpo docente
#    And preencho o campo numero do documento academico"<cpf>"
#    And clico no campo email institucional academico
#    And preencho o campo abreviatura academico "<abreviatura>"
#    And clico no botao MAIS academico
#    And seleciono o nivel de titulacao academico "<nivel2>"
#    And preencho o campo ano da titulacao academico "<ano>"
#    And seleciono pais da instituicao da titulacao academico "<pais>"
#    And preencho o campo instituicao da titulacao academico "<sigla>" "<instTitulacao>"
#    And seleciono a categoria do vinculo academico "<categoria>"
#    And preencho o campo horas de dedicacao semanal na instituicao academico "<horasInstituicao>"
#    And preencho o campo horas de dedicacao semanal no programa academico "<horasPrograma>"
#    And clico no botao Sim se ele pertence a uma instituicao de ensino vinculada a proposta academico
#    And seleciono a instituicao de ensino academico "<instituicaoEnsino>"
#    And clico no botao inserir docente academico
#    And o sistema insere o novo docente academico e emite a mensagem "<mensagem2>"
#    And clico no botao avancar para aba producao
#    And seleciono o campo docente academico "<docente>"
#    And preencho data de producao academica "<data>"
#    And preencho campo nome academico "<nome2>"
#    And seleciono o tipo de producao academica "<tipoProducao>"
#    And seleciono o subtipo de producao academica "<subtipoProducao>"
#    And preencho o campo natureza bibliografica academica "<natureza>"
#    And preencho o campo nome da editora academica "<editora>"
#    And preencho o campo idioma academico "<idioma>"
#    And seleciono o tipo da divulgacao da producao academica "<tipoDivulgacao>"
#    And preencho campo nome de um subAutor academico "<nome2>"
#    And preencho o campo abreviatura de um subAutor academico "<abreviatura2>"
#    And clico no botao Inserir Autor academico
#    And o sistema insere um novo autor da producao e exibe a lista de autores academicos "<listaAutores>"
#    And clico no botao inserir Producao academica
#    And o sistema insere a nova producao academica e emite a mensagem academica "<mensagem3>"
#    And clico no botao avancar para aba projetos de pesquisa
#    And preencho o campo nome do projeto academico "<nomeProjeto>"
#    And seleciono uma linha de pesquisa academica "<linhaPesquisa>"
#    And preencho o campo data de inicio academico "<dataInicio>"
#    And preencho o campo descricao do projeto academico "<descricao>"
#    And preencho o campo descricao do financiador academico "<descFinanciador>"
#    And seleciono um docente academico "<docente2>"
#    And clico no botao MAIS academico para inserir o docente
#    And seleciono o checkbox do responsavel academico
#    And clico no botao inserir projeto academico
#    And o sistema insere o novo projeto e apresenta uma mensagem de sucesso "<mensagem4>"
#    And clico no botao avancar para aba vinculo de docente
#    And seleciono o docente academico "<docente3>"
#    And seleciono a disciplina academica "<disciplina2>"
#    And clico no botao associar
#    And o sistema associa o docente a disciplina academica selecionada e exibe a mensagem "<mensagem5>"
#    And clico no botao avancar para aba vinculo de docente
#    And seleciono um docente academico para preencher os dados "<docente4>"
#    And preencho o campo iniciacao cientifica academica "<iniciacaoCientifica>"
#    And preencho o campo especializacao academica "<especializacao>"
#    And preencho o campo mestrado academico "<mestrado>"
#    And preencho o campo trabalho de conclusao de curso academico "<trabConclusao>"
#    And preencho o campo doutorado academico "<doutorado>"
#    And preencho o campo mestrado academico2 "<mestrado2>"
#    And preencho o campo doutorado academico2 "<doutorado2>"
#    And preencho o campo participacao em projetos academicos "<participacaoProjetos>"
#    And preencho o campo artes cenicas academico "<artesCenicas>"
#    And preencho o campo artes visuais academico "<artesVisuais>"
#    And preencho o campo musica academico "<musica>"
#    And preencho o campo outra producao cultural academico "<outraProd>"
#    And preencho o campo artigo em jornal ou revista academico "<artigoJR>"
#    And preencho o campo artigo em periodico academico "<artigoPeriodico>"
#    And preencho o campo livro academico "<livro>"
#    And preencho o campo outro academico "<outro>"
#    And preencho o campo partitura musical academico "<partituraMusical>"
#    And preencho o campo trabalho em anais academico "<trabalhoAnais>"
#    And preencho o campo traducao academico "<traducao>"
#    And preencho o campo apresentacao de trabalho academico "<apresentacaoTrab>"
#    And preencho o campo cartas academico "<cartas>"
#    And preencho o campo curso de curta duracao academico "<cursoCurto>"
#    And preencho o campo desenvolvimento de aplicativo academico "<desenvApp>"
#    And preencho o campo desenvolvimento de material didatico e instrucional academico "<desenvMaterial>"
#    And preencho o campo desenvolvimento de producao academico "<desenvProd>"
#    And preencho o campo desenvolvimento de tecnica academico "<desenvTecnica>"
#    And preencho o campo editoria academico "<editoria>"
#    And preencho o campo manutencao de obra artistica academico "<manutArtistica>"
#    And preencho o campo maquete academico "<maquete>"
#    And preencho o campo organizacao de evento academico "<organizacao>"
#    And preencho o campo outros academico "<outros>"
#    And preencho o campo patente academico "<patente>"
#    And preencho o campo programa de radio ou tv academico "<progRadioTv>"
#    And preencho o campo relatorio de pesquisa academico "<relatorio>"
#    And preencho o campo servicos tecnicos academico "<servTecnicos>"
#    And clico no botao salvar dados academicos
#    And o sistema salva as atividades academicas do docente e exibe a mensagem "<mensagem6>"
#    And clico no botao avancar para aba vinculo de docente
#    And preencho o campo Labotarios para pesquisas academicas "<laboratorios>"
#    And preencho o campo Caracterizacao do Acervo da biblioteca academica "<acervo>"
#    And preencho o campo Financiamentos academicos "<financiamentos>"
#    And preencho o campo Informacoes adicionais academicas "<adicionais>"
#    And preencho o campo Municipio para programas a distancia academica "<municipio1>"
#    When clico no botao salvar dados da infraestrutura academica
#    Then o sistema salva os dados da infraestrutura academica e exibe a mensagem "<mensagem7>"
#    And clico no botao avancar para aba vinculo de docente
#    And preencho o campo Observacoes academicas "<observacoes>"
#    And preencho o campo Criticas e Sugestoes academicas "<criticasSugestoes>"
#    And clico no botao salvar dados das Informacoes Complementares academicas
#    And o sistema salva os dados das Informacoes Complementares academica e exibe a mensagem "<mensagem8>"
#    And clico no botao avancar para aba vinculo de docente
#    And preencho o campo Credenciamento academico
#    And clico no botao Anexar credenciamento academico
#    And preencho o campo Regimento academico
#    And clico no botao Anexar regimento academico
#    And preencho o campo Regulamento do curso academico
#    And clico no botao Anexar regulamento academico
#    And preencho o campo Autorizacao academica
#    And clico no botao Anexar autorizacao academico
#    And clico no avancar para salvar os documentos academicos
#    And o sistema salva documentos academicos e exibe a mensagem "<mensagem9>" na tela de finalizar proposta
#    And clico no botao enviar dados academicos
#    When o sistema salva os dados da nova proposta academica e exibe a mensagem "<mensagem10>" e finaliza solicitacao da proposta
#    Then clico no botao concluir para finalizar a solicitacao academica
#
#
#
#
#
#
#
#
#
#    Examples:
#      | calendario                                       | tituloTelaSolicitacao       | dadosDaInstituicao | instituicaoDeEnsino                                        | programa                       | tipoDeDocumento | numeroDoDocumento | ddd | telefone  | areaConhecimento             | anoInicio               |modalidade            | nivelCursoProposto  | historicoCurso            | primeiroCodigoProgramaOriginal     |segundoCodigoProgramaOriginal|login       |senha    |dadosDaInstituicao2  | instituicaoDeEnsino2                                |uf         |municipio |polo            |contextualizacao        |historicoCurso2          |cooperacaoIntercambio   |nome                     |periodicidade |objetivoCurso            |disciplina |tese |vagas |equivalencia |outrosCreditos |descOfertaCurso          |areaConcentracao        |nomeArea                |descricaoArea           |nomeLinha               |areaConcentracao        | descricaoLinha         |nomeDisciplina  |nivel    |creditos |ementa |bibliografia |mensagem                                  |cpf         |abreviatura |nivel2    |ano  |pais   |sigla |instTitulacao                                               |categoria   |horasInstituicao |horasPrograma |instituicaoEnsino                                  |mensagem2                              |docente                         |data     |nome  |tipoProducao  |subtipoProducao |natureza |editora |idioma    |tipoDivulgacao |nome2 |abreviatura2 |listaAutores                        |mensagem3                                |nomeProjeto |linhaPesquisa           |dataInicio |descricao |descFinanciador |docente2                        |mensagem4                                         |docente3                         |disciplina2 |mensagem5                      |docente4                         |iniciacaoCientifica |especializacao |mestrado |trabConclusao |doutorado |mestrado2 |doutorado2 |participacaoProjetos |artesCenicas |artesVisuais|musica|outraProd|artigoJR|artigoPeriodico|livro|outro|partituraMusical|trabalhoAnais|traducao|apresentacaoTrab|cartas|cursoCurto|desenvApp|desenvMaterial|desenvProd|desenvTecnica|editoria|manutArtistica|maquete|organizacao|outros|patente|progRadioTv|relatorio|servTecnicos|mensagem6                                                          |laboratorios |acervo |financiamentos |adicionais |adicionais |mensagem7                                                                             |observacoes |criticasSugestoes |mensagem8                                                             |mensagem9               |mensagem10                                                                                          |municipio1 |ufProp     |munProp |
#      | PROPOSTA DE CURSOS NOVOS - ACADÊMICO (ACADÊMICO) | Solicitação de Novos Cursos | ufrn               | 23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN)| teste automatizado academico   | CPF             | 80732810400       | 61  | 123456789 | FÍSICA MATEMÁTICA (10104011) |           2000          | Educação a Distância | Mestrado            | Fusão de Curso Existente  |     23001011026P4                  |     23001011007P0           |80732810400 |sucup1r4 |ufpe                 | 25001019 UNIVERSIDADE FEDERAL DE PERNAMBUCO (UFPE)  |Pernambuco |Recife    |RECIFE-PE CENTRO|Teste Automatizado 2019 |Teste Automatizado 2019  |Teste Automatizado 2019 |Teste Automatizado 2019! |SEMESTRAL     |Teste Automatizado 2019! |300        |200  |200   |200          |200            |Teste Automatizado 2019! |Teste Automatizado 2019 |Teste Automatizado 2019 |Teste Automatizado 2019 |Teste Automatizado 2019 |Teste Automatizado 2019 |Teste Automatizado 2019 |TESTE           |Mestrado |200      |Teste  |Teste        |Disciplina foi cadastrado(a) com sucesso. |10382939441 |Teste       |Mestrado  |2000 |Brasil |ufrn  |23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |COLABORADOR |40               |40            |UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN) |Docente foi cadastrado(a) com sucesso. |BIANCA SILVA LINS (10382939441) |01062019 |Teste |BIBLIOGRÁFICA |OUTRO           |Teste    |Teste   |Português |IMPRESSO       |João  |J.O          |Autore(s) Adicionado(s) na produção |Produção foi cadastrado(a) com sucesso.  |Teste       |Teste Automatizado 2019 |20082019   |TESTE     |Teste           |BIANCA SILVA LINS (10382939441) |Projeto de Pesquisa foi cadastrado(a) com sucesso.|BIANCA SILVA LINS (10382939441)  |TESTE       |Docente vinculado com sucesso. |BIANCA SILVA LINS (10382939441)  |10                  |10             |10       |10            |10        |10        |10         |10                   |10           |10          |10    |10       |10      |10             |10   |10   |10              |10           |10      |10              |10    |10        |10       |10            |10        |10           |10      |10            |10     |10         |10    |10     |10         |10       |10          |Os dados da Atividades dos Docentes foram cadastrados com sucesso. |Teste        |Teste  |Teste          |Teste      |Teste      |Os dados da Infraestrutura (Preenchimento Obrigatório) foram cadastrados com sucesso. |Teste       |Teste             |Os dados da Informações complementares foram cadastrados com sucesso. |Não existem pendências. |A proposta de solicitação de novo(s) curso(s) foi enviada com sucesso para análise da Pró-Reitoria. |Brasília   |Pernambuco |Recife  |
#
