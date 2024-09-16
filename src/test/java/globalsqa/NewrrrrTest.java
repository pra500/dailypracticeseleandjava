package globalsqa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewrrrrTest {
	
	
	WebDriver driver;
	
	//@Test
	  public void efTest() {
		  
		
		System.out.println(driver.getPageSource());
		 
	  }
	
	
	
	
	
  @Test
  public void fTest() {
	  
	  
	  while (true) {
		    // Get all the page numbers
		    List<WebElement> pages = driver.findElements(By.cssSelector(".pagination li a"));

		    for (WebElement page : pages) {
		        System.out.println("Clicking page number: " + page.getText());
		        page.click();

		        // Extract data on this page
		        List<WebElement> items = driver.findElements(By.className("item-class")); // Adjust the locator
		        for (WebElement item : items) {
		            System.out.println(item.getText());
		        }
		    }

		    // Check if the "Next" button exists
		    try {
		        WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
		        if (!nextButton.isEnabled()) {
		            break;  // If Next is disabled, we are done
		        }
		        nextButton.click();
		    } catch (Exception e) {
		        break;  // No "Next" button means last page
		    }
		}

  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.scrapingcourse.com/ecommerce/page/3/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	}
  }


