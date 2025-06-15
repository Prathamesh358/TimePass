package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class Practice10 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		javascriptExecutor.executeScript("window.scrollBy(0,1000);", "");
		Thread.sleep(2000);
		javascriptExecutor.executeScript("window.scrollBy(0,-500);", "");

		Thread.sleep(3000);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//button[text()='Dropdown']")));
		javascriptExecutor.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//button[text()='Dropdown']")));

	}

}
