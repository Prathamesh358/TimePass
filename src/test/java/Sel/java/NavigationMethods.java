package Sel.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");

		Thread.sleep(3000);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.navigate().to("https://www.amazon.in");

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(3000);

		driver.close();

	}

}
