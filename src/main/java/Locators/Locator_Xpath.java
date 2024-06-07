package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		
	/*1.  Absolute Xpath : Starts from root element html.It starts with single slash.. it is a complete and full xpath..
     It is not recommended for dynamic webPages as there is always changes in DOM like Addition/deletion of elements.
	 In such cases Xpath won't work..it is difficult to locate the element using absolute Xpath.
	 
	 Syntax : /html/body/div[1]/div/h1
	
		driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a")).click();
	*/
		
	/* 2. Relative Xpath
		
	 It starts from specific element.. It starts with double slash..It is not complete Xpath
     It is always recommended to use Relative Xpath for dynamic webPages..
     even in cases of chane in DOM, Relative XPath will work to Locate the elements
     Any attribute other than id,name, classname can be used.
	  
	  Syntax : //tagName[@attribute='value']
		
		*/
	//driver.findElement(By.xpath("//a[@id='signin2']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[@href='prod.html?idp_=1']")).click();
		
    // Relative XPath Functions :
		/* 
		 * If by using Relative XPath also matches woth more than one elements using Xpath functions
		 * helps in locating webElements easily.
		 * 
		 * These xPath functions give  unqiue Identification for the elements.
		 
		 */
		
		
		// a. Contains function
		
		//driver.findElement(By.xpath("//a[contains(text(),'s7')]")).click();
		
		// b. text()
		
	  //	driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();		
		
		
		// c. starts-with
		
		//driver.findElement(By.xpath("//a[starts-with(text(),'Nokia')]")).click();
		
		
		
		// d. ends-with
		
		//driver.findElement(By.xpath("//a[ends-with(text(),'s7')]")).click();
		
		
		// e. AND
		
		driver.
		findElement(By.xpath("//a[@id='signin2' and @class='nav-link']")).click();
		
	 // driver.findElement(By.xpath("//tagname[@Attribute='value'][@Attribute='value']]"));
		
		
		// f. OR
		
		//driver.findElement(By.xpath("//a[@id='signin2' or @class='nav-link']")).click();
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
