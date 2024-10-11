package parallelexe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class N6Test {
	
	WebDriver driver;
	
	
   @Parameters("broe")
  @Test
  public void RYTest(String b) {
	
	
	if(b.equalsIgnoreCase("chrome"))
	{
		
		
		 
		  driver=new ChromeDriver();	  
		 
		
		
	}
	else if(b.equalsIgnoreCase("edge"))
			{
		
		  driver=new EdgeDriver();
		
			}
	
	   driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");	
	String s=	driver.getWindowHandle();
	
	System.out.println(s);
			  
//	driver.getWindowHandle()
	  
	  
  }
 

}
