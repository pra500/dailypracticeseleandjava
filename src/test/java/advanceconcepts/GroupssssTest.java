package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class GroupssssTest {

	@Test(groups = { "sanity" })
	public void fTest() {

		System.out.println("hello");
	}

	@Test(groups = { "smoke" })
	public void fuTest() {

		System.out.println("hello1");

	}

	@Test(groups = { "regression" })
	public void fuuTest() {

		System.out.println("hello2");
	}

	@Test(groups = { "smoke" })
	public void ftttTest() {

		System.out.println("welcome1");
	}
	
	
	@Test(groups = { "sanity" })
	public void f44Test() {

		System.out.println("hello5");
	}
	
	@Test(groups = { "sanity" })
	public void f55Test() {

		System.out.println("hello6");
	}
	
	@Test(groups = { "sanity" })
	public void f66Test() {

		System.out.println("hello7");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("beforeee");

	}

	@AfterTest
	public void afterTest() {

		System.out.println("afterrrr");
	}
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
