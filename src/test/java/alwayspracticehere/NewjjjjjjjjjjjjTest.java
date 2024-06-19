package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewjjjjjjjjjjjjTest {
	
	
	WebDriver driver;

  @Test
  public void fTest() {
	 
	  
	 driver.findElement(By.xpath("//*[@id='search']")).sendKeys("mac", Keys.ENTER);	 
	 driver.findElement(By.xpath("(//a[text()='iMac'])[2]")).click();
	 driver.findElement(By.xpath("//*[@id='button-cart']")).click();
	 driver.findElement(By.xpath("//*[@id='cart']")).click();
	 
	 
	 
	 
	 
	  
  }
  
  
  

  @Test
  public void fiTest() {
	 
	 //need to chk again
	  
	  
	 driver.findElement(By.xpath("//div[@id='search']")).sendKeys("mac", Keys.ENTER);	 
	 driver.findElement(By.xpath("(//a[text()='iMac'])[2]")).click();
	 driver.findElement(By.xpath("//*[@id='button-cart']")).click();
	 driver.findElement(By.xpath("//*[@id='cart']")).click();
	 
	 driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]")).click(); 
	 
	 
	 boolean b=driver.findElement(By.xpath("(//img[@title='iMac'])[2]")).isDisplayed();
	 
	Assert.assertTrue(b);
	 
	  
  }
  
  
  @Test
  public void fiqTest() {
	  
	  

  }
	 
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	            driver=new ChromeDriver();	  
	            driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://naveenautomationlabs.com/opencart/");
		  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
