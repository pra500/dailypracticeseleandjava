package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google22Test {

	WebDriver driver;

	@Test
	public void fTest() {

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("c++", Keys.ENTER);

	}

	@Test
	public void yatraTest() {

		driver.get("https://www.yatra.com/");

		System.out.println(driver.getTitle());
		// driver.getTitle().contains("cheap")

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
