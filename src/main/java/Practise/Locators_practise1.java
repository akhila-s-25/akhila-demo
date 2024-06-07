package Practise;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators_practise1 {

	
	@Test
	public void Test1() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
         driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Mahesh");
         
         String lastNamelabel =driver.findElement(By.xpath("//label[text()='Last Name']")).getText();
		 
	   
	     System.out.println("label : " +lastNamelabel);
	
	
	    driver.findElement(By.xpath("//input[contains(@id,'TextField-2')]")).sendKeys("Babu");
	          
	          
	WebElement phonenumber =driver.findElement(By.xpath("//input[@id='RESULT_TextField-3' and @name='RESULT_TextField-3' and @type='text']"));
	
	phonenumber.sendKeys("9999999999");
	
	
	     // or
	
//	 driver.findElement(By.xpath("//input[@id='RESULT_TextField-3'][@name='RESULT_TextField-3'] "))
	
	
	  driver.findElement(By.xpath("//input[@id='RESULT_TextField-4' or @name='RESULTTextField'] ")).sendKeys("India");
	
	
	
	 driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']/parent::div/following-sibling::div[2]/input")).sendKeys("Hyderabad");
	
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click(); 
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
