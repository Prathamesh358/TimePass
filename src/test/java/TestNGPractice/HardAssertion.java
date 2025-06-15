package TestNGPractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class HardAssertion {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	@Test
	public void hardAssert() {

		String expectedPageUrlString = "https://omayo.blogspot.com/";
		String actualPageUrlString = driver.getCurrentUrl();

		System.out.println("Before First assert");

		assertEquals(actualPageUrlString, expectedPageUrlString, "Actual page Url is not matching");

		System.out.println("After First assert");

		System.out.println("Before second assert");

		String pageTitleString = driver.getTitle();
		assertEquals(pageTitleString, "omayo (QAFox.com)", "Actual title is matching with expected");

		System.out.println("After second assert");

		assertTrue(actualPageUrlString.equalsIgnoreCase(expectedPageUrlString), "URL is not Matching");

		System.out.println("after all the asserts");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
