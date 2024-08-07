package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;

public class RelativeLocatorsTest {
	
	
	
	//relative locators in selenium 4: above, below, toleftof, torightof, near
	
	
	
	
	
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {	
	  
	  /*
	  //above:	  
	  WebElement wb = driver.findElement(By.xpath("//button[@id='openwindow']"));
	  
	  WebElement wb1 =   driver.findElement(RelativeLocator.with(By.tagName("legend")).above(wb));
	  
      boolean b=wb1.isDisplayed();
      
      System.out.println(b);
      */
      
      
      /*
      //below:
      WebElement wb = driver.findElement(By.xpath("//legend[text()='Switch Window Example']"));
	  
	  WebElement wb1 =   driver.findElement(RelativeLocator.with(By.tagName("button")).below(wb));
	  
      boolean b=wb1.isDisplayed();
      
      System.out.println(b);
      */
      
      
 
	      
	      
	  /*
	  //toleftof:	    	  
      WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Practice']"));
	  
	  WebElement wb1 = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(wb));
	  
      boolean b=wb1.isDisplayed();
      
      System.out.println(b);
      */
	  
	  
	  /*
      //torightof:	  
      WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Practice']"));
	  
	  WebElement wb1 = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(wb));
	  
      boolean b=wb1.isDisplayed();
      
      System.out.println(b); 
      */
	  
	  
	  
      //near:	  
	  WebElement wb =   driver.findElement(By.xpath("//span[normalize-space()='Free Trial']"));
	  WebElement wb1 = driver.findElement(RelativeLocator.with(By.tagName("button")).near(wb));	  
      boolean b=wb1.isDisplayed();      
      System.out.println(b); 
	  
	  
	  
  }
  
  
  
   
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
		//for toleftof and torightof:
		//driver.get("https://practicetestautomation.com/practice-test-login/");	
		
		//for near:
		driver.get("https://www.browserstack.com/guide/relative-locators-in-selenium");
		
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
