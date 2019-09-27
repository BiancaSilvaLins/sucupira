package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaVinculoDeDocenteAsDisciplinas {

    public void clicaNaAbaVinculo(){
        $(byXpath("//*[@id='sidebar']/ul/li[11]/a")).shouldBe(visible).click();
    }

    public void selecionarDocente(String docente){
        $(byId("formBaseProposta:selecionarDocente")).shouldBe(visible).selectOption(docente);
    }

    public void selecionarDisciplina(String disciplina){
        $(byId("formBaseProposta:selecionarDisciplina")).shouldBe(visible).selectOption(disciplina);
    }

    public void clicarBotaoAssociar() throws InterruptedException {
        Thread.sleep(1000);
        $(byId("formBaseProposta:btnAssociar")).shouldBe(visible).click();
    }

    public String mensagem(String mensagem){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }
}
