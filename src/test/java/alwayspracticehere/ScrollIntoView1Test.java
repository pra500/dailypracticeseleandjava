package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ScrollIntoView1Test {
	
	WebDriver driver;
	
	
	 
	
	
  //@Test
  public void fTest() {
	  
	  
	 WebElement wb= driver.findElement(By.xpath("//a[@class='button button_pale tiny_button']"));
	  
			  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", wb);
	  
	  
	  
	  System.out.println(wb.getText());
	  	  
	  	  
	  
	  
  }
  
  
	
  @Test
  public void fiiTest() {
		   
     
       WebElement wb=driver.findElement(By.xpath("//*[@id='privacy']/a"));
 	         
  
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", wb);
		
			
		
		System.out.println(wb.getText());
				
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//driver.get("https://www.globalsqa.com/");
		driver.get("https://www.seleniumeasy.com/lander?query=Selenium+Automation&afdToken=ChMIubXHlJGriAMVQOM4Bh1cKAxoEmwBlLqpj4Hbxcr75cOCU4cJTkth8EwWWWW8pSsMimirij5nThkfp0P5Qw_vyeF4zcl4VwPvC8Xv8Bn5uy8fsDPL976nabcuaLmf8aJEc4ajpKxK8WXaBhBZFZM9mvi8275NxM0f6gWEeUNWZXI&pcsa=false&nb=0&rurl=https%3A%2F%2Fwww.seleniumeasy.com%2Ftest%2Ftable-pagination-demo.html&nm=15&nx=378&ny=66&is=788x453&clkt=156");
		
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
