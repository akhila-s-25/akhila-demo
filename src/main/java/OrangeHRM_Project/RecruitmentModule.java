package OrangeHRM_Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class RecruitmentModule {

	@Test(groups= {"Smoke"})
	void RecruitmentTest1() {
		
		
		System.out.println("Recruitment Test 1");
	}
	
	
	@Test(groups= {"Smoke","Regression"})
    void RecruitmentTest2() {
		
		
		System.out.println("Recruitment Test 2");
	}


	
	@Test(groups= {"Regression"})
	void RecruitmentTest3() {
    	
    	
    	System.out.println(" Recruitment Test 3");
    }

     
	@Test(groups= {"Functional","Regression"})
    void RecruitmentTest4() {
    	
    	
    	System.out.println("Recruitment Test 4");
    }

    	
    	
    	
    	
    	
    	
    	
    	
    }
