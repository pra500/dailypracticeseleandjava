package com.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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

	@Test(priority = 2)
	public void brokenlinksTest() throws IOException {

		try {

			List<WebElement> list = driver.findElements(By.tagName("a"));
			System.out.println(list.size());

			for (int i = 0; i <= list.size() - 1; i++) {
				WebElement wb = list.get(i);
				String s = wb.getAttribute("href");
				broke(s);

			}

		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void broke(String url) throws IOException {

		try {
			URL uu = new URL(url);
			HttpURLConnection h = (HttpURLConnection) uu.openConnection();
			h.setConnectTimeout(3000);
			h.connect();
			int responsecode = h.getResponseCode();

			if (h.getResponseCode() == 200) {
				System.out.println(url + " - " + h.getResponseMessage());
			} else {
				System.out.println(url + " - " + h.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void brokenimagesTest() throws IOException {
		try {

			List<WebElement> list = driver.findElements(By.tagName("img"));
			System.out.println(list.size());

			for (int i = 0; i <= list.size() - 1; i++) {
				WebElement wb = list.get(i);
				String s = wb.getAttribute("src");
				broke1(s);

			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void broke1(String url) throws IOException {

		try {
			URL uu = new URL(url);
			HttpURLConnection h = (HttpURLConnection) uu.openConnection();
			h.setConnectTimeout(3000);
			h.connect();
			int responsecode = h.getResponseCode();

			if (h.getResponseCode() == 200) {
				System.out.println(url + " - " + h.getResponseMessage());
			} else {
				System.out.println(url + " - " + h.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	  //@Test(priority = 0)
	  public void solutionsclickTest() {
		  
		  
		  
		  
	  }
	  

	@BeforeClass
	public void beforeClass() {
		
		
		/*
		 //incognito 
		 ChromeOptions co=new ChromeOptions();
		 co.addArguments("--incognito"); 
		 driver = new ChromeDriver(co);
		 */

		
		 
		 
		 /*
		 //headless 
		 ChromeOptions co1=new ChromeOptions();
		 co1.addArguments("--headless=new");
		 driver = new ChromeDriver(co1);
		 

		//ChromeOptions co = new ChromeOptions();
		co1.addArguments("disable-notification");
*/
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
