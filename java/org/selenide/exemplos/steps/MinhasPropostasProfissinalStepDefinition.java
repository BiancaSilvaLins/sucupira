package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAPCNCalendarioAcademico;
import org.selenide.exemplos.paginas.PaginaAcesso;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;
import org.selenide.exemplos.paginas.PaginaPreencheDadosInstituicaoAcademico;

public class MinhasPropostasProfissinalStepDefinition {
    PaginaAPCNCalendarioAcademico paginaAPCNCalendarioAcademico = new PaginaAPCNCalendarioAcademico();
    PaginaAcesso pgAcesso = new PaginaAcesso();
    PaginaPreencheDadosInstituicaoAcademico pgPreencheDados = new PaginaPreencheDadosInstituicaoAcademico();
    PaginaMinhasPropostas pgMinhasPropostas = new PaginaMinhasPropostas();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na pagina de Minhas propostas profissionais")
    public void estou_na_pagina_de_Minhas_propostas_profissionais() {
        paginaAPCNCalendarioAcademico.navegar();
        paginaAPCNCalendarioAcademico.clicaBotaoCalendarioAcademico();
        pgAcesso.preencheCampoIESPagAcesso();
        pgAcesso.clicaIESPagAcesso();
        pgPreencheDados.selecionaOpcaoNao();
        pgAcesso.preencheCampoProgramaPgAcesso();
        pgAcesso.selecionaTipoDocumentoPgAcesso();
        pgAcesso.preencheNumeroDocumentoPgAcesso();
        pgAcesso.preencheDadosTelefoneDDDPgAcesso();
        pgPreencheDados.clicaBotaoCriarProposta();
        pgPreencheDados.verificaModal();
        pgMinhasPropostas.preencheCamposLoginPgPMinhasPropostas();
        pgAcesso.clicaLogin();
    }

    @And("estou na aba Propostas profissionais")
    public void estou_na_aba_Propostas_profissionais() {
        Assert.assertEquals(pgMinhasPropostas.retornaTituloAbaPropostas(),"Propostas");
    }

    @And("possuo uma tabela referente a {string} profissional")
    public void possuo_uma_tabela_referente_a(String instituicaoDeEnsino) {
        pgMinhasPropostas.retornaUmValorNaLista(instituicaoDeEnsino);
    }
    @When("clico no icone de play referente ao programa profissional {string}")
    public void clico_no_icone_de_play_referente_ao_programa_profissional(String programa) {
        pgMinhasPropostas.clicaSimboloPlay(programa);
    }

    @Then("sou direcionado a {string} Proposta e Curso profissional")
    public void sou_direcionado_a_aba_Proposta_e_Curso_profissional(String aba) {
        Assert.assertEquals(pgMinhasPropostas.retornaTituloAbaPropostaECurso(aba),aba);

    }
}
