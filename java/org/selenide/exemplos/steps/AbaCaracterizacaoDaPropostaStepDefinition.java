package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.PaginaAbaCaracterizacaoDaProposta;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaCaracterizacaoDaPropostaStepDefinition {
    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaCaracterizacaoDaProposta pCP = new PaginaAbaCaracterizacaoDaProposta();



    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na aba de Caracterizacao da Proposta")
    public void estou_na_aba_de_Caracterizacao_da_Proposta() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pCP.clicaNaAbaProposta();
    }

    @Given("estou na aba de Caracterizacao da Proposta Academica")
    public void estou_na_aba_de_Caracterizacao_da_Proposta_Academica() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pCP.clicaNaAbaProposta();
    }

    @Given("preencho o campo Contextualizacao Institucional e Regional da Proposta {string}")
    public void preencho_o_campo_Contextualizacao_Institucional_e_Regional_da_Proposta(String string) {
        pCP.preencheContextualizacao(string);
    }

    @Given("preencho o campo Historico do Curso {string}")
    public void preencho_o_campo_Historico_do_Curso(String string) {
        pCP.preencheHistorico(string);
    }

    @Given("preencho o campo Cooperacao e Intercambio {string}")
    public void preencho_o_campo_Cooperacao_e_Intercambio(String string) {
        pCP.preencheCooperacao(string);
    }

    @Then("clico no botao Avancar")
    public void clico_no_botao_Avancar() {
        pCP.clicarBotaoAvancar();
    }

    @Given("seleciono o campo uf da proposta {string}")
    public void seleciono_o_campo_uf_da_proposta(String uf) throws InterruptedException{
        pCP.selecionaUf(uf);
    }

    @Given("seleciono o campo municipio da proposta {string}")
    public void seleciono_o_campo_municipio_da_proposta(String municipio)throws InterruptedException {
        pCP.selecionaMun(municipio);
    }

}
