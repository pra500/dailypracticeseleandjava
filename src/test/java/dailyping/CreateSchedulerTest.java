package dailyping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CreateSchedulerTest {
		

	WebDriver driver;
	
	
	
	 @Test(priority = 0)
	  public void gettitleandurlTest() {
		  
		 System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	 }
	 
	 
	 
	
  @Test(priority = 1)
  public void getallbrokenlinksTest() {
	  
	 System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println("Total links are "+links.size());
	
	for(int i=0;i<links.size();i++)
	{
		
		WebElement ele= links.get(i);
		
		String url=ele.getAttribute("href");
		
		verifyLinkActive(url);
		
	}
	
  }
  
  
  public static void verifyLinkActive(String linkUrl)
	{
      try 
      {
         URL url = new URL(linkUrl);
         
         HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
         
         httpURLConnect.setConnectTimeout(3000);
         
         httpURLConnect.connect();
         
         if(httpURLConnect.getResponseCode()==200)
         {
             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
          }
        if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
         {
             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
          }
      } catch (Exception e) {
         
      }
  } 
  
	
  	 
  @BeforeClass
  public void beforeClass() {  
	  
 
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://app.dailyping.xyz/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  
  //**************

}
