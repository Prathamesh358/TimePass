package cucumber.step.def;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class LoginCredentilaSteps {

	WebDriver driver;

//	@Given("^Launch Application$")
//	public void launchApplication() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(Utility.readProperty("newtourtravelloginurl"));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}

	@When("^Enter valid Username$")
	public void enterUsername() {
		WebElement userNameFieldElement = driver.findElement(By.xpath("//input[@name='userName']"));
		userNameFieldElement.sendKeys("Admin");
	}

	@When("^Enter Valid Password$")
	public void enterPassword() {
		WebElement passwordFielfElement = driver.findElement(By.xpath("//input[@name='password']"));
		passwordFielfElement.sendKeys("admin@123");
	}

	@When("^Click on submit button$")
	public void clickOnSubmitButton() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("^Verify Login Successful Message$")
	public void verifyLoginResults() {

		String actualResult = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		assertEquals(actualResult, "Login Successfully", "user is not been Loged in");

		driver.quit();

	}

	@When("^Enter valid Uname (.*)$")
	public void enterInValidUName(String userName) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
	}

	@And("^Enter Valid Pass (.*)$")
	public void enterInValidPassword(String passwordString) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwordString);
	}

	@Then("^Verify Message (.*)$")
	public void verifyMsg(String msg) {
		String actualMsgString = driver
				.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"))
				.getText();

		Assert.assertEquals(actualMsgString.trim(), msg, "User or Admin is not logged in");

	}

//	@And("^Close Browser$")
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}

	@Then("^Enter Username and Password and verify message$")
	public void enterInvalidUsernameAndPassword(DataTable dataTable) {
		List<Map<String, String>> list = dataTable.asMaps();

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(list.get(0).get("Username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(list.get(0).get("Password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Assert.assertEquals(
				driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"))
						.getText().trim(),
				list.get(0).get("Message"), "User is not logged in");
	}

	@Before("@tag1 or @tag2 or @tag3")
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utility.readProperty("newtourtravelloginurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After("@tag1 or @tag2 or @tag3")
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
