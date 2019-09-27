package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selectors.*;

public class AbaPropostaeCursoAcademicoStepDefinition {

    PaginaAbaPropostaECurso pgAba = new PaginaAbaPropostaECurso();
    PaginaAPCNCalendarioAcademico paginaAPCNCalendarioAcademico = new PaginaAPCNCalendarioAcademico();
    PaginaAcesso pgAcesso = new PaginaAcesso();
    PaginaPreencheDadosInstituicaoAcademico pgPreencheDados = new PaginaPreencheDadosInstituicaoAcademico();
    PaginaMinhasPropostas pgMinhasPropostas = new PaginaMinhasPropostas();
    PaginaCalendarioAcademico pgCalendarioProf = new PaginaCalendarioAcademico();
    PaginaAbaPropostaECurso pgAbaProfissional = new PaginaAbaPropostaECurso();


    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na aba de Proposta e Curso Academico")
    public void estou_na_aba_de_Proposta_e_Curso_Academico() {
        paginaAPCNCalendarioAcademico.navegar();
        pgCalendarioProf.clicaCalendarioAcademico();
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
        pgAba.clicaSimboloPlayPgAbaProposta();
        pgAba.verificaTituloAba();

        if($(byXpath("//h1[text()='Proposta de Cursos Cadastrados']")).isDisplayed()){
            pgAbaProfissional.retiraProgramasAssociados();
        }
    }

    @And("preencho o campo area de conhecimento academico")
    public void preencho_o_campo_area_de_conhecimento_academico() throws InterruptedException {
        pgAba.preenchoCampoAreaConhecimento();
    }

    @And("seleciono SIM para graduacao na area afim academico")
    public void seleciono_SIM_para_graduacao_na_area_afim_academico() {
        pgAba.selecionaBotaoSim();
    }

    @And("preencho o  ano de inicio academico {string}")
    public void preencho_o_ano_de_inicio_academico(String anoInicio) {
        pgAba.preencheAnoInicio(anoInicio);
    }

    @And("seleciono a modalidade de ensino {string}")
    public void seleciono_a_modalidade_de_ensino(String modalidade) {
        pgAba.selecionaModalidade(modalidade);
    }

    @And("seleciono o nivel do curso academico proposto {string}")
    public void seleciono_o_nivel_do_curso_academico_proposto(String nivelCursoProposto) {
        pgAba.selecionaNivelCursoProposto(nivelCursoProposto);
    }

    @And("seleciono o historico academico do curso na capes {string}")
    public void seleciono_o_historico_academico_do_curso_na_capes(String historico) {
        pgAba.selecionaHistoricoCursoCapes(historico);
    }

    @And("preencho o campo de codigo do primeiro programa academico original {string}")
    public void preencho_o_campo_de_codigo_do_primeiro_programa_academico_original(String codigo1) {
        pgAba.preencheCodigoProgOriginal(codigo1);
    }

    @And("preencho o campo de codigo do segundo programa academico original {string}")
    public void preencho_o_campo_de_codigo_do_segundo_programa_academico_original(String codigo2) {
        pgAba.preencheCodigoProgOriginal(codigo2);
    }

    @And("clico no simbolo MAIS academico")
    public void clico_no_simbolo_MAIS_academico() {
        pgAba.clicaSimboloMais();
        sleep(2000);
}

    @And("surgir a tabela de Programas Academicos Associados")
    public void surgir_a_tabela_de_Programas_Academicos_Associados() {
        pgAba.verificaTabelaProgAssociados();
    }

    @When("clico no botao Inserir curso academico")
    public void clico_no_botao_Inserir_curso_academico() {
       pgAba.clicaInserirCurso();
    }

    @Then("a tabela Propostas de Cursos Academicos Cadastrados surgira")
    public void a_tabela_Propostas_de_Cursos_Academicos_Cadastrados_surgira() {
        pgAba.verificaTabelaPropostasCursosCadastrados();
    }

    @Then("clico no botao avancar para seguir para a pagina de instituicoes de ensino")
    public void clico_no_botao_avancar_para_seguir_para_a_pagina_de_instituicoes_de_ensino() {
        pgAba.clicarBotaoAvancar();
    }



}
