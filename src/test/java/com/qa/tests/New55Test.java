package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class New55Test {
	
	
	//need to check again

	WebDriver driver;

	@Test(priority = 0, groups = { "sanity" })
	public void getTest() {

		System.out.println(driver.getCurrentUrl());

	}

	@Test(priority = 1, dependsOnMethods = { "getTest" }, dependsOnGroups = { "sanity" })
	public void get1Test() {

		System.out.println(driver.getTitle());

	}

	@Test(priority = 2, dependsOnMethods = { "get1Test" })
	public void get2Test() {

		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}

	
	
	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
