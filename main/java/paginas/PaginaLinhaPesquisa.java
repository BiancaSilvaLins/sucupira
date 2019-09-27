package paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class PaginaLinhaPesquisa {

	private PaginaBase paginaBase;

	public PaginaLinhaPesquisa(PaginaBase paginaBase) {
		this.paginaBase = paginaBase;
	}

	public void clicaCadastrarLinhaPesquisa(){
		$(byId("form:cadastro")).shouldBe(visible).click();
	}
	public void efetuaConsultaLinhaDePesquisa(String linhaPesquisa, String areaPesquisa, String periodoVigenciaInicio) {

		sleep(3000);
		paginaBase.clickViaJavaScript($(byId("form:nome")));
	
		$(byId("form:nome")).shouldBe(visible).sendKeys(linhaPesquisa);
		$(byId("form:nome")).pressTab();
		
		paginaBase.clickViaJavaScript($(byId("form:areaConcentracao")));
		$(byId("form:areaConcentracao")).shouldBe(visible).sendKeys(areaPesquisa);

		paginaBase.clickViaJavaScript($(byId("form:inicialInputDate")));
		$(byId("form:inicialInputDate")).shouldBe(visible).sendKeys(periodoVigenciaInicio);
		
		$(byId("form:consultar")).shouldBe(visible).click();

	}
	
	public void selecionaVisualizarLinhaPesquisa() {
		$(byXpath("//td/a[contains(@href,viewLinhaPesquisa)]")).click();
		
	}

	public void selecionaAlterarLinhaPesquisa() {
		$(byXpath("//table//td/a/img[@title='Alterar']")).click();

	}

	public void clicaBotaoExcluir(){
		$(byXpath("//img[@title='Remover']")).click();
		switchTo().alert().accept();

	}

}
