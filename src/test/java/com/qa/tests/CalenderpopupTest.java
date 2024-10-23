package com.qa.tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import java.util.*;

public class CalenderpopupTest {

	WebDriver driver;

	@Test(priority = 0)
	public void f33Test() {

		boolean b = driver.findElement(By.xpath("//li[@id='menu-item-53896']//a[normalize-space()='About']"))
				.isDisplayed();

		System.out.println(b);

	}

	@Test(priority = 1)
	public void f77Test() {
		boolean b = driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']"))
				.isDisplayed();

		System.out.println(b);

	}

	@Step("select class")
	@Description("check select classss")

	@Test(priority = 2)
	public void f5Test() {

		WebElement wb = driver.findElement(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select sel = new Select(wb);
		boolean b = sel.isMultiple();

		System.out.println(b);

	}

	@Step("select class size")
	@Description("check the size")

	@Test(priority = 3)
	public void f909Test() {

		List<WebElement> list = driver.findElements(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));

		System.out.println(list.size());

	}

	@Test(priority = 4)
	public void f9Test() {

		List<WebElement> list = driver.findElements(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));

		System.out.println(list.size());

		for (int i = 0; i <= list.size() - 1; i++) {

			System.out.println(list.get(i).getText());

		}

	}

	@Test(priority = 5)
	public void f00Test() {

		WebElement wb = driver.findElement(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));

		Select sel = new Select(wb);

		sel.selectByVisibleText("Angola");

	}

	@Test(priority = 6)
	public void fTest() {

		WebElement wb = driver.findElement(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));

		Select sel = new Select(wb);

		sel.selectByVisibleText("Aruba");		

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

		driver.quit();
	}

}
