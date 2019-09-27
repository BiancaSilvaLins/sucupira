package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaCalendarioAcademico {

    public void retornaCalendarioAcademico(String calendarioAcademico){
        $(byXpath("//span[text()='"+calendarioAcademico+"']")).shouldHave(text(calendarioAcademico));
    }

    public void clicaCalendarioAcademico(){
        $(byXpath("//*[@id='formCalendario']/div[2]/a/div")).shouldBe(visible).click();
    }

    public void retornaTelaDeSolicitacao(String calendarioAcademico){
        $(byXpath("//div/div/form/h1")).shouldBe(visible).click();
    }
}
