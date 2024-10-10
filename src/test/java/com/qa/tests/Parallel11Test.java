package com.qa.tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Parallel11Test {

	WebDriver driver;

	// @Test
	public void fTest() {

		WebElement wb = driver.findElement(By.xpath("//button[@type='submit']"));

		Actions act = new Actions(driver);

		act.sendKeys(wb, Keys.CONTROL, Keys.ALT, "s");

	}

	@Step("existence chk")
	@Description("existence verifying")
	@Severity(SeverityLevel.CRITICAL)
	@Test(enabled = true)
	public void fiTest() {

		boolean b = driver.findElement(By.xpath("//a[text()='Tools']")).isDisplayed();

		System.out.println(b);

		System.out.println("thread id is "+Thread.currentThread().getId());

	}

	@Step("username chk")
	@Description("username verifying")
	@Severity(SeverityLevel.BLOCKER)
	@Test(enabled = true)
	public void fttTest() {

		boolean b = driver.findElement(By.cssSelector("#username")).isDisplayed();

		System.out.println(b);
		System.out.println("thread id is "+Thread.currentThread().getId());

	}

	@Step("username chk")
	@Description("username verifying")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void futtyTest() {

		boolean b = driver.findElement(By.cssSelector("#password")).isDisplayed();
		System.out.println(b);

		System.out.println("thread id is "+Thread.currentThread().getId());
	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
