package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class actionsclassTest {
	
	
	
	WebDriver driver;
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  System.out.println(driver.getTitle());

	  
	  
  }
  
  @Test(priority = 1)
  public void fiTest() {
	  
	  
	  System.out.println(driver.getTitle());
	 
	  
  }
  
  @Test(priority = 2)
  public void fppTest() {
	  
	  
	  System.out.println(driver.getTitle());

	  
	  
  }
  
  @Test(priority = 4)
  public void fpppTest() {
	  
	  
	  System.out.println(driver.getTitle());

	  
	  
  }
  
  @Test(priority = 5)
  public void fppoTest() {
	  
	  
	  System.out.println(driver.getTitle());

	  
	  
  }
  
  @Test(priority = 6)
  public void fpppptTest() {
	  
	  
	  WebElement wb=driver.findElement(By.xpath("//button[@id='mousehover']"));
	  
	WebElement wb1=driver.findElement(By.xpath("//a[normalize-space()='Top']"));  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(wb).click(wb1).build().perform();
	  
	  
	  

	 
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  
	  driver.close();
	  
  
  }

}
