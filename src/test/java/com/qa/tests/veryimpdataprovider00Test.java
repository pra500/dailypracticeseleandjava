package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class veryimpdataprovider00Test {
	
	
	
	
	//need to prepare notes:
	
	
	

	WebDriver driver;

	@Test(dataProvider = "tesss")
	public void fTest(String s, String ss) {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ss);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	@Test(dataProvider = "tesss")
	public void fjTest(String s, String ss) {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ss);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	@Test(dataProvider = "tesss")
	public void fjmTest(String s, String ss) {

		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ss);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	@Test(dataProvider = "tesss")
	public void opmTest(String s, String ss) {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ss);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	//@Test(dataProvider = "tesss")	
	@Test(dataProvider = "tesss1")
	public void fyyTest(String s, String ss) {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ss);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	//@Test(dataProvider = "tesss")
	@Test(dataProvider = "tesss1")
	public void opTest(String s, String ss) {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ss);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@DataProvider(name = "tesss")
	public Object[][] mii() {

		Object[][] arr = new Object[2][2];
		arr[0][0] = "pra";
		arr[0][1] = "pra1@12344";
		arr[1][0] = "prachi";
		arr[1][1] = "prachi@123";

		return arr;

	}
	

	
	
	@DataProvider(name = "tesss1")
	public Object[][] miij() {

		Object[][] arr = new Object[2][2];
		arr[0][0] = "subha";
		arr[0][1] = "subha@12344";
		arr[1][0] = "prateek";
		arr[1][1] = "prateek@12345";

		return arr;

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
