package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

	// WebElements
	@FindBy(name = "userName")
	WebElement userNameTextField;

	@FindBy(name = "password")
	WebElement passwordTextField;

	@FindBy(name = "submit")
	WebElement submitButton;

	public SignUpPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Getters for the above Elements
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	// Methods for above Elements
	public void sendUserName(String userName) {
		getUserNameTextField().clear();
		getUserNameTextField().sendKeys(userName);
	}

	public void sendPassword(String passwordText) {
		getPasswordTextField().clear();
		getPasswordTextField().sendKeys(passwordText);
	}

	public void clickSubmitButton() {
		getSubmitButton().click();
	}

}
