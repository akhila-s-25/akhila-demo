package AutomationSessions.com;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Alert_Popups {

	
	WebDriver driver;
	
	@BeforeMethod
	void Setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		  
		//driver.get("https://demo.automationtesting.in/Alerts.html");
		
		 driver.navigate().to("https://demoqa.com/alerts");

		
		
	}
	
	
	//@Test
	void AlertTest() throws InterruptedException {
		
	 
		
	      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
	      
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Alert with OK")));
	      
		   
	     driver.findElement(By.cssSelector(".btn.btn-danger")).click();
	      
	    // We Can't Inspect the elements present in alert popup, so we can't locate the elements in alert popup using locators.
	      
	   //   Inorder to handle alert popups we have to use selenium commands switchTo method  as we can't inspect the alert popup and locate the element
	      
             Alert alertMessage1=driver.switchTo().alert();
	        
	      Thread.sleep(1000);
      
		 //1.  For clicking "OK" on the alert message popup, accept() method will be used
	      
	      
	         alertMessage1.accept();
	     
	     // 2. For clicking "Cancel" on the alert message popup, dismiss() method will be used.
	         
	        Thread.sleep(3000);
	         
	        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	 
	        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	        
	       Alert alertMessage2= driver.switchTo().alert();
       
	       Thread.sleep(1000);
	       
           alertMessage2.dismiss();
	      
	    
	       
	   // 3. For Getting Text from the alert message.
	       
	       
	       
	       driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	       
	       driver.findElement(By.cssSelector(".btn.btn-info")).click();
	       
	       Alert alertMessage3=driver.switchTo().alert();
	        
	       String AlertMessageText=    alertMessage3.getText();
	       
           System.out.println(AlertMessageText);
	       
	    
	   // 4. For Entering value in the Text Box in alertMessage
	       
	        Thread.sleep(2000);
	       
	       alertMessage3.sendKeys("Nikitha Manvikar");
	       
	       alertMessage3.accept();
	       
	        
	       
	}
	
	
	
	  @Test    
	  void AlertTest2() throws InterruptedException {
		  
		  
		   		 
		     Thread.sleep(1000);
		  
		     // 1. alert1
		     
		     driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		     
		     Thread.sleep(1000);
		     
		     driver.switchTo().alert().accept();
		     
		     
		     // 2. alert2
		     
		     JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollBy(0,250)", "");
		     
		     
		     driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		         
		     Thread.sleep(6000);
		     driver.switchTo().alert().accept();
		     
		     
		     // 3. alert3
		  
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		     
		     Thread.sleep(2000);
		     driver.switchTo().alert().dismiss();
		  
		    
		     // 4. alert4
		     
		     driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		     
		     String alertMessage3=driver.switchTo().alert().getText();
		       
		     System.out.println(alertMessage3);
		    
		      Thread.sleep(2000);
		      driver.switchTo().alert().sendKeys("Nikku");
		      
		      driver.switchTo().alert().accept();
		  
		  
		  
	  }       
	       
	  @AfterMethod   
	  void teardown() {
		  
		  driver.close();
		  
		  
	  } 
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

