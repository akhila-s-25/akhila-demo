package Locators;

//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_id_name_clsname_linkText {

	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.id("openwindow")).click();	
		
		//driver.findElement(By.name("enter-name")).sendKeys("Nikku");

		
		//driver.findElement(By.className("inputs")).sendKeys("Akku");
		
		
		//driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		//driver.findElement(By.partialLinkText("Free Access to")).click();
		
		
		
		
		
		
		
		
		
	}

}
