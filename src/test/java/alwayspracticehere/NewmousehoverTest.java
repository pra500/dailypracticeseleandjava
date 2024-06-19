package alwayspracticehere;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewmousehoverTest {
	
	
	
	//need to chk testngeasy.xml grouping execution, not working fine
	
	
	
	
	
	
	WebDriver driver;
	

	
	
	
	
	
	
  @Test(priority = 0, groups ={"sanity"})
  public void fTest() {
	  
	  
	  WebElement wb= driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
	  
	  WebElement wb1= driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']"));
	  Actions act=new Actions(driver);
	  
	  
	  act.moveToElement(wb).click(wb1).build().perform();
	  
	  
	 boolean b= driver.findElement(By.xpath("//li[@id='menu-item-51137']//a[normalize-space()='Home']")).isDisplayed();
	 
	 Assert.assertTrue(b);
	  
	  
	 
	  
	  
  }
  
  
  @Test(priority = 0, groups ={"smoke"})
  public void fkTest() {
	  
	 System.out.println(driver.getTitle());
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
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
