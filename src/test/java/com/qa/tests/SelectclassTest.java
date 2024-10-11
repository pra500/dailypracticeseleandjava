package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SelectclassTest {
	
	
	
	
	WebDriver driver;		
	
	
	@Test
	public void FTest() {
		
		driver.getCurrentUrl();
	}

	@Test
	public void F1Test() {
	}

	@Test
	public void FT2123est() {
	}

	@Test
	public void F1223Test() {
	}

	@Test
	public void F1234Test() {
		
		
	}
	
	

	@BeforeClass
	public void beforeClass() {
		
		   driver=new ChromeDriver();	  
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
			

	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}

}
