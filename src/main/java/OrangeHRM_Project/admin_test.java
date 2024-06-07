package OrangeHRM_Project;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class admin_test extends BaseClass {

	
	

	
	@Parameters({"browser name","UserName","Password"})

	@BeforeTest
	void loginWithAdminUser(String BrowserName,String Username,String Password) throws InterruptedException
	{
		BrowserURLLaunch(BrowserName);
		System.out.println("Browser Launched!!");
		Login_Test loginTest=new Login_Test(driver);
		
		loginTest.LoginWthValidCredentials(Username,Password);
		System.out.println("Logged in successfully!!");
		
	}
	
	
	
	
	@Test
	void adminTest1() throws InterruptedException {
		
	
		
		System.out.println(" click on admin- test case");
		
		  Thread.sleep(4000);
	
		  driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		  Thread.sleep(2000);
		  
		  
		  driver.findElement(By.xpath("//label[text()='User Role']/ancestor::div/div[2]/div/div/div[2]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//span[text()='Admin'])[2]")).click();
		
		  Thread.sleep(2000);
		
		      driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
		      
		      
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//span[text()='Enabled']")).click();
		      
		      driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Mahesh  s");
		
		     driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Mahesh@123!");
		     
		     driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Mahesh@1234");
		
		     driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Mahesh@1234");
		     
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	
	}
	
	
	@AfterTest
	void closeApplication() throws InterruptedException {
		System.out.println("Will write close application script later");
		
		Thread.sleep(3000);
		
		
		driver.close();
	}
	
	
	
}
