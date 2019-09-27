package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaProjetosDePesquisa;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaProjetosDePesquisaAcademicoStepDefinition {
    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaProjetosDePesquisa ppp = new PaginaAbaProjetosDePesquisa();


    @Given("que estou na tela de Dados dos Projetos de Pesquisa Academica")
    public void que_estou_na_tela_de_Dados_dos_Projetos_de_Pesquisa_Academica() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlayAcademico();
        ppp.clicarNaAbaProjetosDePesquisa();
    }

    @Given("preencho o campo nome do projeto academico {string}")
    public void preencho_o_campo_nome_do_projeto_academico(String nome) {
        ppp.preencherCampoNomeProjeto(nome);
    }

    @Given("clico no botao editar projeto academico")
    public void clico_no_botao_editar_projeto_academico () {
        ppp.clicarBotaoEditar();
    }

    @Given("seleciono uma linha de pesquisa academica {string}")
    public void seleciono_uma_linha_de_pesquisa_academica(String linhaPesquisa) {
        ppp.selecionarLinhaPesquisa(linhaPesquisa);
    }

    @Given("preencho o campo data de inicio academico {string}")
    public void preencho_o_campo_data_de_inicio_academico(String dataInicio) {
        ppp.preencherCampoDataInicio(dataInicio);
    }

    @Given("preencho o campo descricao do projeto academico {string}")
    public void preencho_o_campo_descricao_do_projeto_academico(String descricao) {
        ppp.preencherCampoDescricao(descricao);
    }

    @Given("preencho o campo descricao do financiador academico {string}")
    public void preencho_o_campo_descricao_do_financiador_academico(String descFinanciador) {
        ppp.preencherCampoDescricaoFinanciador(descFinanciador);
    }

    @Given("seleciono um docente academico {string}")
    public void seleciono_um_docente_academico(String docente) {
      ppp.selecionarDocente(docente);
    }

    @Given("clico no botao MAIS academico para inserir o docente")
    public void clico_no_botao_MAIS_academico_para_inserir_o_docente() {
        ppp.clicarBotaoMais();
    }

    @Given("seleciono o checkbox do responsavel academico")
    public void seleciono_o_checkbox_do_responsavel_academico() {
        ppp.clicarCheckBox();
    }

    @When("clico no botao inserir projeto academico")
    public void clico_no_botao_inserir_projeto_academico() {
       ppp.clicarBotaoInserirProjeto();
    }

    @Then("o sistema insere o novo projeto e apresenta uma mensagem de sucesso {string}")
    public void o_sistema_insere_o_novo_projeto_e_apresenta_uma_mensagem_de_sucesso(String msg) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(ppp.mensagem(msg)));
    }//*[@id='formBaseProposta:btnAvancar']

    @When("clico no botao avancar para aba vinculo de docente")
    public void clico_no_botao_avancar_para_aba_vinculo_de_docente() {

        ppp.clicarBotaoAvancar();
    }

    @When("clico no botao atualizar projeto academico")
    public void clico_no_botao_atualizar_projeto_academico() {
        ppp.clicarBotaoAtualizarProjeto();
    }

    @Then("o sistema apresenta uma mensagem de de erro {string}")
    public void o_sistema_apresenta_uma_mensagem_de_de_erro(String msg2) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                msg2,
                pb.removerCaracteresEspeciais(ppp.mensagem2(msg2)));
    }
}
