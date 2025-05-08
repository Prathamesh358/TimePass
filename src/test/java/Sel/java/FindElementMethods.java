package Sel.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethods {

//	1. FindElement is used to locate first single  matching element.
//	2. If no such element is found in that case it will throw NoSuchElementException.

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement write = driver.findElement(By.xpath("//textarea"));
		write.sendKeys("Welcome to prathamesh");

		Thread.sleep(3000);
		WebElement radioSelect = driver.findElement(By.xpath("//input[@id = 'radio1']"));
		radioSelect.click();

	}

}
