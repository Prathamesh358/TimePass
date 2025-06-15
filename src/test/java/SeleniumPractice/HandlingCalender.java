package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalender {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		startDateAndTime("2023", "May", "5");
		endDateAndTime("2023", "May", "23");

	}

	public static void startDateAndTime(String year, String month, String givenDate) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='datetimepicker1']")).click();

		WebElement calenderYear = driver.findElement(By.xpath("(//input[@aria-label='Year'])[1]"));
		calenderYear.clear();
		Thread.sleep(3000);
		calenderYear.sendKeys(year);

		Select select = new Select(driver.findElement(By.xpath("(//select[@aria-label='Month'])[1]")));
		Thread.sleep(3000);
		select.selectByVisibleText(month);

		List<WebElement> dates = driver
				.findElements(By.xpath("(//div[@class=\"dayContainer\"])[1]//span[@class=\"flatpickr-day\"]"));
		for (WebElement date : dates) {
			if (date.getText().equalsIgnoreCase(givenDate)) {
				date.click();
				break;

			}
		}

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB)
				.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		Thread.sleep(3000);

	}

	public static void endDateAndTime(String year, String month, String selDate) throws InterruptedException {
		driver.findElement(By.cssSelector("#datetimepicker2[type='text']")).click();

		WebElement calYear = driver.findElement(By.xpath("(//input[@aria-label='Year'])[2]"));
		calYear.clear();
		calYear.sendKeys(year);

		Select select = new Select(driver.findElement(By.xpath("(//select[@aria-label='Month'])[2]")));
		select.selectByVisibleText(month);

		List<WebElement> calDate = driver
				.findElements(By.xpath("(//div[@class='dayContainer'])[2]//span[@class='flatpickr-day']"));
		for (WebElement date : calDate) {
			if (date.getText().equalsIgnoreCase(selDate)) {
				date.click();
				break;

			}

		}
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB)
				.build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//h1[text() = 'Date Picker']")).click();
	}

}
