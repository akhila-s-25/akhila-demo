package Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Login_test extends Base {

	@BeforeMethod
	  
	void Setup() {
		
	
		InitializeBrowserandOpenApplicationURL("Chrome");
		 
	 }
	
	
	@AfterMethod
	void teardown() {
		
		driver.close();
	}
	
	
	
	
// 1. Login with Valid User Name and Valid Password
   @Test(priority=1)
   void LoginTest1() throws InterruptedException {
	   
	   Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	   
   }


// 2. Login with Valid User Name and Invalid Password  
   
   @Test(priority=2)
   void LoginTest2() throws InterruptedException {
	   
	   Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   
	   driver.findElement(By.name("password")).sendKeys("Invalid");
	   
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	   
   }

 
// 3. Login with Invalid User Name and Valid Password
  
  @Test(priority=3)
  void LoginTest3() throws InterruptedException {
	   
	   Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("Invalid");
	   
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	   
   }

//4. Login with Invalid User Name and Invalid Password
 
  @Test(priority=4)
  void LoginTest4() throws InterruptedException {
	   
	   Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("Invalid");
	   
	   driver.findElement(By.name("password")).sendKeys("Invalid");
	   
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   

  }
  
  
  // 5. Login with Blank Values
  
  
      @Test(priority=5)
	  void LoginTest5() throws InterruptedException {
		   
		   Thread.sleep(3000);
		   driver.findElement(By.name("username")).sendKeys(" ");
		   
		   driver.findElement(By.name("password")).sendKeys(" ");
		   
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		   
		   
	   }  
	   
	   
	   
	   
	   
	   
	   
	   
  

}

