package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clickmultiways111Test {
	
	WebDriver driver;
	
  @Test
  public void fTest() throws InterruptedException {  
	   
	  	  
	    
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		
	
		driver.findElement(By.xpath("//li[@id='menu-item-51137']//a[normalize-space()='Home']")).sendKeys(Keys.RETURN);
		
	
		driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).sendKeys(Keys.ENTER);
				
  }
}
