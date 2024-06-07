package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_practise {

public static void main(String[] args) throws InterruptedException {

	
	
// 1. Absolute Xpath:
	
	
//	 /html/body/div/div/div[5]/div/main/div/section/section/section/form/div/span/label
	
//	/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button

	
//	html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button

	
//2. Relative Xpath
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();

	
	 driver.get("https://www.saucedemo.com/inventory.html");
	 
	 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	 
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	 
	 driver.findElement(By.xpath("//input[@id='login-button']")).click();
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
	
	
// 3.  Xpath Axes
	 
	driver.findElement(By.xpath("//a[@id='item_0_title_link']/parent::div/following-sibling::div/child::button")).click();
	
	
	driver.findElement(By.xpath("(//div[@id='inventory_container'])[2]/descendant::div[45]/following-sibling::div/button")).click();
	
	//driver.findElement(By.xpath("//a[@id='item_3_title_link']/parent::div/parent::div/parent::div/preceding-sibling::div[2]/descendant::div[6]/button")).click();
	
	driver.findElement(By.xpath("//a[@id='item_3_title_link']/ancestor::div[3]//preceding-sibling::div[2]/descendant::div[6]/button")).click();
	
// Xpath Functions
	
//1. Starts-with :

	// syntax : //tagname[starts-with(@Attribute,'value')]
	
	
	driver.findElement(By.xpath("//a[starts-with(@id,'item_1_t')]/parent::div/following-sibling::div/button")).click();
	

// 2.contains:
	
	// syntax : //tagname[contains(@Attribute,'value')]
	
	driver.findElement(By.xpath("//button[contains(@id,'onesie')]")).click();
	
	
// 3. text():
	
	// syntax : //tagname[text()='text']
	
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	
	driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	
 
	String Page_title=driver.findElement(By.xpath("//span[text()='Checkout: Your Information']")).getText();
	
	
	System.out.println(Page_title);
	
	
	
	
	
	
}
}