package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class PaginaRemover {

    public void clicaBtnRemover(){
        $(byXpath("//img[@title='Remover']")).shouldBe(visible).click();
    }

}
