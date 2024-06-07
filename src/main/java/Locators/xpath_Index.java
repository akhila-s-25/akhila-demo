package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_Index {

	public static void main(String[] args) throws InterruptedException {
		
// 1. Automating auto suggestions by finding xpath using index method
		 
		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();

			/*
			driver.get("https://www.amazon.com/");
			
			driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])")).sendKeys("Laptop");
			
			Thread.sleep(2000);

	Xpath Index : It will be useful to locate the elements which are on same level
	             if more than one element is matching with xpath , 
			//In that case, use Index number to identify the elements.
			
			syntax: (//div[@class='abc'])[3]
			
			driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[8]")).click();
	
	
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("panasonic Tv");
		 
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("(//div[text()='panasonic tv'])[6]")).click();

*/			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobiles");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//div[@class='YGcVZO _2VHNef'])[4]")).click();
	           
	
	
	
	
	
	
	
	
	
	
	
	}

}
