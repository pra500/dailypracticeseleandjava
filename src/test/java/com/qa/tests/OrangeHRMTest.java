package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRMTest {

	/*
	 * 
	 * 
	 * @author Pragti
	 * 
	 * @functionality login for demo
	 * 
	 * @date 4/12/24
	 */

	WebDriver driver;

	@Test
	public void geturlTest() {
		
		driver.getTitle();
		

	}

	@Test
	public void gettitleTest() {

	}

	@Test
	public void getdemoTest() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();

		driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("Rupa");

		driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']")).sendKeys("8909000066");

		driver.findElement(By.xpath("//input[@id='Form_getForm_Email']")).sendKeys("py688@gmail.com");

		driver.findElement(By.xpath("//input[@id='Form_getForm_CompanyName']")).sendKeys("tcs");

		WebElement wb = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));

		Select sel = new Select(wb);

		sel.selectByVisibleText("India");

		WebElement wb1 = driver.findElement(By.xpath("//select[@id='Form_getForm_NoOfEmployees']"));

		Select sel1 = new Select(wb1);

		sel1.selectByIndex(3);

		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();

		driver.findElement(By.xpath("//input[@id='Form_getForm_action_submitForm']")).click();

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
