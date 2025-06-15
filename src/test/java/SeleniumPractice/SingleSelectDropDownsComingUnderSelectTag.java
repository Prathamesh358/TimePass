package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDownsComingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement singleSelectDrop = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select sel = new Select(singleSelectDrop);

//		sel.deselectAll();  

		List<WebElement> l1 = sel.getAllSelectedOptions();
		for (WebElement list : l1) {
			System.out.println(list.getText());
		}

		System.out.println("########################################");
		List<WebElement> l2 = sel.getOptions();
		for (WebElement list : l2) {
			System.out.println(list.getText());
		}

		System.out.println("#####################################");
		WebElement sElement = sel.getFirstSelectedOption();
		System.out.println(sElement.getText());

		System.out.println("########################################");
		System.out.println("Mutiple dropdown = " + sel.isMultiple());

		System.out.println("##########################");
		sel.selectByContainsVisibleText("4");
		Thread.sleep(3000);

		sel.selectByIndex(2);
		Thread.sleep(3000);

		sel.selectByValue("ghi");
		Thread.sleep(3000);

		sel.selectByVisibleText("doc 3");

	}
}
