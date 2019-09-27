package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.PaginaAbaCaracterizacaoDoCursoProfissional;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaCaracterizacaoDoCursoProfissionalStepDefinition {
    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaCaracterizacaoDoCursoProfissional pCP = new PaginaAbaCaracterizacaoDoCursoProfissional();

    @After
    public void tearDown() {
        Selenide.close();
    }

    @Given("que estou na tela Caracterizacao do Curso Profissional")
    public void que_estou_na_tela_Caracterizacao_do_Curso_Profissional() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pCP.clicaNaAbaCaracterizacaoDoCurso();
    }

    @Given("clico na opcao Mestrado Profissional")
    public void clico_na_opcao_Mestrado_Profissional() {
        pCP.clicaOpcaoMestrado();
    }

    @Given("Preencho o campo nome Mestrado {string}")
    public void preencho_o_campo_nome_Mestrado(String string) {
        pCP.preencheCampoNome(string);
    }

    @Given("Seleciono a Periodicidade da Selecao Mestrado{string}")
    public void seleciono_a_Periodicidade_da_Selecao_Mestrado(String string) {
        pCP.selecionarPeriodicidade(string);
    }

    @Given("Preencho o campo Objetivo do curso Mestrado {string}")
    public void preencho_o_campo_Objetivo_do_curso_Mestrado(String string) {
        pCP.preencheObjetivoCurso(string);
    }

    @Given("Preencho as horas da disciplina Mestrado{string}")
    public void preencho_as_horas_da_disciplina_Mestrado(String string) {
        pCP.creditosDisciplinas(string);
    }

    @Given("Preencho as horas da tese Mestrado{string}")
    public void preencho_as_horas_da_tese_Mestrado(String string) {
        pCP.creditosTese(string);
    }

    @Given("Preencho o numero da vagas Mestrado{string}")
    public void preencho_o_numero_da_vagas_Mestrado(String string) {
        pCP.vagasSelecao(string);
    }

    @Given("Preencho as horas de equivalencia Mestrado{string}")
    public void preencho_as_horas_de_equivalencia_Mestrado(String string) {
        pCP.equivalencia(string);
    }

    @Given("Preencho as horas dos Outros Creditos Mestrado{string}")
    public void preencho_as_horas_dos_Outros_Creditos_Mestrado(String string) {
        pCP.outrosCreditos(string);
    }

    @Given("Preencho a descricao sintetica do esquema de oferta de curso Mestrado{string}")
    public void preencho_a_descricao_sintetica_do_esquema_de_oferta_de_curso_Mestrado(String string) {
        pCP.descricaoSintetica(string);
    }

    @When("Seleciono uma area de concentracao Mestrado{string}")
    public void seleciono_uma_area_de_concentracao_Mestrado(String string) {
        pCP.selecionarAreasConcentracao(string);
    }

    @Then("Clico no botao atualizar os dados do curso Mestrado")
    public void clico_no_botao_atualizar_os_dados_do_curso_Mestrado() {
        pCP.clicarBotaoAtualizar();
    }

    @Given("clico na opcao Doutorado Profissional")
    public void clico_na_opcao_Doutorado_Profissional() {
        pCP.clicarOpcaoDoutorado();
    }

    @Given("Preencho o campo nome Doutorado {string}")
    public void preencho_o_campo_nome_Doutorado(String string) {
        pCP.preencheCampoNomeDoutorado(string);
    }

    @Given("Seleciono a Periodicidade da Selecao Doutorado {string}")
    public void seleciono_a_Periodicidade_da_Selecao_Doutorado(String string) {
        pCP.selecionarPeriodicidadeDoutorado(string);
    }

    @Given("Preencho o campo Objetivo do curso Doutorado {string}")
    public void preencho_o_campo_Objetivo_do_curso_Doutorado(String string) {
        pCP.preencheObjetivoCursoDoutorado(string);
    }

    @Given("Preencho as horas da disciplina Doutorado {string}")
    public void preencho_as_horas_da_disciplina_Doutorado(String string) {
        pCP.creditosDisciplinasDoutorado(string);
    }

    @Given("Preencho as horas da tese Doutorado {string}")
    public void preencho_as_horas_da_tese_Doutorado(String string) {
        pCP.creditosTeseDoutorado(string);
    }

    @Given("Preencho o numero da vagas Doutorado {string}")
    public void preencho_o_numero_da_vagas_Doutorado(String string) {
        pCP.vagasSelecaoDoutorado(string);
    }

    @Given("Preencho as horas de equivalencia Doutorado {string}")
    public void preencho_as_horas_de_equivalencia_Doutorado(String string) {
        pCP.equivalenciaDoutorado(string);
    }

    @Given("Preencho as horas dos Outros Creditos Doutorado {string}")
    public void preencho_as_horas_dos_Outros_Creditos_Doutorado(String string) {
        pCP.outrosCreditosDoutorado(string);
    }

    @Given("Preencho a descricao sintetica do esquema de oferta de curso Doutorado {string}")
    public void preencho_a_descricao_sintetica_do_esquema_de_oferta_de_curso_Doutorado(String string) {
        pCP.descricaoSinteticaDoutorado(string);
    }

    @When("Seleciono uma area de concentracao Doutorado {string}")
    public void seleciono_uma_area_de_concentracao_Doutorado(String string) {
        pCP.selecionarAreasConcentracaoDoutorado(string);
    }

    @Then("Clico no botao atualizar os dados do curso Doutorado")
    public void clico_no_botao_atualizar_os_dados_do_curso_Doutorado() {
        pCP.clicarBotaoAtualizarDoutorado();
    }
}