package testNG_essencials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting {
	WebDriver driver;
	
	@Test
	@Parameters("browser") // parameter declared in the .xml file of this class.
	public void testcase1(@Optional("Chrome") String nameofbrowser) 
	//When we declare parameter on the top of the method, it will become parameterised.
	// and the poarameters will be passed by the help of the .xml file.
	{
		if(nameofbrowser.equals("Chrome")) {
			driver = new ChromeDriver();
			//driver.get("https://www.google.com");
		}
		
		
		if(nameofbrowser.equals("Firefox")) {
			driver = new FirefoxDriver();
			//driver.get("https://www.google.com");

		}
		
		
		if(nameofbrowser.equals("Edge")) {
			driver = new EdgeDriver();
			//driver.get("https://www.google.com");

			
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("APjFqb")).sendKeys("Lord Shiva");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
									
	}

	
	
	
}
