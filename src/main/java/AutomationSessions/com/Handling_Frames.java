package AutomationSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Frames {

	
	
 WebDriver driver;
	
	@BeforeMethod
	void Setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		  
		
		
		 driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

		
		
	}
	
	
	@Test
	void handlingFrame() {
		
		//Handling FRAMES :
		
		/* We can switch to frame by mentioning its index, name , id or by using locator.
		   
		  driver.switchTo().frame("int index");
		  
		  driver.switchTo().frame("name");
		  
		  driver.switchTo().frame("id");
		  
		  driver.switchTo().frame(Locator);
		  
		  */
		
		     // 1. Switching using name/id
		/*
		         driver.switchTo().frame("globalSqa");
		
		         JavascriptExecutor js=(JavascriptExecutor)driver;
		         
		           js.executeScript("window.scrollBy(0,250)","");
		
		      driver.findElement(By.xpath("(//div[@class='pic_holder'])[1]/img")).click();
		*/
		
	         // 2. Switching using locator
		      
		       WebElement FrameElement= driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
	
	              driver.switchTo().frame(FrameElement);
		       
	
	              JavascriptExecutor js=(JavascriptExecutor)driver;
			         
		           js.executeScript("window.scrollBy(0,250)","");
		
		      driver.findElement(By.xpath("(//div[@class='pic_holder'])[1]/img")).click();
	
	
		        
		        
		        driver.switchTo().parentFrame();// switch back to parent frame when focus is on child frame
		        
		        
		      
		        driver.switchTo().defaultContent(); // switch to main HTML page
		      
		      
		      
		      
		      
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
