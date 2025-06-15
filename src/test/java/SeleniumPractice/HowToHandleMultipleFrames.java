package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement textArea = driver.findElement(By.cssSelector("#ta1"));
		Thread.sleep(3000);
		textArea.sendKeys("Welcome to prathamesh stack");

//		driver.switchTo().frame(0);
//		driver.switchTo().frame("navbar-iframe");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));

//		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q' and  not(@title)]"));
//		searchBar.sendKeys("Prathamesh");
//
//		driver.switchTo().parentFrame();
//		textArea.clear();

		// parent frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#iframe2")));

		// child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_1']")));

		driver.switchTo().parentFrame();

		driver.switchTo().parentFrame();

		driver.switchTo().frame(0);
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q' and  not(@title)]"));
		Thread.sleep(2000);
		searchBar.sendKeys("Prathamesh");
		Thread.sleep(2000);
		searchBar.clear();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		textArea.clear();

	}

}
