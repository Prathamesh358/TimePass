package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class Practice3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		WebElement alertButtonElement = driver.findElement(By.cssSelector("#prompt"));
		alertButtonElement.click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Prathamesh Kumbhar");
		alert.accept();

		WebElement textAreaElement1 = driver.findElement(By.xpath("//textarea[@cols= '30']"));
		System.out.println(textAreaElement1.getText());

	}

}
