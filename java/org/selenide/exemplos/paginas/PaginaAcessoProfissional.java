package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAcessoProfissional {

    public void preencheCampoProgramaPgAcesso() {
        $(byXpath("//input[@name='form:j_idt83']")).shouldBe(visible).sendKeys("teste automatizado profissional");
    }
}
