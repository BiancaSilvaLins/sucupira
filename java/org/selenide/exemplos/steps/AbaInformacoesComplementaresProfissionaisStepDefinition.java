package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaInformacoesComplementares;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaInformacoesComplementaresProfissionaisStepDefinition {

    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaInformacoesComplementares pic = new PaginaAbaInformacoesComplementares();

    @Given("que estou na tela de dados de Informacoes Complementares profissionais")
    public void que_estou_na_tela_de_dados_de_Informacoes_Complementares_profissionais() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlay();
        pic.clicaNaAbaInformacoesComplementares();
    }

    @Given("preencho o campo Observacoes profissionais {string}")
    public void preencho_o_campo_Observacoes_profissionais(String string) {
        pic.preencherCampoObservacoes(string);
    }

    @Given("preencho o campo Criticas e Sugestoes profissionais {string}")
    public void preencho_o_campo_Criticas_e_Sugestoes_profissionais(String string) {
        pic.preencherCampoCriticasSugestoes(string);
    }

    @When("clico no botao salvar dados das Informacoes Complementares profissionais")
    public void clico_no_botao_salvar_dados_das_Informacoes_Complementares_profissionais() {
       pic.clicarBotaoSalvarDados();
    }

    @Then("o sistema salva os dados das Informacoes Complementares profissional e exibe a mensagem {string}")
    public void o_sistema_salva_os_dados_das_Informacoes_Complementares_profissional_e_exibe_a_mensagem(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pic.mensagem(msg)));
    }
}
