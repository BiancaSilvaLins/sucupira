package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.*;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class MinhasPropostasAcademicoStepDefinition {

    PaginaAPCNCalendarioAcademico paginaAPCNCalendarioAcademico = new PaginaAPCNCalendarioAcademico();
    PaginaAcesso pgAcesso = new PaginaAcesso();
    PaginaPreencheDadosInstituicaoAcademico pgPreencheDados = new PaginaPreencheDadosInstituicaoAcademico();
    PaginaMinhasPropostas pgMinhasPropostas = new PaginaMinhasPropostas();
    PaginaAcesso pgAcessoProf = new PaginaAcesso();
    PaginaCalendarioAcademico pgCalendarioProf = new PaginaCalendarioAcademico();
    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na pagina de Minhas propostas")
    public void estou_na_pagina_de_Minhas_propostas() {
        paginaAPCNCalendarioAcademico.navegar();
        pgCalendarioProf.clicaCalendarioAcademico();
        pgAcesso.preencheCampoIESPagAcesso();
        pgAcesso.clicaIESPagAcesso();
        pgPreencheDados.selecionaOpcaoNao();
        pgAcessoProf.preencheCampoProgramaPgAcesso();
        pgAcesso.selecionaTipoDocumentoPgAcesso();
        pgAcesso.preencheNumeroDocumentoPgAcesso();
        pgAcesso.preencheDadosTelefoneDDDPgAcesso();
        pgPreencheDados.clicaBotaoCriarProposta();
        pgPreencheDados.verificaModal();
        pgPreencheDados.clicarBotaoContinuar();
        pgMinhasPropostas.preencheCamposLoginPgPMinhasPropostas();
        pgAcesso.clicaLogin();
    }

    @And("estou na aba Propostas")
    public void estou_na_aba_Propostas() {
        Assert.assertEquals(pgMinhasPropostas.retornaTituloAbaPropostas(),"Propostas");
    }

    @And("possuo uma tabela referente a {string}")
    public void possuo_uma_tabela_referente_a(String instituicaoDeEnsino) {
       pgMinhasPropostas.retornaUmValorNaLista(instituicaoDeEnsino);
    }
    @When("clico no icone de play referente ao {string}")
    public void clico_no_icone_de_play_referente_ao(String programa) {
        pgMinhasPropostas.clicaSimboloPlay(programa);
    }

    @Then("sou direcionado a {string} Proposta e Curso")
    public void sou_direcionado_a_aba_Proposta_e_Curso(String aba) {
        Assert.assertEquals(pgMinhasPropostas.retornaTituloAbaPropostaECurso(aba),aba);

    }

}
