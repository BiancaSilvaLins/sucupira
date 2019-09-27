package org.selenide.exemplos.steps;

import org.selenide.exemplos.paginas.PaginaAbaInformacoesComplementares;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AbaInformacoesComplementaresAcademicasStepDefinition {

    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaInformacoesComplementares pic = new PaginaAbaInformacoesComplementares();

    @Given("que estou na tela de dados de Informacoes Complementares academicas")
    public void que_estou_na_tela_de_dados_de_Informacoes_Complementares_academicas() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlayAcademico();
        pic.clicaNaAbaInformacoesComplementares();
    }

    @Given("preencho o campo Observacoes academicas {string}")
    public void preencho_o_campo_Observacoes_academicas(String string) {
        pic.preencherCampoObservacoes(string);
    }

    @Given("preencho o campo Criticas e Sugestoes academicas {string}")
    public void preencho_o_campo_Criticas_e_Sugestoes_academicas(String string) {
        pic.preencherCampoCriticasSugestoes(string);
    }

    @When("clico no botao salvar dados das Informacoes Complementares academicas")
    public void clico_no_botao_salvar_dados_das_Informacoes_Complementares_academicas() {
       pic.clicarBotaoSalvarDados();
    }

    @Then("o sistema salva os dados das Informacoes Complementares academica e exibe a mensagem {string}")
    public void o_sistema_salva_os_dados_das_Informacoes_Complementares_academica_e_exibe_a_mensagem(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pic.mensagem(msg)));
    }
}
