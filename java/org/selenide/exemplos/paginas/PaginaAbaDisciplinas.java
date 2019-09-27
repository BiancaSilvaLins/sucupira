package org.selenide.exemplos.paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaDisciplinas {

    PaginaBase pgBase = new PaginaBase();

        public void clicaNaAbaDisciplinas(){
            $(byXpath("//a[contains(text(),'7. Disciplinas')]")).shouldBe(visible).click();
        }

        public void preencherCampoNome(String nome){
            $(byXpath("//*[@id='content']/div[1]/div/div/div/input")).shouldBe(visible).sendKeys(nome);
        }

        public void selecionaNivel(String nivel){
            $(byId("formBaseProposta:nivel")).shouldBe(visible).selectOption(nivel);
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

        public void preencherCampoCreditos(String creditos){
            $(byXpath("//form[@id='formBaseProposta']/div/div[3]/div[3]/div[1]/div/div/input")).shouldBe(visible).sendKeys(creditos);
        }

        public void preencherCampoEmenta(String ementa){
            $(byId("formBaseProposta:ementa")).shouldBe(visible).sendKeys(ementa);
        }

        public void preencherCampoBibliografia(String bibliografia){
            $(byId("formBaseProposta:bibliografia")).shouldBe(visible).sendKeys(bibliografia);
        }

        public void selecionarAreaConcentracao(String area){
            $(byId("formBaseProposta:idArea")).shouldBe(visible).selectOption(area);
        }

        public void clicarBotaoMais(){
            $(byXpath("//*[@id='formBaseProposta:addArea']/span")).shouldBe(visible).click();
        }

        public void clicarBotaoInserirDisciplina(){
            $(byXpath("//*[@value='Inserir Disciplina']")).shouldBe(visible).click();
        }

        public String mensagemSucess(String mensagemSucess){
           return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
        }

        public String mensagemErro1(String mensagem1){
            return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li[1]")).shouldBe(visible).getText();
        }

    public String mensagemErro2(String mensagem2){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li[2]")).shouldBe(visible).getText();
    }

    public String mensagemErro3(String mensagem3){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li[3]")).shouldBe(visible).getText();
    }

    public String mensagemErro4(String mensagem4){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li[4]")).shouldBe(visible).getText();
    }

    public String mensagemErro5(String mensagem5){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li[5]")).shouldBe(visible).getText();
    }

    public void clicarBotaoAvancar(){
        $(byXpath("//*[@id='content']/div[7]/div/div/input[3]")).shouldBe(visible).click();
    }
}