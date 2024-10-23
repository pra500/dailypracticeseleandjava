
package screenshotinallurefailed11111111;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureTestListener.class)
public class Titleee extends AllureTestListener{

	Titleee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		
		 driver=new ChromeDriver();	  
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			  
			  
			String url=driver.getCurrentUrl();	
			  Assert.assertEquals(url,  "https://rahulshettyacademy.com/AutomationPractice/");
			  
			  
			  boolean b=  driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']")).isDisplayed();
				Assert.assertEquals(b, false);
				
				  driver.quit();
				  
				  
				  //need to chk this dependency
				  /*
				   * <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-java-commons</artifactId>
        <version>2.13.9</version>
    </dependency>
				   */
				  
				  
				  //naveen sir refer: https://www.youtube.com/watch?v=cQUVGvag8UQ
				  
				  
				  
			  
			 }
		  

	

}