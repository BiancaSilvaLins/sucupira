package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaPBTA {

    public void clicaNaAbaPBTA(){
        $(byXpath("//*[@id='sidebar']/ul/li[9]/a")).shouldBe(visible).click();
    }

    public void selecionarDocente(String docente){
       $(byId("formBaseProposta:selectDocente")).shouldBe(visible).selectOption(docente);
    }

    public void digitarDataProducao(String dataProd){
        $(byId("formBaseProposta:dataProducaoInputDate")).shouldBe(visible).sendKeys(dataProd);
    }

    public void digitarNomeProd(String nomeProd){
        $(byId("formBaseProposta:nomeProducao")).shouldBe(visible).sendKeys(nomeProd);
    }

    public void selecionarTipoProd(String tipoProd){
        $(byId("formBaseProposta:tipoProducao")).shouldBe(visible).selectOption(tipoProd);
    }

    public void selecionarSubTipoProd(String subTipoProd){
        $(byId("formBaseProposta:subtipo")).shouldBe(visible).selectOption(subTipoProd);
    }

    public void preencherCampoNatureza(String natureza){
        $(byXpath("//*[@id='formBaseProposta:formulario']/div/div/div[1]/div/div/div/textarea")).shouldBe(visible).sendKeys(natureza);
    }

    public void preencherCampoEditora(String editora){
        $(byXpath("//*[@id='formBaseProposta:formulario']/div/div/div[2]/div/div/div/textarea")).shouldBe(visible).sendKeys(editora);
    }

    public void preencherCampoIdioma(String idioma){
        $(byXpath("//*[@id='formBaseProposta:formulario']/div/div/div[5]/div/div/div/input")).shouldBe(visible).sendKeys(idioma);
    }

    public void selecionaCampoDivulgacao(String divulgacao){
        $(byXpath("//*[@id='formBaseProposta:formulario']/div/div/div[8]/div/div/div/select")).shouldBe(visible).selectOption(divulgacao);
    }

    public void digitarNomeAutor(String nomeAutor){
        $(byId("formBaseProposta:nomeAutor")).shouldBe(visible).sendKeys(nomeAutor);
    }

    public void digitarAbreviatura(String abreviatura){
        $(byId("formBaseProposta:nmAbreviatura")).shouldBe(visible).sendKeys(abreviatura);
    }

    public void clicarBotaoInserirAutor(){
        $(byId("formBaseProposta:btnAutor")).shouldBe(visible).click();
    }

    public void clicarBotaoInserirProducao(){
        $(byId("formBaseProposta:btnAddProducao")).shouldBe(visible).click();
    }

    public String listaAutores(String listaAutores){
        return $(byXpath("//*[@id='formBaseProposta:listAutores']/div/div/div/h1")).shouldBe(visible).getText();
    }

    public String mensagemSucesso(String mensagemSucess){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }

    public void clicarCheckBox(){
        $(byXpath("//*[@id='formBaseProposta:producoes']/div/div/div/table/tbody/tr/td[1]/input")).shouldBe(visible).click();
    }

    public void clicarBotaoRemoverProducoes(){
        $(byId("formBaseProposta:remover")).shouldBe(visible).click();
    }

    public void clicarBotaoEditar(){
        $(byXpath("//*[@id='formBaseProposta:producoes']/div/div/div/table/tbody/tr/td[6]/a")).shouldBe(visible).click();
    }

    public void clicarBotaoAtualizarProducao(){
        $(byId("formBaseProposta:btnAddProducao")).shouldBe(visible).click();
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='formBaseProposta:btnProximo']")).shouldBe(visible).click();
    }
}
