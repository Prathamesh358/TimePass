package SeleniumPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		List<WebElement> footerLinks = driver.findElements(By.xpath("//ul[@class='footer_links']//a"));

		System.out.println(footerLinks.size());

		Iterator<WebElement> itr1 = footerLinks.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next().getAttribute("href"));
		}

	}

}
