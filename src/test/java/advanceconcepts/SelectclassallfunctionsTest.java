package advanceconcepts;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import java.util.*;

public class SelectclassallfunctionsTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	
	
	
	  WebElement wb=driver.findElement(By.xpath("//select"));
	  
	  Select sel=new Select(wb);
	 
	  
	  /*
	  List<WebElement>list=sel.getOptions();
	  
	  System.out.println(list.size());
	  
	 for(WebElement w:list)
	 {
		 
		 System.out.println(w.getText());
		
	 }	  
	*/
	  
	  
	  WebElement w1=sel.getFirstSelectedOption();
	  
	  System.out.println(w1.getText());
 
   
			  
 
if(sel.isMultiple())
{
	System.out.println("dd is single select");
}
	
else
	
	 
	  
	  
	  
	  
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
	    driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
