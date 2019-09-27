package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaPBTA;
import org.selenide.exemplos.paginas.PaginaBase;

public class AbaPBTAAcademicoStepDefinition {
    PaginaAbaPBTA pbta = new PaginaAbaPBTA();
    PaginaBase pb = new PaginaBase();

    @After
    public void tearDown() {
        Selenide.close();
    }


    @Given("seleciono o campo docente academico {string}")
    public void seleciono_o_campo_docente_academico(String docente) {
        pbta.selecionarDocente(docente);
    }

    @Given("preencho data de producao academica {string}")
    public void preencho_data_de_producao_academica(String dataProd) throws InterruptedException{
        Thread.sleep(1000);
        pbta.digitarDataProducao(dataProd);
    }

    @Given("preencho campo nome academico {string}")
    public void preencho_campo_nome_academico(String nomeProd) {
        pbta.digitarNomeProd(nomeProd);
    }

    @Given("seleciono o tipo de producao academica {string}")
    public void seleciono_o_tipo_de_producao_academica(String tipoProd) {
        pbta.selecionarTipoProd(tipoProd);
    }

    @Given("seleciono o subtipo de producao academica {string}")
    public void seleciono_o_subtipo_de_producao_academica(String subTipoProd) {
        pbta.selecionarSubTipoProd(subTipoProd);
    }

    @Given("preencho o campo natureza bibliografica academica {string}")
    public void preencho_o_campo_natureza_bibliografica_academica(String natureza) {
        pbta.preencherCampoNatureza(natureza);
    }

    @Given("preencho o campo nome da editora academica {string}")
    public void preencho_o_campo_nome_da_editora_academica(String editora) {
        pbta.preencherCampoEditora(editora);
    }

    @Given("preencho o campo idioma academico {string}")
    public void preencho_o_campo_idioma_academico(String idioma) {
        pbta.preencherCampoIdioma(idioma);
    }

    @Given("seleciono o tipo da divulgacao da producao academica {string}")
    public void seleciono_o_tipo_da_divulgacao_da_producao_academica(String divulgacao) {
        pbta.selecionaCampoDivulgacao(divulgacao);
    }

    @Given("preencho campo nome de um subAutor academico {string}")
    public void preencho_campo_nome_de_um_subAutor_academico(String nomeAutor) {
       pbta.digitarNomeAutor(nomeAutor);
    }

    @Given("preencho o campo abreviatura de um subAutor academico {string}")
    public void preencho_o_campo_abreviatura_de_um_subAutor_academico(String abreviatura) {
        pbta.digitarAbreviatura(abreviatura);
    }

    @Given("clico no botao Inserir Autor academico")
    public void clico_no_botao_Inserir_Autor_academico() {
        pbta.clicarBotaoInserirAutor();
    }

    @Given("o sistema insere um novo autor da producao e exibe a lista de autores academicos {string}")
    public void o_sistema_insere_um_novo_autor_da_producao_e_exibe_a_lista_de_autores_academicos(String listaAutores) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                listaAutores,pbta.listaAutores(listaAutores));
    }

    @When("clico no botao inserir Producao academica")
    public void clico_no_botao_inserir_Producao_academica() {
        pbta.clicarBotaoInserirProducao();
    }

    @Given("o sistema insere a nova producao academica e emite a mensagem academica {string}")
    public void o_sistema_insere_a_nova_producao_academica_e_emite_a_mensagem_academica(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pbta.mensagemSucesso(msg)));
    }

    @When("clico no botao avancar para aba projetos de pesquisa")
    public void clico_no_botao_avancar_para_aba_projetos_de_pesquisa() {

        pbta.clicarBotaoAvancar();
    }

    @Given("seleciono o checkbox da producao academica desejada")
    public void seleciono_o_checkbox_da_producao_academica_desejada() {
        pbta.clicarCheckBox();
    }

    @When("clico no botao remover producoes academicas")
    public void clico_no_botao_remover_producoes_academicas()throws InterruptedException {
        Thread.sleep(5000);
        pbta.clicarBotaoRemoverProducoes();
    }

    @Then("o sistema exclui a producao academica e emite a mensagem academica {string}")
    public void o_sistema_exclui_a_producao_academica_e_emite_a_mensagem_academica(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pbta.mensagemSucesso(msg)));
    }

    @Given("clico no editar")
    public void clico_no_editar() {
        pbta.clicarBotaoEditar();
    }

    @When("clico no botao atualizar producao academica")
    public void clico_no_botao_atualizar_producao_academica() {
        pbta.clicarBotaoAtualizarProducao();
    }

    @Then("o sistema atualiza a producao academica e emite a mensagem academica {string}")
    public void o_sistema_atualiza_a_producao_academica_e_emite_a_mensagem_academica(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pbta.mensagemSucesso(msg)));
    }
}