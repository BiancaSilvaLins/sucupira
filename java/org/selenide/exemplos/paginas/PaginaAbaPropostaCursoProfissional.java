package org.selenide.exemplos.paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PaginaAbaPropostaCursoProfissional {
    PaginaBase pgBase = new PaginaBase();

    public void selecionaOpcaoNAO(){
        SelenideElement button = $(byId("formBaseProposta:radioPossuiGraduacao:1"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void retiraProgramasAssociados(){
        $(byXpath("//table/tbody/tr/td[5]")).click();
        confirm();
        sleep(2000);
    }

    public void clicaSimboloPlayPgAbaPropostaProfissional(){
        $(byXpath("//table/tbody/tr[1]/td[9]/a/span[@title='Selecionar']")).shouldBe(visible).click();
    }

    public void verificaTituloAba(){
        $(byXpath("//a[contains(text(),'1. Proposta/Curso')]")).shouldHave(text("1. Proposta/Curso"));
    }

    public void preenchoCampoAreaConhecimento(String areaConhecimento){
        $(byXpath("//div[@id='formBaseProposta:arvore:tree:1:index_']//span[@class='rf-trn-hnd-colps rf-trn-hnd']")).shouldBe(visible).click();
        $(byXpath("//div[@id='formBaseProposta:arvore:tree:1:index_']//div[2]/div/span[@class='rf-trn-hnd-colps rf-trn-hnd']")).shouldBe(visible).click();
        $(byXpath("//div[@id='formBaseProposta:arvore:tree:1:index_']//div[2]/div[5]/div/span[1]")).shouldBe(visible).click();
        $(byXpath("//span[contains(text(),'"+areaConhecimento+"')]")).shouldBe(visible).click();
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

}
