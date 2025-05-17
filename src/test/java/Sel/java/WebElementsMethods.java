package Sel.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement txtArea = driver.findElement(By.cssSelector("textarea#ta1"));
//		txtArea.sendKeys("Welcome to Prathamesh stack");
//		Thread.sleep(3000);
//		txtArea.clear();
//		Thread.sleep(3000);

		String getAt = txtArea.getAttribute("id");
		System.out.println(getAt);

		String prop = txtArea.getDomProperty("cols");
		System.out.println(prop);

		WebElement dropDownButton = driver.findElement(By.cssSelector("button.dropbtn"));
		String clrOFDropDwonBtn = dropDownButton.getCssValue("background-color");
		System.out.println(clrOFDropDwonBtn);

		System.out.println("#################################################");
		Rectangle ract = dropDownButton.getRect();
		System.out.println(ract.getHeight());
		System.out.println(ract.getWidth());
		System.out.println(ract.getX());
		System.out.println(ract.getY());

		System.out.println("####################################################");
		Point dropDownButtone = dropDownButton.getLocation();
		System.out.println(dropDownButtone.getX());
		System.out.println(dropDownButtone.getY());

		System.out.println("###############################################");
		Dimension dd = dropDownButton.getSize();
		System.out.println(dd.getHeight());
		System.out.println(dd.getWidth());

		System.out.println("################################################");
		WebElement textArea = driver.findElement(By.cssSelector("textarea[cols = '30']"));
		System.out.println(textArea.getText());

		System.out.println("##################################");
		WebElement hiddenText = driver.findElement(By.cssSelector("div#delayedText"));
		System.out.println(hiddenText.isDisplayed());
		System.out.println(hiddenText.getCssValue("visibility"));

		Thread.sleep(10000);
		System.out.println(hiddenText.isDisplayed());
		System.out.println(hiddenText.getCssValue("visibility"));

		System.out.println("#######################################");
		WebElement disabledButton = driver.findElement(By.cssSelector("#but1"));
		System.out.println(disabledButton.isEnabled());

		System.out.println("#############################################");
		WebElement disabledTxtArea = driver.findElement(By.cssSelector("#tb2"));
		System.out.println(disabledTxtArea.isEnabled());
		// disabledTxtArea.sendKeys("Hello"); // It will through an error called ElementNotIntereactableException

		System.out.println("##############################################");
		System.out.println(driver.findElement(By.xpath("//input[@value='Bike']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected());

		System.out.println(driver.findElement(By.xpath("//input[@value='Pen']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='Book']")).isSelected());

	}

}
