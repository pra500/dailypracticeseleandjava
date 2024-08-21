package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewyyyyyyyyyyyyyyyyyTest {

	WebDriver driver;

	@Test
	public void fTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(list.size());
	}
	
	

	@Test
	public void fllltTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");

		List<WebElement> list = driver.findElements(By.tagName("img"));

		System.out.println(list.size());
	}
	

	@Test
	public void jftTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");

		List<WebElement> list = driver.findElements(By.tagName("src"));

		System.out.println(list.size());
	}
}
