package scenriobased;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RahulShettyLoginTest {
	
	
	
	
		
	//need to chk again
	
	
	
    WebDriver driver;  
    
    SoftAssert sw=new SoftAssert();
	 
	
	
  @Test(priority = 0)
  public void getloginTest() throws InterruptedException {
	  
	
	  driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
	  
	  
	  driver.findElement(By.xpath("(//div[@class='login-btn'])[2]")).click();
	  
	  
	  driver.findElement(By.cssSelector("input#email")).sendKeys("riya99@gmail.com");
	  
	  
	  driver.findElement(By.cssSelector("input#password")).sendKeys("riya@123");
	  
	  
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  
	  
	  
	  /*
	   * 
	   *this below element came in side, we should recognize it 
	   *
	   *
	   	  
	String act=driver.findElement(By.xpath("//span[@class='text-with-icon']")).getText();
	Assert.assertEquals(act,  "Your email or password is incorrect.");
	  */
	
	//need to chk below also working fine/not in place of this //span[@class='text-with-icon']:  
	//div[@data-transition='entering']	 
	 
	 
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  
	  Thread.sleep(4000);	
	  
	 String act= driver.findElement(By.xpath("//div[text()='Please confirm your email to fully activate your account. You can do this by clicking the link in the email confirmation we sent you.']")).getText();  
	 Assert.assertEquals(act,  "Please confirm your email to fully activate your account. You can do this by clicking the link in the email confirmation we sent you.");
  
	 
	 
	 boolean flag=driver.findElement(By.xpath("//div[normalize-space(text())='Category:']")).isDisplayed();
	 Assert.assertTrue(flag);
	 
	 sw.assertAll();
  
  }
  
  
  
  @Test(priority = 1)
  public void gettitleTest() {
	  
	 String title= driver.getTitle();
	 Assert.assertEquals(title, "Rahul Shetty Academy");
	 
	  
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
