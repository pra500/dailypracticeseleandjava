package parallelexecutionandcrossbrowsertesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class parallelTest {
	
	
	
	
	
	
	//plz refer "testngforparallel.xml" for execution

	
	WebDriver driver;
	

  
  
  @Test
  public void titleChromeTest() {
	  
	  
	  
	            driver=new ChromeDriver();	 
	            driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://naveenautomationlabs.com/opencart/");
				
				 String url=driver.getCurrentUrl();
				  Assert.assertEquals(url,  "https://naveenautomationlabs.com/opencart/");
				  
				  
			  }
  
  
  
  
  @Test
  public void urlfirefoxTest() {
	  
	  
	  
	            driver=new FirefoxDriver();
	            driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://naveenautomationlabs.com/opencart/");
				
				
				 String title=driver.getTitle();
				  Assert.assertEquals(title,  "Your Store");
			  }
  
  
  
  @Test
  public void elementedgeTest() {
	  
	  
	  
	            driver=new EdgeDriver();
	            driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://naveenautomationlabs.com/opencart/");
				
				
				boolean b=driver.findElement(By.xpath("//a[normalize-space()='Phones & PDAs']")).isDisplayed();			
				Assert.assertEquals(b,  true);
			  }
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
