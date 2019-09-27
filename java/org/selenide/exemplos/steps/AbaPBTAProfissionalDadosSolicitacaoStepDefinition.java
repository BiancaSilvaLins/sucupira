package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaPBTA;
import org.selenide.exemplos.paginas.PaginaAbaPBTADadosSolicitacao;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaPBTAProfissionalDadosSolicitacaoStepDefinition {
    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaPBTADadosSolicitacao pbtaDS = new PaginaAbaPBTADadosSolicitacao();
    PaginaAbaPBTA pbta = new PaginaAbaPBTA();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela de Producao Bibliografica Tecnica e Artistica profissional")
    public void que_estou_na_tela_de_Producao_Bibliografica_Tecnica_e_Artistica_profissional() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pbta.clicaNaAbaPBTA();
    }

    @Given("clico na opcao para cadastrar um novo veiculo profissional")
    public void clico_na_opcao_para_cadastrar_um_novo_veiculo_profissional() {
        pbtaDS.clicarOpcaoCadastrarClicaAqui();
    }

    @Given("preencho o campo titulo profissional {string}")
    public void preencho_o_campo_titulo_profissional(String titulo) {
        pbtaDS.preencherCampoTitulo(titulo);
    }

    @Given("preencho o campo valor do identificador profissional {string}")
    public void preencho_o_campo_valor_do_identificador_profissional(String valor) {
        pbtaDS.preencherCampoValor(valor);
    }

    @Given("preencho o campo justificativa profissional {string}")
    public void preencho_o_campo_justificativa_profissional(String justificativa) {
        pbtaDS.preencherCampoJustificativa(justificativa);
    }

    @Given("clico no botao enviar profissional")
    public void clico_no_botao_enviar_profissional() {
        pbtaDS.clicarBotaoEnviar();
    }

    @Given("o sistema insere a nova solicitacao profissional e emite a mensagem profissional {string}")
    public void o_sistema_insere_a_nova_solicitacao_profissional_e_emite_a_mensagem_profissional(String msg) {
        Assert.assertEquals(pbtaDS.validaMensagem(msg), msg);
    }

    @Given("clico no botao retornar para o cadastro profissional")
    public void clico_no_botao_retornar_para_o_cadastro_profissional() {
        pbtaDS.clicarBotaoRetornar();
    }

    @Given("clico na aba Producao Bibliografica Tecnica e Artistica profissional")
    public void clico_na_aba_Producao_Bibliografica_Tecnica_e_Artistica_profissional() {
        pbta.clicaNaAbaPBTA();
    }

    @Given("clico na opcao solicitacoes de veiculos profissionais")
    public void clico_na_opcao_solicitacoes_de_veiculos_profissionais() {
        pbtaDS.clicarSolicitacoesVeiculos();
    }

    @Then("o sistema apresenta a nova solicitacao de veiculos na {string} profissional")
    public void o_sistema_apresenta_a_nova_solicitacao_de_veiculos_na_profissional(String listaVeiculos) {
        Assert.assertEquals(pbtaDS.validaSolicitacao(listaVeiculos), listaVeiculos);
    }
}
