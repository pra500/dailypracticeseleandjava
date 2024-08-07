package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class trickytestng1Test {

	
	
	
	

	WebDriver driver;

  @Test(priority = 0)
  public void fTest() {
	  
	  boolean b=driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
	  System.out.println(b);
	  
	
  }

  @Test(priority=1, dependsOnMethods = {"fTest"}, description = "validate element present")
  public void fiTest() {
	  
	  boolean b=driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
	  System.out.println(b);
	  
	
  }

  @Test(priority = 2)
  public void foTest() {
	  
	  boolean b=driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
	  System.out.println(b);
	  
	
  }
  
  @Test(priority = 3, description = "validate title")
  public void fokTest() {
	  
	  boolean b=driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
	  System.out.println(b);
	  
  }
  
  
  @Test(priority = 4, description = "validate logo")
  public void folTest() {
	  
	  boolean b=driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
	  System.out.println(b);
	  
  }
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	     
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }


}
