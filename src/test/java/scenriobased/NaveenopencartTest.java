package scenriobased;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NaveenopencartTest {
	
		
	
	
   WebDriver driver;
	
  @Test
  public void contactTest() {
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(300, 450)","");
	  
	  SoftAssert sw=new SoftAssert();
	  
	 
	driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	
	
	
	driver.findElement(By.xpath("//input[@id='input-name']")).sendKeys("Pr");
	
	

	
	driver.findElement(By.id("input-email")).sendKeys("priu345P@gmail.com");
	
	
	driver.findElement(By.id("input-enquiry")).sendKeys("others");
	  
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	String act="Name must be between 3 and 32 characters!";
	Assert.assertEquals(act, "Name must be between 3 and 32 characters!");
	
	
    String act1="Enquiry must be between 10 and 3000 characters!";
    Assert.assertEquals(act1, "Enquiry must be between 10 and 3000 characters!");
	
	
	sw.assertAll();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
