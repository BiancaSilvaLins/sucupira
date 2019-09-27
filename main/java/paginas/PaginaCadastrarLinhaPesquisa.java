package paginas;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class PaginaCadastrarLinhaPesquisa {

    public void cadastrarLinhaPesquisa(String nomeLP, String datainicio, String descricao, String areaConcentracao) {

        $(byId("form:nome")).shouldBe(visible).sendKeys(nomeLP);
        $(byId("form:dataInicioInputDate")).shouldBe(visible).sendKeys(datainicio);
        $(byId("form:descricao")).shouldBe(visible).sendKeys(descricao);
        $(byId("form:areaConcentracao")).selectOptionContainingText(areaConcentracao);
    }

    public void clicaBotaoCadastrar(){
        $(byId("form:cadastrar")).click();
    }
}