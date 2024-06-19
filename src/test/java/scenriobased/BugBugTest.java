package scenriobased;

import org.testng.annotations.Test;

import com.itextpdf.text.pdf.hyphenation.TernaryTree.Iterator;

import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BugBugTest {
	

	
	//ll chk later 
	
	
	
	WebDriver driver;  
	
	
  @Test
  public void fTest() {
	  
	  //driver.findElement(By.xpath("//span[contains(text(), 'Download the Full Cheat Sheet')]")).click();
	  
	  
	  
	  
	  
	  
	/*  
	  
	 Set<String>set1= driver.getWindowHandles();
	 
Iterator<String> itr1=set1.iterator();
	 
	 String parent=itr1.next();
	 
	 String child=itr1.next();
	 
	 //driver.switchTo().window(child);
	 */
	  
	 /*
	 
	 String parent=driver.getWindowHandle();

	 Set<String>s=driver.getWindowHandles();

	 // Now iterate using Iterator
	 java.util.Iterator<String> I1= s.iterator();

	 while(I1.hasNext())
	 {

	 String child_window=I1.next();


	 if(!parent.equals(child_window))
	 {
	 driver.switchTo().window(child_window);
	 }
	 }
	*/
	  
	  
	  
	  driver.findElement(By.xpath("//span[text()='Solutions']")).click();	
	  
	  
	  driver.findElement(By.xpath("//ul//li//a//span[text()='For QA']")).click();
	  driver.findElement(By.xpath("//button[text()='Accept']")).click();
	  driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("pruta23@hotmail.com");
	  
	  driver.findElement(By.xpath("(//span[contains(text(), 'Sign up for free')])[3]")).click();
	  
	  driver.findElement(By.xpath("//span[text()='We use cookies on our website to give you the most relevant experience by remembering your preferences and repeat visits. By clicking “Accept”, you consent to the use of ALL the cookies.']")).click(); 
	  
	//span[text()='We use cookies on our website to give you the most relevant experience by remembering your preferences and repeat visits. By clicking “Accept”, you consent to the use of ALL the cookies.']
	  
	  
	// driver.findElement(By.xpath("//button[text()='Accept']")).click();
	 
	  
	  
	  
	  
	  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/");
  }

  @AfterClass
  public void afterClass() {
	  
	 driver.close();
  }

}
