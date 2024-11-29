package alwayspracticehere;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	@FindBy(xpath="//img[@title='naveenopencart']")
	private WebElement  pagelogo;
	
	
	
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement  seach;



	
	
	
	
	public PaymentPage getproductinfo()
	{
		
		
	
		
		
		
		
		
		
		return new PaymentPage();
				
		
		
		
		
		
	}
	
	
	
	
	
	

}
