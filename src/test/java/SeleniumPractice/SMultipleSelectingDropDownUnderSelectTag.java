package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SMultipleSelectingDropDownUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropDown = driver.findElement(By.xpath("//select[@id=\"multiselect1\"]"));
		Select sel = new Select(dropDown);

		Thread.sleep(3000);
		sel.selectByContainsVisibleText("vo");
		Thread.sleep(3000);
		sel.selectByIndex(2);

		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		for (WebElement list : allSelectedOptions) {
			System.out.println(list.getText());
		}

		System.out.println("###########################################");
		WebElement firstSelected = sel.getFirstSelectedOption();
		System.out.println(firstSelected.getText());

		System.out.println("#####################################");
		List<WebElement> allOptions = sel.getOptions();
		for (WebElement list : allOptions) {
			System.out.println(list.getText());
		}

		System.out.println("###################################");
		System.out.println(sel.isMultiple());

		Thread.sleep(3000);
		sel.deselectAll();

	}

}
