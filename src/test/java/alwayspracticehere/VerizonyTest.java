package alwayspracticehere;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class VerizonyTest {
	
	//need to check again
	
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  List<WebElement>list=driver.findElements(By.xpath("//iframe | //frame"));
	 
	  System.out.println(list.size());
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
