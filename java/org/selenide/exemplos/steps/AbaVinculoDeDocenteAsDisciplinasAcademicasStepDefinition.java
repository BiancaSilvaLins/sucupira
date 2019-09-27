package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.*;

public class AbaVinculoDeDocenteAsDisciplinasAcademicasStepDefinition {

    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaVinculoDeDocenteAsDisciplinas pvdd = new PaginaAbaVinculoDeDocenteAsDisciplinas();
    PaginaBase pb = new PaginaBase();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela de Dados dos Vinculo de Docente as Disciplinas Academicas")
    public void que_estou_na_tela_de_Dados_dos_Vinculo_de_Docente_as_Disciplinas_Academicas() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pvdd.clicaNaAbaVinculo();
    }

    @Given("seleciono o docente academico {string}")
    public void seleciono_o_docente_academico(String docente) {
        pvdd.selecionarDocente(docente);
    }

    @Given("seleciono a disciplina academica {string}")
    public void seleciono_a_disciplina_academica(String disciplina) {
        pvdd.selecionarDisciplina(disciplina);
    }

    @When("clico no botao associar")
    public void clico_no_botao_associar() throws InterruptedException {
        pvdd.clicarBotaoAssociar();
    }

    @Then("o sistema associa o docente a disciplina academica selecionada e exibe a mensagem {string}")
    public void o_sistema_associa_o_docente_a_disciplina_academica_selecionada_e_exibe_a_mensagem(String mensagem)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                mensagem,
                pb.removerCaracteresEspeciais(pvdd.mensagem(mensagem)));
    }
}
