package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com");
		
		Thread.sleep(1000);

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("mobile");

	}

}
