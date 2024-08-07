package alwayspracticehere;

import org.testng.annotations.Test;

import com.itextpdf.text.log.SysoCounter;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.util.*;



public class NejjjwTest {
	
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  
	 boolean b= driver.findElement(By.xpath("//a[normalize-space()='Practice']")).isDisplayed();
System.out.println(b);
  }
  
  @Test
  public void f99Test() {
	  
	  
	  
	List<WebElement>list=driver.findElements(By.tagName("a"));
	System.out.println(list.size());
  }
  
  
  @Test
  public void fjTest() {
	  
	  
	  
	
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
