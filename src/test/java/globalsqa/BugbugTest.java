package globalsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

public class BugbugTest {
	
	
	//https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/
	WebDriver driver;
	
	
	 //for url testing
  @Test( priority = 1)
  public void urlTest() {
	  
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  Assert.assertEquals(url, "https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/" );
  }
  
  
  //for title testing
  @Test( priority = 2)
  public void titleTest() {
	  
	  
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Best Selenium Practice Websites for Test Automation" );
  }
  
  
  

  @Test( priority = 3)
  public void newWinTest() {
	  
	

	  
	  driver.switchTo().newWindow(WindowType.TAB);
	  
  }
  
  

  @Test( priority = 4)
  public void windowHandlingTest() {
	                         
	  WebElement wb= driver.findElement(By.xpath("//span[normalize-space()='Resources']"));	  
	  Actions act=new Actions(driver);
	  act.moveToElement(wb).click();  
	  
	  
	  WebElement wb1= driver.findElement(By.xpath("(//ul[@class='ContentMenu_ContentMenu__nestedMenu__YGG1z']//li//a//span[text()='Documentation'])[2]"));
	  Actions act11=new Actions(driver);
	  act11.moveToElement(wb1).click();  
	  
	  
	  
	Set<String>set1=driver.getWindowHandles();
Iterator<String>itr=set1.iterator();
String parent=itr.next();
String child=itr.next();


driver.switchTo().window(child);


String title1=driver.getTitle();

System.out.println(title1);
Assert.assertEquals(title1, "Documentation | BugBug Documentation" );
driver.close();


driver.switchTo().window(parent);

			  
	
  }
  

  @Test( priority = 5)
  public void windowhandlingTest() {
	  
	 String s= driver.getWindowHandle();
	 System.out.println(s);
  }
  
  

  @Test( priority = 6)
  public void scrollDownTest() {
	  
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(230, 220)", "");
  }
  
  
  


  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/");
		
		
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(5000);	
  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
}
