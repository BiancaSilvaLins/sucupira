package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaProjetosDePesquisa;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaProjetosDePesquisaProfissionalStepDefinition {
    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaProjetosDePesquisa ppp = new PaginaAbaProjetosDePesquisa();


    @Given("que estou na tela de Dados dos Projetos de Pesquisa profissional")
    public void que_estou_na_tela_de_Dados_dos_Projetos_de_Pesquisa_profissional() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlay();
        ppp.clicarNaAbaProjetosDePesquisa();
    }

    @Given("preencho o campo nome do projeto profissional {string}")
    public void preencho_o_campo_nome_do_projeto_profissional(String nome) {
        ppp.preencherCampoNomeProjeto(nome);
    }

    @Given("clico no botao editar projeto profissional")
    public void clico_no_botao_editar_projeto_profissional () {
        ppp.clicarBotaoEditar();
    }

    @Given("seleciono uma linha de pesquisa profissional {string}")
    public void seleciono_uma_linha_de_pesquisa_profissional(String linhaPesquisa) {
        ppp.selecionarLinhaPesquisa(linhaPesquisa);
    }

    @Given("preencho o campo data de inicio profissional {string}")
    public void preencho_o_campo_data_de_inicio_profissional(String dataInicio) {
        ppp.preencherCampoDataInicio(dataInicio);
    }

    @Given("preencho o campo descricao do projeto profissional {string}")
    public void preencho_o_campo_descricao_do_projeto_profissional(String descricao) {
        ppp.preencherCampoDescricao(descricao);
    }

    @Given("preencho o campo descricao do financiador profissional {string}")
    public void preencho_o_campo_descricao_do_financiador_profissional(String descFinanciador) {
        ppp.preencherCampoDescricaoFinanciador(descFinanciador);
    }

    @Given("seleciono um docente profissional {string}")
    public void seleciono_um_docente_profissional(String docente) {
      ppp.selecionarDocente(docente);
    }

    @Given("clico no botao MAIS profissional para inserir o docente")
    public void clico_no_botao_MAIS_profissional_para_inserir_o_docente() {
        ppp.clicarBotaoMais();
    }

    @Given("seleciono o checkbox do responsavel profissional")
    public void seleciono_o_checkbox_do_responsavel_profissional() {
        ppp.clicarCheckBox();
    }

    @When("clico no botao inserir projeto profissional")
    public void clico_no_botao_inserir_projeto_profissional() {
       ppp.clicarBotaoInserirProjeto();
    }

    @Then("o sistema insere o novo projeto e apresenta uma mensagem de sucesso profissional {string}")
    public void o_sistema_insere_o_novo_projeto_e_apresenta_uma_mensagem_de_sucesso_profissional(String msg) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(ppp.mensagem(msg)));
    }

    @When("clico no botao atualizar projeto profissional")
    public void clico_no_botao_atualizar_projeto_profissional() {
        ppp.clicarBotaoAtualizarProjeto();
    }

    @Then("o sistema apresenta uma mensagem de de erro profissional {string}")
    public void o_sistema_apresenta_uma_mensagem_de_de_erro_profissional(String msg2) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                msg2,
                pb.removerCaracteresEspeciais(ppp.mensagem2(msg2)));
    }
}
