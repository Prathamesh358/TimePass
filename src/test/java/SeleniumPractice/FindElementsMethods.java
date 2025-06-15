package SeleniumPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethods {

//	1. FindElements is used to return list<webElements> of all matching elements.
//	2. if no such elements are found they it will return empty list.

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type=\"radio\"]"));

		System.out.println("Number of radio buttons :" + radioButtons.size());

		Iterator<WebElement> it = radioButtons.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getAttribute("value"));
		}

	}

}
