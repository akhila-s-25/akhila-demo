package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;

public class Css_selector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//Xpath
		
// Relative Xpath Syntax : //tagname[@attribute='value']

		
		
//                            CSS LOCATOR
		
// 1. CSS General Syntax : tagname[attribute='value']
		
// CSS syntax will be same like Relative xpath but '//' and '@' will not be there in Css like xpath..that is the only difference
		
	     
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Css");
		
// 2. we can have CSS syntax directly without tagname also
		
// Ex: [attribute='value']
		

       // driver.findElement(By.cssSelector("[id='email']")).sendKeys("Css1");
		

// 3. we can have multiple atributes also
		
// Ex:- tagname[attribute='value'][attribute='value'][attribute='value']
		
		//	driver.findElement(By.cssSelector("input[id='email'][name='email'][type='text']")).sendKeys("multiple attributes");
		
		
// 4. we can use '#' symbol followed by id name to locate id of the element 
		
	    // Ex:- #idname   instead of tagname[id='idname']
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("#id");
		
		
// 5. we can use '.' symbol followed by classname to locate classname of the element
		
		
		// Ex:- .classname instead of tagname[class='classname']
		
		//driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys(".classname");
		
// 6. we can use all of them in combination also
		
		// Ex: 1 #idname.classname[name='value'][attribute='value']
		
	//	driver.findElement(By.cssSelector(".inputtext._55r1._6luy#email[name='email']")).sendKeys("combination");
		
		

// Css functions
		
// 1. Starts-with = '^ '

// If Starting value is static and remaining value is dynamic everytime when page loads or refreshes, we will use this symbol '^' to locate the element based on starting static text.

// Syntax : tagname[id^=startingvalue]
		
		//driver.findElement(By.cssSelector("input[class^='inputtext']")).sendKeys("starting Text");
	
		
		
// 2. Ends-with = '$'	
		
// If Ending value is static and starting value is dynamic everytime when page loads or refreshes, we will use this symbol '$' to locate the element based on ending static text.

// Syntax: tagname[id$='endingtext']		
		
			
		//driver.findElement(By.cssSelector("input[id$='il']")).sendKeys("Ending text");
		
		
// 3. Contains = '*'		
		
// If both starting value and ending value is dynamic , only the middle value is static , then we will use this symbol '*'	to locate the element based on middle static text.

// and also if the attribute value is big, to simplify we will use this contains method by specifting some value in the entire value.
		
		
// Syntax : tagname[id*='middle or some value']
		
		
		//driver.findElement(By.cssSelector("input[class*='inputtext']")).sendKeys("Contains Method");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
