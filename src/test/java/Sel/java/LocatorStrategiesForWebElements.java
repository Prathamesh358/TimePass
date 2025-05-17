package Sel.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategiesForWebElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		// By .id
//		WebElement textWrite = driver.findElement(By.id("ta1"));
//		Thread.sleep(3000);
//		textWrite.sendKeys("Hello Prathamesh");

		// By.class
//		WebElement searchThisBlog = driver.findElement(By.className("feed-link"));
//		searchThisBlog.click();

		// By LinkedText
		WebElement linkText = driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
		linkText.click();

		// By PartialLinkedText
//		WebElement partialLinkText = driver.findElement(By.partialLinkText("143.blogspot.com"));
//		Thread.sleep(3000);
//		partialLinkText.click();

		// By TagName
//		WebElement textArea = driver.findElement(By.tagName("textarea"));
//		Thread.sleep(3000);
//		textArea.sendKeys("Hello Prathamesh");
//		Thread.sleep(3000);
//		textArea.clear();

		// By Name
//		WebElement maleRadioButton = driver.findElement(By.name("gender"));
//		maleRadioButton.click();
		
		
	}
}
