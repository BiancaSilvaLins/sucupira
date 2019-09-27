package org.selenide.exemplos.steps;

import cucumber.api.java.After;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaPolosEAD;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaPolosEADAcademicoStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaPolosEAD polos = new PaginaAbaPolosEAD();

    @Given("que estou na tela Polos EAD Academico")
    public void que_estou_na_tela_Polos_EAD_Academico() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        polos.clicarNaAbaPolosEAD();
    }

    @Given("seleciono uma {string}")
    public void seleciono_uma(String uf) {
        polos.selecionarUF(uf);
    }

    @Given("seleciono um {string}")
    public void seleciono_um(String municipio) throws InterruptedException {
        polos.selecionarMunicipio(municipio);
    }

    @Given("seleciono um Polo disponivel {string}")
    public void seleciono_um_Polo_disponivel(String polo) {
        polos.selecionarPolo(polo);
    }

    @When("clico no botao Adicionar Polo")
    public void clico_no_botao_Adicionar_Polo() throws InterruptedException{
        polos.clicarBotaoAdicionarPolo();
    }

    @Then("verifico se o {string} foi incluso")
    public void verifico_se_o_foi_incluso(String verifica) {
        Assert.assertEquals(polos.verificaInclusao(verifica), verifica);
    }

    @Then("o sistema apresenta mensagem de erro {string}")
    public void o_sistema_apresenta_mensagem_de_erro(String mensagemErro) {
        Assert.assertEquals(polos.mensagemDeErro(mensagemErro), mensagemErro);
    }

    @Given("verifico se existe um {string} cadastrado")
    public void verifico_se_existe_um_cadastrado(String verifica) {
        Assert.assertEquals(polos.verifica(verifica), verifica);
    }

    @When("clico no botao excluir")
    public void clico_no_botao_excluir() {
        polos.clicarBotaoExcluir();
    }

    @Then("clico no botao avancar")
    public void clico_no_botao_avancar() {
        polos.clicarBotaoAvancar();
    }

    @Then("o sistema exclui o polo adicionado e apresenta uma {string} na tela")
    public void o_sistema_exclui_o_polo_adicionado_e_apresenta_uma_na_tela(String exclusao) {
        Assert.assertEquals(polos.verificaExclusao(exclusao),exclusao);
    }
}