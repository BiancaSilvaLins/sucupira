package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.PaginaAbaAreasDeConcentracao;
import org.selenide.exemplos.paginas.PaginaAbaCaracterizacaoDoCursoAcademico;
import org.selenide.exemplos.paginas.PaginaAbaPropostaECurso;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaCaracterizacaoDoCursoAcademicoStepDefinition {
    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaCaracterizacaoDoCursoAcademico pCC = new PaginaAbaCaracterizacaoDoCursoAcademico();
    PaginaAbaPropostaECurso pgAba = new PaginaAbaPropostaECurso();
    AbaPropostaeCursoAcademicoStepDefinition proposta = new AbaPropostaeCursoAcademicoStepDefinition();
    PaginaAbaAreasDeConcentracao pAC = new PaginaAbaAreasDeConcentracao();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela Caracterizacao do Curso Academico")
    public void que_estou_na_tela_Caracterizacao_do_Curso_Academico() throws InterruptedException {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pgAba.verificaTituloAba();
        pgAba.preenchoCampoAreaConhecimento();
        pgAba.selecionaBotaoSim();
        proposta.seleciono_o_nivel_do_curso_academico_proposto("Mestrado");
        proposta.seleciono_o_historico_academico_do_curso_na_capes("Nova Proposta de Curso");
        pgAba.clicaInserirCurso();
        pgAba.verificaTabelaPropostasCursosCadastrados();
        pAC.clicaNaAbaAreasELinhas();
        pAC.preencheCampoArea("Teste Automatizado 2019");
        pAC.preencheDescArea("Teste Automatizado 2019");
        pAC.clicarBotaoInserirArea();
        pAC.preencheCampoLinha("Teste Automatizado 2019");
        pAC.selecionarArea("Teste Automatizado 2019");
        pAC.preencheDescLinha("Teste Automatizado 2019");
        pAC.clicarBotaoInserirLinha();
        pAC.clicarBotaoAvancar();
        pCC.clicaNaAbaCaracterizacaoDoCurso();
    }

    @Given("clico na opcao Mestrado Academico")
    public void clico_na_opcao_Mestrado_Academico() {
        pCC.clicaOpcaoMestrado();
    }

    @Given("Preencho o campo nome {string}")
    public void preencho_o_campo_nome(String string) {
        pCC.preencheCampoNome(string);
    }

    @Given("Seleciono a Periodicidade da Selecao {string}")
    public void seleciono_a_Periodicidade_da_Selecao(String string) {
        pCC.selecionarPeriodicidade(string);
    }

    @Given("Preencho o campo Objetivo do curso {string}")
    public void preencho_o_campo_Objetivo_do_curso(String string) {
        pCC.preencheObjetivoCurso(string);
    }

    @Given("Preencho as horas da disciplina {string}")
    public void preencho_as_horas_da_disciplina(String string) {
        pCC.creditosDisciplinas(string);
    }

    @Given("Preencho as horas da tese {string}")
    public void preencho_as_horas_da_tese(String string) {
        pCC.creditosTese(string);
    }

    @Given("Preencho o numero da vagas {string}")
    public void preencho_o_numero_da_vagas(String string) {
        pCC.vagasSelecao(string);
    }

    @Given("Preencho as horas de equivalencia {string}")
    public void preencho_as_horas_de_equivalencia(String string) {
        pCC.equivalencia(string);
    }

    @Given("Preencho as horas dos Outros Creditos {string}")
    public void preencho_as_horas_dos_Outros_Creditos(String string) {
       pCC.outrosCreditos(string);
    }

    @Given("Preencho a descricao sintetica do esquema de oferta de curso {string}")
    public void preencho_a_descricao_sintetica_do_esquema_de_oferta_de_curso(String string) {
        pCC.descricaoSintetica(string);
    }

    @When("Seleciono uma area de concentracao {string}")
    public void seleciono_uma_area_de_concentracao(String string) {
       pCC.selecionarAreasConcentracao(string);
    }

    @Then("Clico no botao atualizar os dados do curso")
    public void clico_no_botao_atualizar_os_dados_do_curso() {
        pCC.clicarBotaoAtualizar();
    }

    @When("clico no botao avancar para aba disciplinas")
    public void clico_no_botao_avancar_para_aba_disciplinas() {
        pCC.clicarBotaoAvancar();
    }

    @Given("clico na opcao Doutorado Academico")
    public void clico_na_opcao_Doutorado_Academico() {
        pCC.clicarOpcaoDoutorado();
    }
//================================================================================================================================================================================//
    @Given("Preencho o campo nome doutorado {string}")
    public void preencho_o_campo_nome_doutorado(String string) {
        pCC.preencheCampoNomeDoutorado(string);
    }

    @Given("Seleciono a Periodicidade da Selecao doutorado {string}")
    public void seleciono_a_Periodicidade_da_Selecao_doutorado(String string) {
        pCC.selecionarPeriodicidadeDoutorado(string);
    }

    @Given("Preencho o campo Objetivo do curso doutorado {string}")
    public void preencho_o_campo_Objetivo_do_curso_doutorado(String string) {
        pCC.preencheObjetivoCursoDoutorado(string);
    }

    @Given("Preencho as horas da disciplina doutorado {string}")
    public void preencho_as_horas_da_disciplina_doutorado(String string) {
        pCC.creditosDisciplinasDoutorado(string);
    }

    @Given("Preencho as horas da tese doutorado {string}")
    public void preencho_as_horas_da_tese_doutorado(String string) {
        pCC.creditosTeseDoutorado(string);
    }

    @Given("Preencho o numero da vagas doutorado {string}")
    public void preencho_o_numero_da_vagas_doutorado(String string) {
        pCC.vagasSelecaoDoutorado(string);
    }

    @Given("Preencho as horas de equivalencia doutorado {string}")
    public void preencho_as_horas_de_equivalencia_doutorado(String string) {
        pCC.equivalenciaDoutorado(string);
    }

    @Given("Preencho as horas dos Outros Creditos doutorado {string}")
    public void preencho_as_horas_dos_Outros_Creditos_doutorado(String string) {
        pCC.outrosCreditosDoutorado(string);
    }

    @Given("Preencho a descricao sintetica do esquema de oferta de curso doutorado {string}")
    public void preencho_a_descricao_sintetica_do_esquema_de_oferta_de_curso_doutorado(String string) {
        pCC.descricaoSinteticaDoutorado(string);
    }

    @When("Seleciono uma area de concentracao doutorado {string}")
    public void seleciono_uma_area_de_concentracao_doutorado(String string) {
        pCC.selecionarAreasConcentracaoDoutorado(string);
    }

    @Then("Clico no botao atualizar os dados do curso doutorado")
    public void clico_no_botao_atualizar_os_dados_do_curso_doutorado() {
        pCC.clicarBotaoAtualizarDoutorado();
    }
}
