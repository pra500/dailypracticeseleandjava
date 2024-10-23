package randompopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rndompopup {
	

public static void main(String[] args) {
	

	WebDriver driver;
	
	   
    driver=new ChromeDriver();	  
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	
	try
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
		
	}
	catch(NoAlertPresentException e)	
	{
		
		//e.printStackTrace();
		System.out.println("no alert present");
		
	}
	
	
	
	System.out.println(driver.getCurrentUrl());
	

	
	
	
	
	driver.close();
	
	
	
	
	
}
}
