package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceAtionOnOmayoWebsite {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement contentTextarea1 = driver.findElement(By.xpath("//textarea[@cols='30']"));

		WebElement blankTextarea2 = driver.findElement(By.cssSelector("#ta1"));

		Actions action = new Actions(driver);
		Thread.sleep(3000);

		action.click(contentTextarea1).build().perform();

		action.keyDown(Keys.CONTROL).keyDown("a").pause(Duration.ofSeconds(2)).keyUp("a").keyDown("x")
				.pause(Duration.ofSeconds(2)).keyUp("x").pause(Duration.ofSeconds(2)).build().perform();

		action.moveToElement(blankTextarea2).click().build().perform();

		action.keyDown("v").keyUp("v").keyUp(Keys.CONTROL).build().perform();

	}

}
