package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetAttributeTest {
	
	WebDriver driver;
	
<<<<<<< HEAD:src/test/java/com/qa/tests/GetAttributeTest.java
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  //dropdown-toggle
	  String s=driver.findElement(By.xpath("//a[text()='Components']")).getAttribute("class");
		System.out.println(s);	  
  }
=======

	@Test
	  public void fooooTest() {
		 
		
		List<WebElement> list=
		
		driver.findElements(By.cssSelector("a.hfe-menu-item"));
		
		
		System.out.println(list.size());
		

		
for(int i=0;i<=list.size()-1;i++)
{
	
	
	System.out.println(list.get(i).getText());
	
	//list.get(i).getText();)
}
		
		  
	  }
	  
	

	@Test
	  public void foTest() {
		  
		
		  
	  }
	  
	

	@Test
	  public void fdffvfdvmTest() {
		  
		
		  
	  }
	  
	
>>>>>>> 9970ed8 (dddddddd):src/test/java/alwayspracticehere/BTest.java
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	
	  
	     
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
<<<<<<< HEAD:src/test/java/com/qa/tests/GetAttributeTest.java
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
=======
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/");
>>>>>>> 9970ed8 (dddddddd):src/test/java/alwayspracticehere/BTest.java
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
<<<<<<< HEAD:src/test/java/com/qa/tests/GetAttributeTest.java
  }
=======
	  
  }	
  
  
  
  
 
>>>>>>> 9970ed8 (dddddddd):src/test/java/alwayspracticehere/BTest.java
}
