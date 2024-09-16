package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HandlingCookiesinSeleniumTest {

	//https://www.youtube.com/watch?v=TjLU9Iq9AeE
	//Cookie is a class in selenium	
	//key-value pair is der
	
	
	
	

	WebDriver driver;
	
	
	

	@Test
	public void fTest() {

	/*
		
	   Set<Cookie>  set1=driver.manage().getCookies();	
	   
		for(Cookie c:set1)
		{
			System.out.println(c.getName() + ":" +c.getValue());
		}
	   
	   
		System.out.println(set1.size());
	*/	
			
		
		
	/*Cookie cc=	driver.manage().getCookieNamed("_gid");
		
		System.out.println(cc);*/
		
		
		
		/*
		Cookie vv=new Cookie("pp", "789065");
		
		driver.manage().addCookie(vv);
		
		   Set<Cookie>  set1=driver.manage().getCookies();
		
			for(Cookie c:set1)
			{
				System.out.println(c.getName() + ":" +c.getValue());
			}*/
		
		
		/*
		
		//__gads
		
		driver.manage().deleteCookieNamed("__gads");
		
		Set<Cookie>  set1=driver.manage().getCookies();
		
		for(Cookie c:set1)
		{
			System.out.println(c.getName() + ":" +c.getValue());
		}*/
		
		
		
		driver.manage().deleteAllCookies();
		
		
		Set<Cookie>  set3=	driver.manage().getCookies();
		
		
		System.out.println(set3.size());   
	   
		
		
		
		

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		//driver.get("https://naveenautomationlabs.com/opencart/");
driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
