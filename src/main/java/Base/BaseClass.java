package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// Base Class is the super class of all classes
	// Base Class is the Parent class of all class
	// All the classes inherit the base class
	// Base Class consists of common Reusable methods
	
  public WebDriver driver;
	
	@Parameters("browser name")
	
    public  void BrowserURLLaunch(String BrowserName){
		 
			
			
		WebDriverManager.chromedriver().setup();
		
		if(BrowserName.equals("Chrome")) {
			 
			
              driver=new ChromeDriver();
              
         	}
		else if(BrowserName.equals("Firefox")) {
			
			
			driver =new FirefoxDriver();
		
		}else if(BrowserName.equals("edge")) {
			
			driver =new EdgeDriver();
		}
		
		 System.out.println("Base class");

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//return driver;
		
	}

	
	 
	
	
	
	
}
