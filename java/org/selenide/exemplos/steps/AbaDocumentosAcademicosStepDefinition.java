package org.selenide.exemplos.steps;

import org.selenide.exemplos.paginas.PaginaAbaDocumentos;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.awt.*;

public class AbaDocumentosAcademicosStepDefinition {

    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaDocumentos pad = new PaginaAbaDocumentos();


    @Given("que estou na tela de Dados de Documentos academicos")
    public void que_estou_na_tela_de_Dados_de_Documentos_academicos() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlayAcademico();
        pad.clicaNaAbaDocumentos();
    }

    @Given("preencho o campo Credenciamento academico")
    public void preencho_o_campo_Credenciamento_academico() throws AWTException {
        pad.uploadCredenciamento();
    }

    @Given("clico no botao Anexar credenciamento academico")
    public void clico_no_botao_Anexar_credenciamento_academico() {
        pad.subirCredenciamento();
    }

    @Given("preencho o campo Regimento academico")
    public void preencho_o_campo_Regimento_academico() throws AWTException {
        pad.uploadRegimento();
    }

    @Given("clico no botao Anexar regimento academico")
    public void clico_no_botao_Anexar_regimento_academico() {
        pad.subirRegimento();
    }

    @Given("preencho o campo Regulamento do curso academico")
    public void preencho_o_campo_Regulamento_do_curso_academico() throws AWTException {
        pad.uploadRegulamento();
    }

    @Given("clico no botao Anexar regulamento academico")
    public void clico_no_botao_Anexar_regulamento_academico() {
        pad.subirRegulamento();
    }

    @Given("preencho o campo Autorizacao academica")
    public void preencho_o_campo_Autorizacao_academica() throws AWTException {
        pad.uploadAutorizacao();
    }

    @Given("clico no botao Anexar autorizacao academico")
    public void clico_no_botao_Anexar_autorizacao_academico() {
        pad.subirAutorizacao();
    }

    @When("clico no avancar para salvar os documentos academicos")
    public void clico_no_avancar_para_salvar_os_documentos_academicos() {
        pad.clicarBotaoAvancar();
    }

    @Then("o sistema salva documentos academicos e exibe a mensagem {string} na tela de finalizar proposta")
    public void o_sistema_salva_documentos_academicos_e_exibe_a_mensagem_na_tela_de_finalizar_proposta(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pad.mensagem(msg)));
    }

    @Given("que estou na tela de finalizar proposta academica")
    public void que_estou_na_tela_de_finalizar_proposta_academica() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlayAcademico();
        pad.clicaNaAbaFinalizarProposta();
    }

    @When("clico no botao enviar dados academicos")
    public void clico_no_botao_enviar_dados_academicos() {
        pad.clicarBotaoEnviar();
    }

    @When("o sistema salva os dados da nova proposta academica e exibe a mensagem {string} e finaliza solicitacao da proposta")
    public void o_sistema_salva_os_dados_da_nova_proposta_academica_e_exibe_a_mensagem_e_finaliza_solicitacao_da_proposta(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pad.mensagemSucesso(msg)));
    }

    @Then("clico no botao concluir para finalizar a solicitacao academica")
    public void clico_no_botao_concluir_para_finalizar_a_solicitacao_academica() {
       pad.clicarBotaoConcluir();
    }
}
