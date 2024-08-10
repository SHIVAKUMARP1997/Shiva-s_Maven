package amazon_Scenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonLaunch_Close {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeMethod
	public void Amazon_Login() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement LoginClick = driver.findElement(By.linkText("Log in"));
		LoginClick.click();
		
		WebElement Login_Mail = driver.findElement(By.id("Email"));
		Login_Mail.sendKeys("someoneka14@gmail.com");
		
		
		WebElement Login_pwd = driver.findElement(By.id("Password"));
		Login_pwd.sendKeys("Someone@123");
		
		WebElement logInButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		logInButton.click();
		

		
		}
	
	
	
	@AfterMethod
	public void Amazon_Close() throws IOException {
				
		TakesScreenshot s1 = (TakesScreenshot) driver;
		
		File source = s1.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Sel_ScrnShot\\scnsht" +Math.random()+".png");
		
		FileHandler.copy(source, dest);
		
		WebElement LogOutButton = driver.findElement(By.className("ico-logout"));
		LogOutButton.click();
		
		driver.quit();
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
