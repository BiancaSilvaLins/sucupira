package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaAreasDeConcentracao {

    public void clicaNaAbaAreasELinhas(){
        $(byXpath("//*[@id='sidebar']/ul/li[5]/a")).shouldBe(visible).click();
    }

    public void preencheCampoArea(String campoArea){
        $(byXpath("//*[@id='content']/div[1]/div/div/div/input")).shouldBe(visible).sendKeys(campoArea);
    }

    public void preencheDescArea(String descArea){
        $(byId("formBaseProposta:descricaoArea")).shouldBe(visible).sendKeys(descArea);
    }

    public void clicarBotaoInserirArea(){
        $(byXpath("//*[@id='content']/div[3]/div/div/input")).shouldBe(visible).click();
    }

    public void preencheCampoLinha(String linhaPesquisa){
        $(byXpath("//*[@id='formBaseProposta:dadosFormulario']/div[1]/div/div/div/input")).shouldBe(visible).sendKeys(linhaPesquisa);
    }

    public void selecionarArea(String areaConcentracao) throws InterruptedException {
        Thread.sleep(1000);
        $(byId("formBaseProposta:idArea")).shouldBe(visible).selectOption(areaConcentracao);
    }

    public void preencheDescLinha(String descLinha){
        $(byId("formBaseProposta:descricaoLinha")).shouldBe(visible).sendKeys(descLinha);
    }

    public void clicarBotaoInserirLinha(){
        $(byId("formBaseProposta:addLinha")).shouldBe(visible).click();
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='content']/div[5]/div/div/input[3]")).shouldBe(visible).click();
    }

    public String mensagem1(String msg1){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li[1]")).shouldBe(visible).getText();
    }

    public String mensagem2(String msg2){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li[2]")).shouldBe(visible).getText();
    }
}