package AutomationSessions.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {

//1. Script to automate filling and submitting the application form.
		
		//1.To launch or open the browser
   
		WebDriverManager.chromedriver().setup(); //Search for the chrome driver
    
        ChromeDriver driver=new ChromeDriver(); // Launch the chrome browser
    
       // 2. To Maximize the Browser
    
        driver.manage().window().maximize();
       
       //3.To Open the application url:
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

//      driver.get("https://www.google.com");
   
//      driver.navigate().to("https://www.facebook.com");
//      driver.navigate().back();
    
    
   
    // 4. To locate theWebElements
    
        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Akhila");
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("S");
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("9999999999");
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
        driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Hyderabad");
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("123@gmail.com");
            //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label")).click();   
            
        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click();
            
            // Finding dropdown element and storing the value in variable of webElement type.
        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
            
            // Using Select class to select the dropdown.
            
        Select dropdown = new Select(dropDown); // Creating object for the select class and giving the parameter value as dropdown
            
            // By using obj reference variable we can select the option from dropdown
            // There are 3 ways to select an option from dropdown.
            
            //dropdown.selectByIndex(1); //1.  Index number of options
            
           // dropdown.selectByValue("Radio-2"); //2.  Attribute value
            
        dropdown.selectByVisibleText("Afternoon");
            
            // File upload using sendkeys method
            
            //driver.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-10\"]")).sendKeys("Filepath");
            
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"FSsubmit\"]")).click();            
 
            
            //5. To close the url
            
        driver.close();
            
            
    
	}

}
