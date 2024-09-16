package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CookiesalloperationsTest {
	
	
	
//cookiesalloperations:
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {	  
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//Set<Cookie>  set1=driver.manage().getCookies();
		
		//System.out.println(set1);
		
		
		/*
		System.out.println(set1.size());	
	
for(Cookie c:set1)
{
	System.out.println(c.getName() + ":" +c.getValue());
	
}
		
	  	
     Cookie c=driver.manage().getCookieNamed("currency");
		System.out.println(c);
		
		*/
		
		/*
		
		Cookie cc=new Cookie("pragti1", "pujj@123499");
		driver.manage().addCookie(cc);
		
for(Cookie cr:set1)
{
	System.out.println(cr.getName() + ":" +cr.getValue());
	
}
*/


/*
driver.manage().deleteCookieNamed("language");
Set<Cookie>  set1=driver.manage().getCookies();


for(Cookie c:set1)
{
	System.out.println(c.getName() + ":" +c.getValue());
	
}
	
*/

driver.manage().deleteAllCookies();

driver.quit();

  }
  

}
