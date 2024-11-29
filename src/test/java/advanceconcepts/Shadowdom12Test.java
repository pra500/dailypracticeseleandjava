package advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Shadowdom12Test {
	
	//open
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  WebElement wb=driver.findElement(By.cssSelector("book-app"));  
	  SearchContext s= wb.getShadowRoot();	  
	  
	  
	  
	  
	  
	  WebElement wb1=s.findElement(By.cssSelector("app-header"));
	  SearchContext s1= wb1.getShadowRoot();
	  
	  
	  
	  
	  WebElement wb2=s1.findElement(By.cssSelector("app-toolbar"));
	  SearchContext s2= wb2.getShadowRoot();
	  
	  
	  

	  WebElement wb3=s2.findElement(By.cssSelector("book-input-decorator"));
	  SearchContext s3= wb3.getShadowRoot();
	  
	  
	  
	  
	s3.findElement(By.cssSelector("input#input")).sendKeys("java");	   
  }
  
  
  
  
 
  
  @BeforeClass
  public void beforeClass() {	  
driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://books-pwakit.appspot.com/explore");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();  
	  }
}
