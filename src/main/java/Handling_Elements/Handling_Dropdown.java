package Handling_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Dropdown {

	
	WebDriver driver;
	
	@BeforeMethod
	void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://formstone.it/components/dropdown/demo/");
		
	}
	
	

	@Test(priority=1)
	void dropdownSelect() throws InterruptedException {
		
		
		// Inorder to select some option value in the dropdown, steps to follow:
		
		// 1. First Locate the Dropdown Webelement and store it in a webElement Variable
		
		// 2. Second, inorder use readymade methods of select class to select the dropdown, 
		// a. Create object for the select class.
		// b. Pass the Located  webelement as  Parameter in the select class
		
		// 3. Third, using Select class obect reference, by using any of the three methods, we can select options in the dropdown
		
		     // a. Select by index
		     // b. Select by value (value attribute in html)
		     // c. Select by visible text
		      
		WebElement NativeDropdown=driver.findElement(By.cssSelector("#demo_native"));
		
		
		
		Select select =new Select(NativeDropdown);
		
		// 1. Select by index
		
		  select.selectByIndex(4);
		  
		  Thread.sleep(3000);
		
		  
		  // 2. Select by value
		  
		  select.selectByValue("4");
		  
	       Thread.sleep(3000);
		  
		  // 3. Select by visible Text
		
		   select.selectByVisibleText("Three");
	
		   
		 // HOW TO PRINT LIST OF OPTIONS IN DROPDOWN
		   
		 
		   
		 // 1. Using Select class object refernece, use "getOptions" method to return all the options in the dropdown and store it in a variable.
		   
		   // As it is returning all the List of options,return type is List<weblement>
		   
		 
		List<WebElement>  DropDownList= select.getOptions();
		   
		    System.out.println("Total Options in the dropdown : " +DropDownList.size());
		
		
		    
		    for(int i=0;i<DropDownList.size();i++) {
		    	
		    	System.out.println(DropDownList.get(i).getText());
		    	
		    	
		    }
		
		
		
	}
	
	
	
	@AfterMethod
	void closeapp() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
