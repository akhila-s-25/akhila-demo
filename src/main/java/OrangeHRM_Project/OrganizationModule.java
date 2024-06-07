package OrangeHRM_Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class OrganizationModule {

	@Test(groups= {"Smoke"})
	void OrganizationTest1() {
		
		
		System.out.println("Organization Test 1");
	}
	
	
	@Test(groups= {"Smoke","Regression"})
    void OrganizationTest2() {
		
		
		System.out.println("Organization Test 2");
	}


	
	@Test(groups= {"Regression"})
	void OrganizationTest3() {
    	
    	
    	System.out.println("Organization Test 3");
    }

     
	@Test(groups= {"Functional","Regression"})
    void OrganizationTest4() {
    	
    	
    	System.out.println("Organization Test 4");
    }

	
	
	
}
