package config;

import com.codeborne.selenide.Configuration;

import java.io.File;

public class ConfigSelenide {

	public static void configurar() {
		System.setProperty("webdriver.chrome.driver", retornaPathChromeDriver());
		Configuration.reportsFolder = "target/selenide/screenshoots";
		Configuration.browser = "chrome";
		Configuration.startMaximized = true;
		Configuration.timeout = 30000;
		Configuration.fastSetValue = false;

	}

	public static String retornaPathChromeDriver() {
		return new File("src\\test\\resources\\chromedriver.exe").getAbsolutePath();
	}
}
