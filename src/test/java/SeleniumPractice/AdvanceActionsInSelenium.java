package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import util.Utility;

public class AdvanceActionsInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement textArea = driver.findElement(By.xpath("//textarea[@name='q']"));
		Actions action = new Actions(driver);

		action.click(textArea).build().perform();
		Thread.sleep(3000);
		action.keyDown(Keys.SHIFT).keyDown("a").keyUp("a").keyUp(Keys.SHIFT).keyDown("p").keyUp("p").keyDown("p")
				.keyUp("p").build().perform();
		Thread.sleep(3000);
		action.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();

		Thread.sleep(2000);

		WebElement gLinks = driver.findElement(By.xpath("//a[@class='gb_B']"));
		action.moveToElement(gLinks).build().perform();
		action.contextClick().build().perform();

		driver.switchTo().newWindow(WindowType.TAB).get("https://omayo.blogspot.com/");

	}

}
