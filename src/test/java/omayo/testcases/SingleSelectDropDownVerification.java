package omayo.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayo.pages.HomePage;

public class SingleSelectDropDownVerification extends OmayoBaseTest {

	HomePage homePage;
	SoftAssert verify;
	Select select;

	@Test
	public void SingleSelctDropDown() {

		verify = new SoftAssert();
		homePage = new HomePage(driver);
		select = new Select(homePage.getSingleSelectDropdownElement());

		verify.assertFalse(select.isMultiple(), "It is Not an multiple Select Dropdown");

		List<String> expectedList = Arrays.asList("Older Newsletters", "doc 1", "doc 2", "doc 3", "doc 4");

		ArrayList<String> actualList = new ArrayList<>();

		for (WebElement element : select.getOptions()) {

			actualList.add(element.getText());
		}

		verify.assertEquals(actualList, expectedList);

		verify.assertAll();

	}

}
