package advanceconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class listfindelementsforeach1Test {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() throws InterruptedException {  
	  
	  
	  List<WebElement>list=driver.findElements(By.xpath("//select//option"));
	  
	  System.out.println(list.size());
	  
//	  for(WebElement e:list)
//	  {
//		  System.out.println(e.getText());
//	  }
	  
	  
	  
	  for(WebElement e:list)
	  {
		  
		  if(e.getText().equalsIgnoreCase("Barbados"))
		  {
			  
			  e.click();
			  Thread.sleep(8000);
			  break;
		  }
		  }
		
	   
	  
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
