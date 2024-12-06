package com.qa.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StratbeansTest {

	// title validation
	// url validation
	// broken links
	// incognito
	// headless

	WebDriver driver;

	@Test(priority = 0)
	public void urlTest() {

		String url = driver.getCurrentUrl();

		Assert.assertEquals(url, "https://stratbeans.com/");

	}

	@Test(priority = 1)
	public void titleTest() {

		String title = driver.getTitle();

		Assert.assertEquals(title, "Stratbeans - AI Enabled LXP, Upskilling and LMS");

	}

	// @Test(priority = 2)
	public void brokenlinksTest() {
	 

	  
	  List<WebElement> list=driver.findElements(By.tagName("//a"));
	  
	  list.get
	  
	  for(int i=0;i<=list.size()-1;i++)
	  {
		  
		  
	  }
	  
	  
	  
  }

	@BeforeClass
	public void beforeClass(){
		/*
		 * //incognito ChromeOptions co=new ChromeOptions();
		 * co.addArguments("--incognito"); driver = new ChromeDriver(co);
		 */

		/*
		 * //headless ChromeOptions co1=new ChromeOptions();
		 * co.addArguments("--headless-"); driver = new ChromeDriver(co1);
		 */
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("disable-notification");
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stratbeans.com/");
		
		
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
	
		}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
