package Sel.java;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksFailureInOmagloWebsites {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
//		for(WebElement link2 : links) {
//			System.out.println(link2.getAttribute("href"));
//		}

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
		VerifyBrokenLinks(links);
	}

	public static void VerifyBrokenLinks(List<WebElement> links) {

		int count = 0;
		for (WebElement link1 : links) {
			String link = link1.getAttribute("href");

			if (link != null) {
				try {
					URL url = new URL(link);
					HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
					httpURLConnection.setConnectTimeout(3000);
					httpURLConnection.connect();

					if (httpURLConnection.getResponseCode() == 200) {
						System.out.println(link + " " + httpURLConnection.getResponseMessage());
					} else {
						count++;
						System.out.println(link + " " + " Link is broken");
					}
				} catch (Exception exception) {
					count++;
					System.out.println("Link is broken");
				}

			}

		}
		System.out.println("Number of broken links :" + count);

	}

}
