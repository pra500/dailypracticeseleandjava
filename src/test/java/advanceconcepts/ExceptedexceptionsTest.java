package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ExceptedexceptionsTest {
	
	//u can  give one /more exceptions, can give any selenium/java exception
	
		
	
	//we don't use it in real time, only for interview, dev use it
	
	//qafox:  https://www.youtube.com/watch?v=PMWxcV3QdgQ
	
	
	
	WebDriver driver;
	
  //@Test(expectedExceptions = NoSuchElementException.class)
  public void fTest() {
	  
	//boolean b=  driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
	boolean flag=  driver.findElement(By.xpath("//a[normalize-space()='Practices']")).isDisplayed();
	System.out.println(flag);
	  
	  
	
	boolean flag1=driver.findElement(By.xpath("//input[@id='username11']")).isDisplayed();
	System.out.println(flag1);

  }
  
  
	
  @Test(expectedExceptions = {NoSuchElementException.class, StaleElementReferenceException.class})
		  
		  public void fiTest() {
 
	  
	
	boolean flag=  driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle11']")).isDisplayed();
	System.out.println(flag);
	  
		  
	
  }
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.get("https://naveenautomationlabs.com/opencart/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
