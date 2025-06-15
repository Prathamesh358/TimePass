package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class SkipTestCasesUsingEnbaled {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();

	}

	@Test(priority = 1, groups = { "smoke" })
	public void verfiyUrl() {

		String pageUrlString = driver.getCurrentUrl();

		Assert.assertEquals(pageUrlString, "https://omayo.blogspot.com/");

	}

	@Test(priority = -1, groups = { "sanity" }, enabled = false)
	public void verifyPageTitle() {

		String pageTitleString = driver.getTitle();

		Assert.assertEquals(pageTitleString, "omayo (QAFox.com)");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
