package onlyfailedtcexecute;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class New1Test {

	

	@Test
	public void ffTest() {

		Assert.assertTrue(true);

	}

	@Test
	public void fTest() {

		Assert.assertTrue(false);

	}

	@Test
	public void f0Test() {

		Assert.assertTrue(false);

	}

	@Test
	public void fkTest() {

		
		Assert.assertEquals(5, 5);
	}

	@Test
	public void f8Test() {

		Assert.assertEquals(5, 8);

	}

	@Test
	public void fkkllTest() {

		Assert.assertEquals(5, 8);

	}
	
	//4 fail, 2 pass

}
