package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;



public class LoginPage extends BaseClass{

	// public WebDriver driver;
	
	public WebDriver driver;



	public LoginPage(WebDriver driver){
	
		this.driver=driver;
	
	  PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	@FindBy(name="username")
	WebElement userName;
	
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(name="button[type='submit']")
	WebElement submit;
	
	
	
	public void login(String username,String Password) throws InterruptedException {
		
		Thread.sleep(2000);
		userName.sendKeys(username);
		
		password.sendKeys(Password);
		
		submit.click();
		
		
	}
	
	
	
	
	
}
