package AutomationSessions.com;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;


public class alerts_test {

	
	
	@Test
	public void alertsTest() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
	
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		String alertMessage =driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Nikitha Manvikar");
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
