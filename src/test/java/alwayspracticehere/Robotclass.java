package alwayspracticehere;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		   WebDriver driver;
		
		
		    driver=new ChromeDriver();
	        driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://naveenautomationlabs.com/opencart/");
			
			
			driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
			
			Thread.sleep(4000);
						
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);  //press the key
			
			Thread.sleep(4000);
			
						
			rb.keyPress(KeyEvent.VK_TAB); //for tab  (next...next...)
			
			Thread.sleep(4000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			
			
			Thread.sleep(4000);
			
		
			rb.keyRelease(KeyEvent.VK_DOWN);  //release any key
			
			
			Thread.sleep(4000);
			
		rb.mouseMove(30, 100);
						
			
			driver.close();
			
			
			
			
			
			
			
			

	}

}
