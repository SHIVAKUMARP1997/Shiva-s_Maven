package testNG_essencials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assersions_ {
	
	@Test
	public void shiva() {
		//How to fail a testcase.
		Assert.assertTrue(false);
		Assert.assertFalse(false);
		
		Assert.assertEquals(false, false);
		
		Assert.assertEquals(false, false, null);
		
		Assert.assertEquals(false, null);
		
		
	}

}
