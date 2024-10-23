package screenshotinallurefailed11111111;

import org.testng.annotations.Test;

import io.qameta.allure.AllureResultsWriter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

@Listeners(AllureTestListener.class)
public class NewTest extends AllureTestListener{
	
	/*
	
	NewTest(WebDriver driver) {
		super(driver);
		
	}


	WebDriver driver;
	
	
	
  @Test
  public void fiTest() {
	  
	  
	  
	String url=driver.getCurrentUrl();	
	  Assert.assertEquals(url,  "https://rahulshettyacademy.com/AutomationPractice/");
	  
	 }
  
	
	
  @Test
  public void fiiTest() {
	  
	  
	  
	boolean b=  driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']")).isDisplayed();
	Assert.assertEquals(b, false);
	
	  
	  
	 }
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 
  }
  

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
  }
*/
	
}
