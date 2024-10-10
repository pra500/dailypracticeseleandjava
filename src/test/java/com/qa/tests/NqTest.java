package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class NqTest {
	
	
	// need to chk the code   
	
	

	/*
	 * 
	 * 
	 * 
	 * author: Pragti Gupta
	 * env:qa
	 * reviewers: Naveen sir
	 */
	WebDriver driver;

	@Test

	public void fTest() {

		System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();
	}

	@Test
	public void f1Test() {

		System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();

	}

	@Test
	public void f2Test() {

		System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();

	}

	@Test
	public void f3Test() {

		System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();

	}

	@Test
	public void f4Test() {

		System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();

	}

	@Test
	public void f5Test() {
		String st = driver.getWindowHandle();
		System.out.println(st);
	}

	@Test
	public void f6Test() {
		System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();
	}

	@Test
	public void f7Test() {
		System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();
	}

	
	//@Parameters("browser")
	@BeforeClass
	@Parameters("browser")
	public void beforeClass(String s) {

		if(s.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(s.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.geeksforgeeks.org/reverse-string-preserving-space-positions/");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
