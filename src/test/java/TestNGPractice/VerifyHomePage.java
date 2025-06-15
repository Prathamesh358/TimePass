package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;


public class VerifyHomePage {

	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeMethod
	public void launchTheBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeWindow() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}

	@Test
	public void verifyHomepageTitle() {

		String pageString = driver.getTitle();

		Assert.assertEquals(pageString, "omayo (QAFox.com)");
	}

	@Test
	public void verifyWbesiteUrl() {

		String websiteUrlString = driver.getCurrentUrl();

		Assert.assertEquals(websiteUrlString, "https://omayo.blogspot.om/");

	}

	

}
