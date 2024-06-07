package OrangeHRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Admin_Module extends BaseClass{

	
	  
	@Test(priority=1)
	void verifyAdminModule() throws InterruptedException {
		
		System.out.println("Admin Module");
		
		
		BrowserURLLaunch("chrome");
		
//		Login_Test login=new Login_Test(); 
//		
//		login.LoginWthValidCredentials(); // Error null pointer exception this.driver=null
//		
//		
		
		
		Thread.sleep(3000);
		
		 driver.findElement(By.name("username")).sendKeys("Admin");
			
		 driver.findElement(By.name("password")).sendKeys("admin123");
		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		  Thread.sleep(3000);
		  
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
