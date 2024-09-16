package com.qa.tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.*;

public class Cookies222Test {
	
	
	WebDriver driver;	
	
	 @BeforeClass
	 public void setup() {
		 
		 driver=new ChromeDriver();	  
		    driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.redbus.in/");	  
		  
		 
	  }

  @Test
  public void getsssTest() {
	  
	  
	  
         Set<Cookie>set1=driver.manage().getCookies();
         
         System.out.println(set1.size());  //22
         
        
         /*System.out.println(set1.size());
         for(Cookie c:set1)
         {
        	 
        	 System.out.println(c.getName() + ":" +c.getValue());
        	 
         }*/      
                  
         /*
         
         Cookie cc=new Cookie("op", "po9033");       
       
         driver.manage().addCookie(cc);
         
         
         System.out.println(set1.size());
         for(Cookie c:set1)
         {
        	 
        	 System.out.println(c.getName() + ":" +c.getValue());
        	 
         }
         */
         
         
   // Cookie ccc=driver.manage().getCookieNamed("selectedCurrency");
         
     //System.out.println(ccc);    
     
     
     driver.manage().deleteAllCookies();
     
     Set<Cookie>set2=driver.manage().getCookies();
     
     System.out.println(set2.size());  //0
     
    
   
     
     
     
     
  // int y=  driver.manage().hashCode();
     
     //System.out.println(y);
    
     
  }
  
  
  

  
  
  @AfterClass
  public void teardown() {
	  
	  driver.close();
	  }

}
