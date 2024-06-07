package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Test {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#gender-female")).click();
		
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Akhila");
		
		driver.findElement(By.cssSelector("#LastName")).sendKeys("S");
		
		driver.findElement(By.cssSelector("#Email")).sendKeys("akhila123@gmail.com");
		
		driver.findElement(By.cssSelector("#Company")).sendKeys("Nucot");
		
		driver.findElement(By.cssSelector("#Password")).sendKeys("Password123");
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("Password123");
		
		
		driver.findElement(By.cssSelector("#register-button")).click();

	
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("https:/www.google.com");
	
	driver.navigate().refresh();
	
	}

}
