package org.selenide.exemplos.steps;

import cucumber.api.java.After;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaPBTA;
import org.selenide.exemplos.paginas.PaginaAbaPBTADadosSolicitacao;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaPBTAAcademicoDadosSolicitacaoStepDefinition {
    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaPBTADadosSolicitacao pbtaDS = new PaginaAbaPBTADadosSolicitacao();
    PaginaAbaPBTA pbta = new PaginaAbaPBTA();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela de Producao Bibliografica Tecnica e Artistica academico")
    public void que_estou_na_tela_de_Producao_Bibliografica_Tecnica_e_Artistica_academico() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlayAcademico();
        pbta.clicaNaAbaPBTA();
    }

    @Given("clico na opcao para cadastrar um novo veiculo academico")
    public void clico_na_opcao_para_cadastrar_um_novo_veiculo_academico() {
        pbtaDS.clicarOpcaoCadastrarClicaAqui();
    }

    @Given("preencho o campo titulo academico {string}")
    public void preencho_o_campo_titulo_academico(String titulo) {
        pbtaDS.preencherCampoTitulo(titulo);
    }

    @Given("preencho o campo valor do identificador academico {string}")
    public void preencho_o_campo_valor_do_identificador_academico(String valor) {
        pbtaDS.preencherCampoValor(valor);
    }

    @Given("preencho o campo justificativa academica {string}")
    public void preencho_o_campo_justificativa_academica(String justificativa) {
        pbtaDS.preencherCampoJustificativa(justificativa);
    }

    @Given("clico no botao enviar academico")
    public void clico_no_botao_enviar_academico() {
        pbtaDS.clicarBotaoEnviar();
    }

    @Given("o sistema insere a nova solicitacao academica e emite a mensagem academica {string}")
    public void o_sistema_insere_a_nova_solicitacao_academica_e_emite_a_mensagem_academica(String msg) {
        Assert.assertEquals(pbtaDS.validaMensagem(msg), msg);
    }

    @Given("clico no botao retornar para o cadastro")
    public void clico_no_botao_retornar_para_o_cadastro() {
        pbtaDS.clicarBotaoRetornar();
    }

    @Given("clico na aba Producao Bibliografica Tecnica e Artistica academico")
    public void clico_na_aba_Producao_Bibliografica_Tecnica_e_Artistica_academico() {
        pbta.clicaNaAbaPBTA();
    }

    @Given("clico na opcao solicitacoes de veiculos academicos")
    public void clico_na_opcao_solicitacoes_de_veiculos_academicos() {
        pbtaDS.clicarSolicitacoesVeiculos();
    }

    @Then("o sistema apresenta a nova solicitacao de veiculos na {string} academico")
    public void o_sistema_apresenta_a_nova_solicitacao_de_veiculos_na_academico(String listaVeiculos) {
        Assert.assertEquals(pbtaDS.validaSolicitacao(listaVeiculos), listaVeiculos);
    }
}
