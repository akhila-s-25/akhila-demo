package TestNG_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2_Priority {

//1.If Tests Methods are without priority - Methods will be executed in alphabetical order i.e., from A to Z
// Script will fail, if test methods are executed in alphabetical order..so it is not recommended.
	
// 2. If Test Methods are with priority - Methods will be Executed as per priority in ascending order i.e., from 1,2,3 to so on....
//	i.e., lowest to highest. The lowest priority will be executed first, highest priority will be execuetd last.

/* 3. Priority attribute can have '0' and '-ve' values. in that case, as -ve priority  is lowest , 
  it is executed first, then '0' priority will be executed, then '+ve' priority will be executed in ascending order.

 Ex:- -3,-2,-1,0,1,2,3,4
 
 */

/* 4. If Some Test Methods are given Priority and some Test Methods are not given priority at all, then
 *   
 *   >>> Test Methods which are not given priority is by default '0 priority', as '0' is lowest it will be executed first before '+ve' priority methods.

 */

/* 5. If some Test methods are given -ve priority and some methods are given '0' priority /not given priority at all and some methods are given '+ve' Priority
 * 
 * >>>> Then -ve priority will be executed first, then '0' priority/No priority  will be executed as "No priority" is by default '0' priority , then '+ve' priority will be executed.
 * 
 */

	
/* 6. If two or more test methods have same priority, then
 * 
 * >>>> Methods with same priority will be executed in alphabetical order
 * 
 * 
 * 
 * 
 */
	
	WebDriver driver;
	
	// Pre Condition
	@BeforeMethod
	void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login");
		
	}
	
	
	@Test(priority=-1)
	void Getcurrenturl() {
		
		String URL=driver.getCurrentUrl();
		
		System.out.println("URL : " +URL);
		
		System.out.println("priority -1");
	
	}
	
	
	@Test(priority=0)
	void Title() {
		
		String title=driver.getTitle();
		
		System.out.println("Title : " +title);
		System.out.println("Priority 0");
		
		
	}
	
	@Test(priority=1)
	void Login() {
		
		
		driver.findElement(By.cssSelector("#username")).sendKeys("akhila.9595s@gmail.com");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("Hubpass@95");
		
		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		System.out.println("Priority 1");
		
	}
	
	
	@Test(priority=2)
	void CloseApp() {
		
		
		driver.close();
		System.out.println("Priority 2");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
