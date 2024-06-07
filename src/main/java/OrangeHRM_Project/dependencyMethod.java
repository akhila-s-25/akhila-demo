package OrangeHRM_Project;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class dependencyMethod {

    
	@Test(priority=3)
	void UserRegistration() {
		
		
		System.out.println("Registration successfull");
		
		//Assert.assertTrue(false);
		
		
		
	}
	
	
	@Test(priority=2)
    void Login() {
		
		   
		//System.out.println("Login successfull by Registered User");
        
		Assert.assertTrue(false);
	
	}


	
	@Test(priority=1,dependsOnMethods= {"Login"},ignoreMissingDependencies = true)
	void Admin() {
    	
    	
    	System.out.println("Leave Applied Successfully");
    }

     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
