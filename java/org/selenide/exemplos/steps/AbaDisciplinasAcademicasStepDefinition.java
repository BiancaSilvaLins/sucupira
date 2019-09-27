package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.*;

import java.text.Normalizer;

public class AbaDisciplinasAcademicasStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaDisciplinas pd = new PaginaAbaDisciplinas();
    PaginaBase pb =  new PaginaBase();

    @Given("que estou na tela Dados da Disciplina academica")
    public void que_estou_na_tela_Dados_da_Disciplina_academica() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pd.clicaNaAbaDisciplinas();
    }

    @Given("preencho o campo nome da disciplina academica {string}")
    public void preencho_o_campo_nome_da_disciplina_academica(String nome) {
        pd.preencherCampoNome(nome);
    }

    @Given("seleciono o nivel da disciplina academica {string}")
    public void seleciono_o_nivel_da_disciplina_academica(String nivel) {
        pd.selecionaNivel(nivel);
    }

    @Given("clico no botao SIM de disciplina academica obrigatoria")
    public void clico_no_botao_SIM_de_disciplina_academica_obrigatoria() {
        pd.clicarBotaoSim();
    }

    @Given("preencho o campo de creditos da disciplina academica {string}")
    public void preencho_o_campo_de_creditos_da_disciplina_academica(String creditos) {
       pd.preencherCampoCreditos(creditos);
    }

    @Given("preencho o campo ementa da disciplina academica {string}")
    public void preencho_o_campo_ementa_da_disciplina_academica(String ementa) {
       pd.preencherCampoEmenta(ementa);
    }

    @Given("preencho o campo bibliografia da disciplina academica {string}")
    public void preencho_o_campo_bibliografia_da_disciplina_academica(String bibliografia) {
       pd.preencherCampoBibliografia(bibliografia);
    }

    @Given("seleciono a area de concentracao da disciplina academica {string}")
    public void seleciono_a_area_de_concentracao_da_disciplina_academica(String area) {
        pd.selecionarAreaConcentracao(area);
    }

    @Given("clico no simbolo MAIS academica")
    public void clico_no_simbolo_MAIS_academica() {
        pd.clicarBotaoMais();
    }

    @When("clico no botao inserir disciplina academica")
    public void clico_no_botao_inserir_disciplina_academica() throws InterruptedException{
        Thread.sleep(1000);
        pd.clicarBotaoInserirDisciplina();
    }

    @Then("o sistema insere a nova disciplina academica e emite a mensagem {string}")
    public void o_sistema_insere_a_nova_disciplina_academica_e_emite_a_mensagem(String mensagemSucess) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagemSucess,
                pb.removerCaracteresEspeciais(pd.mensagemSucess(mensagemSucess)));
    }

    @When("clico no botao avancar para aba corpo docente")
    public void clico_no_botao_avancar_para_aba_corpo_docente() {
        pd.clicarBotaoAvancar();
    }

    @When("nao preencho nenhum campo obrigatorio academico")
    public void nao_preencho_nenhum_campo_obrigatorio_academico() {
        pd.clicarBotaoInserirDisciplina();
    }

    @Then("o sistema apresenta as mensagens academicas {string} {string} {string} {string} {string}")
    public void o_sistema_apresenta_as_mensagens_academicas(String mensagem1, String mensagem2, String mensagem3, String mensagem4, String mensagem5) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagem1,
                pb.removerCaracteresEspeciais(pd.mensagemErro1(mensagem1)));
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagem2,
                pb.removerCaracteresEspeciais(pd.mensagemErro2(mensagem2)));
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagem3,
                pb.removerCaracteresEspeciais(pd.mensagemErro3(mensagem3)));
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagem4,
                pb.removerCaracteresEspeciais(pd.mensagemErro4(mensagem4)));
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagem5,
                pb.removerCaracteresEspeciais(pd.mensagemErro5(mensagem5)));
    }

    @Given("clico no botao NAO de disciplina academica obrigatoria")
    public void clico_no_botao_NAO_de_disciplina_academica_obrigatoria() {
       pd.clicarBotaoNao();
    }

}
