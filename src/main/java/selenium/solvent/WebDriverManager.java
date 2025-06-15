package selenium.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.Utility;

public class WebDriverManager {

	static WebDriver driver;
	static WebDriverManager webDriverManager;

	private WebDriverManager() {

	}

	public WebDriver initDriver() {

		String browserNameString = Utility.readProperty("browser");

		switch (browserNameString) {
		case "chrome":
			io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			io.github.bonigarcia.wdm.WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "FireFox":
			io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please Drop the appropriate Browser");
			break;
		}
		return driver;
	}

	public static WebDriver getDriver() {
		if (webDriverManager == null) {
			webDriverManager = new WebDriverManager();
			webDriverManager.initDriver();
		}
		return driver;

	}

}
