package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaInfraestrutura;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaInfraestruturaProfissionalStepDefinition {

    PaginaBase pb =  new PaginaBase();
    PaginaMinhasPropostas pMP = new PaginaMinhasPropostas();
    PaginaAbaInfraestrutura pin = new PaginaAbaInfraestrutura();

    @Given("que estou na tela de dados da Infraestrutura profissional")
    public void que_estou_na_tela_de_dados_da_Infraestrutura_profissional() {
        pMP.navegar();
        pMP.clicarOpcaoAPCN();
        pMP.clicarMinhasPropostas();
        pMP.preencheCamposLoginPgPMinhasPropostas();
        pMP.clicarBotaoLogin();
        pMP.clicaSimboloPlay();
        pin.clicaNaAbaInfraestrutura();
    }

    @Given("preencho o campo Municipio para programas a distancia profissional {string}")
    public void preencho_o_campo_Municipio_para_programas_a_distancia_profissional(String string) {
        pin.preencherCampoMunicipioEad(string);
    }

    @Given("clico na opcao Sim para infraestrutura administrativa exclusiva profissional")
    public void clico_na_opcao_Sim_para_infraestrutura_administrativa_exclusiva_profissional() {
        pin.clicarBotaoSim1();
    }

    @Given("clico na opcao Sim para salas para docentes profissionais")
    public void clico_na_opcao_Sim_para_salas_para_docentes_profissionais() {
        pin.clicarBotaoSim2();
    }

    @Given("preencho o campo Numero de Salas profissional {string}")
    public void preencho_o_campo_Numero_de_Salas_profissional(String string) {
        pin.preencherCampoNumeroDeSalas(string);
    }

    @Given("clico na opcao Sim para salas equipadas com computadores profissionais")
    public void clico_na_opcao_Sim_para_salas_equipadas_com_computadores_profissionais() {
        pin.clicarBotaoSim3();
    }

    @Given("preencho o campo Numero de Salas equipada com computadores profissional {string}")
    public void preencho_o_campo_Numero_de_Salas_equipada_com_computadores_profissional(String string) {
        pin.preencherCampoNumeroDeSalas2(string);
    }

    @Given("preencho o campo Labotarios para pesquisas profissionais {string}")
    public void preencho_o_campo_Labotarios_para_pesquisas_profissionais(String string) {
        pin.preencherCampoLaboratorios(string);
    }

    @Given("clico na opcao Sim para biblioteca ligada a rede mundial de computadores profissionais")
    public void clico_na_opcao_Sim_para_biblioteca_ligada_a_rede_mundial_de_computadores_profissionais() {
       pin.clicarBotaoSim4();
    }

    @Given("preencho o campo Numero de Computadores na biblioteca profissional{string}")
    public void preencho_o_campo_Numero_de_Computadores_na_biblioteca_profissional(String string) {
        pin.preencherCampoNumerosPcs(string);
    }

    @Given("preencho o campo Caracterizacao do Acervo da biblioteca profissional {string}")
    public void preencho_o_campo_Caracterizacao_do_Acervo_da_biblioteca_profissional(String string) {
        pin.preencherCampoAcervo(string);
    }

    @Given("preencho o campo Financiamentos profissionais {string}")
    public void preencho_o_campo_Financiamentos_profissionais(String string) {
        pin.preencherCampoFinanciamentos(string);
    }

    @Given("preencho o campo Informacoes adicionais profissionais {string}")
    public void preencho_o_campo_Informacoes_adicionais_profissionais(String string) {
       pin.preencherCampoAdicionais(string);
    }

    @When("clico no botao salvar dados da infraestrutura profissional")
    public void clico_no_botao_salvar_dados_da_infraestrutura_profissional() {
        pin.clicarBotaoSalvarDados();
    }

    @Then("o sistema salva os dados da infraestrutura profissional e exibe a mensagem {string}")
    public void o_sistema_salva_os_dados_da_infraestrutura_profissional_e_exibe_a_mensagem(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pin.mensagem(msg)));
    }

    @Given("clico na opcao Nao para infraestrutura administrativa exclusiva profissional")
    public void clico_na_opcao_Nao_para_infraestrutura_administrativa_exclusiva_profissional() {
        pin.clicarBotaoNao1();
    }

    @Given("clico na opcao Nao para salas para docentes profissionais")
    public void clico_na_opcao_Nao_para_salas_para_docentes_profissionais() {
        pin.clicarBotaoNao2();
    }

    @Given("clico na opcao Nao para salas equipadas com computadores profissionais")
    public void clico_na_opcao_Nao_para_salas_equipadas_com_computadores_profissionais() {
        pin.clicarBotaoNao3();
    }

    @Given("clico na opcao Nao para biblioteca ligada a rede mundial de computadores profissionais")
    public void clico_na_opcao_Nao_para_biblioteca_ligada_a_rede_mundial_de_computadores_profissionais() {
        pin.clicarBotaoNao4();
    }
}
