package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaPolosEAD {

    public void clicarNaAbaPolosEAD(){
        $(byXpath("//a[contains(text(),'3. Polos EAD')]")).shouldBe(visible).click();
    }

    public void selecionarUF(String uf){
        $(byId("formBaseProposta:ufPolo")).shouldBe(visible).selectOption(uf);
    }

    public void selecionarMunicipio(String municipio) throws InterruptedException {
        Thread.sleep(1000);
        $(byId("formBaseProposta:municipioPolo")).shouldBe(visible).selectOption(municipio);
    }

    public void selecionarPolo(String polo){
        $(byId("formBaseProposta:poloSisuab")).shouldBe(visible).selectOption(polo);
    }

    public void clicarBotaoAdicionarPolo()throws InterruptedException{
        Thread.sleep(1000);
        $(byXpath("//input[@value='Adicionar Polo']")).shouldBe(visible).click();
    }

    public String verificaInclusao(String verifica){
        return $(byXpath("//*[@id='formBaseProposta:polosAdicionados']/div/div/div/div/table/tbody/tr[1]/td[1]")).shouldBe(visible).getText();
    }

    public String mensagemDeErro(String mensagemErro){
        return $(byId("mensagensGeraisDoSistema")).shouldBe(visible).getText();
    }

    public String verifica(String verifica){
        return $(byXpath("//*[@id='formBaseProposta:polosAdicionados']/div/div/div/div/table/tbody/tr[1]/td[1]")).shouldBe(visible).getText();
    }

    public void clicarBotaoExcluir(){
        $(byXpath("//*[@id='formBaseProposta:polosAdicionados']/div/div/div/div/table/tbody/tr[1]/td[2]/a")).shouldBe(visible).click();
    }

    public String verificaExclusao(String exclusao){
        return $(byId("formBaseProposta:polosAdicionados")).shouldBe(visible).getText();
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='content']/div[3]/div/div/input[3]")).shouldBe(visible).click();
    }
}