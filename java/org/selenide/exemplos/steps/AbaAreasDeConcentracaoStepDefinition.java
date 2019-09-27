package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaAreasDeConcentracao;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaAreasDeConcentracaoStepDefinition {
    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaAreasDeConcentracao pAC = new PaginaAbaAreasDeConcentracao();
    PaginaBase pb = new PaginaBase();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na aba de Areas de Concentracao e Linhas de Pesquisa")
    public void estou_na_aba_de_Areas_de_Concentracao_e_Linhas_de_Pesquisa() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pAC.clicaNaAbaAreasELinhas();
    }

    @Given("estou na aba de Areas de Concentracao e Linhas de Pesquisa Academica")
    public void estou_na_aba_de_Areas_de_Concentracao_e_Linhas_de_Pesquisa_Academica() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pAC.clicaNaAbaAreasELinhas();
    }

    @Given("preencho o campo nome da area {string}")
    public void preencho_o_campo_nome_da_area(String string) {
        pAC.preencheCampoArea(string);
    }



    @When("preencho o campo descricao da area {string}")
    public void preencho_o_campo_descricao_da_area(String string) {
        pAC.preencheDescArea(string);
    }

    @Then("clico no botao Inserir Area")
    public void clico_no_botao_Inserir_Area() {
       pAC.clicarBotaoInserirArea();
    }

    @Given("preencho o campo nome da linha de pesquisa {string}")
    public void preencho_o_campo_nome_da_linha_de_pesquisa(String string) {
        pAC.preencheCampoLinha(string);
    }

    @Given("seleciono a area de concentracao {string}")
    public void seleciono_a_area_de_concentracao(String string) throws InterruptedException {
        pAC.selecionarArea(string);
    }

    @When("preencho o campo descricao da linha de pesquisa {string}")
    public void preencho_o_campo_descricao_da_linha_de_pesquisa(String string) {
       pAC.preencheDescLinha(string);
    }

    @Then("clico no botao Inserir Linha")
    public void clico_no_botao_Inserir_Linha() {
        pAC.clicarBotaoInserirLinha();
    }

    @Then("clico no botao avancar para seguir para a pagina de caracterizacao do curso")
    public void clico_no_botao_avancar_para_seguir_para_a_pagina_de_caracterizacao_do_curso() {
        pAC.clicarBotaoAvancar();
    }

    @Then("o sistema apresenta duas mensagens de campos obrigatorios {string} {string}")
    public void o_sistema_apresenta_duas_mensagens_de_campos_obrigatorios(String msg1, String msg2) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                msg1,
                pb.removerCaracteresEspeciais(pAC.mensagem1(msg1)));
        Thread.sleep(1000);
        Assert.assertEquals(
                msg2,
                pb.removerCaracteresEspeciais(pAC.mensagem2(msg2)));

        Thread.sleep(3000);
    }
}