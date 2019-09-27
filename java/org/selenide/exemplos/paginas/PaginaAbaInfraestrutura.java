package org.selenide.exemplos.paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaInfraestrutura {

    PaginaBase pgBase = new PaginaBase();

    public void clicaNaAbaInfraestrutura(){
        $(byXpath("//a[contains(text(),'13. Infraestrutura')]")).shouldBe(visible).click();
    }

//    public void preencherCampoMunicipio(String municipio){
//        $(byXpath("//*[@id='content']/div[1]/div/div/div/textarea")).shouldBe(visible).sendKeys(municipio);
//    }

    public void clicarBotaoSim1(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-1']/tbody/tr/td[1]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void clicarBotaoSim2(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-2']/tbody/tr/td[1]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void clicarBotaoSim3(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-3']/tbody/tr/td[1]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void clicarBotaoSim4(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-5']/tbody/tr/td[1]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void preencherCampoNumeroDeSalas(String salas){
        $(byXpath("//*[@id='formBaseProposta:conteudo1-2']/div/div/div/div/textarea")).shouldBe(visible).sendKeys(salas);
    }

    public void preencherCampoNumeroDeSalas2(String salas){
        $(byXpath("//*[@id='formBaseProposta:conteudo1-3']/div/div/div/div/textarea")).shouldBe(visible).sendKeys(salas);
    }

    public void preencherCampoLaboratorios(String lab){
        $(byXpath("//*[@id='formBaseProposta:obs-3']")).shouldBe(visible).sendKeys(lab);
    }

    public void preencherCampoNumerosPcs(String pcs){
        $(byXpath("//*[@id='formBaseProposta:conteudo1-5']/div/div/div/div/textarea")).shouldBe(visible).sendKeys(pcs);
    }

    public void preencherCampoAcervo(String acervo){
        $(byId("formBaseProposta:obs-5")).shouldBe(visible).sendKeys(acervo);
    }

    public void preencherCampoFinanciamentos(String financiamentos){
        $(byId("formBaseProposta:obs-6")).shouldBe(visible).sendKeys(financiamentos);
    }

    public void preencherCampoAdicionais(String add){
        $(byId("formBaseProposta:obs-7")).shouldBe(visible).sendKeys(add);
    }

    public void preencherCampoMunicipioEad(String add){
        $(byId("formBaseProposta:obs-8")).shouldBe(visible).sendKeys(add);
    }

    public void clicarBotaoSalvarDados(){
        $(byId("formBaseProposta:btnSalvar")).shouldBe(visible).click();
    }

    public String mensagem(String msg){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }

    public void clicarBotaoNao1(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-1']/tbody/tr/td[2]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void clicarBotaoNao2(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-2']/tbody/tr/td[2]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void clicarBotaoNao3(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-3']/tbody/tr/td[2]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void clicarBotaoNao4(){
        SelenideElement button = $(byXpath("//*[@id='formBaseProposta:simnao-5']/tbody/tr/td[2]/label"));
        pgBase.clickBotaoViaJavaScript(button);
    }
}