package com.qa.tests;

import org.testng.annotations.Test;
import java.util.*;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class OpencattttTest {

	WebDriver driver;

	@Test
	public void fTest() {

		List<WebElement> list = driver.findElements(By.cssSelector("a.dropdown-toggle"));
		System.out.println(list.size());
		
		if(list.size()==5)
		{
			
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}

	}
	
	
	//@Test
	public void foTest() {

		driver.findElement(By.cssSelector("input[placeholder=Search]")).isDisplayed();
		

	}
	
	
	//@Test
	public void fllTest() {

		List<WebElement> list = driver.findElements(By.cssSelector("a.dropdown-toggle"));
		System.out.println(list.size());

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
	}

	@AfterClass
	public void afterClass() {

		driver.quit();

	}

}
