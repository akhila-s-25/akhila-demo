package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class AdminPage {
	
	  public WebDriver driver;
	  
	  
	  public AdminPage(WebDriver driver) {
		  
		  this.driver=driver;
		  
		  PageFactory.initElements(driver, this);// Initialization of WebElements using PageFactory
		  
	  }
	
	
	// Locators
	
	
	  @FindBy(xpath ="//a[@class='oxd-main-menu-item active']")
	  WebElement adminLink;
	
	  
	  @FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	  WebElement addButton;
	

	  @FindBy(xpath="//label[text()='User Role']/ancestor::div[2]/div[2]/div/div")  
	  WebElement userRoleDropdown;
	  
	  @FindBy (xpath="//span[text()='Admin'])[2]")
	  WebElement userRoleSelectAdmin;
	
	  @FindBy(xpath="//input[@placeholder='Type for hints...']")
	  WebElement employeeNameField;
	  
	  
	  @FindBy (xpath="//span[text()='Enabled']")
	  WebElement statusDropdown;
		
	  
	  @FindBy(xpath="(//label[text()='Username']/parent::div/following::div/input)[1]")
	  WebElement userNameField;
	

	  @FindBy(xpath ="//input[@type='password'])[1]")
	  WebElement passwordField;
	

      @FindBy(xpath ="//input[@type='password'])[2]")
	  WebElement confirmPasswordField;
	
	
	
	  @FindBy(xpath ="//button[@type='submit']")
	  WebElement saveButtonInAddUser;
	
	  
	
	
	// Re-usable Common Methods
	
	public void clickAdmin() throws InterruptedException {
		
		Thread.sleep(2000);
		adminLink.click();
		
	}
	
	
	public void clickAdd() throws InterruptedException {
		
		Thread.sleep(2000);
		addButton.click();
		
		
	}
	
	
	
	public void enterUserDetails() {
		
		employeeNameField.sendKeys("Mahesh");
		
		 userRoleDropdown.click();
		 userRoleSelectAdmin.click();
		 
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
