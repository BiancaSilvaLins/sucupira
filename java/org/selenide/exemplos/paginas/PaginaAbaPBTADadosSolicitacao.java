package org.selenide.exemplos.paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaPBTADadosSolicitacao {

    public void clicarOpcaoCadastrarClicaAqui(){
        $(byId("formBaseProposta:btnIniciarSolicitacao")).shouldBe(visible).click();
    }

    public void preencherCampoTitulo(String titulo){
        $(byXpath("//*[@id='form']/div[1]/div/div/div/input")).shouldBe(visible).sendKeys(titulo);
    }

    public void preencherCampoValor(String valor){
        $(byId("form:vlIdent")).shouldBe(visible).sendKeys(valor);
    }

    public void preencherCampoJustificativa(String justificativa){
        $(byId("form:justificativa")).shouldBe(visible).sendKeys(justificativa);
    }

    public void clicarBotaoEnviar(){
        $(byId("form:enviar")).shouldBe(visible).click();
    }

    public String validaMensagem(String msg){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }

    public void clicarBotaoRetornar(){
        $(byXpath("//*[@type='submit']")).shouldBe(visible).click();
    }

    public void clicarSolicitacoesVeiculos(){
        $(byXpath("//*[@id='formBaseProposta']/div/div[3]/div[12]/div/div/div/table/tbody/tr/td[2]")).shouldBe(visible).click();
    }

    public String validaSolicitacao(String listaVeiculos){
        return $(byXpath("//*[@id='formBaseProposta:solVeiculos']/div/div/div/table/tbody/tr/td[3]")).shouldBe(visible).getText();
    }
}