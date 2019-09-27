package paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class PaginaPortalCoordenador {
	
	public void selecionaPrograma(String idPrograma) {
		$(byId(idPrograma)).shouldBe(visible).click();

	}

}
