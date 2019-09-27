package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.PaginaAbaInstituicoesDeEnsino;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaInstituicoesDeEnsinoStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaInstituicoesDeEnsino pIE = new PaginaAbaInstituicoesDeEnsino();



    @After
    public void tearDown(){
        Selenide.close();
    }



    @Given("estou na aba de Instituicoes de Ensino")
    public void estou_na_aba_de_Instituicoes_de_Ensino() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pIE.clicaNaAbaInstituicoes();
    }

    @Given("estou na aba de Instituicoes de Ensino Academico")
    public void estou_na_aba_de_Instituicoes_de_Ensino_Academico() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pIE.clicaNaAbaInstituicoes();
    }

    @Given("preencho com os {string}")
    public void preencho_com_os(String string) {
        pIE.preencheInstituicao(string);
    }

    @Given("preencho o campo Instituicao de ensino superior {string}")
    public void preencho_o_campo_Instituicao_de_ensino_superior(String string) {
        pIE.selecioaInstituicaoDeEnsino(string);
    }

    @When("clico no botao Inserir Instituicao")
    public void clico_no_botao_Inserir_Instituicao() {
        pIE.clicaBotaoInserirInstituicao();
    }

    @Then("a tabela Instituicoes Participantes atualiza {string}")
    public void a_tabela_Instituicoes_Participantes_atualiza(String string) {
        pIE.verificaInsercaoDeInstituicao(string);
    }

    @Then("clico no botao avancar para seguir para a pagina de polos ead")
    public void clico_no_botao_avancar_para_seguir_para_a_pagina_de_polos_ead() {
        pIE.clicarBotaoAvancar();
    }

    @Then("o sistema apresenta mensagem de confirmacao {string}")
    public void o_sistema_apresenta_mensagem_de_confirmacao(String string) {
        pIE.mensagemDeErro(string);
    }
}