package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BottomlineTest {

	WebDriver driver;
	
	/*

	@Test
	public void getNameTest() {

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("bottomline technologies inc", Keys.ENTER);

		// driver.findElement(By.xpath("//div[@class='pcTkSc']//span[text()='Bottomline
		// Technologies, Inc.']")).sendKeys(Keys.ENTER);

		// div[@class='pcTkSc']//span[text()='Bottomline Technologies, Inc.']

		// Keys.ENTER);

		// (//span[@class='LrzXr kno-fv wHYlTd z8gr9e'])[2]//a

		String ceo = driver.findElement(By.xpath("(//span[@class='LrzXr kno-fv wHYlTd z8gr9e'])[2]//a")).getText();

		System.out.println(ceo);
	}
	*/
	
	
	
	@Test(priority = 0)
	public void getName1Test() {
		
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isDisplayed();
		
	}
	

	@Test(priority = 1)
	public void getName2Test() {
		
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isDisplayed();
		
	};

	@Test(priority = 2)
	public void getName3Test() {
		
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isDisplayed();
		
	}
	
	
	
	

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
