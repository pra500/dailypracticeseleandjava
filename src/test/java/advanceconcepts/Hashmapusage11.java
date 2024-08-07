package advanceconcepts;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmapusage11 {
	
	
	//naveen sir: https://www.youtube.com/watch?v=IAo-nia3YlM
	
	//hashmap - no order , no indexing
	
	

	//amazon site scenario:
	
	//admin  > login to app  > can see all the orders
	//distributor > login to app  > can see only respective order
	//delivery boy  > login to app  > can see only respective order
	//customer > login to app  > can see only his/her order
	//cutomer care user > login to app  > can see only respective order
	
	
	
	

	//admin     -       student:Password123
	//distributor  -    incorrectUser:Password123
	//delivery boy -      student:incorrectPassword
	 
	//key          -       value 
	
	
	
	
	
	
	 public static WebDriver driver;
	 
	 
	
	public static void main(String[] args) {
		
		
		
		    driver=new ChromeDriver();	  
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
						
			 driver.findElement(By.id("//input[@id='username']")).sendKeys(credsdata("admin"));
		      
			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passdata("admin"));	 
			  
		
			  driver.close();			  
			
			
	}
	
	
	
	

	  public static HashMap<String, String>  takeallvaluesfromhashmap() {  	  
		 
		  
		  HashMap<String, String> hm=new HashMap<String, String>();
		  hm.put("admin", "student:Password123");
		  hm.put("distributor", "incorrectUser:Password123");
		  hm.put("delivery boy", "student:incorrectPassword");
		  
		  /*
		  System.out.println(hm);
		  
		 String s= hm.get("prac2"); 
		 System.out.println(s);
		  
		 */
		 
	   
		 return hm;	 
		 
	  }

	  
	  

	  public static String credsdata(String a)
	  {
		String s= takeallvaluesfromhashmap().get(a);
		return  s.split(":")[0];
		 
	  }
	  
	  
	  
	  public static  String  passdata(String b)
	  {
		  
		  String s11= takeallvaluesfromhashmap().get(b);
			return  s11.split(":")[1];
			
	  }
	  
	  

}
