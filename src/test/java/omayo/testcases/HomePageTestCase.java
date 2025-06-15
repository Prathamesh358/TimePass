package omayo.testcases;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import omayo.pages.HomePage;

public class HomePageTestCase extends OmayoBaseTest {

	@Test
	public void verifyHomePage() {

		HomePage homePage = new HomePage(driver);
		assertFalse(homePage.getMaleRadioButton().isSelected(), "male button is Selected");
		assertFalse(homePage.getFemaleRadioButton().isSelected(), "female button is not selected");
	}

}
