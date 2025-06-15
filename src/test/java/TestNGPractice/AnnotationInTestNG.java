package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AnnotationInTestNG {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test.xml file");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	public void anyTestMethod() {
		System.out.println("Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test.xml file");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

}
