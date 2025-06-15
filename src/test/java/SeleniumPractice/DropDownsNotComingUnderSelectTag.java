package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownsNotComingUnderSelectTag {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");
		driver.manage().window().maximize();

		selectTripType("one way");

		Thread.sleep(3000);

		selectTripType("return trip");
	}

	public static void selectTripType(String tripType) throws InterruptedException {
		driver.findElement(By.cssSelector("#tripType")).click();

		List<WebElement> tripTypeList = driver.findElements(By.cssSelector("div.tripTypeFilter ul li p"));
		for (WebElement list : tripTypeList) {
			if (list.getText().equalsIgnoreCase(tripType)) {
				list.click();
				Thread.sleep(3000);
				break;
			}
		}

	}

}
