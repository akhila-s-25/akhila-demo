package OrangeHRM_Project;

import static org.testng.Assert.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login_Test extends BaseClass{

	WebDriver driver;
    public  Login_Test(WebDriver driver){
    	  
    	  this.driver=driver;
    	  
    	  
    	  
    	  
      }
	
		
	@Parameters("browser name")
	@BeforeMethod
	void LaunchBrowserUrl(String BrowserName) throws InterruptedException {
		
        BrowserURLLaunch(BrowserName);
		
		Thread.sleep(3000);
		 
		
	} 
	
	
	@Parameters({"UserName","Password"})
	@Test(priority=1)
	public void LoginWthValidCredentials(String Username,String Password) throws InterruptedException {
		
		
		  Thread.sleep(2000);
         driver.findElement(By.name("username")).sendKeys(Username);
		
		 driver.findElement(By.name("password")).sendKeys(Password);
		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		 Thread.sleep(2000);
		
		 
		 // Title Verification
		 
		 String ActualTitle= driver.getTitle();
		  
		 System.out.println(ActualTitle);
		
		  String ExpectedTitle="OrangeHRM";
		
		
		/*  1. Verifying the title using If else conditional statement
		 
		 if(ActualTitle.equals(ExpectedTitle)) {
			 
			 System.out.println("Test Case 1 ,Result : Passed :: Login Successful : Title of the Page Matched");
		 
		 }else {
			 
			 
			 System.out.println("Test Case 1, Result : Failed ::Login Unsucessful : Title of the page Mismatched");
		 }
		
		 *
		 */ 
		  //*******************************************************************************
		
		
		  // 2. Verifying the Title using  Hard Assertions
		
		
		  Assert.assertEquals(ActualTitle,ExpectedTitle,"Title is Mismatched");
		  
		  // 3. Verifying the Title using Soft Assertions
		  
//		  SoftAssert softAssert=new SoftAssert();
//		  
//		  
//		  softAssert.assertEquals(ActualTitle, ExpectedTitle);
		  
		  
		 String Url= driver.getCurrentUrl();
		 
		 System.out.println(Url);
		
		
		
		// softAssert.assertAll();
	}
	
	
	@Parameters({"UserName","Invalid password"})
	@Test(priority=2)
	void LoginWthValidUserNameInvalidPassword(@Optional("Nikitha") String username,@Optional("27")String password) throws InterruptedException {
		

		
		 driver.findElement(By.name("username")).sendKeys(username);
		
		 driver.findElement(By.name("password")).sendKeys(password);
		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		 Thread.sleep(2000);
		
		 String ActualErrorMessage= driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		
		 String ExpectedErrorMessage="Invalid credentials";
		
//		if(ErrorMessage.equals(ExpectedErrorMessage)) {
//			
//			System.out.println("Test Case 2 : Result :Passed :: Login unsuccessful , Error Message Matched");
//		}else
//		{
//			
//		    System.out.println("Test Case 2 : Result : Failed :: Error Message Mismatched");
//		}
//		
			
		 SoftAssert softAssert=new SoftAssert();
		 
		 softAssert.assertEquals(ActualErrorMessage, ExpectedErrorMessage,"Error Message Mismatched");
		 
		 
		 System.out.println("Printing code after soft Assertion Error");
		 
		 softAssert.assertAll();
		 
		 
	}
	
	
	
	//@Test(priority=3)
	void LoginWthInvalidUserNameValidPassword() throws InterruptedException {
	
		
		 driver.findElement(By.name("username")).sendKeys("Invalid");
		
		 driver.findElement(By.name("password")).sendKeys("admin123");
		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		 Thread.sleep(2000);
			
		 String ErrorMessage= driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		
		String ExpectedErrorMessage="Invalid";
		
		/*if(ErrorMessage.equals(ExpectedErrorMessage)) {
			
			System.out.println("Test Case 3 : Result :Passed :: Login unsuccessful , Error Message Matched");
		}
		else
			
		{
			
		    System.out.println("Test Case 3 : Result : Failed :: Error Message Mismatched");
		}
		*/
		
		Assert.assertEquals(ErrorMessage,ExpectedErrorMessage);
		
		
		
		
	}
	
	
	
	//@Test(priority=4)
	void LoginwthInvalidCreadentials() throws InterruptedException {
		
		
		driver.findElement(By.name("username")).sendKeys("Invalid");
		
		 driver.findElement(By.name("password")).sendKeys("Invalid");
		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		 

		 Thread.sleep(2000);
			
		 String ErrorMessage= driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		
		String ExpectedErrorMessage="Invalid credentials";
		
/*		if(ErrorMessage.equals(ExpectedErrorMessage)) {
			
			System.out.println("Test Case 4 : Result :Passed :: Login unsuccessful , Error Message Matched");
		}else
       	{
		
		    System.out.println("Test Case 4 : Result : Failed :: Error Message Mismatched");
		}
	*/		 
		
		Assert.assertEquals(ErrorMessage, ExpectedErrorMessage);
		
		
		
			
		
	}
	
	
	//@Test(priority=5)
	void LoginWthBlankCredentials() throws InterruptedException {
		
	
		 driver.findElement(By.name("username")).sendKeys(" ");
		
		 driver.findElement(By.name("password")).sendKeys(" ");
		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
			
		 Thread.sleep(2000);
		 
		 String ActualErrorMesssage= driver.findElement(By.xpath("(//span[text()='Required'])[1]")).getText();
		 
		 String ExpectedErrorMessage="Required";
		 
	/*	 if(ActualErrorMesssage.equals(ExpectedErrorMessage)) {
			 
			 System.out.println("Test Case 5 , Result : Passed :: Error Message Matched");
			 	 
		 }else {
			 
			 System.out.println("Test Case 5 , Result : Failed :: Error Message Mismatched");
			 
	      }
	*/	
		 SoftAssert softAssert=new SoftAssert();
		 
		        softAssert.assertEquals(ActualErrorMesssage,ExpectedErrorMessage);
		        
		        softAssert.assertAll();
		 
		 
		
	}
	
	
	
	@AfterMethod
	void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
