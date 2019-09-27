package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.*;

import static com.codeborne.selenide.Selenide.sleep;

public class PreencheDadosInstituicaoProfissionalStepDefinition {

    private PaginaPreencheDadosInstituicaoAcademico pgPreencheDados = new PaginaPreencheDadosInstituicaoAcademico();
    private PaginaAPCNCalendarioProfissional pgCalendario = new PaginaAPCNCalendarioProfissional();
    private PaginaCalendarioProfissional pgCalendarioProf = new PaginaCalendarioProfissional();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("estou na tela de solicitacao de novos cursos profissionais {string}")
    public void estou_na_tela_de_solicitacao_de_novos_cursos_profissionais(String titulo) {
        pgCalendario.navegar();
        pgCalendarioProf.clicaCalendarioProfissional();
        pgPreencheDados.getTituloPaginaSolicitacaoNovosCursos(titulo);
    }

    @Given("preencho o campo {string} com as tres primeira iniciais da ies profissional")
    public void preencho_o_campo_com_as_tres_primeira_iniciais_da_ies_profissional(String ies) {
        pgPreencheDados.preencheSiglaIES(ies);
    }

    @Given("seleciono a {string} profissional")
    public void seleciono_a_profissional(String instituicaoDeEnsino) {
        pgPreencheDados.selecioaInstituicaoDeEnsino(instituicaoDeEnsino);
    }

    @Given("seleciono Nao para a opcao de correspondencia a um novo curso vinculado a programa profissional")
    public void seleciono_Nao_para_a_opcao_de_correspondencia_a_um_novo_curso_vinculado_a_programa_profissional() {
        pgPreencheDados.selecionaOpcaoNao();
    }

    @Given("Preencho o campo de {string} profissional")
    public void preencho_o_campo_de_profissional(String programa) {
        pgPreencheDados.preenchaCampoPrograma(programa);
    }

    @Given("seleciono o {string} do coordenador profissional")
    public void seleciono_o_do_coordenador_profissional(String tipoDeDocumento) {
        pgPreencheDados.selecionaTipoDeDocumento(tipoDeDocumento);
    }

    @Given("preencho o campo {string} profissional")
    public void preencho_o_campo_profissional(String numeroDoDocumento) throws InterruptedException {
        pgPreencheDados.preencherNumeroDoc(numeroDoDocumento);
        Thread.sleep(3000);
    }

    @Given("preencho os campos {string} e {string} profissional")
    public void preencho_os_campos_e_profissional(String ddd, String telefone) throws InterruptedException {
        pgPreencheDados.clicarDDD();
        pgPreencheDados.preencherDDD(ddd);
        pgPreencheDados.preencherTelefone(telefone);
    }

    @When("clico no botao de criar proposta profissional")
    public void clico_no_botao_de_criar_proposta_profissional() {
        pgPreencheDados.clicaBotaoCriarProposta();
    }

    @Then("sera encaminhado pagina de Dados da Proposta de Programa profissional")
    public void sera_encaminhado_pagina_de_Dados_da_Proposta_de_Programa_profissional() {
        pgPreencheDados.verificaModal();
        pgPreencheDados.retornaTituloProximaPg();
    }

    @Given("seleciono Sim para a opcao de correspondencia a um novo curso vinculado a programa profissional")
    public void seleciono_Sim_para_a_opcao_de_correspondencia_a_um_novo_curso_vinculado_a_programa_profissional() {
        pgPreencheDados.selecionaOpcaoSim();
    }

    @Given("seleciono o {string} profissional")
    public void seleciono_o_profissional(String programa) {
        pgPreencheDados.selecionaPrograma(programa);
    }

    @Given("a aba de Dados do {string} aparecer profissional")
    public void a_aba_de_Dados_do_aparecer_profissional(String coordenador) {
        pgPreencheDados.retornaNomeCoord(coordenador);
    }

    @Given("preencho os campos login {string} e senha {string} profissional")
    public void preencho_os_campos_login_e_senha_profissional(String login, String senha) {
        pgPreencheDados.preencheLoginESenha(login, senha);
    }

    @When("clico no botao de criar proposta confirmacao profissional")
    public void clico_no_botao_de_criar_proposta_confirmacao_profissional() {
        pgPreencheDados.clicaBotaoCriarProposta2();
    }

}
