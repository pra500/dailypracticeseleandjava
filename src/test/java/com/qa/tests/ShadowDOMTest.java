	package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ShadowDOMTest {
	
	//it ll return javascript webele we ve to convert it into sele webele
	
	//#shadow-root starting
	
//naveen repo: https://github.com/naveenanimation20/ShadowDOMHandle/blob/master/src/main/java/ShadowDOMDemo.java
	
	
	//https://www.youtube.com/watch?v=Gqc8Rq3KdPM&ab_channel=NaveenAutomationLabs	
	 
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	    
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	//WebElement wb=(WebElement) js.executeScript("return document.querySelector("document.querySelector("downloads-manager").shadowRoot.querySelector("#toolbar").shadowRoot.querySelector("#toolbar").shadowRoot.querySelector("#search").shadowRoot.querySelector("#searchInput")");"
			
	  
	  
	  WebElement wb=(WebElement) js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm > input#searchInput')");

	   
	  
	String b = "arguments[0].setAttribute('value', 'naveen')";	
	
	((JavascriptExecutor)driver).executeScript(b,  wb);
	
	
	
	
	
  }
  
  @Test
  public void gTest()
  {
	  
	  driver.get("http://classic.crmpro.com/");
      
      JavascriptExecutor jse =  ((JavascriptExecutor)driver);
		
		String text = jse.executeScript("return $(\"div.navbar-collapse li:nth-of-type(2) a\").text();").toString();
		System.out.println(text);
	  
  }
  
  
  @Test
  public void giTest()
  {
	  
	  driver.get("http://classic.crmpro.com/");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  //js.executeScript("return document.querySelector("grammarly-desktop-integration").shadowRoot.querySelector("div")");
	  
	  
	  
	  //WebElement wb=(WebElement)  js.executeScript("return document.querySelector("grammarly-desktop-integration").shadowRoot.querySelector("div")");
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	   driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("chrome://downloads/");
		
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
	  
	  
  }

}
