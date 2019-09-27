package org.selenide.exemplos.paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaCorpoDocente {

    PaginaBase pgBase = new PaginaBase();


    public void clicaNaAbaCorpoDocente(){
        $(byXpath("//a[contains(text(),'8. Corpo Docente')]")).shouldBe(visible).click();
    }

    public void preencheCampoNumeroDocumento(String doc){
        $(byXpath("//*[@class='form-control cpf']")).shouldBe(visible).sendKeys(doc);
    }

    public void clicaCampoEmailInstituicional(){
        $(byXpath("//form/div/div[3]/div/div/span/div/div/div/div/input[@class='form-control']")).shouldBe(visible).click();
    }

    public void preencheCampoAbreviatura(String abreviatura){
        $(byXpath("//form/div/div[3]/div/div/span/span[3]/span/div/div/div/div/input")).shouldBe(visible).sendKeys(abreviatura);
    }

    public void selecionarNivel(String nivel){
        $(byXpath("//*[@id='formBaseProposta:titulo']/div[1]/div/div/div/select")).shouldBe(visible).selectOption(nivel);
    }

    public void clicarBotaoMais(){
        $(byXpath("//form/div/div[3]/div/div/span/span[3]/span/div/div/div/div/a")).shouldBe(visible).click();
    }

    public void preencheAnoTitulacao(String anoTitulacao){
        $(byXpath("//*[@id='formBaseProposta:titulo']/div[2]/div[1]/div/div/input")).shouldBe(visible).sendKeys(anoTitulacao);
    }

    public void selecionarPaisTitulacao(String pais){
        $(byXpath("//*[@id='formBaseProposta:titulo']/div[2]/div/div/div/select")).shouldBe(visible).selectOption(pais);
    }


    public void selecionarCategoria(String categoria){
        $(byXpath("//*[@id='content']/div[2]/div/div/div/select")).shouldBe(visible).selectOption(categoria);
    }

    public void preencherDedicacaoInstituicao(String di){
        $(byXpath("//*[@id='content']/div[3]/div[1]/div/div/input")).shouldBe(visible).sendKeys(di);
    }

    public void preencherDedicacaoPrograma(String dp){
        $(byXpath("//*[@id='content']/div[3]/div[2]/div/div/input")).shouldBe(visible).sendKeys(dp);
    }

    public void clicarBotaoSim(){
        SelenideElement button = $(byXpath("//tbody/tr/td[1]/label[text()=' Sim']"));
        button.scrollTo();
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void clicarBotaoNao(){
        SelenideElement button = $(byXpath("//tbody/tr/td[2]/label"));
        button.scrollTo();
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void preencheCampoInstituicao(String inst){
        $(byXpath("//input[@id='formBaseProposta:idIes:input']")).shouldBe(visible).sendKeys(inst);
    }

    public void selecionarInstituicao(String inst){
        $(byXpath("//*[@id='formBaseProposta:instituicoes']/div/div/div/div/select")).shouldBe(visible).selectOption(inst);
    }

    public void clicarBotaoInserirDocente(){
        $(byXpath("//*[@value='Inserir Docente']")).shouldBe(visible).click();
    }

    public String mensagemSucess(String mensagemSucess){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }

    public void preencheSiglaIES(String sigla){
        $(byXpath("//*[@id='formBaseProposta:idIesTitulacao:input']")).shouldBe(visible).sendKeys(sigla);
    }

    public void preencheSiglaIESVinculo(String sigla){
        $(byXpath("//*[@id='formBaseProposta:idIes:input']")).shouldBe(visible).sendKeys(sigla);
    }

    public void preencherInstituicaoTitulacao(String instituicaoTitulacao){
        $(byXpath("//*[@id='formBaseProposta:idIesTitulacao:listbox']")).shouldBe(visible).sendKeys(instituicaoTitulacao);
    }

    public void selecionaInstituicaoDeEnsino(String instituicaoDeEnsino){
        $(byXpath("//*[@id='formBaseProposta:idIes:listbox']/option[1]")).shouldBe(visible).click();

    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='content']/div[7]/div/div/input[3]")).shouldBe(visible).click();
    }
}