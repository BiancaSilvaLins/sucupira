package org.selenide.exemplos.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.StaticConfig;
import com.codeborne.selenide.junit.TextReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org.selenide.exemplos.steps",
        features = "src/test/resources/features/CalendarioAcademico/" , tags = "@1CalendarioAcademico, @2PreencheDadosInstituicao, @3PaginaDeAcesso, @4PaginaMinhasPropostas, @5AbaPropostaCurso, @6AbaInstituicoesDeEnsino, @7PolosEAD, @8AbaCaracterizacaoDaProposta, @9AbaAreasDeConcentracaoLinhasPesquisa, @10CaracterizacaoDoCursoAcademico, @11AbaDisciplinas, @12AbaCorpoDocenteAcademico, " +
        "@13AbaProducaoBibliograficaTecnicaEArtisticaAcademicoDadosSolicitacao, @13AbaProducaoBibliograficaTecnicaEArtisticaAcademico, @14AbaProjetosDePesquisa, @15AbaVinculoDeDocenteAsDisciplinas, @16AbaAtividadesDosDocentes, @17AbaInfraestrutura, @18AbaInformacoesComplementares, @19AbaDocumentos" ,
        plugin = "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
        //formato legivelmonochrome=true
        monochrome = true
)
public class Runner {

    private WebDriver driver = null;

    String  BaseURL,NodeURL;

    @Rule
    public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

    @BeforeClass
    public static void configure() throws Exception{
        Configuration.timeout = 30000;
//        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
//        Configuration.browser = "chrome";
        Configuration.startMaximized = true;


//        BaseURL="http://hom.capes.gov.br/sucupira";
        String NodeURL="http://localhost:4444/wd/hub";
//        DesiredCapabilities capa =DesiredCapabilities.chrome();
//        capa.setBrowserName("chrome");
//        capa.setPlatform(Platform.ANY);
//        driver=new RemoteWebDriver(new URL(NodeURL),capa);

        Configuration.driverManagerEnabled = false;
        Configuration.remote = NodeURL;
    }

    public void hightlight(WebElement webElement) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    webElement, "color: red; border: 3px solid red;");
        }
    }
}

//