package SeleniumPractice;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class SynchronizationInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.get(Utility.readProperty("url"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(Utility.readProperty("time"))));
//		driver.findElement(By.xpath("//input[@id = 'virat']"));

		WebElement visibleTextArea = driver.findElement(By.cssSelector("#delayedText"));

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
//		wait.until(ExpectedConditions.visibilityOf(visibleTextArea));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(Long.valueOf(Utility.readProperty("time"))))
				.ignoring(TimeoutException.class).pollingEvery(Duration.ofMillis(10))
				.until(ExpectedConditions.visibilityOf(visibleTextArea));
		System.out.println("Visible text is displayed : " + visibleTextArea.isDisplayed());

	}

}
