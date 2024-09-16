package com.qa.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookiesssuuu77Test {

	WebDriver driver;

	@Test
	public void fTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		Set<Cookie> set1 = driver.manage().getCookies();

//	System.out.println(set1.size());
//	
//	for(Cookie cc:set1)
//	{
//		System.out.println(cc.getName() + ":" +cc.getValue());
//		//cc.getName() + ":" +cc.getValue()
//	}

		Cookie c1 = new Cookie("prag", "pi67123");

		driver.manage().addCookie(c1);

		driver.manage().getCookieNamed("ak_bmsc");

		System.out.println(set1.size());

		for (Cookie cc : set1) {
			System.out.println(cc.getName() + ":" + cc.getValue());
			// cc.getName() + ":" +cc.getValue()
		}

		Cookie cv = driver.manage().getCookieNamed("ak_bmsc");

		System.out.println(cv);
		
		driver.close();
	}
}
