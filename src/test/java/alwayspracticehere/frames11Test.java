package alwayspracticehere;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class frames11Test {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']
	  
	boolean b=  driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  
	  System.out.println(b);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
