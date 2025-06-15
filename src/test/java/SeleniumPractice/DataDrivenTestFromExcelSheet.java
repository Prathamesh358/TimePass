package SeleniumPractice;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class DataDrivenTestFromExcelSheet {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get(Utility.readProperty("newtourtravelurl"));
		driver.manage().window().maximize();

		Map<Integer, List<Object>> excelList = Utility.readExcelFile("userdetails");

		List<Object> rowData = excelList.get(1);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(String.valueOf(rowData.get(0)));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(String.valueOf(rowData.get(1)));
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(rowData.get(2)));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(String.valueOf(rowData.get(3)));

		Utility.selectDropDownValue(driver.findElement(By.xpath("//select[@name='country']")), "INDIA");

	}

}
