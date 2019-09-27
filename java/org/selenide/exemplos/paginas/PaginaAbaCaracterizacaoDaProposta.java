package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaCaracterizacaoDaProposta {

    public void clicaNaAbaProposta(){
        $(byXpath("//*[@id='sidebar']/ul/li[4]/a")).shouldBe(visible).click();
    }

    public void preencheContextualizacao(String contextualizacao){
        $(byId("formBaseProposta:contextualizacao")).shouldBe(visible).sendKeys(contextualizacao);
    }

    public void preencheHistorico(String historico){
        $(byId("formBaseProposta:historico")).shouldBe(visible).sendKeys(historico);
    }

    public void preencheCooperacao(String cooperacao){
        $(byId("formBaseProposta:cooperacao")).shouldBe(visible).sendKeys(cooperacao);
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//input[@value='Avancar >>']")).shouldBe(visible).click();
    }

    public void selecionaUf(String uf) throws InterruptedException {
        Thread.sleep(2000);
        $(byXpath("//*[@id='formBaseProposta:uf']")).shouldBe(visible).selectOption(uf);
    }

    public void selecionaMun(String mun)throws InterruptedException{
        Thread.sleep(2000);
        $(byXpath("//*[@id='formBaseProposta:municipio']")).shouldBe(visible).selectOption(mun);
    }
}