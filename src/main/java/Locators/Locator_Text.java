package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locator_Text {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
	    WebElement First_Name=driver.findElement(By.xpath("//label[text()='First Name']"));
		
		
	    String firstName=First_Name.getText();
		
		System.out.println(firstName);
		

		
		
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Nikku");
		
		//text() method  is used to verify labels of the fields
		
		
		
		
		

	}

}
