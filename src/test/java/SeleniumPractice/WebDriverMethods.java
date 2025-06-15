package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://ww.google.com");

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		String driverr = driver.getTitle();
		System.out.println(driverr);

		System.out.println(driver.getCurrentUrl());

		System.out.println("############################################");
//		Thread.sleep(3000);
//		String src = driver.getPageSource();
//		System.out.println(src);
		
		

		

	}

}
