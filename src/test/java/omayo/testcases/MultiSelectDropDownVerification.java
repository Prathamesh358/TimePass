package omayo.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayo.pages.HomePage;

public class MultiSelectDropDownVerification extends OmayoBaseTest {

	HomePage homePage;
	SoftAssert verify;
	Select select;

	@Test
	public void multiSelectVerification() {
		homePage = new HomePage(driver);
		verify = new SoftAssert();

		select = new Select(homePage.getMultiSelectDropDown());
		verify.assertTrue(select.isMultiple(), "It is not an multi select DropDown");

		List<String> expectedList = Arrays.asList("Volvo", "Swift", "Hyundai", "Audi");

		ArrayList<String> actualList = new ArrayList<>();
		
		for (WebElement element : select.getOptions()) {
			actualList.add(element.getText());
		}

		verify.assertEquals(actualList, expectedList);

		verify.assertAll();

	}

}
