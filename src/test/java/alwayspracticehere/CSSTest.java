package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSTest {
	
	
	
	WebDriver driver;
	
	
	
	
  @Test
  public void fTest() {
	  	    
	  
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		boolean b=
	
		driver.findElement(By.cssSelector(".dropdown-toggle[href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25']"))
		.isDisplayed();
		
		
		System.out.println(b);
		
		
  }
  
  
  
  
	
  @Test
  public void fTest() {
	  	    
	  
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		boolean b=
	
		driver.findElement(By.cssSelector(".dropdown-toggle[href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25']"))
		.isDisplayed();
		
		
		System.out.println(b);
		
		
  }
  
  
	
  @Test
  public void fkTest() {
	  	    
	  
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		boolean b=
	
		driver.findElement(By.cssSelector(".dropdown-toggle[href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25']"))
		.isDisplayed();
		
		
		System.out.println(b);
		
		
  }
  
	
  @Test
  public void fkkkTest() {
	  	    	  
	 
		
		
  }
}
