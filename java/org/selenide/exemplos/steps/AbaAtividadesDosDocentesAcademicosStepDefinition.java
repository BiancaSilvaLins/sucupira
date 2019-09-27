package org.selenide.exemplos.steps;

import org.selenide.exemplos.paginas.PaginaAbaAtividadesDosDocentes;
import org.selenide.exemplos.paginas.PaginaBase;
import org.selenide.exemplos.paginas.PaginaMinhasPropostas;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AbaAtividadesDosDocentesAcademicosStepDefinition {

    PaginaBase pb = new PaginaBase();
    PaginaMinhasPropostas pmp = new PaginaMinhasPropostas();
    PaginaAbaAtividadesDosDocentes pad = new PaginaAbaAtividadesDosDocentes();



    @Given("que estou na tela de dados das Atividades dos Docentes Academicos")
    public void que_estou_na_tela_de_dados_das_Atividades_dos_Docentes_Academicos() {
        pmp.navegar();
        pmp.clicarOpcaoAPCN();
        pmp.clicarMinhasPropostas();
        pmp.preencheCamposLoginPgPMinhasPropostas();
        pmp.clicarBotaoLogin();
        pmp.clicaSimboloPlayAcademico();
        pad.clicaNaAbaAtividadesDosDocentes();
    }

    @Given("seleciono um docente academico para preencher os dados {string}")
    public void seleciono_um_docente_academico_para_preencher_os_dados(String string) {
        pad.selecionarDocente(string);
    }

    @Given("preencho o campo iniciacao cientifica academica {string}")
    public void preencho_o_campo_iniciacao_cientifica_academica(String string) {
        pad.preencherCampoIniciacaoCientfica(string);
    }

    @Given("preencho o campo especializacao academica {string}")
    public void preencho_o_campo_especializacao_academica(String string) {
        pad.preencherCampoEspecializacao(string);
    }

    @Given("preencho o campo mestrado academico {string}")
    public void preencho_o_campo_mestrado_academico(String string) {
        pad.preencherCampoMestrado1(string);
    }

    @Given("preencho o campo trabalho de conclusao de curso academico {string}")
    public void preencho_o_campo_trabalho_de_conclusao_de_curso_academico(String string) {
        pad.preencherCampoTrabConclusao(string);
    }

    @Given("preencho o campo doutorado academico {string}")
    public void preencho_o_campo_doutorado_academico(String string) {
       pad.preencherCampoDoutorado1(string);
    }

    @Given("preencho o campo mestrado academico2 {string}")
    public void preencho_o_campo_mestrado_academico2( String string) {
        pad.preencherCampoMestrado2(string);
    }

    @Given("preencho o campo doutorado academico2 {string}")
    public void preencho_o_campo_doutorado_academico2( String string) {
        pad.preencherCampoDoutorado2(string);
    }

    @Given("preencho o campo participacao em projetos academicos {string}")
    public void preencho_o_campo_participacao_em_projetos_academicos(String string) {
        pad.preencherCampoParticipacaoEmProjetos(string);
    }

    @Given("preencho o campo artes cenicas academico {string}")
    public void preencho_o_campo_artes_cenicas_academico(String string) {
        pad.preencherCampoArtesCenicas(string);
    }

    @Given("preencho o campo artes visuais academico {string}")
    public void preencho_o_campo_artes_visuais_academico(String string) {
        pad.preencherCampoArtesVisuais(string);
    }

    @Given("preencho o campo musica academico {string}")
    public void preencho_o_campo_musica_academico(String string) {
        pad.preencherCampoMusica(string);
    }

    @Given("preencho o campo outra producao cultural academico {string}")
    public void preencho_o_campo_outra_producao_cultural_academico(String string) {
       pad.preencherCampoOutraProducao(string);
    }

    @Given("preencho o campo artigo em jornal ou revista academico {string}")
    public void preencho_o_campo_artigo_em_jornal_ou_revista_academico(String string) {
        pad.preencherCampoArtigoJR(string);
    }

    @Given("preencho o campo artigo em periodico academico {string}")
    public void preencho_o_campo_artigo_em_periodico_academico(String string) {
        pad.preencherCampoArtiqoPeriodico(string);
    }

    @Given("preencho o campo livro academico {string}")
    public void preencho_o_campo_livro_academico(String string) {
        pad.preencherCampoLivro(string);
    }

    @Given("preencho o campo outro academico {string}")
    public void preencho_o_campo_outro_academico(String string) {
        pad.preencherCampoOutro(string);
    }

    @Given("preencho o campo partitura musical academico {string}")
    public void preencho_o_campo_partitura_musical_academico(String string) {
        pad.preencherCampoPartituraMusical(string);
    }

    @Given("preencho o campo trabalho em anais academico {string}")
    public void preencho_o_campo_trabalho_em_anais_academico(String string) {
        pad.preencherCampoTrabalhoAnais(string);
    }

    @Given("preencho o campo traducao academico {string}")
    public void preencho_o_campo_traducao_academico(String string) {
        pad.preencherCampoTraducao(string);
    }

    @Given("preencho o campo apresentacao de trabalho academico {string}")
    public void preencho_o_campo_apresentacao_de_trabalho_academico(String string) {
        pad.preencherCampoApresentacaoTrabalho(string);
    }

    @Given("preencho o campo cartas academico {string}")
    public void preencho_o_campo_cartas_academico(String string) {
        pad.preencherCampoCartas(string);
    }

    @Given("preencho o campo curso de curta duracao academico {string}")
    public void preencho_o_campo_curso_de_curta_duracao_academico(String string) {
        pad.preencherCampoCursoCurtaDuracao(string);
    }

    @Given("preencho o campo desenvolvimento de aplicativo academico {string}")
    public void preencho_o_campo_desenvolvimento_de_aplicativo_academico(String string) {
       pad.preencherCampoDesenvolvimentoApp(string);
    }

    @Given("preencho o campo desenvolvimento de material didatico e instrucional academico {string}")
    public void preencho_o_campo_desenvolvimento_de_material_didatico_e_instrucional_academico(String string) {
        pad.preencherCampoDesenvolvimentoMaterial(string);
    }

    @Given("preencho o campo desenvolvimento de producao academico {string}")
    public void preencho_o_campo_desenvolvimento_de_producao_academico(String string) {
        pad.preencherCampoDesenvolvimentoProducao(string);
    }

    @Given("preencho o campo desenvolvimento de tecnica academico {string}")
    public void preencho_o_campo_desenvolvimento_de_tecnica_academico(String string) {
        pad.preencherCampoDesenvolvimentoDeTecnica(string);
    }

    @Given("preencho o campo editoria academico {string}")
    public void preencho_o_campo_editoria_academico(String string) {
        pad.preencherCampoEditoria(string);
    }

    @Given("preencho o campo manutencao de obra artistica academico {string}")
    public void preencho_o_campo_manutencao_de_obra_artistica_academico(String string) {
        pad.preencherCampoManutencaoDeObra(string);
    }

    @Given("preencho o campo maquete academico {string}")
    public void preencho_o_campo_maquete_academico(String string) {
        pad.preencherCampoMaquete(string);
    }

    @Given("preencho o campo organizacao de evento academico {string}")
    public void preencho_o_campo_organizacao_de_evento_academico(String string) {
        pad.preencherCampoOrganizacaoDeEvento(string);
    }

    @Given("preencho o campo outros academico {string}")
    public void preencho_o_campo_outros_academico(String string) {
        pad.preencherCampoOutros(string);
    }

    @Given("preencho o campo patente academico {string}")
    public void preencho_o_campo_patente_academico(String string) {
        pad.preencherCampoPatente(string);
    }

    @Given("preencho o campo programa de radio ou tv academico {string}")
    public void preencho_o_campo_programa_de_radio_ou_tv_academico(String string) {
        pad.preencherCampoProgramaRadioTv(string);
    }

    @Given("preencho o campo relatorio de pesquisa academico {string}")
    public void preencho_o_campo_relatorio_de_pesquisa_academico(String string) {
        pad.preencherCampoRelatorioDePesquisa(string);
    }

    @Given("preencho o campo servicos tecnicos academico {string}")
    public void preencho_o_campo_servicos_tecnicos_academico(String string) {
        pad.preencherCampoServicosTecnicos(string);
    }

    @When("clico no botao salvar dados academicos")
    public void clico_no_botao_salvar_dados_academicos() {
        pad.clicarBotaoSalvarDados();
    }

    @Then("o sistema salva as atividades academicas do docente e exibe a mensagem {string}")
    public void o_sistema_salva_as_atividades_academicas_do_docente_e_exibe_a_mensagem(String msg) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pad.mensagemSucesso(msg)));
    }
}
