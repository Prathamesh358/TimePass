package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class DataProviderLogin {

	WebDriver driver;

	@BeforeMethod
	public void launchingBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utility.readProperty("newtourtravelurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@Test(dataProvider = "userdata")
	public void user1(String userName, String password) {
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String headerTextString = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		Assert.assertEquals(headerTextString, "Login Successfully");
	}

//	@Test
//	public void user2() {
//		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("user1");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//
//		String headerTextString = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
//
//		Assert.assertEquals(headerTextString, "Login Successfully");
//	}
//	
//	@Test
//	public void user3() {
//		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("user_2");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//
//		String headerTextString = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
//
//		Assert.assertEquals(headerTextString, "Login Successfully");
//	}

	@DataProvider(name = "userdata")
	public String[][] dataProvider() {
		String userString[][] = { { "admin", "admin@123" }, { "user1", "admin@234" }, { "user2", "admin@567" } };
		return userString;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
