package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaCaracterizacaoDoCursoAcademico {

    public void clicaNaAbaCaracterizacaoDoCurso(){
        $(byXpath("//*[@id='sidebar']/ul/li[6]/a")).shouldBe(visible).click();
    }

    public void clicaOpcaoMestrado(){
        $(byXpath("//*[@id='accordion']/div[1]")).shouldBe(visible).click();
    }

    public void clicarOpcaoDoutorado(){
        $(byXpath("//*[@id='accordion']/div[2]")).shouldBe(visible).click();
    }

    public void preencheCampoNome(String campoNome){
        $(byId("formBaseProposta:cursos:0:nomeCurso")).shouldBe(visible).sendKeys(campoNome);
    }

    public void selecionarPeriodicidade(String periodicidade){
        $(byId("formBaseProposta:cursos:0:periodicidade")).shouldBe(visible).selectOption(periodicidade);
    }

    public void preencheObjetivoCurso(String objetivo){
        $(byId("formBaseProposta:cursos:0:objetivo")).shouldBe(visible).sendKeys(objetivo);
    }

    public void creditosDisciplinas(String disciplinas){
        $(byId("formBaseProposta:cursos:0:creditosDisciplinas")).shouldBe(visible).sendKeys(disciplinas);
    }

    public void creditosTese(String tese){
        $(byId("formBaseProposta:cursos:0:creditosTese")).shouldBe(visible).sendKeys(tese);
    }

    public void outrosCreditos(String outros){
        $(byId("formBaseProposta:cursos:0:outrosCreditos")).shouldBe(visible).sendKeys(outros);
    }

    public void vagasSelecao(String vagas){
        $(byId("formBaseProposta:cursos:0:vagasSelecao")).shouldBe(visible).sendKeys(vagas);
    }

    public void equivalencia(String equivalencia){
        $(byId("formBaseProposta:cursos:0:equivalenciaHoraCr")).shouldBe(visible).sendKeys(equivalencia);
    }

    public void descricaoSintetica(String desc){
        $(byId("formBaseProposta:cursos:0:oferta")).shouldBe(visible).sendKeys(desc);
    }

    public void selecionarAreasConcentracao(String areas){
        $(byId("formBaseProposta:cursos:0:idArea")).shouldBe(visible).selectOption(areas);
        $(byId("formBaseProposta:cursos:0:addArea")).shouldBe(visible).click();
    }

    public void clicarBotaoAtualizar(){
        $(byId("formBaseProposta:cursos:0:btnAtualizar")).shouldBe(visible).click();
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='formBaseProposta:btnProximo']")).shouldBe(visible).click();
    }

    //===============================================================================================================================================================//
    public void preencheCampoNomeDoutorado(String campoNome){
        $(byId("formBaseProposta:cursos:1:nomeCurso")).shouldBe(visible).sendKeys(campoNome);
    }

    public void selecionarPeriodicidadeDoutorado(String periodicidade){
        $(byId("formBaseProposta:cursos:1:periodicidade")).shouldBe(visible).selectOption(periodicidade);
    }

    public void preencheObjetivoCursoDoutorado(String objetivo){
        $(byId("formBaseProposta:cursos:1:objetivo")).shouldBe(visible).sendKeys(objetivo);
    }

    public void creditosDisciplinasDoutorado(String disciplinas){
        $(byId("formBaseProposta:cursos:1:creditosDisciplinas")).shouldBe(visible).sendKeys(disciplinas);
    }

    public void creditosTeseDoutorado(String tese){
        $(byId("formBaseProposta:cursos:1:creditosTese")).shouldBe(visible).sendKeys(tese);
    }

    public void outrosCreditosDoutorado(String outros){
        $(byId("formBaseProposta:cursos:1:outrosCreditos")).shouldBe(visible).sendKeys(outros);
    }

    public void vagasSelecaoDoutorado(String vagas){
        $(byId("formBaseProposta:cursos:1:vagasSelecao")).shouldBe(visible).sendKeys(vagas);
    }

    public void equivalenciaDoutorado(String equivalencia){
        $(byId("formBaseProposta:cursos:1:equivalenciaHoraCr")).shouldBe(visible).sendKeys(equivalencia);
    }

    public void descricaoSinteticaDoutorado(String desc){
        $(byId("formBaseProposta:cursos:1:oferta")).shouldBe(visible).sendKeys(desc);
    }

    public void selecionarAreasConcentracaoDoutorado(String areas){
        $(byId("formBaseProposta:cursos:1:idArea")).shouldBe(visible).selectOption(areas);
        $(byId("formBaseProposta:cursos:1:addArea")).shouldBe(visible).click();
    }

    public void clicarBotaoAtualizarDoutorado(){
        $(byId("formBaseProposta:cursos:1:btnAtualizar")).shouldBe(visible).click();
    }
}