package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAPCNCalendarioAcademico;

public class CalendarioAcademicoStepDefinition {

    private PaginaAPCNCalendarioAcademico calendarioAcademicoPage = new PaginaAPCNCalendarioAcademico();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela Inicial")
    public void que_estou_na_tela_Inicial() {
        calendarioAcademicoPage.navegar();
    }

    @Given("possuo {string} de proposta de novos cursos")
    public void possuo_de_proposta_de_novos_cursos(String calendarioAcademico) {
        Assert.assertEquals(calendarioAcademicoPage.retornaCalendarioAcademico(calendarioAcademico),calendarioAcademico);
    }

    @When("clico no botao de calendario de propostas de novos cursos academico")
    public void clico_no_botao_de_calendario_de_propostas_de_novos_cursos_academico() {
        calendarioAcademicoPage.clicaBotaoCalendarioAcademico();
    }

    @Then("devo obter tela de solicitacaoo de novos cursos {string}")
    public void devo_obter_tela_de_solicitacaoo_de_novos_cursos(String tituloPagina) {
        Assert.assertEquals(calendarioAcademicoPage.getTituloSolicitacaoCursosNovos(tituloPagina),tituloPagina);

    }

}
