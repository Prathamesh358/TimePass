package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice7 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		SelectDropDownValue("Return Trip");

		Thread.sleep(3000);

		SelectDropDownValue("One Way");

	}

	public static void SelectDropDownValue(String trip) {
		driver.findElement(By.cssSelector("#tripType")).click();

		List<WebElement> tripTypElements = driver.findElements(By.cssSelector("div[class='tripTypeFilter'] ul li p"));

		for (WebElement tripElement : tripTypElements) {
			if (tripElement.getText().equalsIgnoreCase(trip)) {
				tripElement.click();
				break;
			}
		}
	}

}
