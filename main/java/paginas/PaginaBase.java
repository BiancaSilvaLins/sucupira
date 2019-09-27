package paginas;

import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class PaginaBase {

	public String retornaUmValorNaLista(String value, List<SelenideElement> lista) {

		for (SelenideElement e : lista) {
			if (e.getText().contains(value)) {
				return e.getText();
			}
		}
		return "NAO ENCONTROU NADA";
	}

	public PaginaBase clickViaJavaScript(SelenideElement element) {
		element.shouldBe(Condition.visible);
		executeJavaScript("arguments[0].click()", element);
		return this;
	}

	public void excluiElemento(String xpath){
		$(byXpath(xpath)).click();
	}

	public void logoff(){
		$(byCssSelector("span.seta")).click();
		$(byId("form_base_interna:botaoDeslogarSSO")).click();
	}

	
}
