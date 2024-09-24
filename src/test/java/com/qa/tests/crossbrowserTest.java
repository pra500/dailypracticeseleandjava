package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowserTest {

	WebDriver driver;

	@Test
	public void f1Test() {

		boolean b = driver.getPageSource().contains("visibility");

		System.out.println(b);
	}

	@Test
	public void f2Test() {
		boolean b = driver.getPageSource().contains("value");

		System.out.println(b);

	}

	@Test
	public void f3Test() {

		List<WebElement> list = driver.findElements(By.tagName("img"));
		System.out.println(list.size());
	}

	@Test
	public void f4Test() {

		String s = driver.getWindowHandle();
		System.out.println(s);

	}

	@Test
	public void f5Test() {

		boolean b = driver.getTitle().contains("Page");
		System.out.println(b);
	}

	@Test
	public void f6Test() {

		boolean b = driver.getCurrentUrl().contains("Automation");
		System.out.println(b);

	}

	@Test
	public void f7Test() {

		String title = driver.getTitle();

		Assert.assertEquals(title, "Practice Page");
	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}
}
