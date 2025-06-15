package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpSuccessful extends BasePage {

	// WbeElements
	@FindBy(xpath = "//h3[text()='Login Successfully']")
	WebElement loginSuccessfulTextElement;

	@FindBy(xpath = "//b[normalize-space()='Thank you for Loggin.']")
	WebElement thankyouTextMsg;

	public SignUpSuccessful(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Getters
	public WebElement getLoginSuccessfulTextElement() {
		return loginSuccessfulTextElement;
	}

	public WebElement getThankyouTextMsg() {
		return thankyouTextMsg;
	}

}
