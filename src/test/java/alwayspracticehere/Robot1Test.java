package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Robot1Test {
	
	
	
	//will chk again working fine/not
	
	//mouse ops, k.b ops- any type of ops, file upload 
	
	//file upload later 
	
		 
	
	

	   WebDriver driver;
	
	
  @Test
  public void fTest() throws AWTException, InterruptedException {
	  
	driver.findElement(By.xpath("//a[normalize-space()='Courses']")).click();	
		
		driver.findElement(By.xpath("//a[normalize-space()='Selenium WebDriver with Java for beginners']")).click();
		
	
		//mouse events:
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);		
		
		Thread.sleep(4000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
				
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
		
		rb.keyPress(KeyEvent.VK_SHIFT);
		Thread.sleep(4000);
		
		
		rb.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(3000);
		

		
		rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(3000);
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
	
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		
		//keyboard events:				
		
		//left click:
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
				
		Thread.sleep(4000);
		
		
	  //right click:		
		rb.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		
		
		Thread.sleep(4000);
		
		//mouse move:
		rb.mouseMove(30, 100);   //x, y coordinates
		
				
		
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
