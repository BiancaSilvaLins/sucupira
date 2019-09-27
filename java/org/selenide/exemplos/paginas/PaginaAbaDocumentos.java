package org.selenide.exemplos.paginas;

import com.codeborne.selenide.Selenide;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaDocumentos {

    public void clicaNaAbaDocumentos(){
        $(byXpath("//a[contains(text(),'15. Documentos')]")).shouldBe(visible).click();
    }

    public void clicaNaAbaFinalizarProposta(){
        $(byXpath("//a[contains(text(),'16. Finalizar Proposta')]")).shouldBe(visible).click();
    }

    public void uploadCredenciamento() throws AWTException {
        String filePath = "C:/Users/biancaSL/teste_novo.pdf";
        $(byId("formBaseProposta:arquivoEad")).shouldBe(visible).click();
        $(byName("formBaseProposta:arquivoEad")).shouldBe(exist).uploadFile(new File(filePath));

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

//        Selenide.refresh();
    }

    public void subirCredenciamento(){
        $(byXpath("//*[@id='formBaseProposta:anexarEad']/span")).shouldBe(visible).click();
    }

    public void uploadRegimento() throws AWTException {
        String filePath = "C:/Users/biancasl/Downloads/teste_novo2.pdf";
        $(byId("formBaseProposta:arquivoRegimentoIes")).shouldBe(visible).click();
        $(byName("formBaseProposta:arquivoRegimentoIes")).shouldBe(exist).uploadFile(new File(filePath));
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

//        Selenide.refresh();

    }

    public void subirRegimento(){
        $(byXpath("//*[@id='formBaseProposta:anexarRegimentoIes']/span")).shouldBe(visible).click();
    }

    public void uploadRegulamento() throws AWTException {
        String filePath = "C:/Users/biancasl/Downloads/teste_novo3.pdf";
        $(byId("formBaseProposta:arquivoRegimentoCurso")).shouldBe(visible).click();
        $(byName("formBaseProposta:arquivoRegimentoCurso")).shouldBe(exist).uploadFile(new File(filePath));

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

//        Selenide.refresh();
    }

    public void subirRegulamento(){
        $(byXpath("//*[@id='formBaseProposta:anexarRegimentoCurso']/span")).shouldBe(visible).click();
    }

    public void uploadAutorizacao() throws AWTException {
        String filePath = "C:/Users/biancaSL/teste_novo4.pdf";
        $(byId("formBaseProposta:arquivoAutorizacaoIes")).shouldBe(visible).click();
        $(byName("formBaseProposta:arquivoAutorizacaoIes")).shouldBe(exist).uploadFile(new File(filePath));

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public void subirAutorizacao(){
        $(byXpath("//*[@id='formBaseProposta:anexarAutorizacaoIes']/span")).shouldBe(visible).click();
    }

    public void clicarBotaoAvancar(){
        $(byId("formBaseProposta:btnAvancar")).shouldBe(visible).click();
    }

    public String mensagem(String mensagem){
        return $(byXpath("//*[@id='content']/div[1]")).shouldBe(visible).getText();
    }

    public String mensagemSucesso(String mensagem){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }

    public void clicarBotaoEnviar(){
        $(byXpath("//*[@id='content']/div[2]/div/div/input[3]")).shouldBe(visible).click();
    }

    public void clicarBotaoConcluir(){
        $(byXpath("//*[@id='form']/div[8]/div/div/input")).shouldBe(visible).click();
    }
}
