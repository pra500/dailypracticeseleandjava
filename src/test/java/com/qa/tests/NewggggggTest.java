package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewggggggTest {

	public static WebDriver driver;

	@Test
	public void fTest() {

		boolean b = driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']")).isDisplayed();
		Assert.assertTrue(b);
		
		get();

	}
	
	public static void get()
	{
		System.out.println(driver.getCurrentUrl());
	}

	@BeforeClass
	public void beforeClass() {

		driver.get("https://naveenautomationlabs.com/opencart/");
	}

	@AfterClass
	public void afterClass() {

		System.out.println(driver.getTitle());

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
