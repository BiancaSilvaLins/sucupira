package paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class PaginaPainelModulos {
	
	public void selecionaPortal(String idPortal) {
//		$(byId("formPortais:portalCoordenadorPrograma")).shouldBe(visible).click();
		$(byId(idPortal)).shouldBe(visible).click();

	}
}
