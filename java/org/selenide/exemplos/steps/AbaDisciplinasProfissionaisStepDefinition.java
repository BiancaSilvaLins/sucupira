package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaDisciplinas;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaDisciplinasProfissionaisStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaDisciplinas pd = new PaginaAbaDisciplinas();
    PaginaBase pb =  new PaginaBase();

    @Given("que estou na tela Dados da Disciplina profissional")
    public void que_estou_na_tela_Dados_da_Disciplina_profissional() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pd.clicaNaAbaDisciplinas();
    }

    @Given("preencho o campo nome da disciplina profissional {string}")
    public void preencho_o_campo_nome_da_disciplina_profissional(String nome) {
        pd.preencherCampoNome(nome);
    }

    @Given("seleciono o nivel da disciplina profissional {string}")
    public void seleciono_o_nivel_da_disciplina_profissional(String nivel) {
        pd.selecionaNivel(nivel);
    }

    @Given("clico no botao SIM de disciplina profissional obrigatoria")
    public void clico_no_botao_SIM_de_disciplina_profissional_obrigatoria() {
        pd.clicarBotaoSim();
    }

    @Given("preencho o campo de creditos da disciplina profissional {string}")
    public void preencho_o_campo_de_creditos_da_disciplina_profissional(String creditos) {
        pd.preencherCampoCreditos(creditos);
    }

    @Given("preencho o campo ementa da disciplina profissional {string}")
    public void preencho_o_campo_ementa_da_disciplina_profissional(String ementa) {
        pd.preencherCampoEmenta(ementa);
    }

    @Given("preencho o campo bibliografia da disciplina profissional {string}")
    public void preencho_o_campo_bibliografia_da_disciplina_profissional(String bibliografia) {
        pd.preencherCampoBibliografia(bibliografia);
    }

    @Given("seleciono a area de concentracao da disciplina profissional {string}")
    public void seleciono_a_area_de_concentracao_da_disciplina_profissional(String area) {
       pd.selecionarAreaConcentracao(area);
    }

    @Given("clico no simbolo MAIS profissional")
    public void clico_no_simbolo_MAIS_profissional() {
        pd.clicarBotaoMais();
    }

    @When("clico no botao inserir disciplina")
    public void clico_no_botao_inserir_disciplina() throws InterruptedException{
        Thread.sleep(1000);
        pd.clicarBotaoInserirDisciplina();
    }

    @Then("o sistema insere a nova disciplina e emite a mensagem {string}")
    public void o_sistema_insere_a_nova_disciplina_e_emite_a_mensagem(String mensagemSucess)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagemSucess,
                pb.removerCaracteresEspeciais(pd.mensagemSucess(mensagemSucess)));
    }

    @When("nao preencho nenhum campo obrigatorio")
    public void nao_preencho_nenhum_campo_obrigatorio() {
        pd.clicarBotaoInserirDisciplina();
    }

    @Then("o sistema apresenta as mensagens {string} {string} {string} {string} {string}")
    public void o_sistema_apresenta_as_mensagens(String mensagem1, String mensagem2, String mensagem3, String mensagem4, String mensagem5) throws InterruptedException {
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

    @Given("clico no botao NAO de disciplina profissional obrigatoria")
    public void clico_no_botao_NAO_de_disciplina_profissional_obrigatoria() {
       pd.clicarBotaoNao();
    }
}