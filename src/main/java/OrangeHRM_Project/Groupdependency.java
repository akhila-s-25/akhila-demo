package OrangeHRM_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groupdependency {

	
		@Test(priority=3,groups= {"Smoke"})
		void Test1() {
			
			
			System.out.println("Smoke Test 1");
		}
		
		
		@Test(priority=4,groups= {"Smoke"})
	    void Test2() {
			
			Assert.assertTrue(false);
			System.out.println("Smoke Test 2 ");
		}


		
		@Test(priority=5,groups= {"Sanity"})
		void Test3() {
	    	
		
	    	
	    	System.out.println("Sanity Test 1");
	    }

		@Test(priority=5,groups= {"Sanity"})
		void Test4() {
	    	
		
	    	
	    	System.out.println("Sanity Test 2");
	    }

		@Test(priority =1,groups= {"Regression"})
		void Test5() {
	    	
		
	    	
	    	System.out.println("Regression Test 1");
	    }

		@Test(priority=2,groups= {"Regression"})
		void Test6() {
	    	
		
	    	
	    	System.out.println("Regression Test 2");
	    }

	 
		
		
		@Test(dependsOnGroups= {"Smoke"},alwaysRun = true)
	    void Test7() {
	    	
	    	
	    	System.out.println("MAIN TEST");
	    }

	      
		@Test(dependsOnGroups= {"Regression"})
		void dependencyMethod1() {
			
			System.out.println("Method depends on Regression group");
			
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
