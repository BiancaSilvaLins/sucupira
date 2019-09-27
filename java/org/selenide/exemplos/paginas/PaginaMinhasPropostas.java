package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PaginaMinhasPropostas {

    public void navegar(){
        open("http://hom.capes.gov.br/sucupira");
    }


    public void preencheCamposLoginAcesso() {
        $(byId("form:login")).shouldBe(visible).sendKeys("80732810400");
        $(byId("form:senha")).shouldBe(visible).sendKeys("sucup1r4");
    }

    public String retornaTituloAbaPropostas(){
        return $(byXpath("//li/a[text()='Propostas']")).shouldBe(visible).getText();
    }

    public void retornaUmValorNaLista(String instituicaoDeEnsino) {
        $(byXpath("//table/tbody/tr/td/h1[contains(text(),'"+instituicaoDeEnsino+"')]")).shouldHave(text(instituicaoDeEnsino));
    }

    public void clicaSimboloPlay(String programa){
       $(byXpath("//table/tbody/tr[1]/td[9]/a/span[@title='Selecionar']")).shouldBe(visible).click();
    }

    public void clicaSimboloPlay(){
        $(byXpath("//table/tbody/tr[1]/td[9]/a/span[@title='Selecionar']")).shouldBe(visible).click();
    }

    public void clicaSimboloPlayAcademico(){
        $(byXpath("//table/tbody/tr[1]/td[9]/a/span[@title='Selecionar']")).shouldBe(visible).click();
    }


    public String retornaTituloAbaPropostaECurso(String aba){
       return $(byXpath("//li[contains(text(),'"+aba+"')]")).shouldBe(visible).getText();
    }

    public void preencheCamposLoginPgPMinhasPropostas(){
        $(byId("form:login")).shouldBe(visible).sendKeys("80732810400");
        $(byId("form:senha")).shouldBe(visible).sendKeys("sucup1r4");
    }

    public void clicarMinhasPropostas(){
        $(byXpath("//a[text()='Minhas Propostas']")).shouldBe(visible).click();
    }

    public void clicarBotaoLogin(){
        $(byXpath("//input[@value='Login']")).shouldBe(visible).click();
    }

    public void clicarOpcaoAPCN(){
        $(byXpath("/html/body/div[5]/div/div[5]/div/div")).shouldBe(visible).click();
    }
}