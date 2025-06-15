package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToUploadFileInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement uploadFile = driver.findElement(By.cssSelector("input#uploadfile"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", uploadFile);
		Thread.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\Prathamesh\\OneDrive\\Desktop\\Documents\\4th year marksheet.pdf");
		
		
	}

}
