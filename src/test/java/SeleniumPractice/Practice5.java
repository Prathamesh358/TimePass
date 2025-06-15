package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class Practice5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement dropDown1 = driver.findElement(By.cssSelector("#drop1"));
		Select select = new Select(dropDown1);
		System.out.println(select.isMultiple());

		select.selectByVisibleText("doc 1 ");
		Thread.sleep(2000);
		select.selectByContainsVisibleText("2");
		Thread.sleep(2000);
		select.selectByIndex(3);

		List<WebElement> optionElements = select.getOptions();
		for (WebElement optionElement : optionElements) {
			System.out.println(optionElement.getText());

		}

		WebElement selectedOptionElement = select.getFirstSelectedOption();
		System.out.println(selectedOptionElement.getText());

		driver.close();

	}

}
