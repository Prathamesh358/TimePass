package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		String parentWindowString = driver.getWindowHandle();

		WebElement textArea = driver.findElement(By.cssSelector("#APjFqb"));
		textArea.click();

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).keyDown("a").keyUp(Keys.SHIFT).keyUp("a").keyDown("p").keyUp("p").keyDown("p")
				.keyUp("p").build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@class='gb_B']"))).build().perform();
		actions.contextClick().build().perform();

		driver.switchTo().newWindow(WindowType.TAB)
				.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		actions.clickAndHold(driver.findElement(By.cssSelector("#draggable")))
				.moveToElement(driver.findElement(By.cssSelector("#droppable")))
				.release(driver.findElement(By.cssSelector("#draggable"))).build().perform();

		Thread.sleep(2000);

		driver.close();

		driver.switchTo().window(parentWindowString);
		actions.click(driver.findElement(By.cssSelector("#APjFqb"))).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE)
				.build().perform();

	}

}


