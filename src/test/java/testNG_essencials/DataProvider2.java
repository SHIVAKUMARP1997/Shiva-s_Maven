package testNG_essencials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	WebDriver driver;

	@DataProvider(name = "loginCred")
	public Object methodName() {
		
		Object ob[][] = new Object[3][2];
		
		ob[0][0] = "First_Username";
		ob[0][1] = "First_Password";
		
		ob[1][0] = "Second_Username";
		ob[1][1] = "Second_Password";
			
		ob[2][0] = "Third_Username";
		ob[2][1] = "Third_Password";
		
		return ob;
		
	}
	
	@Test(dataProvider = "loginCred")
	public void LoginToGrotechminds(String username, String password) 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/user-account/");
		
		driver.findElement(By.name("user_login")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		
		
	}

	

}
