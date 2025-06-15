package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		textArea.sendKeys("hello prathamesh");
		System.out.println(textArea.isDisplayed());

		WebElement visibleText = driver.findElement(By.cssSelector("#delayedText"));
		System.out.println("Visibility is = " + visibleText.getCssValue("visibility"));
		System.out.println(visibleText.isDisplayed());

		Thread.sleep(11000);
		
		System.out.println("Visibility is = " + visibleText.getCssValue("visibility"));
		System.out.println(visibleText.isDisplayed());


	}

}
