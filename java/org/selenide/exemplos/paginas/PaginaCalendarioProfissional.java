package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaCalendarioProfissional {

    public void retornaCalendarioProfissional(String calendarioProfissional){
        $(byXpath("//span[text()='"+calendarioProfissional+"']")).shouldHave(text(calendarioProfissional));
    }

    public void clicaCalendarioProfissional(){
        $(byXpath("//div/div/span[text()='PROPOSTA DE CURSOS NOVOS - PROFISSIONAL (PROFISSIONAL)']")).shouldBe(visible).click();
    }

    public void retornaTelaDeSolicitacao(String calendarioProfissional){
        $(byXpath("//div/div/form/h1")).shouldBe(visible).click();
    }
}
