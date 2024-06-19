package groupingexe;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NTest {
	
	
	
	WebDriver driver;
	
	
	
  @Test(priority = 0, groups = "{reg}")
  public void fTest() {
	  
	  
	  
	  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println("url is "+driver.getCurrentUrl());
		
  }
  
	
  @Test(priority = 0, groups = "{smoke}")
  public void fkTest() {
	  
	  
	  
	  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getCurrentUrl());
		
		
		
		
  }
}
