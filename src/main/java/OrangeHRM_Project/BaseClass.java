package OrangeHRM_Project;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass {

	
	WebDriver driver;
	
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
