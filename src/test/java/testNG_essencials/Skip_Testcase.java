package testNG_essencials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_Testcase {
	
	@Test
	public void login() {
		Assert.assertTrue(false);
	}
	
	
	
	@Test(dependsOnMethods ="login") // logout will run if login passes
	public void logOut() {
		
	}
	

}
