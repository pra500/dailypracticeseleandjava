package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class DevdukesTest {

	WebDriver driver;

	@Test(priority = 0)
	public void logoTest() {

		boolean b = driver.findElement(By.xpath("//img[@alt='DevDukes logo']")).isDisplayed();
		Assert.assertTrue(b);

	}

	@Test(priority = 1)
	public void titleTest() {

		String title = driver.getTitle();

		Assert.assertEquals(title, "DevDukes Technologies | Bangalore");

	}

	@Test(priority = 2)
	public void getstartedbtnTest() {

		//boolean b = driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).isDisplayed();
		
		boolean b = driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).isDisplayed();
		Assert.assertTrue(b);

	}
	
	@Test(priority = 2)
	public void getstartedbtn2Test() {

		//boolean b = driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).isDisplayed();
		
		boolean b = driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).isDisplayed();
		Assert.assertTrue(b);

	}
	
	

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://www.devdukes.com/");
	}

	@AfterMethod
	public void teardown() {

		driver.close();

	}

}
