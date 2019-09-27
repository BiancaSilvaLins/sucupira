package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.selenide.exemplos.paginas.*;

import static com.codeborne.selenide.Selenide.sleep;

public class AbaPropostaeCursoProfissionalStepDefinition {

    PaginaAbaPropostaCursoProfissional pgAba = new PaginaAbaPropostaCursoProfissional();
    PaginaAbaPropostaCursoProfissional pgAbaC = new PaginaAbaPropostaCursoProfissional();
    PaginaAPCNCalendarioProfissional paginaAPCNCalendarioProfissional = new PaginaAPCNCalendarioProfissional();
    PaginaAcesso pgAcesso = new PaginaAcesso();
    PaginaPreencheDadosInstituicaoAcademico pgPreencheDados = new PaginaPreencheDadosInstituicaoAcademico();
    PaginaMinhasPropostas pgMinhasPropostas = new PaginaMinhasPropostas();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("seleciono NAO para graduacao na area afim")
    public void seleciono_NAO_para_graduacao_na_area_afim() {
        pgAba.selecionaOpcaoNAO();
    }




    @Given("estou na aba de Proposta e Curso")
    public void estou_na_aba_de_Proposta_e_Curso() {
        paginaAPCNCalendarioProfissional.navegar();
        paginaAPCNCalendarioProfissional.clicaBotaoCalendarioProfissional();
        pgAcesso.preencheCampoIESPagAcesso();
        pgAcesso.clicaIESPagAcesso();
        pgPreencheDados.selecionaOpcaoNao();
        pgAcesso.preencheCampoProgramaPgAcesso();
        pgAcesso.selecionaTipoDocumentoPgAcesso();
        pgAcesso.preencheNumeroDocumentoPgAcesso();
        pgAcesso.preencheDadosTelefoneDDDPgAcesso();
        pgPreencheDados.clicaBotaoCriarProposta();
        pgPreencheDados.verificaModal();
        pgMinhasPropostas.preencheCamposLoginPgPMinhasPropostas();
        pgAcesso.clicaLogin();
        pgAbaC.clicaSimboloPlayPgAbaPropostaProfissional();
        pgAbaC.verificaTituloAba();
    }

    @And("preencho o campo area de conhecimento {string}")
    public void preencho_o_campo_area_de_conhecimento(String areaConhecimento) {
        pgAbaC.preenchoCampoAreaConhecimento(areaConhecimento);
    }

    @And("seleciono SIM para graduacao na area afim")
    public void seleciono_SIM_para_graduacao_na_area_afim() {
        pgAbaC.selecionaBotaoSim();
    }

    @And("preencho o  ano de inicio {string}")
    public void preencho_o_ano_de_inicio(String anoInicio) {
        pgAbaC.preencheAnoInicio(anoInicio);
    }

    @And("deleciono o nivel do curso proposto {string}")
    public void deleciono_o_nivel_do_curso_proposto(String nivelCursoProposto) {
        pgAbaC.selecionaNivelCursoProposto(nivelCursoProposto);
    }

    @And("seleciono o historico do curso na capes {string}")
    public void seleciono_o_historico_do_curso_na_capes(String historico) {
        pgAbaC.selecionaHistoricoCursoCapes(historico);
    }

    @And("preencho o campo de codigo do primeiro programa original {string}")
    public void preencho_o_campo_de_codigo_do_primeiro_programa_original(String codigo1) {
        pgAbaC.preencheCodigoProgOriginal(codigo1);
    }

    @And("preencho o campo de codigo do segundo programa original {string}")
    public void preencho_o_campo_de_codigo_do_segundo_programa_original(String codigo2) {
        pgAbaC.preencheCodigoProgOriginal(codigo2);
    }

    @And("clico no simbolo MAIS")
    public void clico_no_simbolo_MAIS() {
        pgAbaC.clicaSimboloMais();
    }

    @And("surgir a tabela de Programas Associados")
    public void surgir_a_tabela_de_Programas_Associados() {
        pgAbaC.verificaTabelaProgAssociados();
    }

    @When("clico no botao Inserir curso")
    public void clico_no_botao_Inserir_curso() {
        pgAbaC.clicaInserirCurso();
    }

    @Then("a tabela Propostas de Cursos Cadastrados surgira")
    public void a_tabela_Propostas_de_Cursos_Cadastrados_surgira() {
        pgAbaC.verificaTabelaPropostasCursosCadastrados();
    }
}