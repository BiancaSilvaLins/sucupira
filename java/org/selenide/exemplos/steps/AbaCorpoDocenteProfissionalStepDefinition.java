package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaCorpoDocente;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaCorpoDocenteProfissionalStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaBase pb = new PaginaBase();
    PaginaAbaCorpoDocente pCD = new PaginaAbaCorpoDocente();

    @Given("que estou na tela Dados de corpo docente profissional")
    public void que_estou_na_tela_Dados_de_corpo_docente_profissional() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pCD.clicaNaAbaCorpoDocente();
    }

    @Given("preencho o campo numero do documento profissional{string}")
    public void preencho_o_campo_numero_do_documento_profissional(String doc) {
        pCD.preencheCampoNumeroDocumento(doc);
    }

    @Given("clico no campo email institucional profissional")
    public void clico_no_campo_email_institucional_profissional() {
        pCD.clicaCampoEmailInstituicional();
    }

    @Given("preencho o campo abreviatura profissional {string}")
    public void preencho_o_campo_abreviatura_profissional(String abreviatura) {
        pCD.preencheCampoAbreviatura(abreviatura);
    }

    @Given("clico no botao MAIS profissional")
    public void clico_no_botao_MAIS_profissional() {
        pCD.clicarBotaoMais();
    }

    @Given("seleciono o nivel de titulacao profissional {string}")
    public void seleciono_o_nivel_de_titulacao_profissional(String nivel)  throws InterruptedException {
        Thread.sleep(3000);
        pCD.selecionarNivel(nivel);
    }

    @Given("preencho o campo ano da titulacao profissional {string}")
    public void preencho_o_campo_ano_da_titulacao_profissional(String anoTitulacao) {
        pCD.preencheAnoTitulacao(anoTitulacao);
    }

    @Given("seleciono pais da instituicao da titulacao profissional {string}")
    public void seleciono_pais_da_instituicao_da_titulacao_profissional(String paisTitulacao) {
        pCD.selecionarPaisTitulacao(paisTitulacao);
    }

    @Given("preencho o campo instituicao da titulacao profissional {string} {string}")
    public void preencho_o_campo_instituicao_da_titulacao_profissional(String sigla, String instTitulacao) throws InterruptedException  {
        Thread.sleep(3000);
        pCD.preencheSiglaIES(sigla);
        Thread.sleep(3000);
        pCD.preencherInstituicaoTitulacao(instTitulacao);
    }

    @Given("seleciono a categoria do vinculo profissional {string}")
    public void seleciono_a_categoria_do_vinculo_profissional(String categoria) {
        pCD.selecionarCategoria(categoria);
    }

    @Given("preencho o campo horas de dedicacao semanal na instituicao profissional {string}")
    public void preencho_o_campo_horas_de_dedicacao_semanal_na_instituicao_profissional(String di) {
        pCD.preencherDedicacaoInstituicao(di);
    }

    @Given("preencho o campo horas de dedicacao semanal no programa profissional {string}")
    public void preencho_o_campo_horas_de_dedicacao_semanal_no_programa_profissional(String dp) {
        pCD.preencherDedicacaoPrograma(dp);
    }

    @Given("clico no botao Sim se ele pertence a uma instituicao de ensino vinculada a proposta profissional")
    public void clico_no_botao_Sim_se_ele_pertence_a_uma_instituicao_de_ensino_vinculada_a_proposta_profissional() {
        pCD.clicarBotaoSim();
    }

    @Given("seleciono a instituicao de ensino profissional {string}")
    public void seleciono_a_instituicao_de_ensino_profissional(String instEnsino) {
        pCD.selecionarInstituicao(instEnsino);
    }

    @When("clico no botao inserir docente profissional")
    public void clico_no_botao_inserir_docente_profissional() {
        pCD.clicarBotaoInserirDocente();
    }

    @Then("o sistema insere o novo docente profissional e emite a mensagem {string}")
    public void o_sistema_insere_o_novo_docente_profissional_e_emite_a_mensagem(String mensagemSucess) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagemSucess, pCD.mensagemSucess(mensagemSucess));
    }

    @Given("clico no botao Nao se ele pertence a uma instituicao de ensino vinculada a proposta profissional")
    public void clico_no_botao_Nao_se_ele_pertence_a_uma_instituicao_de_ensino_vinculada_a_proposta_profissional() {
        pCD.clicarBotaoNao();
    }

    @Given("preencho a instituicao de ensino profissional {string} {string}")
    public void preencho_a_instituicao_de_ensino_profissional(String sigla, String instituicao) throws InterruptedException {
        pCD.preencheSiglaIESVinculo(sigla);
        Thread.sleep(3000);
        pCD.selecionaInstituicaoDeEnsino(instituicao);
    }
}
