package org.selenide.exemplos.steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.impl.StaticConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenide.exemplos.paginas.PaginaAPCNCalendarioAcademico;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaCalendarioAcademico;
import org.selenide.exemplos.paginas.PaginaPreencheDadosInstituicaoAcademico;

import static com.codeborne.selenide.Selenide.sleep;

public class PreencheDadosInstituicaoAcademicoStepDefinition {

    private PaginaPreencheDadosInstituicaoAcademico pgPreencheDados = new PaginaPreencheDadosInstituicaoAcademico();
    private PaginaAPCNCalendarioAcademico pgCalendario = new PaginaAPCNCalendarioAcademico();
    private PaginaCalendarioAcademico pgCalendarioProf = new PaginaCalendarioAcademico();
    private PaginaBase pb = new PaginaBase();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na tela de solicitacao de novos cursos {string}")
    public void estou_na_tela_de_solicitacao_de_novos_cursos(String titulo) {
        pgCalendario.navegar();
        pgCalendarioProf.clicaCalendarioAcademico();
        pgPreencheDados.getTituloPaginaSolicitacaoNovosCursos(titulo);


    }

    @And("preencho o campo {string} com as tres primeira iniciais da ies")
    public void preencho_o_campo_com_as_tres_primeira_iniciais_da_ies(String ies) {
        pgPreencheDados.preencheSiglaIES(ies);
    }

    @And("seleciono a {string}")
    public void seleciono_a(String instituicaoDeEnsino) {
        pgPreencheDados.selecioaInstituicaoDeEnsino(instituicaoDeEnsino);
    }

    @And("seleciono Nao para a opcao de correspondencia a um novo curso vinculado a programa")
    public void seleciono_Nao_para_a_opcao_de_correspondencia_a_um_novo_curso_vinculado_a_programa() {
        pgPreencheDados.selecionaOpcaoNao();
    }

    @And("Preencho o campo de {string}")
    public void preencho_o_campo_de(String programa) {
        pgPreencheDados.preenchaCampoPrograma(programa);
    }

    @And("seleciono o {string} do coordenador")
    public void seleciono_o_do_coordenador(String tipoDeDocumento) {
        pgPreencheDados.selecionaTipoDeDocumento(tipoDeDocumento);
    }

    @And("preencho o campo {string}")
    public void preencho_o_campo(String numeroDoDocumento)throws InterruptedException{
        pgPreencheDados.preencherNumeroDoc(numeroDoDocumento);
        pgPreencheDados.clicarDDD();
        Thread.sleep(3000);
    }

    @And("preencho os campos {string} e {string}")
    public void preencho_os_campos_e(String ddd, String telefone) throws InterruptedException {
        pgPreencheDados.preencherDDD(ddd);
        pgPreencheDados.preencherTelefone(telefone);

    }

    @When("clico no botao de criar proposta")
    public void clico_no_botao_de_criar_proposta() {
        pgPreencheDados.clicaBotaoCriarProposta();
    }

    @When("clico no botao de criar proposta confirmacao")
    public void clico_no_botao_de_criar_proposta_confirmacao() {
        pgPreencheDados.clicaBotaoCriarProposta2();
    }

    @Then("sera encaminhado pagina de Dados da Proposta de Programa")
    public void sera_encaminhado_pagina_de_Dados_da_Proposta_de_Programa() {
        pgPreencheDados.verificaModal();
        pgPreencheDados.retornaTituloProximaPg();
    }

    @When("clico no botao continuar")
        public void clico_no_botao_continuar(){
            pgPreencheDados.clicarBotaoContinuar();
        }


    @Given("seleciono Sim para a opcao de correspondencia a um novo curso vinculado a programa")
    public void seleciono_Sim_para_a_opcao_de_correspondencia_a_um_novo_curso_vinculado_a_programa() {
        pgPreencheDados.selecionaOpcaoSim();
    }

    @Given("seleciono o {string}")
    public void seleciono_o(String programa) {
        pgPreencheDados.selecionaPrograma(programa);
    }

    @Given("a aba de Dados do {string} aparecer")
    public void a_aba_de_Dados_do_aparecer(String coordenador) {
        pgPreencheDados.retornaNomeCoord(coordenador);
    }

    @Given("preencho os campos login {string} e senha {string}")
    public void preencho_os_campos_login_e_senha(String login, String senha) {
        pgPreencheDados.preencheLoginESenha(login, senha);
    }

}
