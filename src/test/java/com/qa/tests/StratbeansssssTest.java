package com.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StratbeansssssTest {
	
	

	WebDriver driver;
	
	

	@Test
	public void fTest() throws IOException {

		List<WebElement> list = driver.findElements(By.xpath("//img"));
		System.out.println(list.size());

		for (int i = 0; i <= list.size() - 1; i++) {

			WebElement wb = list.get(i);
			String s = wb.getAttribute("src");
			getbroken(s);

		}

	}

	
	
	
	
	public static void getbroken(String ss) throws IOException {

		URL url = new URL(ss);

		HttpURLConnection h = (HttpURLConnection) url.openConnection();
		h.connect();
		int code = h.getResponseCode();

		if (code == 200) {

			System.out.println("not broken");

		} else {

			System.out.println("broken");
		}

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}
}
