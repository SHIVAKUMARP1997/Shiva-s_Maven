package pom_Amazon_scene;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom_Amazon_Example.Amazon_Home_Page;

public class Case2 {
	@Test
	public void Amazon_Home_Page_Activities() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String titleOfPage = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
			if(titleOfPage.contentEquals(driver.getTitle())) {
			
				System.out.println("HomePage found");
			
				}
			else {
				Assert.assertFalse(true, titleOfPage);
			    }
			
			
			
			Amazon_Home_Page ahp = new Amazon_Home_Page(driver);
			ahp.srch_first_item();
	  }

}
