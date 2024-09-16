package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CookiespracTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//driver.get("https://www.numpyninja.com/post/guide-to-handle-pagination-in-selenium");		  
			 driver.get("https://www.makemytrip.com/");
			 
			 
			 
	   /*Set<Cookie>	set1=driver.manage().getCookies();
	
     System.out.println(set1.size());
     
     for(Cookie cc:set1)
     {    	
    	 
    	 System.out.println(cc.getName() + cc.getValue());
    	 
     }*/

     
     Cookie cb=new Cookie("pra", "22333");
     driver.manage().addCookie(cb);
     
     
     Set<Cookie>	set1=driver.manage().getCookies();
 	
     System.out.println(set1.size());
     
     for(Cookie cc:set1)
     {    	
    	 
    	 System.out.println(cc.getName() + ":" + cc.getValue());
    	 
     }
		
        
	
	
			
			 
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  

}
  
}
