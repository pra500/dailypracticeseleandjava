package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class JavascTest {
	
	WebDriver driver;

  @Test
  public void FTest() {
	  
	  String st=driver.getWindowHandle();
	  System.out.println(st);
	  
  }
  
  @Test
  public void FjTest() {
	  
	  System.out.println(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed());
	  System.out.println(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed());
	  
	 //System.out.println(driver.findElement(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed());
	  
  }
  
  @Test
  public void kFTest() {
	  
	  String st=driver.getWindowHandle();
	  System.out.println(st);
	  
  }
  
  @BeforeMethod
  public void beforeClass() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}
