package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewhweTest {
	
	
	WebDriver driver;
	
	

  @Test
  public void fTest() {
	  
	boolean b=  driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
   Assert.assertTrue(b);
  }
  
  

  @Test
  public void fjkTest() {
	  
	boolean b=  driver.findElement(By.xpath("//a[normalize-space()='Courses']")).isDisplayed();
   Assert.assertTrue(b);
  }
  


  @Test
  public void fuuTest() {
	  
	boolean b=  driver.findElement(By.xpath("//a[normalize-space()='Blog']")).isDisplayed();
   Assert.assertTrue(b);
  }
  
  

  @Test
  public void fuuuTest() {
	  
	  
	  boolean b=
	  driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
	  
	  
	  System.out.println(b);
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
