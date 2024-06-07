 package TestNG_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestNG1_Annotations {

	WebDriver driver;
	
	 @BeforeSuite
	  void setUP() {
		  
		 WebDriverManager.chromedriver().setup();
		 
	  }

	 
	 @BeforeTest
	 void LaunchBrowser() {
		 
		 driver=new ChromeDriver();
		  
		 driver.manage().window().maximize();	  
		  
		 
	 }
	 
	 @BeforeClass
	 void openUrl() {
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
	 }
	
	 @BeforeMethod
	 void Login() {
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
	 }
		 
	 
	 
	 @Test(description= "TestCase 1 : Verification of Url " ,priority=1)
	 void verifyUrl() {
		 
		String Url= driver.getCurrentUrl();
		 
		 
		 System.out.println("URL : "+ Url);
		 
		 
	 }
	 
	 @Test(description="Test case 2 : Verification of title",priority=2)
	 void VerifyTitle() {
		 
		 String ActualTitle= driver.getTitle();
		 
	     String ExpectedTitle ="OrangeHRM";
	     
	     System.out.println("Title of the Page : " +ActualTitle);
	 
	     
	     if(ExpectedTitle.equals(ExpectedTitle)) {
	    	 
	    	 System.out.println("Result : TestCase Title Verificated Passed");
	    	 
	     }
	     else {
	    	 
	    	 System.out.println("Result : TestCase Title Verification Failed");
	     }
	     
	 }
	 
	 
	 @AfterMethod
	 void Logout() {
		 
		 
		    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-userdropdown-tab")));
		    
		    
		 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	     
		  driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	 }
	 
	 
	 @AfterClass
	 void closeUrl() {
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 driver.close();
		 
		 
	 }
	 
	 
	@AfterTest
	void TestReport() {
		
		System.out.println("Test Report");
	}
	
	  
	@AfterSuite
	 void teardown() {
		 
		 driver.quit();
		 System.out.println("Closing the webDriver");
	 }
	 
	 
	 
}
