package TestNGPractice;

import org.testng.annotations.Test;

public class GroupingInTestNG {

	@Test(groups = { "smoke" })
	public void verfiyPageUrl() {
		System.out.println("Page url");
	}

	@Test(groups = { "sanity" })
	public void verifyPageTitle() {
		System.out.println(" Page Title");
	}

	@Test(groups = { "regression" })
	public void verifyPageSource() {
		System.out.println("Page Source");
	}

	@Test(groups = { "smoke", "regression" })
	public void verifyPageNumber() {
		System.out.println("Page Number");
	}

}
