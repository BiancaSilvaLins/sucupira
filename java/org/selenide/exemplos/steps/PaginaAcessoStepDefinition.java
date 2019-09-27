package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAPCNCalendarioAcademico;
import org.selenide.exemplos.paginas.PaginaAPCNCalendarioProfissional;
import org.selenide.exemplos.paginas.PaginaAcesso;
import org.selenide.exemplos.paginas.PaginaPreencheDadosInstituicaoAcademico;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class PaginaAcessoStepDefinition {

    private PaginaAcesso paginaAcesso = new PaginaAcesso();
    private PaginaPreencheDadosInstituicaoAcademico preencheDadosInstituicaoPage = new PaginaPreencheDadosInstituicaoAcademico();
    private PaginaAPCNCalendarioProfissional calendarioProfissionalPage = new PaginaAPCNCalendarioProfissional();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na pagina de acesso")
    public void estou_na_pagina_de_acesso() {
        calendarioProfissionalPage.navegar();
        calendarioProfissionalPage.clicaBotaoCalendarioProfissional();
        paginaAcesso.preencheCampoIESPagAcesso();
        paginaAcesso.clicaIESPagAcesso();
        preencheDadosInstituicaoPage.selecionaOpcaoNao();
        paginaAcesso.preencheCampoProgramaPgAcesso();
        paginaAcesso.selecionaTipoDocumentoPgAcesso();
        paginaAcesso.preencheNumeroDocumentoPgAcesso();
        paginaAcesso.preencheDadosTelefoneDDDPgAcesso();
        preencheDadosInstituicaoPage.clicaBotaoCriarProposta();
        preencheDadosInstituicaoPage.verificaModal();
        paginaAcesso.verificaTitulopaginaAcesso();
    }

    @And("preencho os campos login {string} e senha {string} para acesso")
    public void preencho_os_campos_login_e_senha_para_acesso(String login, String senha) {
        paginaAcesso.preencheCamposLogin(login,senha);
    }

    @When("clico no botao de Login")
    public void clico_no_botao_de_Login() {
        paginaAcesso.clicaLogin();
    }

    @Then("sou direcionado a pagina de Minhas Propostas")
    public void sou_direcionado_a_pagina_de_Minhas_Propostas() {
        Assert.assertEquals(paginaAcesso.retornaTituloMinhasPropostas(),"Minhas Propostas");

    }


}
