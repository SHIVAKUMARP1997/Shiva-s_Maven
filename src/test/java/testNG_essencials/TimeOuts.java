package testNG_essencials;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// If you want your testcases to be completed within the specified time.. 
//then we make use of timeouts.
public class TimeOuts {

	@Test(timeOut =10000)
	public void test() {
		ChromeDriver driver = new ChromeDriver();
		
	}
	
}
