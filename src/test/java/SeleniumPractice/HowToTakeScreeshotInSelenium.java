package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToTakeScreeshotInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		takeScreenshot(String.valueOf(System.currentTimeMillis()));

		WebElement multiDropDown = driver.findElement(By.cssSelector("select#multiselect1"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTo();", multiDropDown);

		File file = multiDropDown.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("src/test/resources/Snapshots/multiselectdropdown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void takeScreenshot(String name) {

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("src/test/resources/Snapshots/" + name + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
