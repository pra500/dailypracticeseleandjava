package alwayspracticehere;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepageeeee {

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(name = "password")
	private WebElement pwd;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginbtn;

	public void usereneter() {
		user.sendKeys("saddcb");

	}

	public void pwdenter() {
		user.sendKeys("s@123");

	}

	public void loginbtnclick() {
		loginbtn.click();

	}

}
