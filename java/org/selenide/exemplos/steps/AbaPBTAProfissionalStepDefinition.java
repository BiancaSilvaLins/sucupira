package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaAbaPBTA;
import org.selenide.exemplos.paginas.PaginaBase;

public class AbaPBTAProfissionalStepDefinition {
    PaginaAbaPBTA pbta = new PaginaAbaPBTA();
    PaginaBase pb = new PaginaBase();

    @After
    public void tearDown() {
        Selenide.close();
    }


    @Given("seleciono o campo docente profissional {string}")
    public void seleciono_o_campo_docente_acamidemico(String docente) {
        pbta.selecionarDocente(docente);
    }

    @Given("preencho data de producao profissional {string}")
    public void preencho_data_de_producao_profissional(String dataProd) throws InterruptedException{
        Thread.sleep(1000);
        pbta.digitarDataProducao(dataProd);
    }

    @Given("preencho campo nome profissional {string}")
    public void preencho_campo_nome_profissional(String nomeProd) {
        pbta.digitarNomeProd(nomeProd);
    }

    @Given("seleciono o tipo de producao profissional {string}")
    public void seleciono_o_tipo_de_producao_profissional(String tipoProd) {
        pbta.selecionarTipoProd(tipoProd);
    }

    @Given("seleciono o subtipo de producao profissional {string}")
    public void seleciono_o_subtipo_de_producao_profissional(String subTipoProd) {
        pbta.selecionarSubTipoProd(subTipoProd);
    }

    @Given("preencho o campo natureza bibliografica profissional {string}")
    public void preencho_o_campo_natureza_bibliografica_profissional(String natureza) {
        pbta.preencherCampoNatureza(natureza);
    }

    @Given("preencho o campo nome da editora profissional {string}")
    public void preencho_o_campo_nome_da_editora_profissional(String editora) {
        pbta.preencherCampoEditora(editora);
    }

    @Given("preencho o campo idioma profissional {string}")
    public void preencho_o_campo_idioma_profissional(String idioma) {
        pbta.preencherCampoIdioma(idioma);
    }

    @Given("seleciono o tipo da divulgacao da producao profissional {string}")
    public void seleciono_o_tipo_da_divulgacao_da_producao_profissional(String divulgacao) {
        pbta.selecionaCampoDivulgacao(divulgacao);
    }

    @Given("preencho campo nome de um subAutor profissional {string}")
    public void preencho_campo_nome_de_um_subAutor_profissional(String nomeAutor) {
       pbta.digitarNomeAutor(nomeAutor);
    }

    @Given("preencho o campo abreviatura de um subAutor profissional {string}")
    public void preencho_o_campo_abreviatura_de_um_subAutor_profissional(String abreviatura) {
        pbta.digitarAbreviatura(abreviatura);
    }

    @Given("clico no botao Inserir Autor profissional")
    public void clico_no_botao_Inserir_Autor_profissional() {
        pbta.clicarBotaoInserirAutor();
    }

    @Given("o sistema insere um novo autor da producao e exibe a lista de autores profissionais {string}")
    public void o_sistema_insere_um_novo_autor_da_producao_e_exibe_a_lista_de_autores_profissionais(String listaAutores) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(
                listaAutores,
                pb.removerCaracteresEspeciais(pbta.listaAutores(listaAutores)));
    }

    @When("clico no botao inserir Producao profissional")
    public void clico_no_botao_inserir_Producao_profissional() {
        pbta.clicarBotaoInserirProducao();
    }

    @Given("o sistema insere a nova producao profissional e emite a mensagem profissional {string}")
    public void o_sistema_insere_a_nova_producao_profissional_e_emite_a_mensagem_profissional(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pbta.mensagemSucesso(msg)));
    }

    @Given("seleciono o checkbox da producao profissional desejada")
    public void seleciono_o_checkbox_da_producao_profissional_desejada() {
        pbta.clicarCheckBox();
    }

    @When("clico no botao remover producoes profissionais")
    public void clico_no_botao_remover_producoes_profissionais()throws InterruptedException {
        Thread.sleep(5000);
        pbta.clicarBotaoRemoverProducoes();
    }

    @Then("o sistema exclui a producao profissional e emite a mensagem profissional {string}")
    public void o_sistema_exclui_a_producao_profissional_e_emite_a_mensagem_profissional(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pbta.mensagemSucesso(msg)));
    }

    @Given("clico no editar profissional")
    public void clico_no_editar_profissional() {
        pbta.clicarBotaoEditar();
    }

    @When("clico no botao atualizar producao profissional")
    public void clico_no_botao_atualizar_producao_profissional() {
        pbta.clicarBotaoAtualizarProducao();
    }

    @Then("o sistema atualiza a producao profissional e emite a mensagem profissional {string}")
    public void o_sistema_atualiza_a_producao_profissional_e_emite_a_mensagem_profissional(String msg) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(
                msg,
                pb.removerCaracteresEspeciais(pbta.mensagemSucesso(msg)));
    }
}