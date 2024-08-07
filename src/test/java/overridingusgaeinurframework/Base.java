package overridingusgaeinurframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {	
	
	public static WebDriver driver;
	
	Base(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public static void getdriverlaunch()
	{
		
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/");
	}

	
	
	public static void getdrivershut()
	{
		
	   driver.close();
	}
}
