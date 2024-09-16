package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PaginationTest {
	
	WebDriver driver;
	
	
	
	
 // @Test
  public void fTest() {
	  
	  while (true) {
		    // Get all the page numbers
		    List<WebElement> pages = driver.findElements(By.cssSelector(".pagination li a"));

		    for (WebElement page : pages) {
		        System.out.println("Clicking page number: " + page.getText());
		        page.click();

		        // Extract data on this page
		        List<WebElement> items = driver.findElements(By.className("item-class")); // Adjust the locator
		        for (WebElement item : items) {
		            System.out.println(item.getText());
		        }
		    }

		    // Check if the "Next" button exists
		    try {
		        WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
		        if (!nextButton.isEnabled()) {
		            break;  // If Next is disabled, we are done
		        }
		        nextButton.click();
		    } catch (Exception e) {
		        break;  // No "Next" button means last page
		    }
		}

  }
  
  
  
  
  
	
 //@Test
  public void fyTest() {
	  
	  while (true) {
		    // Get all the page numbers
		    List<WebElement> pages = driver.findElements(By.xpath("(//nav[@id='pagination'])[1]"));

//		    for (WebElement page : pages) {
//		        System.out.println("Clicking page number: " + page.getText());
//		        page.click();
		        
		      
		        int p=pages.size();
		        for(int i=0;i<=p-1;i++)
		        {
		        	if(pages.get(i).getText().equalsIgnoreCase("2"))
		        	{
		        	pages.get(i).click();
		        	break;
		        	}
		        }
		        				
		        				
		        				
		        				
		        /*
		        // Extract data on this page
		        List<WebElement> items = driver.findElements(By.className("item-class")); // Adjust the locator
		        for (WebElement item : items) {
		            System.out.println(item.getText());
		        }
		    }

		    // Check if the "Next" button exists
		    try {
		        WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
		        if (!nextButton.isEnabled()) {
		            break;  // If Next is disabled, we are done
		        }
		        nextButton.click();
		    } catch (Exception e) {
		        break;  // No "Next" button means last page
		    }
		    
		    */
		        
		        
		        
		        
		    }

	  }        
  
  
  
  

  
@Test
public void fyrTest() throws InterruptedException {

//Ecommerce Test Site to Learn Web Scraping &#8211; Page 2 &#8211; ScrapingCourse.com
	
	
	  List<WebElement> pages = driver.findElements(By.xpath("(//nav[@id='pagination'])[1]"));


			      
			        int p=pages.size();
			        for(int i=0;i<=p-1;i++)
			        {
			        	if(pages.get(i).getText().equalsIgnoreCase("2"))
			        	{
			        		
			        	pages.get(i).click();
			        	Thread.sleep(16000);
			        	
			        
			        	break;
			        	}
			        }    
			        			       				
			      
  
}
  
  
  
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.scrapingcourse.com/ecommerce/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
