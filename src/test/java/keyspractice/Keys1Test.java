package keyspractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Keys1Test {	
	
	
	 WebDriver driver;		
		 
	 
  @Test
  public void fTest() throws InterruptedException {
	  
	  Thread.sleep(6000);  
	  
	  Actions act=new Actions(driver);
	  
	  	  
	  WebElement wb= driver.findElement(By.xpath("//input[@id='username']"));
	  	    
	
		 
	  wb.sendKeys("pragti");
	  
	  
	  act.sendKeys(wb, Keys.CONTROL, "A");
	 act.sendKeys(wb, Keys.CONTROL, "C");	 
			  
	  
	 
	  //wb.sendKeys("pragti", Keys.CONTROL, "A", Keys.CONTROL, "C");
	  
	  WebElement wb1= driver.findElement(By.xpath("//input[@id='password']"));
	   
	  
	 // Thread.sleep(6000);  
			  
			  
	  act.sendKeys(wb1, Keys.CONTROL, "V");	 
	  
	  
	  
	  
	  
	  	  
	
	  
	 
	  
	  
	  
  }
  
    
  @BeforeClass
  public void beforeClass() {
	  
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
