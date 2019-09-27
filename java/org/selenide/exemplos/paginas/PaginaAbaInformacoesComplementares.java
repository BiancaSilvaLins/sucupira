package org.selenide.exemplos.paginas;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaInformacoesComplementares {

    public void clicaNaAbaInformacoesComplementares(){
        $(byXpath("//*[@id='sidebar']/ul/li[14]/a")).shouldBe(visible).click();
    }

    public void preencherCampoObservacoes(String observacoes){
        $(byId("formBaseProposta:obs-0")).shouldBe(visible).sendKeys(observacoes);
    }

    public void preencherCampoCriticasSugestoes(String criticasSugestoes){
        $(byId("formBaseProposta:obs-1")).shouldBe(visible).sendKeys(criticasSugestoes);
    }

    public void clicarBotaoSalvarDados(){
        $(byId("formBaseProposta:btnSalvar")).shouldBe(visible).click();
    }

    public String mensagem(String mensagem){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }
}
