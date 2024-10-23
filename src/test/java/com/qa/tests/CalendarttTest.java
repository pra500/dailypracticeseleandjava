package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CalendarttTest {

	WebDriver driver;

	@Test
	public void fTest() {
		boolean b = driver.findElement(By.xpath("//button[normalize-space()='Login']"))
				.isDisplayed();
		Assert.assertTrue(b);

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}

}
