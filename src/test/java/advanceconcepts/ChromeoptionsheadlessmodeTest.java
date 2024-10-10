package advanceconcepts;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import java.util.*;

public class ChromeoptionsheadlessmodeTest {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  
	List<WebElement>list=driver.findElements(By.tagName("//img"));
	  int t= list.size();
	  System.out.println(t);	  
	
	  
	  
  }
  
  @Test
  public void fiiiTest() {
	  
	  
	List<WebElement>list=driver.findElements(By.tagName("//img"));
	  int t= list.size();
	  System.out.println(t);	  
	
	  
	  
  }
  @Test
  public void fiTest() {
	  
	  
	List<WebElement>list=driver.findElements(By.tagName("//img"));
	  int t= list.size();
	  System.out.println(t);	  
	
	  
	  
  }
  
  @Test
  public void fiiiTest() {
	  
	  
	List<WebElement>list=driver.findElements(By.tagName("//img"));
	  int t= list.size();
	  System.out.println(t);	  
	
	  
	  
  }
  
  
  @Test
  public void foiTest() {
	  
	  
	List<WebElement>list=driver.findElements(By.tagName("//img"));
	  int t= list.size();
	  System.out.println(t);	  
	
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("headless");
	  driver=new ChromeDriver(co);	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/login");

  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
