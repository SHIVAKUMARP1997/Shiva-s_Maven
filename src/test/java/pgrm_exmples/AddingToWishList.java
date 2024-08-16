package pgrm_exmples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddingToWishList {
	@Test
	void shiva3() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String id = driver.getWindowHandle();
		System.out.println("current_ID_of_the page : " +id);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		WebElement el = driver.findElement(By.id(""));
		
		Select s1 = new Select(el);
		List<WebElement> list= s1.getOptions();
		System.out.println(list.size());
		
		
		Actions a1 = new Actions(driver);
		
		TakesScreenshot s12 = driver;
	
		File	source = s12.getScreenshotAs(OutputType.FILE);
			
		File dest = new File("");
		
		FileHandler.copy(source, dest);
		
		
		
		
	}
}
