package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaProjetosDePesquisa {

    public void clicarNaAbaProjetosDePesquisa(){
        $(byXpath("//a[contains(text(),'10. Projetos de Pesquisa')]")).shouldBe(visible).click();
    }

    public void preencherCampoNomeProjeto(String nomeProjeto){
        $(byId("formBaseProposta:nomeProjeto")).shouldBe(visible).sendKeys(nomeProjeto);
    }

    public void selecionarLinhaPesquisa(String linhaPesquisa){
        $(byId("formBaseProposta:linhaPesquisa")).shouldBe(visible).selectOption(linhaPesquisa);
    }

    public void preencherCampoDataInicio(String dataInicio){
        $(byId("formBaseProposta:dataInicioInputDate")).shouldBe(visible).sendKeys(dataInicio);
    }

    public void preencherCampoDescricao(String descricao){
        $(byId("formBaseProposta:descricao")).shouldBe(visible).sendKeys(descricao);
    }

    public void preencherCampoDescricaoFinanciador(String descFinanciador){
        $(byId("formBaseProposta:descricaoFinanciador")).shouldBe(visible).sendKeys(descFinanciador);
    }

    public void selecionarDocente(String docente){
        $(byId("formBaseProposta:selectDocente")).shouldBe(visible).selectOption(docente);
    }

    public void clicarBotaoMais(){
        $(byTitle("Adicionar")).shouldBe(visible).click();
    }

    public void clicarCheckBox(){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[3]/div/div/div/table/tbody/tr[1]/td[1]/input")).shouldBe(visible).click();
    }

    public void clicarBotaoInserirProjeto(){
        $(byId("formBaseProposta:btnAddProjeto")).shouldBe(visible).click();
    }

    public void clicarBotaoAtualizarProjeto(){
        $(byId("formBaseProposta:btnAddProjeto")).shouldBe(visible).click();
    }

    public String mensagem(String msg){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }

    public String mensagem2(String msg2){
        return $(byXpath("//*[@id='formBaseProposta:msgErros']/li")).shouldBe(visible).getText();
    }

    public void clicarBotaoEditar(){
        $(byXpath("//*[@id='formBaseProposta:projetos']/div/div/div/div/table/tbody/tr/td[4]/a/span")).shouldBe(visible).click();
    }


    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='formBaseProposta:btnAvancar']")).shouldBe(visible).click();
    }
}
