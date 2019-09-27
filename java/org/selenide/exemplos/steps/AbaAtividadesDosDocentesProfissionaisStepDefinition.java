package org.selenide.exemplos.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaAtividadesDosDocentes;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;

public class AbaAtividadesDosDocentesProfissionaisStepDefinition {

    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaAtividadesDosDocentes pad = new PaginaAbaAtividadesDosDocentes();



    @Given("que estou na tela de dados das Atividades dos Docentes profissionais")
    public void que_estou_na_tela_de_dados_das_Atividades_dos_Docentes_profissionals() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlay();
        pad.clicaNaAbaAtividadesDosDocentes();
    }

    @Given("seleciono um docente profissional para preencher os dados {string}")
    public void seleciono_um_docente_profissional_para_preencher_os_dados(String string) {
        pad.selecionarDocente(string);
    }

    @Given("preencho o campo iniciacao cientifica profissional {string}")
    public void preencho_o_campo_iniciacao_cientifica_profissional(String string) {
        pad.preencherCampoIniciacaoCientfica(string);
    }

    @Given("preencho o campo especializacao profissional {string}")
    public void preencho_o_campo_especializacao_profissional(String string) {
        pad.preencherCampoEspecializacao(string);
    }

    @Given("preencho o campo mestrado profissional {string}")
    public void preencho_o_campo_mestrado_profissional(String string) {
        pad.preencherCampoMestrado1(string);
    }

    @Given("preencho o campo trabalho de conclusao de curso profissional {string}")
    public void preencho_o_campo_trabalho_de_conclusao_de_curso_profissional(String string) {
        pad.preencherCampoTrabConclusao(string);
    }

    @Given("preencho o campo doutorado profissional {string}")
    public void preencho_o_campo_doutorado_profissional(String string) {
       pad.preencherCampoDoutorado1(string);
    }

    @Given("preencho o campo mestrado profissional2 {string}")
    public void preencho_o_campo_mestrado_profissional2( String string) {
        pad.preencherCampoMestrado2(string);
    }

    @Given("preencho o campo doutorado profissional2 {string}")
    public void preencho_o_campo_doutorado_profissional2( String string) {
        pad.preencherCampoDoutorado2(string);
    }

    @Given("preencho o campo participacao em projetos profissionais {string}")
    public void preencho_o_campo_participacao_em_projetos_profissionais(String string) {
        pad.preencherCampoParticipacaoEmProjetos(string);
    }

    @Given("preencho o campo artes cenicas profissional {string}")
    public void preencho_o_campo_artes_cenicas_profissional(String string) {
        pad.preencherCampoArtesCenicas(string);
    }

    @Given("preencho o campo artes visuais profissional {string}")
    public void preencho_o_campo_artes_visuais_profissional(String string) {
        pad.preencherCampoArtesVisuais(string);
    }

    @Given("preencho o campo musica profissional {string}")
    public void preencho_o_campo_musica_profissional(String string) {
        pad.preencherCampoMusica(string);
    }

    @Given("preencho o campo outra producao cultural profissional {string}")
    public void preencho_o_campo_outra_producao_cultural_profissional(String string) {
       pad.preencherCampoOutraProducao(string);
    }

    @Given("preencho o campo artigo em jornal ou revista profissional {string}")
    public void preencho_o_campo_artigo_em_jornal_ou_revista_profissional(String string) {
        pad.preencherCampoArtigoJR(string);
    }

    @Given("preencho o campo artigo em periodico profissional {string}")
    public void preencho_o_campo_artigo_em_periodico_profissional(String string) {
        pad.preencherCampoArtiqoPeriodico(string);
    }

    @Given("preencho o campo livro profissional {string}")
    public void preencho_o_campo_livro_profissional(String string) {
        pad.preencherCampoLivro(string);
    }

    @Given("preencho o campo outro profissional {string}")
    public void preencho_o_campo_outro_profissional(String string) {
        pad.preencherCampoOutro(string);
    }

    @Given("preencho o campo partitura musical profissional {string}")
    public void preencho_o_campo_partitura_musical_profissional(String string) {
        pad.preencherCampoPartituraMusical(string);
    }

    @Given("preencho o campo trabalho em anais profissional {string}")
    public void preencho_o_campo_trabalho_em_anais_profissional(String string) {
        pad.preencherCampoTrabalhoAnais(string);
    }

    @Given("preencho o campo traducao profissional {string}")
    public void preencho_o_campo_traducao_profissional(String string) {
        pad.preencherCampoTraducao(string);
    }

    @Given("preencho o campo apresentacao de trabalho profissional {string}")
    public void preencho_o_campo_apresentacao_de_trabalho_profissional(String string) {
        pad.preencherCampoApresentacaoTrabalho(string);
    }

    @Given("preencho o campo cartas profissional {string}")
    public void preencho_o_campo_cartas_profissional(String string) {
        pad.preencherCampoCartas(string);
    }

    @Given("preencho o campo curso de curta duracao profissional {string}")
    public void preencho_o_campo_curso_de_curta_duracao_profissional(String string) {
        pad.preencherCampoCursoCurtaDuracao(string);
    }

    @Given("preencho o campo desenvolvimento de aplicativo profissional {string}")
    public void preencho_o_campo_desenvolvimento_de_aplicativo_profissional(String string) {
       pad.preencherCampoDesenvolvimentoApp(string);
    }

    @Given("preencho o campo desenvolvimento de material didatico e instrucional profissional {string}")
    public void preencho_o_campo_desenvolvimento_de_material_didatico_e_instrucional_profissional(String string) {
        pad.preencherCampoDesenvolvimentoMaterial(string);
    }

    @Given("preencho o campo desenvolvimento de producao profissional {string}")
    public void preencho_o_campo_desenvolvimento_de_producao_profissional(String string) {
        pad.preencherCampoDesenvolvimentoProducao(string);
    }

    @Given("preencho o campo desenvolvimento de tecnica profissional {string}")
    public void preencho_o_campo_desenvolvimento_de_tecnica_profissional(String string) {
        pad.preencherCampoDesenvolvimentoDeTecnica(string);
    }

    @Given("preencho o campo editoria profissional {string}")
    public void preencho_o_campo_editoria_profissional(String string) {
        pad.preencherCampoEditoria(string);
    }

    @Given("preencho o campo manutencao de obra artistica profissional {string}")
    public void preencho_o_campo_manutencao_de_obra_artistica_profissional(String string) {
        pad.preencherCampoManutencaoDeObra(string);
    }

    @Given("preencho o campo maquete profissional {string}")
    public void preencho_o_campo_maquete_profissional(String string) {
        pad.preencherCampoMaquete(string);
    }

    @Given("preencho o campo organizacao de evento profissional {string}")
    public void preencho_o_campo_organizacao_de_evento_profissional(String string) {
        pad.preencherCampoOrganizacaoDeEvento(string);
    }

    @Given("preencho o campo outros profissional {string}")
    public void preencho_o_campo_outros_profissional(String string) {
        pad.preencherCampoOutros(string);
    }

    @Given("preencho o campo patente profissional {string}")
    public void preencho_o_campo_patente_profissional(String string) {
        pad.preencherCampoPatente(string);
    }

    @Given("preencho o campo programa de radio ou tv profissional {string}")
    public void preencho_o_campo_programa_de_radio_ou_tv_profissional(String string) {
        pad.preencherCampoProgramaRadioTv(string);
    }

    @Given("preencho o campo relatorio de pesquisa profissional {string}")
    public void preencho_o_campo_relatorio_de_pesquisa_profissional(String string) {
        pad.preencherCampoRelatorioDePesquisa(string);
    }

    @Given("preencho o campo servicos tecnicos profissional {string}")
    public void preencho_o_campo_servicos_tecnicos_profissional(String string) {
        pad.preencherCampoServicosTecnicos(string);
    }

    @When("clico no botao salvar dados profissionais")
    public void clico_no_botao_salvar_dados_profissionais() {
        pad.clicarBotaoSalvarDados();
    }

    @Then("o sistema salva as atividades profissionais do docente e exibe a mensagem {string}")
    public void o_sistema_salva_as_atividades_profissionais_do_docente_e_exibe_a_mensagem(String msg) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pad.mensagemSucesso(msg)));
    }
}
