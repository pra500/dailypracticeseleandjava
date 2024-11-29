package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ApachepoiTest {
	
		

	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  ChromeOptions co=new ChromeOptions();	  
	  co.addArguments("--disable-notifications");
	  
	  
    driver=new ChromeDriver(co);
	 
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	  	
		
	  driver.get("https://www.yatra.com/");
	  
	  
	  
	  
	  driver.findElement(By.xpath("//input[@id='input-with-icon-adornment']")).sendKeys("Mumbai");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
    
  
  

@BeforeClass
public void beforeClass() {
	  
	  driver=new ChromeDriver();  
	  
	 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get("https://toolsqa.com/selenium-webdriver/dropdown-in-selenium/");
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
}

@AfterClass
public void afterClass() {
	  
	  driver.close();
}



}
