package testNG_essencials;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// when u want your testcase to run for multiple data u can make use of dataProvider
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name = "data1")
	public Object method1() //return type for Data provider should be Object class.
		{
		
		return new Object[][] {{"ram"}, {"lakshman"}, {"Shiva"}};
	}
	
	
	
	
	@Test(dataProvider ="data1")
	public void TestCase1(String name) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/user-account/");
		
	}

}
