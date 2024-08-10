package testNG_essencials;

import org.testng.annotations.Test;

public class GroupingInTestNG {

	@Test(groups = {"smoke"})
	public void TestCase1() {
			
	}
	
	@Test(groups = {"System"})
	public void TestCase2() {
		
	}
	
	
	@Test(groups = {"smoke", "System"})
	public void TestCase3() {
		
	}
	
	
	@Test(groups = {"System"})
	public void TestCase4() {
				
	}
	
	
	@Test(groups = {"smoke", "System"})
	public void TestCase5() {
		
	}
}
