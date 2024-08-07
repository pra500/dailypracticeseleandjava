package advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class scenariocheckedornotTest {
		
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  /*
	  boolean flag=driver.findElement(By.xpath("//input[@value='radio2']")).isSelected();
	
	  if(flag)
	  {
		  System.out.println("btn is checked");
	  }
	  else
	  {
		  System.out.println("btn is not checked");	    
	  }
	  */
	  
	  
	  
	  /*
	  boolean flag=driver.findElement(By.xpath("//input[@value='radio2']")).isDisplayed();
		
	  if(flag)
	  {
		  System.out.println("btn is displayed");
	  }
	  else
	  {
		  System.out.println("btn is not displayed");	    
	  }
	  */
	  
	  
	  
	  boolean flag=driver.findElement(By.xpath("//a[@id='opentab']")).isEnabled();
	  
	
	  if(flag)
	  {
		  System.out.println("btn is enabled");
	  }
	  else
	  {
		  System.out.println("btn is not enabled");	    
	  }
	  
	
  }
  

  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
  }
}
