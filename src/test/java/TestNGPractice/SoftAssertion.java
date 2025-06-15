package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class SoftAssertion {

	WebDriver driver;
	org.testng.asserts.SoftAssert verify;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		verify = new org.testng.asserts.SoftAssert();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	@Test
	public void softAssert() {

		String expectedPageUrlString = "https://omayo.blogspot.co/";
		String actualPageUrlString = driver.getCurrentUrl();

		System.out.println("Before First assert");

		verify.assertEquals(actualPageUrlString, expectedPageUrlString, "Actual page Url is not matching");

		System.out.println("After First assert");

		System.out.println("Before second assert");

		String pageTitleString = driver.getTitle();
		verify.assertNotEquals(pageTitleString, "omayo (QAFox.com)", "Actual title is matching with expected");

		System.out.println("After second assert");

		verify.assertTrue(actualPageUrlString.equalsIgnoreCase(expectedPageUrlString), "URL is not Matching");

		System.out.println("after all the asserts");

		verify.assertAll();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
