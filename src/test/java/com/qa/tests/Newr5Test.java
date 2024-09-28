package com.qa.tests;

import org.testng.annotations.Test;
import java.util.*;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Newr5Test {

	WebDriver driver;

	@Test
	public void fTest() {

		System.out.println(driver.getPageSource());
		// driver.getPageSource();

	}

	@Test
	public void fooTest() {
		List<WebElement> list = driver.findElements(By.xpath("//input"));
		System.out.println(list.size());

	}

	@Test
	public void fooooTest() {

		List<WebElement> list = driver.findElements(By.xpath("//img"));
		System.out.println(list.size());

	}
	

	@Test
	public void foooo000Test() {

		List<WebElement> list = driver.findElements(By.xpath("//img"));
		System.out.println(list.size());

	}
	

	@Test
	public void f555t7Test() {

		List<WebElement> list = driver.findElements(By.xpath("//img"));
		System.out.println(list.size());

	}

	@Test
	public void f5oTest() {

		List<WebElement> list = driver.findElements(By.xpath("//img"));
		System.out.println(list.size());

	}
	

	@Test
	public void f0Test() {

		List<WebElement> list = driver.findElements(By.xpath("//img"));
		System.out.println(list.size());

	}

	@BeforeClass
	public void beforeClass() {

		ChromeOptions co = new ChromeOptions();
		
		
		//co.addArguments("incognito");
		co.addArguments("start-maximized");				
		//co.addArguments("headless");		
		//co.addArguments("disable-infobars");		
		co.addArguments("disable-notifications");
		
				

		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}

}
