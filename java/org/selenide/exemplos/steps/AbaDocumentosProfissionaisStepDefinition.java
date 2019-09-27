package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaDocumentos;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

import java.awt.*;

public class AbaDocumentosProfissionaisStepDefinition {

    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaDocumentos pad = new PaginaAbaDocumentos();


    @Given("que estou na tela de Dados de Documentos profissionais")
    public void que_estou_na_tela_de_Dados_de_Documentos_profissionais() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlay();
        pad.clicaNaAbaDocumentos();
    }

    @Given("preencho o campo Credenciamento profissional")
    public void preencho_o_campo_Credenciamento_profissional() throws AWTException {
        pad.uploadCredenciamento();
    }

    @Given("clico no botao Anexar credenciamento profissional")
    public void clico_no_botao_Anexar_credenciamento_profissional() {
        pad.subirCredenciamento();
    }

    @Given("preencho o campo Regimento profissional")
    public void preencho_o_campo_Regimento_profissional() throws AWTException {
        pad.uploadRegimento();
    }

    @Given("clico no botao Anexar regimento profissional")
    public void clico_no_botao_Anexar_regimento_profissional() {
        pad.subirRegimento();
    }

    @Given("preencho o campo Regulamento do curso profissional")
    public void preencho_o_campo_Regulamento_do_curso_profissional() throws AWTException {
        pad.uploadRegulamento();
    }

    @Given("clico no botao Anexar regulamento profissional")
    public void clico_no_botao_Anexar_regulamento_profissional() {
        pad.subirRegulamento();
    }

    @Given("preencho o campo Autorizacao profissional")
    public void preencho_o_campo_Autorizacao_profissional() throws AWTException {
        pad.uploadAutorizacao();
    }

    @Given("clico no botao Anexar autorizacao profissional")
    public void clico_no_botao_Anexar_autorizacao_profissional() {
        pad.subirAutorizacao();
    }

    @When("clico no avancar para salvar os documentos profissionais")
    public void clico_no_avancar_para_salvar_os_documentos_profissionais() {
        pad.clicarBotaoAvancar();
    }

    @Then("o sistema salva documentos profissionais e exibe a mensagem {string} na tela de finalizar proposta")
    public void o_sistema_salva_documentos_profissionais_e_exibe_a_mensagem_na_tela_de_finalizar_proposta(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pad.mensagem(msg)));
    }

    @Given("que estou na tela de finalizar proposta profissional")
    public void que_estou_na_tela_de_finalizar_proposta_profissional() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlay();
        pad.clicaNaAbaFinalizarProposta();
    }

    @When("clico no botao enviar dados profissionais")
    public void clico_no_botao_enviar_dados_profissionais() {
        pad.clicarBotaoEnviar();
    }

    @When("o sistema salva os dados da nova proposta profissional e exibe a mensagem {string} e finaliza solicitacao da proposta")
    public void o_sistema_salva_os_dados_da_nova_proposta_profissional_e_exibe_a_mensagem_e_finaliza_solicitacao_da_proposta(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pad.mensagemSucesso(msg)));
    }

    @Then("clico no botao concluir para finalizar a solicitacao profissional")
    public void clico_no_botao_concluir_para_finalizar_a_solicitacao_profissional() {
       pad.clicarBotaoConcluir();
    }
}
