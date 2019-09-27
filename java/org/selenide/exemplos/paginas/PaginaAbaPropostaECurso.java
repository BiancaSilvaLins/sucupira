package org.selenide.exemplos.paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class PaginaAbaPropostaECurso {

    PaginaBase pgBase = new PaginaBase();

    public void clicaSimboloPlayPgAbaProposta(){
        $(byXpath("//*[@id='formProposta:listagemProposta']/table/tbody/tr[1]/td/table/tbody/tr[1]/td[9]/a/span")).shouldBe(visible).click();
    }



    public void verificaTituloAba(){
        $(byXpath("//a[contains(text(),'1. Proposta/Curso')]")).shouldHave(text("1. Proposta/Curso"));
    }

    public void preenchoCampoAreaConhecimento() throws InterruptedException {
        $(byXpath("//div[@id='formBaseProposta:arvore:tree:1:index_']//span[@class='rf-trn-hnd-colps rf-trn-hnd']")).shouldBe(visible).click();
        Thread.sleep(2000);
        $(byXpath("//div[@id='formBaseProposta:arvore:tree:1:index_']//div[3]//span[@class='rf-trn-hnd-colps rf-trn-hnd']")).shouldBe(visible).click();
        Thread.sleep(2000);
        $(byXpath("//div[@id='formBaseProposta:arvore:tree:1:index_']//div[3]/div[2]//span[@class='rf-trn-hnd-colps rf-trn-hnd']")).shouldBe(visible).click();
        Thread.sleep(2000);
        $(byXpath("//span[contains(text(),'TEOREMAS DE LIMITE (10201033)')]")).shouldBe(visible).click();
    }

    public void selecionaBotaoSim(){
        SelenideElement button = $(byId("formBaseProposta:radioPossuiGraduacao:0"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void preencheAnoInicio(String anoInicio){
        $(byId("formBaseProposta:inputAnoInicio")).shouldBe(visible).sendKeys(anoInicio);
    }

    public void selecionaModalidade(String modalidade){
        $(byXpath("//*[@id='formBaseProposta:modalidadeEnsino']")).shouldBe(visible).selectOption(modalidade);
    }

    public void selecionaNivelCursoProposto(String nivelCursoProposto){
        $(byXpath("//*[@id='formBaseProposta:selectNivelCurso']")).shouldBe(visible).selectOption(nivelCursoProposto);
    }

    public void selecionaHistoricoCursoCapes(String historico){
        $(byId("formBaseProposta:selectHistoricoCurso")).shouldBe(visible).selectOption(historico);
    }

    public void preencheCodigoProgOriginal(String codigo){
        $(byId("formBaseProposta:inputCodigoPrograma")).shouldBe(visible).sendKeys(codigo);
    }

    public void clicaSimboloMais(){
        $(byXpath("//span[@class='glyphicon glyphicon-plus']")).shouldBe(visible).click();
    }

    public void verificaTabelaProgAssociados(){
        $(byXpath("//h1[text()='Programas Associados']")).shouldHave(text("Programas Associados"));
    }

    public void clicaInserirCurso(){
        $(byXpath("//input[@value='Inserir Curso']")).shouldBe(visible).click();
    }

    public void verificaTabelaPropostasCursosCadastrados(){
        $(byXpath("//h1[text()='Proposta de Cursos Cadastrados']"));
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='content']/div/div/div/input[2]")).shouldBe(visible).click();
    }

    public void retiraProgramasAssociados(){
        $(byXpath("//table/tbody/tr/td[5]")).click();
        confirm();
        sleep(2000);
    }
}
