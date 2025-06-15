package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		System.out.println("#########################################################3");
		List<WebElement> tableContent = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		for (WebElement element : tableContent) {
			System.out.println(element.getText());
		}

		System.out.println("####################################################");
		List<WebElement> ageCloumn = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
		for (WebElement element : ageCloumn) {
			System.out.println(element.getText());
		}

		System.out.println("#######################################################");
		List<WebElement> c1 = driver.findElements(
				By.xpath("//table[@id='table1']/tbody/tr/td[text() = 'Kishore' or text() = 'Bangalore']"));
		for (WebElement element : c1) {
			System.out.println(element.getText());
		}

		System.out.println("###########################################################");
		List<WebElement> praveensAge = driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr[3]/td[2]"));
		for (WebElement element : praveensAge) {
			System.out.println(element.getText());
		}

	}

}
