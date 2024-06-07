package AutomationSessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class waits_practise {

	public static void main(String[] args) {
       
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
		// 1.Implicit Wait : Wait for the all elements to load. if all elements taking same time to load, we will use implicit wait.
		// Implicit wait is the dynamic wait.
		// Difference between implicit wait and thread.sleep..
		// Thread.sleep shuts down the execution until the required time completes
		// implicit wait will not shut down until the provided time, as soon as it finds the respective webelements . it will execute.
		// The duration we provides in implicit wait is only the maximum time it waits.
		
		//syntax: 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
	
		// 2. Explicit Wait :
		// If some WebElements are taking more time, we will apply Explicit wait for that specific elements instead of applying wait for all teh elemenets
		// In WebDriverwait class, we have explicit wait methods, so Inorder to access methods of another class we need to create object for the class ad pass respective required parameters to initialize the variables in that class.
		// Syntax :
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(2000));
		
		// using obj ref variable we are accessing methods to apply explicit wait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gender-male']")));
		
		
		
		
	}

}
