package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaVinculoDeDocenteAsDisciplinas;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaVinculoDeDocenteAsDisciplinasProfissionaisStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaVinculoDeDocenteAsDisciplinas pvdd = new PaginaAbaVinculoDeDocenteAsDisciplinas();
    PaginaBase pb = new PaginaBase();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela de Dados dos Vinculo de Docente as Disciplinas Profissionais")
    public void que_estou_na_tela_de_Dados_dos_Vinculo_de_Docente_as_Disciplinas_Profissionais() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pvdd.clicaNaAbaVinculo();
    }

    @Given("seleciono o docente profissional {string}")
    public void seleciono_o_docente_profissional(String docente) {
        pvdd.selecionarDocente(docente);
    }

    @Given("seleciono a disciplina profissional {string}")
    public void seleciono_a_disciplina_profissional(String disciplina) {
        pvdd.selecionarDisciplina(disciplina);
    }

    @When("clico no botao associar profissional")
    public void clico_no_botao_associar_profissional() throws InterruptedException {
        pvdd.clicarBotaoAssociar();
    }

    @Then("o sistema associa o docente a disciplina profissional selecionada e exibe a mensagem {string}")
    public void o_sistema_associa_o_docente_a_disciplina_profissional_selecionada_e_exibe_a_mensagem(String mensagem)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagem,
                pb.removerCaracteresEspeciais(pvdd.mensagem(mensagem)));
    }
}
