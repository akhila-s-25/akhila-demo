package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Locator_1 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com/");
		

// 1. CSS Parent Child Traversing
		
// Syntax : space or '>' to traverse from parent to child
		
// Ex:-  tagname[id='Parent Id'] input[id='child id']
		
// or  tagname[id='Parent Id']>input[id='child id']
		
		
		//driver.findElement(By.cssSelector("div[id='passContainer'] input#pass")).sendKeys("parent child traversing");
		
		//driver.findElement(By.cssSelector("div[id='passContainer']>input#pass")).sendKeys("parent child travesring1");
		
// 2. First-of type, last-of-type, nth-of-type

// If CSS locates more than one elements at the same level , then 
		
		// 1. Inorder to select first element, instead of using index like xpath, in CSS we will use first-of-type
		
		// 2. Inorder to select last element, instead of using index like xpath, in CSS we will use last-of-type
		
		// 3. Inorder to select required element, instead of using index like xpath, in CSS we will use nth-of-type
		
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("mobile");
		
       
		
		
		
		
		
		
		

	}

}
