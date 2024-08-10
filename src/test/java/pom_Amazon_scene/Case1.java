package pom_Amazon_scene;
import pom_Amazon_Example.Amazon_Login_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Case1 {
	@Test
	public void Login_With_Credentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Amazon_Login_Page alp = new Amazon_Login_Page(driver);
		alp.UN(); alp.PWD(); alp.SignIN();
		
		
	}

}
