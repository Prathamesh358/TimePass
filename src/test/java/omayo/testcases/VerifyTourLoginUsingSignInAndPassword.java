package omayo.testcases;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayo.pages.SignUpPage;
import omayo.pages.SignUpSuccessful;
import util.Utility;

public class VerifyTourLoginUsingSignInAndPassword extends OmayoBaseTest {

	SignUpPage signUpPage;
	SignUpSuccessful signUpSuccessful;
	SoftAssert verifyAssert;

	@Test(description = "Verifying Successful Login")
	public void signUpVerification() {

		signUpPage = new SignUpPage(driver);
		signUpSuccessful = new SignUpSuccessful(driver);
		verifyAssert = new SoftAssert();

		driver.navigate().to(Utility.readProperty("newtourtravelloginurl"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		signUpPage.sendUserName("admin");
		signUpPage.sendPassword("admin@123");
		signUpPage.clickSubmitButton();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10)).ignoring(TimeoutException.class).pollingEvery(Duration.ofMillis(10))
				.until(ExpectedConditions.visibilityOf(signUpSuccessful.getLoginSuccessfulTextElement()));

		verifyAssert.assertEquals(signUpSuccessful.getLoginSuccessfulTextElement().getText(), "Login Successfully");

		verifyAssert.assertEquals(signUpSuccessful.getThankyouTextMsg().getText().trim(), "Thank you for Loggin.");

		verifyAssert.assertAll();

	}

}
