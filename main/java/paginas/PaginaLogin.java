package paginas;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

// import estaticos somente p o codigo ficar mais clean

public class PaginaLogin {

	public PaginaLogin navegar() {
		open("http://hom.capes.gov.br");
		return this;
	}

	public PaginaPrincipal realizarLogin(String usuario, String senha) {
		navegar();
		$(byId("login")).shouldBe(visible).sendKeys(usuario);
		$(byId("senha")).shouldBe(visible).sendKeys(senha);
		$(byId("idBtnEntrar")).shouldBe(visible).click();
		return new PaginaPrincipal();
	}

	public void verificaTituloDePagina(String xpath, String titulo) {
		$(byXpath(xpath)).shouldHave(text(titulo));
	}

	public void marcaCheckbox(String idCheckbox) {
		$(byId(idCheckbox)).click();
	}



}
