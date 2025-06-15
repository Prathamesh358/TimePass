package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PrioritiesInTestNG {

	WebDriver driver;

//	@BeforeMethod
//	public void websiteLaunch() {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(Utility.readProperty("url"));
//		driver.manage().window().maximize();
//
//	}

//	@AfterMethod
//	public void closeWebsite() {
//		driver.quit();
//	}

	@Test(priority = -10)
	public void dTest() {
		System.out.println("Test D Executed");
	}

	@Test(priority = -40)
	public void cTest() {
		System.out.println("Test C Executed");
	}

	@Test(priority = 2)
	public void aTest() {
		System.out.println("Test A Executed");
	}
}
