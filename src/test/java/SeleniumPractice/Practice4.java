package SeleniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		textArea.sendKeys("hello prathamesh");

		WebElement popupWidoWebElement = driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]"));
		popupWidoWebElement.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		String parentWindowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String window : windowHandles) {
			if (!(window.equalsIgnoreCase(parentWindowHandle))) {
				driver.switchTo().window(window);
				break;
			}
		}

		WebElement text1 = driver.findElement(By.cssSelector("//div[@class= 'example']//h3[text()='New Window']"));
		Thread.sleep(4000);
		System.out.println(text1.getText());
		driver.close();

		driver.switchTo().window(parentWindowHandle);
		textArea.clear();

	}

}
