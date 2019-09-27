package org.selenide.exemplos.paginas;



import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class PaginaAbaInstituicoesDeEnsino {

    public void clicaNaAbaInstituicoes(){
        $(byXpath("//*[@id='sidebar']/ul/li[2]/a")).shouldBe(visible).click();
    }

    public void preencheInstituicao(String instituicao){
        $(byId("formBaseProposta:idIes:input")).shouldBe(visible).sendKeys(instituicao);
    }

    public void clicaBotaoInserirInstituicao(){
        $(byXpath("//*[@id='formBaseProposta:dadosIes']/div[1]/div/div/input")).shouldBe(visible).click();
    }

    public void verificaInsercaoDeInstituicao(String instituicaoEnsino) {
        $(byXpath("//*[@id='formBaseProposta:dadosIes']/div/div/div/div/table/tbody/tr/td[1]")).shouldBe(visible).getText();
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='content']/div[5]/div/div/input[3]")).shouldBe(visible).click();
    }

    public void selecioaInstituicaoDeEnsino(String instituicaoDeEnsino){
        $(byId("formBaseProposta:idIes:listbox")).scrollTo().selectOption(instituicaoDeEnsino);
    }

    public void clicarBotaoExcluir(){
        $(byXpath("//tr[1]//td[5]//a")).shouldBe(visible).click();
    }

    public void mensagemDeErro(String mensagem) {
        $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }

}