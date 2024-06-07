package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
	public WebDriver driver;


    public WebDriver InitializeBrowserandOpenApplicationURL(String BrowserName) {
    
    
    	             WebDriverManager.chromedriver().setup();
    	             
                       if(BrowserName.equals("Chrome")) {
                    	   
                    	   
                    	   driver=new ChromeDriver();
                       }
                       else if (BrowserName.equals("firefox")) {
                    	   
                    	   driver=new FirefoxDriver();
                    	   
                    	   
                       } else if(BrowserName.equals("edge")) {
                    	   
                    	   driver=new EdgeDriver();
                    	   
                    	   
                       }
    
    
                   driver.manage().window().maximize();
                   
                   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
                     return driver;
    
    
}

}
