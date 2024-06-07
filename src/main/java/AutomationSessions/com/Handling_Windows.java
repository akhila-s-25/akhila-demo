package AutomationSessions.com;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Windows {

	

	WebDriver driver;
	
	@BeforeMethod
	void Setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		  
		
		
		 driver.navigate().to("https://demo.automationtesting.in/Windows.html");

		
		
	}
	
	@Test
	void windowHandling() {
		
		
		
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		
		// To get Parent window id
		  String ParentWindow=driver.getWindowHandle();
		
		 System.out.println("ParentWindowID :"+ParentWindow);
		
		
		 // To get all the window ids
		 Set<String> windowids= driver.getWindowHandles();
		
		 
		 Iterator<String> itr=windowids.iterator();
		
		/* Method 1:
		        while(itr.hasNext()) {
		        	
		        	        String ParentID= itr.next(); // In first iteration parent id will be iterated
		        	           
		        	         String ChildID=  itr.next(); // In Scod Iteration child id will be iterated
		        	
		        	         System.out.println("ChildWindowId :"+ChildID);
		        	
		        	
		        	      driver.switchTo().window(ChildID) ;        
		        	           
		        	     String title= driver.getTitle();
		        	      System.out.println(title);
		        	           
		        	      driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		        	      
		        	      
		        	      
		        	      
		        }
		*/
		 
		 // Method : 2
		   while(itr.hasNext()) {
			   
			     String childid= itr.next();
			   
			   if(!ParentWindow.equals(childid)) {
				   
				     
				   driver.switchTo().window(childid);
				   
				  System.out.println(driver.getTitle());
				   
				  driver.findElement(By.xpath("//span[text()='Downloads']")).click();
				   
			   }
			     
			    // System.out.println("thanks");
			     
			   
		   }
		
		
		
		   
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
