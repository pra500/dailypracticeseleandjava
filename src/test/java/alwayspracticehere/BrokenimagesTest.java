package alwayspracticehere;

import org.testng.annotations.Test;

import java.util.*;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrokenimagesTest {
	WebDriver driver;
	
	
	  /*
	  public void brokenlinksTest() throws IOException {
		  
		List<WebElement>list=driver.findElements(By.tagName("img"));	
	    System.out.println(list.size());
	    
	    for(int i=0;i<=list.size()-1;i++)
	    {
	    	WebElement wb=list.get(i);
	    	String s=wb.getAttribute("src");
	    	broke(s);
	    	
	    	
	    }
		  
		  
	  }
	  
	  
	  
	  public void broke(String url) throws IOException
	  {
		  
		  URL uu=new URL(url);
		  HttpURLConnection h=(HttpURLConnection)uu.openConnection();
		  h.setConnectTimeout(3000);
		  h.connect();
		  int responsecode=h.getResponseCode();
		  
		  if(h.getResponseCode()==200)
	      {
	          System.out.println("image is not broken");
	       }
		  else   
	      {
			  System.out.println("image is broken");
	       }   
	  }
	  
	  
	  */
	
	
	  
	  @Test
	  public void geTest()
	  {		  
		  
		  driver.findElement(By.xpath("//button[@id='openwindow']")).click();
          
		  Set<String>set1=driver.getWindowHandles();
		
		
		  Iterator<String>itr=set1.iterator();
		
               String p=itr.next();
               String c=itr.next();
               
               
               driver.switchTo().window(c);
               
               
               System.out.println(driver.getTitle());
             // driver.getTitle();
               
             
          
               
               
           	
               
		  
	  }
	  
	  

	
	  
	  @Test
	  public void pTest()
	  {
		  
		  System.out.println( driver.getPageSource());
		
		  
		  
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  
		  
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//driver.get("https://toolsqa.com/selenium-webdriver/dropdown-in-selenium/");
			
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	  }

	  @AfterClass
	  public void afterClass() {
		  
		  driver.close();
		  
	  }

}
