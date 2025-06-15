package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor sJavascriptExecutor = (JavascriptExecutor) driver;
		sJavascriptExecutor.executeScript("window.scrollBy(0,1000);", "");

		sJavascriptExecutor.executeScript("window.scrollBy(0,-500);", "");

		Thread.sleep(3000);

		//sJavascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight);", args);

		WebElement dropDownButton = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		sJavascriptExecutor.executeScript("arguments[0].scrollIntoView();", dropDownButton);
		sJavascriptExecutor.executeScript("arguments[0].click();", dropDownButton);
		
	}

}
