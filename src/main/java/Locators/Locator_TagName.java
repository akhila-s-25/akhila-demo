package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator_TagName {

// 1. Script to find/Locate all the elements of same type by using tagname and printing them.
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	
		
	// Using FindELements method and tagname to find all the elements of same tagname
	    
		List<WebElement> LinkList =driver.findElements(By.tagName("a"));
	    
	    System.out.println("Total Links in Flipkart = " +LinkList.size());
	        
	  
	   
			   // 1. Printing the Links using Iterator 
	        
	    System.out.println("******* Printing Using Iterator *********"); 
	    
	    
	         Iterator<WebElement> itr=  LinkList.iterator();
	    
	          while(itr.hasNext()) {
	        	  
	        	  System.out.println(itr.next().getText());
	         
	          }
		
	     
	     // 2. Printing the Links using for Loop
	       
	          
	        System.out.println("******* Printing Using For Loop *********");    
	          
	          
            for(int i=0; i<LinkList.size();i++) {
            	
            	System.out.println(LinkList.get(i).getText());
            	
            	
            }
	
		// 3. Printing the Links using for each Loop
	          
          
            System.out.println("******* Printing Using For Each Loop *********");    
            
            
		      for(WebElement LinkList1 : LinkList) {
		    	  
		    	  
		    	  System.out.println(LinkList1.getText());
		     
		      
		      
		      }
	         
		
		
		
		
	}

}
