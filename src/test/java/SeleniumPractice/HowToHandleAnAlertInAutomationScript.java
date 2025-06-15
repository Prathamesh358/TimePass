package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAnAlertInAutomationScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement alertButton = driver.findElement(By.cssSelector("#alert1"));
		alertButton.click();

		Thread.sleep(3000);
		Alert firstAlert = driver.switchTo().alert();
		firstAlert.accept();

		WebElement textArea = driver.findElement(By.cssSelector("textarea[cols = '30']"));
		System.out.println(textArea.getText());
		
	}

}
