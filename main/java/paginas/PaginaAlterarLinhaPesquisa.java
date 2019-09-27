package paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PaginaAlterarLinhaPesquisa{

    public void alteraDadosLP(String nomeLP, String dataInicio, String descricao, String areaConcentracao){
        
        //paginaBase.clickViaJavaScript($(byId("form:nome")));
        $(byId("form:nome")).shouldBe(visible).clear();
        $(byId("form:nome")).shouldBe(visible).sendKeys(nomeLP);
        
        //paginaBase.clickViaJavaScript($(byId("form:dataInicioInputDate")));
        $(byId("form:dataInicioInputDate")).shouldBe(visible).clear();
        $(byId("form:dataInicioInputDate")).shouldBe(visible).sendKeys(dataInicio);

        //paginaBase.clickViaJavaScript($(byId("form:descricao")));
        $(byId("form:descricao")).shouldBe(visible).clear();
        $(byId("form:descricao")).shouldBe(visible).sendKeys(descricao);

        //paginaBase.clickViaJavaScript($(byId("form:areaConcentracao")));
        $(byId("form:areaConcentracao")).selectOptionContainingText(areaConcentracao);
    }

    public void clicaBotaoAlterarLP(){
        $(byId("form:cadastrar")).click();
    }
}