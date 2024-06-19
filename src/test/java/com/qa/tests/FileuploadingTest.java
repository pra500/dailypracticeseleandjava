package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FileuploadingTest {
	
	
	
	WebDriver driver;	
	
	
	
  //file upload:	
  //@Test
  public void fTest() {
	  
	 
	  
	  WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
	  uploadElement.sendKeys("C:\\Users\\Admin\\Documents\\imp1.txt");
	  
	  
	 
	  
  }
  
  //file download
  @Test
  public void fhhTest() {
	  
	 
	  
	  WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
	  uploadElement.sendKeys("C:\\Users\\Admin\\Documents\\imp1.txt");
	  
	  
	 
	  
  }
  
  
  
  
  
   //@Test
  public void fnTest() {
	  
	  	  
	  
	  WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
	  uploadElement.sendKeys("C:\\Users\\Admin\\Desktop\\imp33.txt");
	  
	  //these all are webelement methods: sendkeys(), click(), submit(), getlocation(), gettagname(), getattribute(), gettext() and others
	  
	  System.out.println(uploadElement.getTagName());
	  
	  
	  System.out.println(uploadElement.getLocation());
	  
	  
	  String data=uploadElement.getAttribute("id");
	  System.out.println(data);
	  
	  
	  
	  String data1=uploadElement.getAttribute("class");
	  System.out.println(data1);
	  
	  
	  
	  //if u gv non existing attribute
	  String data2=uploadElement.getAttribute("bthh");
	  System.out.println(data2);   //null
	  
	  
	  
	  
	//  input
	//  (251, 214)
	//  uploadfile_0
	//  upload_txt
	//  null
	
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/upload/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  
  
  
 


}
