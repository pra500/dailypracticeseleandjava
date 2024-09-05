package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class New446Test {
	

	WebDriver driver;

	@Test(priority = 0)
	public void fTest() {
		System.out.println(driver.getTitle());
		
	}

	@Test(priority = 1)
	public void f1Test() {
		
		System.out.println(driver.getCurrentUrl());
		//driver.getCurrentUrl()

	}

	@Test(priority = 2)
	public void f2Test() {
	System.out.println(driver.getPageSource());

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
