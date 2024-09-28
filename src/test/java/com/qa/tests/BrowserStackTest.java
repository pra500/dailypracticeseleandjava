package com.qa.tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BrowserStackTest {

	WebDriver driver;

	/*
	 * 
	 * 
	 * @author: Pragti Gupta
	 */
	@Step("for getting url")
	@Description("url")
	@Test
	public void titleTest() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	
	@Step("for getting title")
	@Description("title")
	@Test
	public void title1Test() {

		boolean b = driver.findElement(By.xpath("//button[@id='products-dd-toggle']")).isDisplayed();
		System.out.println(b);

	}

	
	
	@Step("Accessibility Testing")
	@Description("forAccessibility Testing")
	@Test
	public void title3Test() {

		boolean b = driver.findElement(By.xpath(
				"//div[@class=' bstack-mm-sub-nav-tabcol']//div//span[@class='item-text'][normalize-space()='Accessibility Testing']"))
				.isDisplayed();

		System.out.println(b);

	}

	
	@Step("verify logo")
	@Description("verifying the logo")
	@Test
	public void title4Test() {

		boolean b = driver.findElement(By.xpath("(//img[@alt='BrowserStack Logo'])[1]")).isDisplayed();
		Assert.assertTrue(b);

	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
