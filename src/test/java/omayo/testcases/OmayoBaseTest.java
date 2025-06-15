package omayo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import util.Utility;

public class OmayoBaseTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.valueOf(Utility.readProperty("time"))));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
