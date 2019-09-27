package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.PaginaCalendarioProfissional;

public class CalendarioProfissionalStepDefinition {

    PaginaCalendarioProfissional pgCalendarioProf = new PaginaCalendarioProfissional();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("possuo {string} profissional de proposta de novos cursos")
    public void possuo_profissional_de_proposta_de_novos_cursos(String calendarioProfissional) {
        pgCalendarioProf.retornaCalendarioProfissional(calendarioProfissional);
    }

    @When("clico no botao de calendario profissional de propostas de novos cursos academico")
    public void clico_no_botao_de_calendario_profissional_de_propostas_de_novos_cursos_academico() {
       pgCalendarioProf.clicaCalendarioProfissional();
    }

    @Then("devo obter tela de solicitacao de novos cursos profissional {string}")
    public void devo_obter_tela_de_solicitacao_de_novos_cursos_profissional(String tela) {
        pgCalendarioProf.retornaTelaDeSolicitacao(tela);
    }

}
