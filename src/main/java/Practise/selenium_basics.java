package Practise;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class selenium_basics {

	
	
	@Test
	public void test1() {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	    
	    String title =driver.getTitle();
	    
	    System.out.println(title);
	    
	    String currenturl= driver.getCurrentUrl();
	     
	    System.out.println(currenturl);
	    
	    driver.navigate().to("https://www.google.com");
	    
	    
	    driver.navigate().back();
	    
	    driver.navigate().forward();
	    
	    driver.navigate().refresh();
	    
	    
	    
	    
	    driver.close();
	    
	    
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
