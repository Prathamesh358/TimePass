package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement newWindowLink = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		newWindowLink.click();

		Thread.sleep(3000);

		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		

		for (String windowHandle : windowHandles) {
			if (!(windowHandle.equals(parentWindow))) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		WebElement newWindwoText = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println(newWindwoText.getText());

		driver.close();
		driver.switchTo().window(parentWindow);

		WebElement txtArea = driver.findElement(By.cssSelector("#ta1"));
		Thread.sleep(3000);
		txtArea.sendKeys("Hello World!");
		
		WebElement seleniumLink = driver.findElement(By.xpath("//a[text() = 'SeleniumTutorial']"));
		seleniumLink.click();
		Thread.sleep(5000);

		parentWindow = driver.getWindowHandle();
		windowHandles = driver.getWindowHandles();

		for (String windowHandle : windowHandles) {
			if (!(windowHandle.equals(parentWindow))) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		
		String pageTitle = driver.getTitle();
		System.out.println("Title of the current page is = " + pageTitle);

		driver.close();

		driver.switchTo().window(parentWindow);
		
		Thread.sleep(6000);
		txtArea.clear();

	}

}
