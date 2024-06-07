package AutomationSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFramesDemo {
	
	
	
	ChromeDriver driver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/frames");
	
		
	}
	

	@Test(priority=1)
	void titleOfThePage() throws InterruptedException
	{
		
		String title=driver.getTitle();
		System.out.println(title);
		WebElement nestedframe=driver.findElement(By.xpath("//a[text()='Nested Frames']"));
		nestedframe.click();
		Thread.sleep(3000);
		
		
		// ParentFramecount
		int ParentFrameCount=  driver.findElements(By.xpath("//frame[contains(@name,'frame')]")).size();
		
		System.out.println("No.of Parent Frames in a Page : "+ParentFrameCount);  
		
		// Switch to ParentFrame1 using Index
		
		 driver.switchTo().frame(0);

		  // ChildFramecount
		 int ChildFrameCount=driver.findElements(By.xpath("//frame[contains(@name,'frame')]")).size();
		       
		 System.out.println("No.of  child frames in ParentFrame1 :"+ChildFrameCount);
	        
		 
		 driver.switchTo().frame(1);
		 
		 String ChildFrameText=driver.findElement(By.xpath("//div[@id='content']")).getText();
		  System.out.println("Child Frame Text : "+ChildFrameText);
		    
		   
		  driver.switchTo().defaultContent();
		  
//		  WebElement childFrame=driver.findElement(By.xpath("//frameset[@name='frameset-middle']//frame[@name='frame-middle']"));
//		  driver.switchTo().frame(childFrame); 
//		  
		  
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		
		driver.quit();
		
	}
	

}
