package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class PaginaAPCNCalendarioAcademico {

    public void navegar(){
        open("http://hom.capes.gov.br/sucupira/public/index.xhtml");
    }

    public String retornaCalendarioAcademico(String  calendarioAcademico){
        return $(byXpath("//span[text()='"+calendarioAcademico+"']")).shouldBe(visible).getText();
    }

    public void clicaBotaoCalendarioAcademico(){
        $(byXpath("//*[@id='formCalendario']/div[2]/a/div")).shouldBe(visible).click();

    }

    public String getTituloSolicitacaoCursosNovos(String tituloPagina){
        return $(byXpath("//*[@id='form']/h1")).shouldBe(visible).getText();
    }
}