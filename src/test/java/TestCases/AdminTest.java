package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.AdminPage;
import Pages.LoginPage;

public class AdminTest extends BaseClass {

	//public WebDriver driver;
	
	
	// ***BLUNDER : OBJECT CREATION SHOULD NOT BE DONE AT CLASS LEVEL*** //IT SHOULD ALWAYS BE INSIDE METHOD
	
//	LoginPage loginApp =new LoginPage(driver);
//	AdminPage admin=new AdminPage(driver);
//	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
	
		LoginPage loginApp =new LoginPage(driver);
		
		BrowserURLLaunch("Chrome");
		loginApp.login("Admin","admin123");
		
	}
	
	@Test
	public void verifyUserDetails() throws InterruptedException {
		
		
	AdminPage admin=new AdminPage(driver);
		Thread.sleep(2000);
		admin.clickAdmin();
		admin.clickAdd();
		
		admin.enterUserDetails();
		
		Assert.assertTrue(true);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
