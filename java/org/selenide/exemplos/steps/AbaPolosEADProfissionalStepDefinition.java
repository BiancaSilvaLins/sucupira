package org.selenide.exemplos.steps;

import cucumber.api.java.After;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaPolosEAD;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaPolosEADProfissionalStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaPolosEAD polos = new PaginaAbaPolosEAD();

    @Given("que estou na tela Polos EAD Profissional")
    public void que_estou_na_tela_Polos_EAD_Profissional() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        polos.clicarNaAbaPolosEAD();
    }

    @Given("seleciono uma {string} Profissional")
    public void seleciono_uma_Profissional(String uf) {
        polos.selecionarUF(uf);
    }

    @Given("seleciono um {string} Profissional")
    public void seleciono_um_Profissional(String municipio) throws InterruptedException {
        polos.selecionarMunicipio(municipio);
    }

    @Given("seleciono um Polo disponivel {string} Profissional")
    public void seleciono_um_Polo_disponivel_Profissional(String polo) {
       polos.selecionarPolo(polo);
    }

    @Given("clico no botao Adicionar Polo Profissional")
    public void clico_no_botao_Adicionar_Polo_Profissional()throws InterruptedException {
        polos.clicarBotaoAdicionarPolo();
    }

    @When("verifico se o {string} foi incluso profissional")
    public void verifico_se_o_foi_incluso_profissional(String verifica) {
        Assert.assertEquals(polos.verificaInclusao(verifica), verifica);
    }

    @Then("clico no botao avancar Profissional")
    public void clico_no_botao_avancar_Profissional() {
        polos.clicarBotaoAvancar();
    }

    @When("clico no botao Adicionar Polo ja cadastrado Profissional")
    public void clico_no_botao_Adicionar_Polo_ja_cadastrado_Polo_Profissional() throws InterruptedException{
        polos.clicarBotaoAdicionarPolo();
    }

    @Then("o sistema apresenta mensagem de erro {string} Profissional")
    public void o_sistema_apresenta_mensagem_de_erro_Profissional(String mensagemErro) {
        Assert.assertEquals(polos.mensagemDeErro(mensagemErro), mensagemErro);
    }

    @Given("verifico se existe um {string} cadastrado Profissional")
    public void verifico_se_existe_um_cadastrado_Profissional(String verifica) {
        Assert.assertEquals(polos.verifica(verifica), verifica);
    }

    @When("clico no botao excluir Profissional")
    public void clico_no_botao_excluir_Profissional() {
        polos.clicarBotaoExcluir();
    }

    @Then("o sistema exclui o polo adicionado e apresenta uma {string} na tela Profissional")
    public void o_sistema_exclui_o_polo_adicionado_e_apresenta_uma_na_tela_Profissional(String exclusao) {
        Assert.assertEquals(polos.verificaExclusao(exclusao),exclusao);
    }
}
