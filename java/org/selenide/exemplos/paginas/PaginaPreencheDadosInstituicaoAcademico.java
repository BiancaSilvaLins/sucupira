package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenide.exemplos.paginas.PaginaBase;

public class PaginaPreencheDadosInstituicaoAcademico {

    PaginaBase pgBase = new PaginaBase();

    public void  getTituloPaginaSolicitacaoNovosCursos(String titulo){
        $(byXpath("//*[@id='form']/h1")).shouldBe(visible).getText();
    }

    public void preencheSiglaIES(String ies){
        $(byId("form:idIes:input")).shouldBe(visible).sendKeys(ies);
    }

    public void selecioaInstituicaoDeEnsino(String instituicaoDeEnsino){
        $(byId("form:idIes:listbox")).scrollTo().selectOption(instituicaoDeEnsino);

    }

    public void selecionaOpcaoNao() {

        SelenideElement button = $(byXpath("//*[@id='form:radio:1']"));
        button.scrollTo();
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void selecionaOpcaoSim() {
        SelenideElement button = $(byXpath("//*[@id='form:radio:0']"));
        button.scrollTo();
        pgBase.clickBotaoViaJavaScript(button);
    }

    public void preenchaCampoPrograma(String programa){
        $(byXpath("//*[@id='form:dadosCoord']/div/div/div/div/input")).shouldBe(visible).sendKeys(programa);
    }

    public void selecionaTipoDeDocumento(String tipoDeDocumento){
        $(byXpath("//span[@id='form:pessoa']/span/div/div/div/div/select")).shouldBe(visible).selectOption(tipoDeDocumento);
    }

    public void preencherNumeroDoc(String numeroDoDocumento){
        $(byXpath("//span[@id='form:pessoa']/span/div/div[2]/div/div/input")).shouldBe(visible).sendKeys(numeroDoDocumento);
    }

    public void preencherTelefone(String telefone) throws InterruptedException {
        Thread.sleep(3000);
        $(byXpath("//input[@alt='fone']")).shouldBe(visible).sendKeys(telefone);
    }

    public void clicarDDD() throws InterruptedException {
        $(byXpath("//input[@alt='ddd']")).shouldBe(visible).click();
    }

    public void preencherDDD(String ddd) throws InterruptedException {
        $(byXpath("//input[@alt='ddd']")).shouldBe(visible).sendKeys(ddd);
    }

    public void clicaBotaoCriarProposta(){
        $(byId("form:cadastrar2")).shouldBe(visible).click();
    }
    public void clicaBotaoCriarProposta2(){
        sleep(2000);
        $(byId("form:cadastrar")).shouldBe(visible).click();
    }
    public void verificaModal(){
        sleep(2000);
        if($(byXpath("//div[@class='modal-body']")).isDisplayed()){
            $(byXpath("//*[@id='form:operacaoCadastrar']")).shouldBe(visible).click();
        }else {
            System.out.println("DUPLICIDADE DE PROGRAMA");
        }
    }

    public void retornaTituloProximaPg(){
        $(byXpath("//h1[text()='Dados da Proposta de Programa']")).shouldHave(text("Dados da Proposta de Programa"));
    }

    public void clicarBotaoContinuar(){
        $(byXpath("//*[@id='form']/div/div[15]/div/div/input[2]")).shouldBe(visible).click();
    }

    public void selecionaPrograma(String programa){
        $(byXpath("//*[@id='form:comboPrograma']")).shouldBe(visible).selectOption(programa);
    }

    public void retornaNomeCoord(String coordenador){
        $(byXpath("//div[contains(text(),'RUBENS MARIBONDO DO NASCIMENTO')]")).shouldHave(text(coordenador));
    }

    public void preencheLoginESenha(String login, String senha){
        $(byXpath("//div[@class='conteudo-container']/div/div/div/div/div/div/div/input[@type='text']")).shouldBe(visible).sendKeys(login);
        $(byXpath("//div[@class='conteudo-container']/div/div/div/div/div/div/div/input[@type='password']")).shouldBe(visible).sendKeys(senha);
    }
}
