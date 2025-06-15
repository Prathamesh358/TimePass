package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement FirstFrame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));

		driver.switchTo().frame(FirstFrame);

		WebElement searchField = driver.findElement(By.xpath("//input[@name='q' and not(@title)]"));
		searchField.sendKeys("Prathamesh");

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Kyy kyy ani Prathamesh");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe2']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_1']")));

		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
			
		driver.findElement(By.cssSelector("#ta1")).clear();

	}

}
