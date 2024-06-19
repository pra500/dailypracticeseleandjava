package groupingexe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class open1Test {
	
	
	
	//need to chk again
	
		
	
	WebDriver driver;
	
   @Test(priority = 0, dataProvider = "get", groups = {"reg"})
  public void fTest(String s, String s1) {
	 
	  	   	   
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(s1);		
		driver.findElement(By.xpath("//button[@id='submit']")).click();			
		
		
		
		
		System.out.println("url is "+driver.getCurrentUrl());
		
	 
  }
  
   
   @Test(priority = 2, groups = {"smoke"})
   public void geeTest()
   {
	   
	   System.out.println(driver.getTitle());
	  
	   
   }
  
  
   
   
  
 @DataProvider(name = "get")
  public Object[][] jump()
  {
	  Object [][] twitterdata=new Object[2][2];
	  twitterdata[0][0] = "student";
	  twitterdata[0][1] = "Password123";
	  
	  twitterdata[1][0] = "incorrectUser";
	  twitterdata[1][1] = "Password123";
	  
	  return twitterdata;
	  
  }
  
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
