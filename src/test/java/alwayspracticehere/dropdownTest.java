package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class dropdownTest {
	
	WebDriver driver;
	
	
  //@Test
  public void fTest() {
	  
	   WebElement wb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	  
	  Select sel=new Select(wb);
	  
	  
	  sel.selectByVisibleText("Option2");
	  
	  
  }
  
	
  //@Test
  public void fjTest() {
	   WebElement wb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		  
		  Select sel=new Select(wb);
		 List<WebElement>list= sel.getOptions();
		 
		 for(WebElement b:list)
		 {
			 System.out.println(b.getText());
		 }
	  
	  
  }
  
  //@Test
  public void fjkTest() {
	  
	  // ll chk below 
	  
	  String str=driver.findElement(By.xpath("//a[@class='blinkingText']")).getAttribute("class");
	  
		  System.out.println(str);
	  
	  
  }
  
  
	
  @Test
  public void fjlTest() throws InterruptedException {
	  
	  
	  WebElement wb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	  
	  Select sel=new Select(wb);
	  
	  sel.selectByIndex(1);  //Option1
	  
	 
	  
	  
	  //sel.selectByValue("Option1");	  
	  
	  
	
	
	
	  
	  
	  
	  
  }
			   
	
  
	
  @Test
  public void fjl5Test() {
	  
	  
	  Set<Cookie> set1= driver.manage().getCookies();
	  
	  System.out.println(set1.size());
	 
			   
	  
	  
	 
	  
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
