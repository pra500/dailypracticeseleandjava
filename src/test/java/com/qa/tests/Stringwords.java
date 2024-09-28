package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stringwords 
{		
		
	
	public static void main(String[] args) {
				
		WebDriver driver;
			
		 driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.findElement(By.id("username")).sendkey
			
			
			//input[@id='username']
			
		
	}



}
