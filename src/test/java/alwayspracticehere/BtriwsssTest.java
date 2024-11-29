package alwayspracticehere;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BtriwsssTest {
	
	
	WebDriver drivetr;

	
  @Test
  public void fTest() {
	  /*
	  
		 //headless 
		 ChromeOptions co1=new ChromeOptions();
		 co1.addArguments("--headless=new");
		 driver = new ChromeDriver(co1);
		 

		//ChromeOptions co = new ChromeOptions();
		co1.addArguments("disable-notification");
		
		
		*/
	  

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stratbeans.com/");

		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		
		
		List<Webelement> list=
		driver.findElements(By.tagName("//input"));
		
		System.out.println(lis);
		


  }
}
