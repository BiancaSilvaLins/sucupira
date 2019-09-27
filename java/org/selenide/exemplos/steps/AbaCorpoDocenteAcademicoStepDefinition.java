package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaCorpoDocente;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaCorpoDocenteAcademicoStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaBase pb = new PaginaBase();
    PaginaAbaCorpoDocente pCD = new PaginaAbaCorpoDocente();

    @Given("que estou na tela Dados de corpo docente academico")
    public void que_estou_na_tela_Dados_de_corpo_docente_academico() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pCD.clicaNaAbaCorpoDocente();
    }

    @Given("preencho o campo numero do documento academico{string}")
    public void preencho_o_campo_numero_do_documento_academico(String doc) {
        pCD.preencheCampoNumeroDocumento(doc);
    }

    @Given("clico no campo email institucional academico")
    public void clico_no_campo_email_institucional_academico() {

            pCD.clicaCampoEmailInstituicional();
    }

    @Given("preencho o campo abreviatura academico {string}")
    public void preencho_o_campo_abreviatura_academico(String abreviatura) {
        pCD.preencheCampoAbreviatura(abreviatura);
    }

    @Given("clico no botao MAIS academico")
    public void clico_no_botao_MAIS_academico() {
        pCD.clicarBotaoMais();
    }

    @Given("seleciono o nivel de titulacao academico {string}")
    public void seleciono_o_nivel_de_titulacao_academico(String nivel) throws InterruptedException {
        Thread.sleep(3000);
        pCD.selecionarNivel(nivel);
    }

    @Given("preencho o campo ano da titulacao academico {string}")
    public void preencho_o_campo_ano_da_titulacao_academico(String anoTitulacao) {
        pCD.preencheAnoTitulacao(anoTitulacao);
    }

    @Given("seleciono pais da instituicao da titulacao academico {string}")
    public void seleciono_pais_da_instituicao_da_titulacao_academico(String paisTitulacao) {
        pCD.selecionarPaisTitulacao(paisTitulacao);
    }

    @Given("preencho o campo instituicao da titulacao academico {string} {string}")
    public void preencho_o_campo_instituicao_da_titulacao_academico(String sigla, String instTitulacao) throws InterruptedException {
        Thread.sleep(3000);
        pCD.preencheSiglaIES(sigla);
        Thread.sleep(3000);
        pCD.preencherInstituicaoTitulacao(instTitulacao);
    }

    @Given("seleciono a categoria do vinculo academico {string}")
    public void seleciono_a_categoria_do_vinculo_academico(String categoria) {
        pCD.selecionarCategoria(categoria);
    }

    @Given("preencho o campo horas de dedicacao semanal na instituicao academico {string}")
    public void preencho_o_campo_horas_de_dedicacao_semanal_na_instituicao_academico(String di) {
        pCD.preencherDedicacaoInstituicao(di);
    }

    @Given("preencho o campo horas de dedicacao semanal no programa academico {string}")
    public void preencho_o_campo_horas_de_dedicacao_semanal_no_programa_academico(String dp) {
        pCD.preencherDedicacaoPrograma(dp);
    }

    @Given("clico no botao Sim se ele pertence a uma instituicao de ensino vinculada a proposta academico")
    public void clico_no_botao_Sim_se_ele_pertence_a_uma_instituicao_de_ensino_vinculada_a_proposta_academico() {
        pCD.clicarBotaoSim();
    }

    @Given("seleciono a instituicao de ensino academico {string}")
    public void seleciono_a_instituicao_de_ensino_academico(String instEnsino) {
        pCD.selecionarInstituicao(instEnsino);
    }

    @When("clico no botao inserir docente academico")
    public void clico_no_botao_inserir_docente_academico() {
        pCD.clicarBotaoInserirDocente();
    }

    @Then("o sistema insere o novo docente academico e emite a mensagem {string}")
    public void o_sistema_insere_o_novo_docente_academico_e_emite_a_mensagem(String mensagemSucess) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagemSucess, pCD.mensagemSucess(mensagemSucess));
    }

    @When("clico no botao avancar para aba producao")
    public void clico_no_botao_avancar_para_aba_producao() {
        pCD.clicarBotaoAvancar();
    }

    @Given("clico no botao Nao se ele pertence a uma instituicao de ensino vinculada a proposta academico")
    public void clico_no_botao_Nao_se_ele_pertence_a_uma_instituicao_de_ensino_vinculada_a_proposta_academico() {
        pCD.clicarBotaoNao();
    }

    @Given("preencho a instituicao de ensino academico {string} {string}")
    public void preencho_a_instituicao_de_ensino_academico(String sigla, String instituicao) throws InterruptedException {
        pCD.preencheSiglaIESVinculo(sigla);
        Thread.sleep(3000);
        pCD.selecionaInstituicaoDeEnsino(instituicao);
    }
}
