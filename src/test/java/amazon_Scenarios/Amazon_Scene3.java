package amazon_Scenarios;
//3. serach mouse -> sort Get It in 2 Days->click on 1st product	

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amazon_Scene3 extends AmazonLaunch_Close {
	
	@Test(priority = 3)
	public void Scene3() { 

	WebElement Searchfld = driver.findElement(By.id("small-searchterms"));	
	Searchfld.sendKeys("mouse");
	Searchfld.sendKeys(Keys.ENTER);	
	
	if(driver.findElement(By.className("result")).isDisplayed()){
		System.out.println("Mouse is not listed");
			
	}
	else {
	System.out.println("Mouse is persent write next Steps");
	}
		
	}
}
