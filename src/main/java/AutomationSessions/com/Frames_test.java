package AutomationSessions.com;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames_test {
  
	
	WebDriver driver;
	
	
	//@Test
	public void framesTest() throws InterruptedException {
		
		
		 
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.switchTo().frame("globalSqa");
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
         
         js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='plus_overlay_icon'])[1]")).click();
		
		
		
		
		
	}
	
	
	
	   @Test
	   public void nestedFramesTest() {
		   
		   WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://the-internet.herokuapp.com/frames");
		
			
			driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
			
			
			
			List<WebElement> parentframecount=driver.findElements(By.tagName("frame"));
		     
			
		 int ParentFramecount=	parentframecount.size();
		 
		 System.out.println("Parent frame count : " +ParentFramecount);
		 
		 
		   
	 WebElement ParentFrame= driver.findElement(By.xpath("//frame[@name='frame-top']"));
		   
		   driver.switchTo().frame(ParentFrame);
		   
		int ChildFramecount=  driver.findElements(By.tagName("frame")).size();
		   System.out.println("Child Frame count : " +ChildFramecount);
		   
		 WebElement ChildFrame=  driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		   
		   driver.switchTo().frame(ChildFrame);
		   
		   
		 String frameText=  driver.findElement(By.xpath("//div[@id='content']")).getText();
		   
		 System.out.println(frameText);
	  
	   
	    driver.switchTo().defaultContent();
	   
	   }     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
