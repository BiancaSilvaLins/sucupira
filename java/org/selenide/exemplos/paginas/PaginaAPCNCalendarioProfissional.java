package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PaginaAPCNCalendarioProfissional {

    public void navegar(){
        open("http://hom.capes.gov.br/sucupira/public/index.xhtml");
    }

    public String retornaCalendarioProfissional(String  calendarioProfissional){
        return $(byXpath("//span[text()='"+calendarioProfissional+"']")).shouldBe(visible).getText();
    }

    public void clicaBotaoCalendarioProfissional(){
        $(byXpath("//div/div/span[text()='PROPOSTA DE CURSOS NOVOS - PROFISSIONAL (PROFISSIONAL)']")).shouldBe(visible).click();

    }

    public String getTituloSolicitacaoCursosNovos(String tituloPagina){
        return $(byXpath("//h1[text()='Solicitacao de Novos Cursos']")).shouldBe(visible).getText();
    }
}