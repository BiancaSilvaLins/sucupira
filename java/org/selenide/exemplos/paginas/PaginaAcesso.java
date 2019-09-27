package org.selenide.exemplos.paginas;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class PaginaAcesso {

    PaginaBase pgBase = new PaginaBase();

    public void clicaBotaoCalendarioAcademico(){
        $(byXpath("//*[@id='formCalendario']/div[2]/a/div/div[2]/span[2]")).shouldBe(visible).click();

    }

    public void preencheCampoIESPagAcesso(){
        $(byId("form:idIes:input")).shouldBe(visible).sendKeys("ufrn");
    }

    public void clicaIESPagAcesso(){
        $(byXpath("//select/option[text()='23001011 UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE (UFRN)']")).shouldBe(visible).click();
    }

    public void selecionaOpcaoSIM(){
        SelenideElement button = $(byXpath("//table/tbody/tr/td[1]/label[@for='form:radio:0']"));
        pgBase.clickBotaoViaJavaScript(button);

    }

    public void selecionaProgramaVinculadoPgAcesso(){
        $(byId("form:comboPrograma")).shouldBe(visible).selectOption("ADMINISTRAÇÃO (42001013025P1)");

    }

    public void preencheLogineESenhaConfirmacao(){
        $(byId("form:j_idt71:confirm_cpf")).shouldBe(visible).sendKeys("15055752068");
        $(byId("form:j_idt71:confirm_senha")).shouldBe(visible).sendKeys("3r0c8p");
    }

    public void clicaContinuar(){
        $(byXpath("//input[@value='Continuar >>']")).shouldBe(visible).click();
    }

    public void preencheCamposLogin(String login, String senha){
        $(byId("form:login")).shouldBe(visible).sendKeys(login);
        $(byId("form:senha")).shouldBe(visible).sendKeys(senha);
    }

    public void clicaLogin(){
        $(byXpath("//input[@value='Login']")).shouldBe(visible).click();
    }

    public String verificaTitulopaginaAcesso(){
        return $(byXpath("//h1[text()='Acesso']")).shouldBe(visible).getText();
    }

    public String retornaTituloMinhasPropostas(){
        return $(byXpath("//h1[text()='Minhas Propostas']")).shouldBe(visible).getText();
    }

    public void preencheCampoProgramaPgAcesso() {
        $(byXpath("//*[@id='form:dadosCoord']/div/div/div/div/input")).shouldBe(visible).sendKeys("teste erro");
    }

    public void selecionaTipoDocumentoPgAcesso(){
        $(byXpath("//span[@id='form:pessoa']/span/div/div/div/div/select")).shouldBe(visible).selectOption("CPF");
    }

    public void preencheNumeroDocumentoPgAcesso() {
        $(byXpath("//span[@id='form:pessoa']/span/div/div[2]/div/div/input")).shouldBe(visible).sendKeys("80732810400");
    }

    public void preencheDadosTelefoneDDDPgAcesso() {
        $(byXpath("//input[@alt='ddd']")).shouldBe(visible).sendKeys("61");
        $(byXpath("//input[@alt='fone']")).shouldBe(visible).sendKeys("123456789");
    }

    public void clicaSimModal(){
        $(byXpath("//input[@value='Sim']")).shouldBe(visible).click();
    }



}